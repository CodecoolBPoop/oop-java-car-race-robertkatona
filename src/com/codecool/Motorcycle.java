package com.codecool;

public class Motorcycle extends Vehicle {

    private String name;
    private int position;
    private int speed;
    private double avgSpeed;

    public Motorcycle( String name) {
        super(0.0, 0.0);
        this.name = name;
        this.position = 0;
        this.speed = 0;
        this.avgSpeed = 0;
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
        this.avgSpeed = this.avgSpeed / super.moveForAnHour;
        return avgSpeed;
    }

    public void setAvgSpeed(double avgSpeed) {
        this.avgSpeed += avgSpeed;
    }
}
