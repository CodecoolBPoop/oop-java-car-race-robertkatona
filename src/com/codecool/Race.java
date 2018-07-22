package com.codecool;

public class Race {

    public static void main(String[] args) {

        Truck truckOne = new Truck(400.00, 320.00, "Trucker");

        System.out.println(truckOne.getName());
        System.out.println(truckOne.getDistanceTraveled());
        System.out.println(truckOne.getMoveForAnHour());

    }
}
