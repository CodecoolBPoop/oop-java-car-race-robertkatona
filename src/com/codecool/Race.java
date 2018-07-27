package com.codecool;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Race {

    private static int motorsNumber = 1;


    public static void main(String[] args) {
        int hoursOfTheRace = 50;
        int numberOfVehicles = 10;
        System.out.println("START");
        System.out.println();
        System.out.println("The race will take " + hoursOfTheRace + " hour(s).");
        System.out.println();
        simulateRace(hoursOfTheRace, numberOfVehicles);
    }

    private static void simulateRace(int hoursOfTheRace, int numberOfVehicles) {
        List<Vehicle> vehiclesInTheRace = createVehicles(numberOfVehicles);
        moveForRandomHoursTheRace(hoursOfTheRace, vehiclesInTheRace);
        vehiclesInTheRace = getTheResult(vehiclesInTheRace);
        printRaceResults(vehiclesInTheRace);
    }

    public static List createVehicles(int numberOfVehicles) {
        List<Car> createdCars = new ArrayList<Car>();
        List<Motorcycle> createdMotorcycles = new ArrayList<Motorcycle>();
        List<Truck> createdTrucks = new ArrayList<Truck>();

        int carsNumber = 1;
        for (int i = 0; i < numberOfVehicles; i++) {
            String carName = carsNumber + "_CAR";
            Car car = new Car(carName, "CAR");
            carsNumber += 1;
            createdCars.add(car);
        }

        for (int i = 0; i < numberOfVehicles; i++) {
            String motorName = "Motorcycle " + motorsNumber;
            Motorcycle motorcycle = new Motorcycle(motorName, "MOTOR");
            motorsNumber += 1;
            createdMotorcycles.add(motorcycle);
        }


        for (int i = 0; i < numberOfVehicles; i++) {
            int trucksNumber = Math.round(randomNumber(1000, 0));
            int truckName = trucksNumber;
            Truck truck = new Truck(truckName, "TRUCK");
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
            Weather weather = new Weather();
            boolean rain = weather.setRaining();
            System.out.println("Race hour: " + (i + 1) + ".");
            if (rain) {
                System.out.println("Starts raining!");
            } else {
                System.out.println("No rains!");
            }
            for (Vehicle eachVehicle : listOfVehiclesInTheRace) {
                if (eachVehicle.getType() == "TRUCK") {
                    if (eachVehicle.getBrokenHoursOK() == 2 || eachVehicle.getBrokenHoursOK() == 1) {
                        eachVehicle.setBrokenHoursOK(eachVehicle.getBrokenHoursOK() - 1);
                        eachVehicle.setSpeed(0);
                        eachVehicle.setAvgSpeed(0);
                        eachVehicle.setDistanceTraveled(0);
                        eachVehicle.setMoveForAnHour(0);
                        eachVehicle.setBreakdownTurnsLeft(eachVehicle.getBreakdownTurnsLeft() + 1);
                        continue;
                    }
                }
                boolean isTruckBrokenDown = truckBrokenDown();
                if (isTruckBrokenDown) {
                    System.out.println("Truck broken down!");
                }
                if (isTruckBrokenDown) {
                    int speedLimit = 75;
                    if (eachVehicle.getType() == "TRUCK" && eachVehicle.getBrokenHoursOK() == 0) {
                        int currentCondition = eachVehicle.getBrokenHoursOK();
                        eachVehicle.setBrokenHoursOK(currentCondition + 2);
                        eachVehicle.setSpeed(0);
                        eachVehicle.setAvgSpeed(0);
                        eachVehicle.setDistanceTraveled(0);
                        eachVehicle.setMoveForAnHour(0);
                        eachVehicle.setBreakdownTurnsLeft(eachVehicle.getBreakdownTurnsLeft() + 1);
                        continue;
                    }
                    if (rain && eachVehicle.getType() == "MOTOR") {
                        int normalSpeed = randomNumber(speedLimit, 70);
                        int slowerSpeed = randomNumber(50, 5);
                        int rainSpeedSpeed = normalSpeed - slowerSpeed;
                        eachVehicle.setSpeed(rainSpeedSpeed);
                        eachVehicle.setAvgSpeed(rainSpeedSpeed);
                        eachVehicle.setDistanceTraveled(rainSpeedSpeed);
                        eachVehicle.setMoveForAnHour(1);
                        continue;
                    }
                    int currentSpeed = randomNumber(speedLimit, 70);
                    eachVehicle.setSpeed(currentSpeed);
                    eachVehicle.setAvgSpeed(currentSpeed);
                    eachVehicle.setDistanceTraveled(currentSpeed);
                    eachVehicle.setMoveForAnHour(1);
                    continue;
                } else if (isTruckBrokenDown != true) {
                    if (rain && eachVehicle.getType() == "MOTOR") {
                        int normalSpeed = randomNumber(100, 80);
                        int slowerSpeed = randomNumber(50, 5);
                        int rainSpeedSpeed = normalSpeed - slowerSpeed;
                        eachVehicle.setSpeed(rainSpeedSpeed);
                        eachVehicle.setAvgSpeed(rainSpeedSpeed);
                        eachVehicle.setDistanceTraveled(rainSpeedSpeed);
                        eachVehicle.setMoveForAnHour(1);
                        continue;
                    }
                }
                int currentSpeed = randomNumber(110, 80);
                eachVehicle.setSpeed(currentSpeed);
                eachVehicle.setAvgSpeed(currentSpeed);
                eachVehicle.setDistanceTraveled(currentSpeed);
                eachVehicle.setMoveForAnHour(1);
            }
        }
        return listOfVehiclesInTheRace;
    }

    public static void printRaceResults(List<Vehicle> listOfVehiclesInTheRace) {
        System.out.println("FINISH:");
        System.out.println();
        int finalResult = 1;
        for (Vehicle eachVehicle : listOfVehiclesInTheRace) {
            eachVehicle.setPosition(finalResult);
            if (finalResult < 31) {
                if (eachVehicle.getType() == "TRUCK") {
                    System.out.println(
                            "Position: " + eachVehicle.getPosition() +
                                    " || Name: " + eachVehicle.getNumName() +
                                    " || current speed: " + eachVehicle.getSpeed() + " km/h" +
                                    " || average speed: " + Math.round(eachVehicle.getAvgSpeed()) + " km/h" +
                                    " || hour(s) in the race: " + Math.round(eachVehicle.getMoveForAnHour()) +
                                    " || distance traveled in km: " + Math.round(eachVehicle.getDistanceTraveled()) +
                                    " || and broken hours was: " + eachVehicle.getBreakdownTurnsLeft());
                    finalResult += 1;
                    continue;
                }
                System.out.println(

                        "Position: " + eachVehicle.getPosition() +
                                " || Name: " + eachVehicle.getName() +
                                " || current speed: " + eachVehicle.getSpeed() + " km/h" +
                                " || average speed: " + Math.round(eachVehicle.getAvgSpeed()) + " km/h" +
                                " || hour(s) in the race: " + Math.round(eachVehicle.getMoveForAnHour()) +
                                " || distance traveled in km: " + Math.round(eachVehicle.getDistanceTraveled()) +
                                " || and broken hours was: " + eachVehicle.getBreakdownTurnsLeft());

            }
            finalResult += 1;
        }
    }

    public static int randomNumber(int high, int low) {
        Random random = new Random();
        int randomSpeed = random.nextInt(high - low) + low;
        return randomSpeed;
    }


    public static boolean truckBrokenDown() {
        boolean isTruckBrokenDown = false;
        int chanceToBrokenDown = 5;
        double truckCondition = Math.round(Math.random() * 100);
        if (truckCondition <= chanceToBrokenDown) {
            isTruckBrokenDown = true;
        }
        return isTruckBrokenDown;
    }


}
