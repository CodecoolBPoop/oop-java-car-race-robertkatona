package com.codecool;

public class Motorcycle extends Vehicle {

    private int speed;
    private int position;

    public Motorcycle(String name, String type) {
        super(name, type);
        this.speed = 100;
        this.position = 0;
    }


}