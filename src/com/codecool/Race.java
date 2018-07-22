package com.codecool;

public class Race {

    public static void main(String[] args) {

        Car carOne = new Car(200.00, 500.00, "RacerOne");

        System.out.println(carOne.getName());
        System.out.println(carOne.getDistanceTraveled());
        System.out.println(carOne.getMoveForAnHour());

    }
}
