package com.pluralsight;

public class Hovercraft extends Vehicle {
    private boolean surfaceTypeSupported;
    private boolean stabilitySystem;

    public boolean isSurfaceTypeSupported() {
        return surfaceTypeSupported;
    }

    public void setSurfaceTypeSupported(boolean surfaceTypeSupported) {
        this.surfaceTypeSupported = surfaceTypeSupported;
    }

    public boolean isStabilitySystem() {
        return stabilitySystem;
    }

    public void setStabilitySystem(boolean stabilitySystem) {
        this.stabilitySystem = stabilitySystem;
    }
}