package com.pluralsight;

public class Moped extends Vehicle {
    private boolean hasPedals;

    public Moped(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, boolean hasPedals) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
        this.hasPedals = hasPedals;
    }

    public boolean hasPedals() {
        return hasPedals;
    }

    public void setHasPedals(boolean hasPedals) {
        this.hasPedals = hasPedals;
    }
}