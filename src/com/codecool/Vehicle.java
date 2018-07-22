package com.codecool;

public class Vehicle {

    private double distanceTraveled;
    private double moveForAnHour;

    public Vehicle(double distanceTraveled, double moveForAnHour) {
        this.distanceTraveled = distanceTraveled;
        this.moveForAnHour = moveForAnHour;
    }

    public double getDistanceTraveled() {
        return distanceTraveled;
    }

    public double getMoveForAnHour() {
        return moveForAnHour;
    }
}
