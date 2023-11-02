package io.github.brunobaiano.domain;

public sealed interface Vehicle permits Car, Truck, Bus {
    String getName();
    String getColor();
   default String getDescription(){
       return getName() + " is " + getColor();
   }
}
