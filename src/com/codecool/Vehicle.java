package com.codecool;

public class Vehicle {

    public double distanceTraveled;
    public double moveForAnHour;

    public Vehicle(double distanceTraveled, double moveForAnHour) {
        this.distanceTraveled = distanceTraveled;
        this.moveForAnHour = moveForAnHour;
    }

    public double getDistanceTraveled() {
        return distanceTraveled;
    }

    public void setDistanceTraveled(double distanceTraveled) {
        this.distanceTraveled += distanceTraveled;
    }

    public double getMoveForAnHour() {
        return moveForAnHour;
    }

    public void setMoveForAnHour(double moveForAnHour) {
        this.moveForAnHour += moveForAnHour;
    }
}
