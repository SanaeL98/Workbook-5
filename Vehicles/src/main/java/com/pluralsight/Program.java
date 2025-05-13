package com.pluralsight;

public class Program {
    public static void main(String[] args) {
        // Car
        Car car = new Car("Black", 4, 400, 15, true);
        System.out.println("Car color: " + car.getColor());
        System.out.println("Car is convertible? " + car.isConvertible());

        // SemiTruck
        SemiTruck semiTruck = new SemiTruck("White", 2, 1500, 30, 5000);
        System.out.println("Truck cargo weight limit: " + semiTruck.getCargoWeightLimit());

        // Hovercraft
        Hovercraft hovercraft = new Hovercraft("Gray", 6, 300, 20, true, true);
        System.out.println("Hovercraft supports surface type? " + hovercraft.isSurfaceTypeSupported());
        System.out.println("Hovercraft has stability system? " + hovercraft.isStabilitySystem());

        // Moped
        Moped moped = new Moped("Red", 1, 25, 5, true);
        System.out.println("Moped color: " + moped.getColor());
        System.out.println("Moped has pedals? " + moped.hasPedals());
    }
}
