package com.codecool;

public class Race {

    public static void main(String[] args) {

        Vehicle vehicleOne = new Vehicle("porsche", 500.0, 200.0);


        System.out.println(vehicleOne.getName());
        System.out.println(vehicleOne.getDistanceTraveled());
        System.out.println(vehicleOne.getMoveForAnHour());

    }
}
