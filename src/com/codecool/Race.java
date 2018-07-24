package com.codecool;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Race {

    public static void main(String[] args) {
        int hoursOfTheRace = 50;
        int numberOfVehicles = 10;
        simulateRace(hoursOfTheRace, numberOfVehicles);
    }

    public static void simulateRace(int hoursOfTheRace, int numberOfVehicles) {
        List<Vehicle> vehiclesInTheRace = createVehicles(numberOfVehicles);

        System.out.println("START");
        System.out.println();
        System.out.println("The race will take " + hoursOfTheRace + " hour(s).");
        System.out.println();

        moveForRandomHoursTheRace(hoursOfTheRace, vehiclesInTheRace);
        vehiclesInTheRace = getTheResult(vehiclesInTheRace);
        System.out.println("FINISH:");
        System.out.println();
        int finalResult = 1;
        for (Vehicle eachVehicle : vehiclesInTheRace) {
            eachVehicle.setPosition(finalResult);
            if (finalResult < 4) {
                System.out.println(

                        "Position: " + eachVehicle.getPosition() +
                                " || Name: " + eachVehicle.getName() +
                                " || current speed: " + eachVehicle.getSpeed() + " km/h" +
                                " || average speed: " + Math.round(eachVehicle.getAvgSpeed()) + " km/h" +
                                " || hour(s) in the race: " + eachVehicle.getMoveForAnHour() +
                                " || distance traveled in km: " + eachVehicle.getDistanceTraveled());

            }
            finalResult += 1;
        }
    }

    public static List createVehicles(int numberOfVehicles) {
        List<Car> createdCars = new ArrayList<Car>();
        List<Motorcycle> createdMotorcycles = new ArrayList<Motorcycle>();
        List<Truck> createdTrucks = new ArrayList<Truck>();

        int carsNumber = 1;
        for (int i = 0; i < numberOfVehicles; i++) {
            String carName = carsNumber + "_CAR";
            Car car = new Car(carName);
            carsNumber += 1;
            createdCars.add(car);
        }

        int motorsNumber = 1;
        for (int i = 0; i < numberOfVehicles; i++) {
            String motorName = motorsNumber + "_MOTOR";
            Motorcycle motorcycle = new Motorcycle(motorName);
            motorsNumber += 1;
            createdMotorcycles.add(motorcycle);
        }

        int trucksNumber = 1;
        for (int i = 0; i < numberOfVehicles; i++) {
            String truckName = trucksNumber + "_TRUCK";
            Truck truck = new Truck(truckName);
            trucksNumber += 1;
            createdTrucks.add(truck);
        }
//        List<Vehicle> createdVehicles = new ArrayList<>(createdCars);
        List<Vehicle> createdVehicles = new ArrayList<>();

        createdVehicles.addAll(createdCars);
        createdVehicles.addAll(createdMotorcycles);
        createdVehicles.addAll(createdTrucks);

        return createdVehicles;
    }

    public static List getTheResult(List<Vehicle> listOfVehiclesInTheRace) {
        List<Vehicle> resultOrder = new ArrayList<Vehicle>();
        listOfVehiclesInTheRace.sort(Comparator.comparingDouble(Vehicle::getDistanceTraveled).reversed());
        resultOrder = listOfVehiclesInTheRace;
        return resultOrder;
    }


    public static List moveForRandomHoursTheRace(int hoursOfTheRace, List<Vehicle> listOfVehiclesInTheRace) {
        for (int i = 0; i < hoursOfTheRace; i++) {
            for (Vehicle eachVehicle : listOfVehiclesInTheRace) {
                int currentSpeed = randomSpeed();
                eachVehicle.setSpeed(currentSpeed);
                eachVehicle.setAvgSpeed(currentSpeed);
                eachVehicle.setDistanceTraveled(currentSpeed);
                eachVehicle.setMoveForAnHour(1);
            }
        }
        return listOfVehiclesInTheRace;
    }

    public static int randomSpeed() {
        Random random = new Random();
        int randomSpeed = random.nextInt(30) + 80;
        return randomSpeed;
    }

}
