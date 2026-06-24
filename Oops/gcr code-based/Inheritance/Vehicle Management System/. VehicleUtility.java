package Vehicle Management System;

public class VehicleUtility {

    public void showElectricVehicle(ElectricVehicle vehicle) {

        vehicle.displayInfo();
        vehicle.charge();
    }

    public void showPetrolVehicle(PetrolVehicle vehicle) {

        vehicle.displayInfo();
        vehicle.refuel();
    }
}