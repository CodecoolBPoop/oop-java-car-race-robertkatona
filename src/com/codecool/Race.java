package com.codecool;

public class Race {

    public static void main(String[] args) {

        Vehicle vehicleOne = new Vehicle( 500.0, 200.0);

        System.out.println(vehicleOne.getDistanceTraveled());
        System.out.println(vehicleOne.getMoveForAnHour());

    }
}
