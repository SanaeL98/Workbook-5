package com.pluralsight;

public class SemiTruck extends Vehicle {
    private int cargoWeightLimit;

    public SemiTruck(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, int cargoWeightLimit) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
        this.cargoWeightLimit = cargoWeightLimit;
    }

    public int getCargoWeightLimit() {
        return cargoWeightLimit;
    }

    public void setCargoWeightLimit(int cargoWeightLimit) {
        this.cargoWeightLimit = cargoWeightLimit;
    }
}