public class TwoWheelerVehicle implements Vehicle{
    int wheels = 2;

    @Override
    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    @Override
    public int getWheels() {
        return wheels;
    }
}
