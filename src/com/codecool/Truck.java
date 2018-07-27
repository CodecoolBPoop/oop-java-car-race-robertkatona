package com.codecool;

public class Truck extends Vehicle {

    private int speed;
    private int position;

    public Truck(int numName, String type) {
        super(numName, type);
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