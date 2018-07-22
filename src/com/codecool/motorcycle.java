package com.codecool;

public class motorcycle extends Vehicle {

    private String name;

    public motorcycle(double distanceTraveled, double moveForAnHour, String name) {
        super(distanceTraveled, moveForAnHour);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
