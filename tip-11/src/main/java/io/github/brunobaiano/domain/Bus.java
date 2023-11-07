package io.github.brunobaiano.domain;

public final class Bus implements Vehicle {
    private String name;
    private String color;

    public Bus(String name, String color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public String getName() { return name; }

    @Override
    public String getColor() { return color; }
}
