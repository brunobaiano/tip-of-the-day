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

  }

}
