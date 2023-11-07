package io.github.brunobaiano.domain;

public sealed interface Vehicle permits Bus, Car, Truck {
    String getName();
    String getColor();
   default String getDescription(){
       return getName() + " is " + getColor();
   }
}
