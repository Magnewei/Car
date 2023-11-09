package org.example;

public class GasolineCar extends AFuelCar {


   public GasolineCar(int kmPerLitre) {
        super(kmPerLitre);
    }



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
        String present1 = "This gasolinecar";
        return "";
    }
}
