package com.codecool;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Race {

    public static void main(String[] args) {
        int hoursOfTheRace = 3;
        int numberOfVehicles = 3;
        race(hoursOfTheRace, numberOfVehicles);
    }

    public static void race(int hoursOfTheRace, int numberOfVehicles) {
        List<Car> carsInTheRace = createCars(numberOfVehicles);
        List<Motorcycle> motorcyclesInTheRace = createMotorcycles(numberOfVehicles);

        List<Vehicle> vehiclesInTheRace = new ArrayList(carsInTheRace);
        vehiclesInTheRace.addAll(motorcyclesInTheRace);

        System.out.println("Start");
        System.out.println();

        System.out.println("Vehicles");
        for (Vehicle eachVehicle : vehiclesInTheRace) {
            System.out.println(eachVehicle.getClass());
            //            System.out.println(
//                    "position: " + eachVehicle. +
//                            " || name: " + eachVehicle
//                            " || speed: " + eachVehicle.getSpeed() +
//                            " || hour(s) in race: " + eachVehicle.getMoveForAnHour() +
//                            " || distance traveled: " + eachVehicle.getDistanceTraveled());
        }
        System.out.println();

        System.out.println("Motors");
        for (Motorcycle eachMotor : motorcyclesInTheRace) {
            System.out.println(
                    "position: " + eachMotor.getPosition() +
                            " || name: " + eachMotor.getName() +
                            " || speed: " + eachMotor.getSpeed() +
                            " || hour(s) in race: " + eachMotor.getMoveForAnHour() +
                            " || distance traveled: " + eachMotor.getDistanceTraveled());
        }
        System.out.println();
        System.out.println("The race will take " + hoursOfTheRace + " hour(s).");

        carMovesForRandomHoursTheRace(hoursOfTheRace, carsInTheRace);
        motorMovesForRandomHoursTheRace(hoursOfTheRace, motorcyclesInTheRace);
        carsInTheRace = getTheResultForCars(carsInTheRace);
        motorcyclesInTheRace = getTheResultForMotors(motorcyclesInTheRace);

        System.out.println();
        System.out.println("Finish");
    }

    public static List getTheResultForCars(List<Car> listOfCarsInTheRace) {
        List<Car> resultOrder = new ArrayList<Car>();
        listOfCarsInTheRace.sort(Comparator.comparingDouble(Vehicle::getDistanceTraveled).reversed());
        resultOrder = listOfCarsInTheRace;
        int finalResult = 1;
        for (Car eachCar : listOfCarsInTheRace) {
            eachCar.setPosition(finalResult);
            if (finalResult < 4) {
                System.out.println(
                        "position: " + eachCar.getPosition() +
                                " || name: " + eachCar.getName() +
                                " || current speed: " + eachCar.getSpeed() +
                                " || average speed: " + Math.round(eachCar.getAvgSpeed()) +
                                " || hour(s) in the race: " + eachCar.getMoveForAnHour() +
                                " || distance traveled: " + eachCar.getDistanceTraveled());
            }
            finalResult += 1;
        }
        return resultOrder;
    }

    public static List getTheResultForMotors(List<Motorcycle> listOfMotorcyclesInTheRace) {
        List<Motorcycle> resultOrder = new ArrayList<Motorcycle>();
        listOfMotorcyclesInTheRace.sort(Comparator.comparingDouble(Vehicle::getDistanceTraveled).reversed());
        resultOrder = listOfMotorcyclesInTheRace;
        int finalResult = 1;
        for (Motorcycle eachMotor : listOfMotorcyclesInTheRace) {
            eachMotor.setPosition(finalResult);
            if (finalResult < 4) {
                System.out.println(
                        "position: " + eachMotor.getPosition() +
                                " || name: " + eachMotor.getName() +
                                " || current speed: " + eachMotor.getSpeed() +
                                " || average speed: " + Math.round(eachMotor.getAvgSpeed())+
                                " || hour(s) in the race: " + eachMotor.getMoveForAnHour() +
                                " || distance traveled: " + eachMotor.getDistanceTraveled());
            }
            finalResult += 1;
        }return resultOrder;
    }

    public static List createCars(int numberOfCars) {
        List<Car> createdCars = new ArrayList<Car>();
        int carsNumber = 1;
        for (int i = 0; i < numberOfCars; i++) {
            String carName = carsNumber + "_CAR";
            Car car = new Car(carName);
            carsNumber += 1;
            createdCars.add(car);
        }
        return createdCars;
    }

    public static List createMotorcycles(int numberOfMotorcycles) {
        List<Motorcycle> createdMotorcycles = new ArrayList<Motorcycle>();
        int motorcyclesNumber = 1;
        for (int i = 0; i < numberOfMotorcycles; i++) {
            String motorcycleName = motorcyclesNumber + "_MOTOR";
            Motorcycle motorcycle = new Motorcycle(motorcycleName);
            motorcyclesNumber += 1;
            createdMotorcycles.add(motorcycle);
        }
        return createdMotorcycles;
    }


    public static List carMovesForRandomHoursTheRace(int hoursOfTheRace, List<Car> listOfCarsInTheRace) {
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

    public static List motorMovesForRandomHoursTheRace(int hoursOfTheRace, List<Motorcycle> listOfMotorsInTheRace) {
        for (int i = 0; i < hoursOfTheRace; i++) {
            for (Motorcycle eachMotor : listOfMotorsInTheRace) {
                int currentSpeed = randomSpeed();
                eachMotor.setSpeed(currentSpeed);
                eachMotor.setAvgSpeed(currentSpeed);
                eachMotor.setDistanceTraveled(currentSpeed);
                eachMotor.setMoveForAnHour(1);
            }
        }
        return listOfMotorsInTheRace;
    }

    public static int randomSpeed() {
        Random random = new Random();
        int randomSpeed = random.nextInt(30) + 80;
        return randomSpeed;
    }

}
