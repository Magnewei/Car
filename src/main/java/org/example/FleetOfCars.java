package org.example;

import java.util.ArrayList;

public class FleetOfCars {
    ArrayList <Car> fleet = new ArrayList<Car>();
    FleetOfCars() {


    }

    void addCar(Car car) {
        fleet.add(car);
    }

    //Gets the total registration fee of all cars
    //By looping through the arrayList an utilizing the car objects internal method for getting the fee.
    public int getTotalRegistrationFeeForFleet() {
        int totalRegistrationFee = 0;
        for(Car car : fleet) {
           totalRegistrationFee += car.getRegistrationFee();
        }
        return totalRegistrationFee;
    }

    @Override
    public String toString() {
        String carFleet = "";
        for(Car car : fleet) {
            System.out.println(car+ "\n");
        }
        return "The total registration fee of our car fleet is: " + getTotalRegistrationFeeForFleet();
    }
}
