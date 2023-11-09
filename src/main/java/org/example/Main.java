package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        FleetOfCars fleet = new FleetOfCars();

        //Add car objects.
        fleet.addCar(new DieselCar("XD Z15 400", "Mercedes","C30 CDI AMG" , 5,10, true));
        fleet.addCar(new GasolineCar("LN 320 210", "BMW", "Gran Coupe", 5, 9));
        fleet.addCar(new ElectricCar("DN 2203 50", "Tesla", "Model 3", 5, 60, 540));

        //Call fleet toString
        System.out.println(fleet);


    }
}