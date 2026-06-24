package Vehicle Management System;

public class Main {

    public static void main(String[] args) {

        ElectricVehicle ev =
                new ElectricVehicle("Tesla Model 3", 250);

        PetrolVehicle pv =
                new PetrolVehicle("Honda City", 180);

        VehicleUtility utility = new VehicleUtility();

        System.out.println("Electric Vehicle Details");
        utility.showElectricVehicle(ev);

        System.out.println();

        System.out.println("Petrol Vehicle Details");
        utility.showPetrolVehicle(pv);
    }
}