package io.github.brunobaiano.domain;


import java.util.ArrayList;
import java.util.List;

public class Garage<T>
{
    private List<T> vehicles = new ArrayList<>();
    public void park(T vehicle) {
        System.out.println("Parked " + ((Vehicle)vehicle).getDescription() + " in the garage.");
        vehicles.add(vehicle);
    }

    public int getNumberOfVehicles() {
        return vehicles.size();
    }

}
