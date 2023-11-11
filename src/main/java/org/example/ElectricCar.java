package org.example;

public class ElectricCar extends ACar {
    final private int batteryCapacity;
    final private int maxRange;

    public ElectricCar(String registrationNumber, String make, String model, int numberOfDoors, int batteryCapacity, int maxRange) {
        super(registrationNumber, make, model, numberOfDoors);
        this.batteryCapacity = batteryCapacity;
        this.maxRange = maxRange;
    }

    public int getBatteryCapacityKWh() {

       return batteryCapacity;
    }

    public int getMaxRangeKm() {
        return maxRange;
    }

   public int getWhPrKm() {
        final int wattHours = getBatteryCapacityKWh() / 1000; // converts from kilo to non-kilo watts.
        return wattHours / getMaxRangeKm();
    }


    //Returns registration fee relative to the given object value of WhPrKm.
    public int getRegistrationFee() {
        final double batteryCapacityConversion  = getWhPrKm() / 91.25 / 100;  // km/l conversion of battery capacity
        final int registrationFee;

        if(batteryCapacityConversion <= 50 && batteryCapacityConversion > 20) {
            return registrationFee = 330;

        } else if(batteryCapacityConversion >= 15 && batteryCapacityConversion <= 20) {
            return registrationFee = 1050;

        } else if(batteryCapacityConversion >= 10 && batteryCapacityConversion < 15) {
            return registrationFee = 2340;

        } else if(batteryCapacityConversion  >= 5 && batteryCapacityConversion < 10) {
            return registrationFee = 5500;

        } else if(batteryCapacityConversion <5){
            return registrationFee = 10470;

        } else {
            return registrationFee = 0;
        }
    }


    public String toString() {
        String presentCar1 = "The car is an " + getMake() + " of the model: " + getModel() + " with the registration number: " + getRegistrationNumber() + ".";
        String presentCar2 = " It can drive an average of " + getMaxRangeKm() +" kilometres on a charge. It's battery capacity is " + getBatteryCapacityKWh() + ".";
        String presentCar3 = " It has " + getNumberOfDoors() + " doors and it's registration fee is " + getRegistrationFee() + ".";
        return presentCar1 + presentCar2 + presentCar3;

    }
}
