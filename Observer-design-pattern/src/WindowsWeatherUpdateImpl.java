public class WindowsWeatherUpdateImpl implements WeatherUpdate, Display{

    WeatherStation weatherStation;

    WindowsWeatherUpdateImpl(WeatherStation weatherStation){
        this.weatherStation = weatherStation;
    }
    @Override
    public void update() {
        System.out.println("The updating the windows weather");
    }

    @Override
    public void display() {
        System.out.println("Displaying the temperature in windows " + weatherStation.getTemperature());
    }
}
