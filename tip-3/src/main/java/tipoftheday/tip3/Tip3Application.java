package tipoftheday.tip3;

public class Tip3Application {

  //if you want to increase more zeros, remove the COUNT from String
  public static final int COUNT = 100000;

  public static void main(String[] args) {

    long startTime = System.currentTimeMillis();
    StringBuffer sb = new StringBuffer("Java");
    for (int i = 0; i < COUNT; i++) {
      sb.append("Tip-Of-The_day");
    }
    System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");

    startTime = System.currentTimeMillis();
    StringBuilder sb2 = new StringBuilder("Java");
    for (int i = 0; i < COUNT; i++) {
      sb2.append("Tip-Of-The_day");
    }
    System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms");

    startTime = System.currentTimeMillis();
    String str = "Java";
    for (int i = 0; i < COUNT; i++) {
      str += "Tip-Of-The_day";
    }
    System.out.println("Time taken by String: " + (System.currentTimeMillis() - startTime) + "ms");


    StringBuilder sharedBuilder = new StringBuilder();

    Thread thread1 = new Thread(() -> {
      for (int i = 0; i < 10000; i++) {
        sharedBuilder.append("A");
      }
    });

    Thread thread2 = new Thread(() -> {
      for (int i = 0; i < 10000; i++) {
        sharedBuilder.append("B");
      }
    });

    thread1.start();
    thread2.start();

    try {
      thread1.join();
      thread2.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    // find some corrupted data not A or B
    System.out.println("Resulting StringBuilder size: " + sharedBuilder.length());


    StringBuffer buffer = new StringBuffer();

    Thread thread3 = new Thread(() -> {
      for (int i = 0; i < 10000; i++) {
        buffer.append("A");
      }
    });

    Thread thread4 = new Thread(() -> {
      for (int i = 0; i < 10000; i++) {
        buffer.append("B");
      }
    });

    thread3.start();
    thread4.start();

    try {
      thread3.join();
      thread4.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    System.out.println("Resulting StringBuffer size: " + buffer.length());


  }

}
