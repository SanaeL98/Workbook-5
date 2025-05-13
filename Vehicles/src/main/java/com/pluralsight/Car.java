package com.pluralsight;

public class Car extends Vehicle {
    private boolean isConvertible;

    public boolean isConvertible() {
        return isConvertible;
    }

    public void setConvertible(boolean isConvertible) {
        this.isConvertible = isConvertible;
    }
}