package com.pluralsight;

public class Program {
    public static void main(String[] args) {
        // Car
        Car car = new Car();
        car.setColor("Black");
        car.setConvertible(true);
        System.out.println("Car color: " + car.getColor());
        System.out.println("Is convertible? " + car.isConvertible());

        // SemiTruck
        SemiTruck semiTruck = new SemiTruck();
        semiTruck.setCargoWeightLimit(5000);
        System.out.println("Truck cargo limit: " + semiTruck.getCargoWeightLimit());

        // Hovercraft
        Hovercraft hovercraft = new Hovercraft();
        hovercraft.setSurfaceTypeSupported(true);
        hovercraft.setStabilitySystem(true);
        System.out.println("Hovercraft supports surface type? " + hovercraft.isSurfaceTypeSupported());
        System.out.println("Hovercraft has stability system? " + hovercraft.isStabilitySystem());

        // Moped
        Moped moped = new Moped();
        moped.setColor("Red");
        moped.setHasPedals(true);
        System.out.println("Moped color: " + moped.getColor());
        System.out.println("Moped has pedals? " + moped.hasPedals());
    }
}