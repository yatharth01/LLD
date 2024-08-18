public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStationImpl();
        PhoneWeatherUpdateImpl phoneWeatherUpdate = new PhoneWeatherUpdateImpl(weatherStation);
        WindowsWeatherUpdateImpl windowsWeatherUpdate = new WindowsWeatherUpdateImpl(weatherStation);

        weatherStation.subscribe(phoneWeatherUpdate);
        weatherStation.subscribe(windowsWeatherUpdate);

        weatherStation.notifyTemperature();

        phoneWeatherUpdate.display();
        windowsWeatherUpdate.display();
    }
}