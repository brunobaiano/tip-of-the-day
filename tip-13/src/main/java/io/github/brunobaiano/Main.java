package io.github.brunobaiano;

import io.github.brunobaiano.domain.*;
import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;

@QuarkusMain
public class Main {
    public static void main(String... args) {
        Quarkus.run(MyApp.class, args);
    }

    public static class MyApp implements QuarkusApplication {

        @Override
        public int run(String... args) throws Exception {

            Garage<Vehicle> garage = new Garage<>();
            garage.park(new Car("Vehicle", "White"));
            garage.park(new Bus("Bus", "Yellow"));

            // Now lets create a raw garage
            Garage rawGarage = new Garage();
            //let's park a airplane in the garage
            rawGarage.park(new Airplane("Airplane", "White"));
            //ClassCastException

            // You can enforce T to be a Vehicle in the garage using
            // T extends Vehicle
            // try it out!

            Quarkus.waitForExit();
            return 0;
        }
    }
}