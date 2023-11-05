package io.github.brunobaiano;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;

import java.util.HashMap;

@QuarkusMain
public class Main {
    public static void main(String... args) {
        Quarkus.run(MyApp.class, args);
    }

    public static class MyApp implements QuarkusApplication {

        @Override
        public int run(String... args) throws Exception {

            HashMap<Car, Integer> carHashMap = new HashMap<>();
            carHashMap.put(new Car("Ferrari", "Red"), 1);
            carHashMap.put(new Car("Mercedes", "White"), 2);
            carHashMap.put(new Car("Volkswagen", "Yellow"), 3);
            carHashMap.put(new Car("Fiat", "Blue"), 4);
            carHashMap.put(new Car("Ford", "Black"), 5);

            //should be 1, but it's null
            System.out.println(carHashMap.get(new Car("Ferrari", "Red")));

            //let's use Records like I showed in tip-8

            //create a new hashmap with CarRecord and Integer
            HashMap<CarRecord, Integer> carRecordHashMap = new HashMap<>();
            //populate carRecordHashMap with 5 itens
            carRecordHashMap.put(new CarRecord("Ferrari", "Red"), 1);
            carRecordHashMap.put(new CarRecord("Mercedes", "White"), 2);
            carRecordHashMap.put(new CarRecord("Volkswagen", "Yellow"), 3);
            carRecordHashMap.put(new CarRecord("Fiat", "Blue"), 4);
            carRecordHashMap.put(new CarRecord("Ford", "Black"), 5);

            //should be 1, and it is!
            System.out.println(carRecordHashMap.get(new CarRecord("Ferrari", "Red")));

            //if you came until here, try to implement equals and hashCOde in Car to make the first output return 1 too.



            Quarkus.waitForExit();
            return 0;
        }
    }
}