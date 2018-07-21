package com.codecool;

public class Vehicle {

    private String name;
    private double distanceTraveled;
    private double moveForAnHour;

    public Vehicle(String name, double distanceTraveled, double moveForAnHour) {
        this.name = name;
        this.distanceTraveled = distanceTraveled;
        this.moveForAnHour = moveForAnHour;
    }

    public String getName() {
        return name;
    }

    public double getDistanceTraveled() {
        return distanceTraveled;
    }

    public double getMoveForAnHour() {
        return moveForAnHour;
    }
}
