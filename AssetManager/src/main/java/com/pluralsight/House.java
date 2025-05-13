package com.pluralsight;

public class House extends Asset {
    private int condition;  // 1 to 4
    private int squareFoot;
    private int lotSize;

    public House(String description, String dateAcquired, double originalCost,
                 int condition, int squareFoot, int lotSize) {
        super(description, dateAcquired, originalCost);
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }

    @Override
    public double getValue() {
        double rate = switch (condition) {
            case 1 -> 180;
            case 2 -> 130;
            case 3 -> 90;
            case 4 -> 80;
            default -> 0;
        };
        return (squareFoot * rate) + (lotSize * 0.25);
    }

    public void showAddress() {
        System.out.println("This house has an address and a yard.");
    }
}