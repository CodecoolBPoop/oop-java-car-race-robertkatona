package com.codecool;

public class Truck extends Vehicle {

    private int speed;
    private int position;
    private int breakdownTurnsLeft;

    public Truck(String name, String type) {
        super(name, type);
        this.speed = 100;
        this.position = 0;
        this.breakdownTurnsLeft = 0;
    }

    public int getBreakdownTurnsLeft() {
        return breakdownTurnsLeft;
    }

    public void setBreakdownTurnsLeft(int breakdownTurnsLeft) {
        this.breakdownTurnsLeft = breakdownTurnsLeft;
    }
}