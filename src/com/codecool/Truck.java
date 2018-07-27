package com.codecool;

public class Truck extends Vehicle {

    private int speed;
    private int position;

    public Truck(String name, String type) {
        super(name, type);
        this.speed = 100;
        this.position = 0;
    }


}