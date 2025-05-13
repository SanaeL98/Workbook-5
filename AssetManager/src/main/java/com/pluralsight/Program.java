package com.pluralsight;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        ArrayList<Asset> assets = new ArrayList<>();

        assets.add(new House("Family Home", "2020-01-01", 200000, 1, 2000, 4000));
        assets.add(new Vehicle("Company Van", "2022-06-15", 30000, "Ford", "Transit"));

        for (Asset asset : assets) {
            System.out.println("Asset: " + asset.getDescription());
            System.out.println("Value: $" + asset.getValue());

            if (asset instanceof House house) {
                house.showAddress();
            } else if (asset instanceof Vehicle vehicle) {
                vehicle.honk();
            }

            System.out.println();
        }
    }
}