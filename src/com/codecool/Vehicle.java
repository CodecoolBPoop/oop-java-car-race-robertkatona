package com.codecool;

public class Vehicle {

    private String name;
    private int numName;
    private int position;
    private int speed;
    private double avgSpeed;
    private String type;

    private double distanceTraveled;
    private double moveForAnHour;

    private int brokenHoursOK;
    private int breakdownTurnsLeft;

    public Vehicle(int numName, String type) {
        this.numName = numName;
        this.position = 0;
        this.speed = 0;
        this.avgSpeed = 0;
        this.distanceTraveled = 0;
        this.moveForAnHour = 0;
        this.type = type;
        this.brokenHoursOK = 0;
        this.breakdownTurnsLeft = 0;
    }

    public Vehicle(String name, String type) {
        this.name = name;
        this.position = 0;
        this.speed = 0;
        this.avgSpeed = 0;
        this.distanceTraveled = 0;
        this.moveForAnHour = 0;
        this.type = type;
        this.brokenHoursOK = 0;
        this.breakdownTurnsLeft = 0;
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

    public int getNumName() {
        return numName;
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

    public int getBrokenHoursOK() {
        return brokenHoursOK;
    }

    public void setBrokenHoursOK(int brokenHoursOK) {
        this.brokenHoursOK = brokenHoursOK;
    }

    public int getBreakdownTurnsLeft() {
        return breakdownTurnsLeft;
    }

    public void setBreakdownTurnsLeft(int breakdownTurnsLeft) {
        this.breakdownTurnsLeft = breakdownTurnsLeft;
    }
}
