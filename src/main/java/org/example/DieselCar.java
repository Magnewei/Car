package org.example;

public class DieselCar extends AFuelCar {
    private int kmPerLitre;
    private boolean particleFilter;

    public DieselCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPerLitre, boolean particleFilter) {
        super(registrationNumber, make, model, numberOfDoors, kmPerLitre);;
        this.particleFilter = particleFilter;
    }


    public boolean hasParticleFilter() {
        return particleFilter;
    }

    public void setKmPerLitre(int kmPerLitre) {
        this.kmPerLitre = kmPerLitre;
    }

    @Override
    String getFuelType() {
        return "diesel";
    }

    //Returns registration fee relative to the given object value of WhPrKm.
    @Override
    public int getRegistrationFee() {
        final int registrationFee;
        final int dieselFee;

        if (kmPerLitre <= 50 && kmPerLitre > 20) {
            dieselFee = 130;
            return registrationFee = 330 + dieselFee;

        } else if (kmPerLitre > 15 && kmPerLitre <= 20) {
            dieselFee = 1390;
            return registrationFee = 1050 + dieselFee;

        } else if (kmPerLitre >= 10 && kmPerLitre <= 15) {
            dieselFee = 1850;
            return registrationFee = 5500 + dieselFee;

        } else if (kmPerLitre >= 5 && kmPerLitre < 10) {
            dieselFee = 2770;
            return registrationFee = 5500+ dieselFee;

        } else if (kmPerLitre < 5) {
            dieselFee = 15260;
            return registrationFee = 10470 + dieselFee;

        } else {
            return registrationFee = 0;
        }
    }
    @Override
    public String toString() {
        String superString = super.toString();

        // ternary operator that checks  hasParticleFilter() return value and assigns string value thereafter.
         final String particleFilter = hasParticleFilter() ? "includes a particle filter." : "doesn't include a particle filter";

        //String particleFilter = "";

        String presentCar1 = "and uses a fuel type of " + getFuelType() + "." + " The registration fee is " + getRegistrationFee()+" and the car " + particleFilter;
        return superString + presentCar1;
    }



}
