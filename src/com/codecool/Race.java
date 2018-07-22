package com.codecool;

public class Race {

    public static void main(String[] args) {

        Motorcycle motorOne = new Motorcycle(300.00,  100.00,"MotorRacerOne");

        System.out.println(motorOne.getName());
        System.out.println(motorOne.getDistanceTraveled());
        System.out.println(motorOne.getMoveForAnHour());
        
        Car carOne = new Car(200.00, 500.00, "RacerOne");

        System.out.println(carOne.getName());
        System.out.println(carOne.getDistanceTraveled());
        System.out.println(carOne.getMoveForAnHour());
    }
}
