public class VehicleMain {

    public static void main(String[] args) {

        Car car = new Car();
        car.setVehicleNumber("UP81AB1234");
        car.setVehicleType("Car");
        car.setDailyRate(2000);

        Bike bike = new Bike();
        bike.setVehicleNumber("UP81XY5678");
        bike.setVehicleType("Bike");
        bike.setDailyRate(500);

        Truck truck = new Truck();
        truck.setVehicleNumber("UP81TR9999");
        truck.setVehicleType("Truck");
        truck.setDailyRate(4000);
        truck.setLoadingCharge(1500);

        int days = 5;

        car.displayVehicleInfo();
        System.out.println("Rental Cost : " + car.calculateRentalCost(days));

        System.out.println();

        bike.displayVehicleInfo();
        System.out.println("Rental Cost : " + bike.calculateRentalCost(days));

        System.out.println();

        truck.displayVehicleInfo();
        System.out.println("Rental Cost : " + truck.calculateRentalCost(days));
    }
}