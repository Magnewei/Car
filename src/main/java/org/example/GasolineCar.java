package org.example;

public class GasolineCar extends AFuelCar {

    public GasolineCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPerLitre) {
        super(registrationNumber, make, model, numberOfDoors, kmPerLitre);
    }


    //Returns registration fee relative to the given object value of WhPrKm.
    public int getRegistrationFee() {
        final int registrationFee;

        if(kmPerLitre <= 50 && kmPerLitre >= 20) {
            return registrationFee = 330;
        } else if(kmPerLitre >= 15 && kmPerLitre <= 20) {
            return registrationFee = 1050;

        } else if(kmPerLitre  >= 5 && kmPerLitre <= 10) {
            return registrationFee = 5500;
        } else if(kmPerLitre <5){
            return registrationFee = 10470;
        } else {
            return registrationFee = 0;
        }
    }

    @Override
    String getFuelType() {
        return "Gasoline";
    }

    @Override
    public String toString() {

        String superString = super.toString();
        String presentCar1 = "and uses a fuel type of " + getFuelType() + "." + " The registration fee is " + getRegistrationFee()+".";
        return superString + presentCar1;

    }
}
