package com.codecool;

public class Vehicle {

    private String name;
    private int position;
    private int speed;
    private double avgSpeed;
    private String type;

    public double distanceTraveled;
    public double moveForAnHour;

    public Vehicle(String name, String type) {
        this.name = name;
        this.position = 0;
        this.speed = 0;
        this.avgSpeed = 0;
        this.distanceTraveled = 0;
        this.moveForAnHour = 0;
        this.type = type;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getAvgSpeed() {
        this.avgSpeed = avgSpeed / moveForAnHour;
        return avgSpeed;
    }

    public void setAvgSpeed(double avgSpeed) {
        this.avgSpeed += avgSpeed;
    }

    public String getType() {
        return type;
    }
}
