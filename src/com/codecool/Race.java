package com.codecool;

public class Race {

    public static void main(String[] args) {

        motorcycle motorOne = new motorcycle(300.00,  100.00,"MotorRacerOne");

        System.out.println(motorOne.getName());
        System.out.println(motorOne.getDistanceTraveled());
        System.out.println(motorOne.getMoveForAnHour());

    }
}
