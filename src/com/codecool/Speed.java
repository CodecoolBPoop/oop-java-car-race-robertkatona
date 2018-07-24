package com.codecool;

import java.util.Random;

public class Speed {

    int speed;

    public Speed() {
        this.speed = randomSpeed();
    }

    private int randomSpeed() {
        Random random = new Random();
        int randomSpeed = random.nextInt(30) + 80;
        return randomSpeed;
    }

    public int getSpeed() {
        return speed;
    }
}

