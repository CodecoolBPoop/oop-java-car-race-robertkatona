package com.codecool;

public class Car extends Vehicle{

    private String name;

    public Car(double distanceTraveled, double moveForAnHour, String name) {
        super(distanceTraveled, moveForAnHour);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
