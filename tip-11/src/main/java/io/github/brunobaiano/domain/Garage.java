package io.github.brunobaiano.domain;


public class Garage<T> {
    public void park(T vehicle) {
        System.out.println("Parked " + ((Vehicle)vehicle).getDescription() + " in the garage.");
    }

}
