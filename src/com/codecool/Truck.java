package com.codecool;

public class Truck extends Vehicle {

    private int speed;
    private int position;

    public Truck(String name) {
        super(name);
        this.speed = 100;
        this.position = 0;
    }


}