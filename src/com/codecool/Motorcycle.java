package com.codecool;

public class Motorcycle extends Vehicle {

    private String name;

    public Motorcycle(double distanceTraveled, double moveForAnHour, String name) {
        super(distanceTraveled, moveForAnHour);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
