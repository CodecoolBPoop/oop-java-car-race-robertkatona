package com.codecool;

public class Motorcycle extends Vehicle {

    private int speed;
    private int position;

    public Motorcycle(String name, String type) {
        super(name, type);
        this.speed = 100;
        this.position = 0;
    }

    @Override
    public void setSpeed(int speed) {
        int maximumSpeed = 100;
        if (speed <= maximumSpeed) {
            super.setSpeed(speed);
        } else {
            int differenceSpeed;
            differenceSpeed = speed - maximumSpeed;
            speed = speed - differenceSpeed;
            super.setSpeed(speed);
        }
    }
}