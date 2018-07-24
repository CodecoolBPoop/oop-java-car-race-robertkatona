package com.codecool;

public class Motorcycle extends Vehicle {

    private int speed;
    private int position;

    public Motorcycle(String name) {
        super(name);
        this.speed = 100;
        this.position = 0;
    }


}