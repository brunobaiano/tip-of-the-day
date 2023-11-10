package io.github.brunobaiano.domain;

public class Airplane {
    private String name;
    private String color;

    public Airplane(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }
    public String getColor() {
        return color;
    }
}
