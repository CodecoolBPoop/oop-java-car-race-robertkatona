package com.codecool;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Race {

    public static void main(String[] args) {
        int hoursOfTheRace = 10;
        int numberOfCars = 10;
        race(hoursOfTheRace, numberOfCars);
    }

    public static void race(int hoursOfTheRace, int numberOfCars) {
        List<Car> carsInTheRace = createCars(numberOfCars);

        System.out.println("Start");
        System.out.println();
        for (Car eachCar : carsInTheRace) {
            System.out.println(
                    "position: " + eachCar.getPosition() +
                            " || name: " + eachCar.getName() +
                            " || speed: " + eachCar.getSpeed() +
                            " || hour(s) in race: " + eachCar.getMoveForAnHour() +
                            " || distance traveled: " + eachCar.getDistanceTraveled());
        }
        System.out.println();
        moveForRandomHoursTheRace(hoursOfTheRace, carsInTheRace);
        carsInTheRace = getTheResult(carsInTheRace);
        int finalResult = 1;
        for (Car eachCar : carsInTheRace) {
            eachCar.setPosition(finalResult);
            if (finalResult < 4) {
                System.out.println(
                        "position: " + eachCar.getPosition() +
                                " || name: " + eachCar.getName() +
                                " || current speed: " + eachCar.getSpeed() +
                                " || average speed: " + eachCar.getAvgSpeed() +
                                " || hour(s) in the race: " + eachCar.getMoveForAnHour() +
                                " || distance traveled: " + eachCar.getDistanceTraveled());
            }
            finalResult += 1;
        }
        System.out.println();
        System.out.println("Finish");
    }

    public static List getTheResult(List<Car> listOfCarsInTheRace) {
        List<Car> resultOrder = new ArrayList<Car>();
        listOfCarsInTheRace.sort(Comparator.comparingDouble(Vehicle::getDistanceTraveled).reversed());
        resultOrder = listOfCarsInTheRace;
        return resultOrder;
    }

    public static List createCars(int numberOfCars) {
        List<Car> createdCars = new ArrayList<>();
        int carsNumber = 1;
        for (int i = 0; i < numberOfCars; i++) {
            String carName = carsNumber + "_CAR";
            Car car = new Car(carName);
            carsNumber += 1;
            createdCars.add(car);
        }
        return createdCars;
    }

    public static List moveForRandomHoursTheRace(int hoursOfTheRace, List<Car> listOfCarsInTheRace) {
        System.out.println("The race will take " + hoursOfTheRace + " hour(s).");
        System.out.println();
        for (int i = 0; i < hoursOfTheRace; i++) {
            for (Car eachCar : listOfCarsInTheRace) {
                int currentSpeed = randomSpeed();
                eachCar.setSpeed(currentSpeed);
                eachCar.setAvgSpeed(currentSpeed);
                eachCar.setDistanceTraveled(currentSpeed);
                eachCar.setMoveForAnHour(1);
            }
        }
        return listOfCarsInTheRace;
    }

    public static int randomSpeed() {
        Random random = new Random();
        int randomSpeed = random.nextInt(30) + 80;
        return randomSpeed;
    }

}
