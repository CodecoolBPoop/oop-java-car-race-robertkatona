package com.codecool;

import java.util.Random;

public class Weather {

    private boolean isRaining;

    public Weather() {
        this.isRaining = false;
    }

    public boolean isRaining() {
        return isRaining;
    }

    public boolean setRaining() {
        Random random = new Random();
        int low = 0;
        int high = 100;
        int result = random.nextInt(100) + low;
        if (result <= 30) {
            this.isRaining = true;
        }
        return isRaining;
    }


}
