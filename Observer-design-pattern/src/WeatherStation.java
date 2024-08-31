public interface WeatherStation {

    public void subscribe(WeatherUpdate weatherUpdate);

    public void unsubscribe(WeatherUpdate weatherUpdate);
    public void notifyTemperature();

    public int getTemperature();
}
