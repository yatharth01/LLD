public class Main {
    public static void main(String[] args) {
        VehicleFactory twoWheelerFactory = new TwoWheelerFactory();

        Vehicle twoWheelerVehicle1 = twoWheelerFactory.createVehicle();

        System.out.println(twoWheelerVehicle1.getWheels());

        VehicleFactory fourWheelerFactory = new FourWheelerFactory();

        Vehicle fourWheelerVehicle1 = fourWheelerFactory.createVehicle();

        System.out.println(fourWheelerVehicle1.getWheels());

    }
}