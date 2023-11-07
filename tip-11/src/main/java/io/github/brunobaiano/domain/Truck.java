package io.github.brunobaiano.domain;

public final class Truck implements Vehicle {
    private String name;
    private String color;

    public Truck(String name, String color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public String getName() { return name; }

    @Override
    public String getColor() { return color; }
}
