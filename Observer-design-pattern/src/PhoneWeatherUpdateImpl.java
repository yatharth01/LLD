public class PhoneWeatherUpdateImpl implements WeatherUpdate, Display{

    WeatherStation weatherStation;

    PhoneWeatherUpdateImpl(WeatherStation weatherStation){
        this.weatherStation = weatherStation;
    }
    @Override
    public void update() {
        System.out.println("The updating the phone weather");
    }

    @Override
    public void display() {
        System.out.println("Displaying the temperature "+ weatherStation.getTemperature()) ;
    }
}
