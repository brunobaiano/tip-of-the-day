package io.github.brunobaiano;

import io.github.brunobaiano.domain.Bus;
import io.github.brunobaiano.domain.Car;
import io.github.brunobaiano.domain.Truck;
import io.github.brunobaiano.domain.Vehicle;
import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;

import java.util.List;

@QuarkusMain
public class Main {
    public static void main(String... args) {
        Quarkus.run(MyApp.class, args);
    }

    public static class MyApp implements QuarkusApplication {

        @Override
        public int run(String... args) throws Exception {
            List<Vehicle> vehicleList = List.of(
                    new Car("Ferrari", "Red"),
                    new Truck("Mercedes", "White"),
                    new Bus("Volkswagen", "Yellow")
            );
            vehicleList.forEach(vehicle -> System.out.println(vehicle.getDescription()));
            Quarkus.waitForExit();
            return 0;
        }
    }
}