package com.codecool;

public class Truck extends Vehicle{

    private String name;

    public Truck(double distanceTraveled, double moveForAnHour, String name) {
        super(distanceTraveled, moveForAnHour);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
