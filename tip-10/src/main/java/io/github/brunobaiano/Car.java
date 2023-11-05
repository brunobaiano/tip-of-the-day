package io.github.brunobaiano;

public class Car {
    private String brand;
    private String color;

    public Car(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public String getDescription() {
        return "This is a " + color + " " + brand + " car.";
    }
}
