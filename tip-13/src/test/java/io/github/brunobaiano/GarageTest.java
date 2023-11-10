package io.github.brunobaiano;

import io.github.brunobaiano.domain.Bus;
import io.github.brunobaiano.domain.Car;
import io.github.brunobaiano.domain.Garage;
import io.github.brunobaiano.domain.Vehicle;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

//if you run all tests you will see that this test will fail

@QuarkusTest
public class GarageTest {

    @Test
    @Tag("UnitTest")
    void testGarage() {
        //create a garage of vehicles and park a car and a bus
        Garage<Vehicle> garage = new Garage<>();
        garage.park(new Car("Vehicle", "White"));
        garage.park(new Bus("Bus", "Yellow"));

        assertThat(garage.getNumberOfVehicles()).isEqualTo(2);
    }

    @Test
    @Tag("NotWorking")
    void testGarage_notWorking() {
        //create a garage of vehicles and park a car and a bus
        Garage<Vehicle> garage = new Garage<>();
        garage.park(new Car("Vehicle", "White"));
        garage.park(new Bus("Bus", "Yellow"));

        assertThat(garage.getNumberOfVehicles()).isEqualTo(3);
    }
}
