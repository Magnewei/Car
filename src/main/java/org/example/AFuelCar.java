package org.example;

public abstract class AFuelCar extends ACar {

    int kmPerLitre;

    AFuelCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPerLitre) {
        super(registrationNumber, make, model, numberOfDoors);
        this.kmPerLitre = kmPerLitre;
    }


    abstract String getFuelType();


    int getKmPerLitre() {
        return kmPerLitre;
    }

    @Override
    public String toString() {
        String presentCar1 = "The car is a " + getMake() + " model: " + getModel() + " with registration number: " + getRegistrationNumber() +".";
        String presentCar2 = " It can drive " + getKmPerLitre() + " km per litre. It has " + getNumberOfDoors() + " doors ";
        return presentCar1 + presentCar2;
    }

}
