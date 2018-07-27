package com.codecool;

import java.util.Random;

public class Car extends Vehicle {

    private int speed;
    private int position;


    public Car(String name, String type) {
        super(name, type);
        this.speed = speedBetween80And110();
        this.position = 0;
    }

    private int speedBetween80And110(){
        Random random = new Random();
        int randomSpeed = random.nextInt(30) + 80;
        return randomSpeed;
    }

}
