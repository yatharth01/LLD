public class FourWheelerVehicle implements Vehicle{
    int wheels = 4;
    @Override
    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    @Override
    public int getWheels() {
        return wheels;
    }
}
