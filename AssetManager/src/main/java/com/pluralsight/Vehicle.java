package com.pluralsight;

public class Vehicle extends Asset {
    private String make;
    private String model;

    public Vehicle(String description, String dateAcquired, double originalCost,
                   String make, String model) {
        super(description, dateAcquired, originalCost);
        this.make = make;
        this.model = model;
    }

    @Override
    public double getValue() {
        return getOriginalCost();
    }

    public void honk() {
        System.out.println("Beep Beep! I'm a " + make + " " + model);
    }

    public double getOriginalCost() {
        return super.getValue();
    }
}