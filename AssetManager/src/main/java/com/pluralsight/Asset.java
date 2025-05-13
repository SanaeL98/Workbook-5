package com.pluralsight;

public class Asset {
    private String description;
    private String dateAcquired;
    private double originalCost;

    public Asset(String description, String dateAcquired, double originalCost) {
        this.description = description;
        this.dateAcquired = dateAcquired;
        this.originalCost = originalCost;
    }

    public String getDescription() {
        return description;
    }

    public double getValue() {
        return originalCost;
    }
}
