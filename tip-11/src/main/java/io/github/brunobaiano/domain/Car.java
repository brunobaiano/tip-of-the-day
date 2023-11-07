package io.github.brunobaiano.domain;

public final class Car implements Vehicle{
    private String name;
    private String color;

    public Car(String name, String color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public String getName() { return name; }

    @Override
    public String getColor() { return color; }

}
