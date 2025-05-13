package com.pluralsight;

public class Car extends Vehicle {
    private boolean isConvertible;

    public Car(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, boolean isConvertible) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
        this.isConvertible = isConvertible;
    }

    public boolean isConvertible() {
        return isConvertible;
    }

    public void setConvertible(boolean isConvertible) {
        this.isConvertible = isConvertible;
    }
}