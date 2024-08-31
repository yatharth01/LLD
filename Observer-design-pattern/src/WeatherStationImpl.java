import java.util.ArrayList;
import java.util.List;

public class WeatherStationImpl implements WeatherStation{

    List<WeatherUpdate> weatherUpdateList = new ArrayList<>();

    @Override
    public void subscribe(WeatherUpdate weatherUpdate) {
        this.weatherUpdateList.add(weatherUpdate);
    }

    @Override
    public void unsubscribe(WeatherUpdate weatherUpdate) {
        this.weatherUpdateList.remove(weatherUpdate);
    }

    @Override
    public void notifyTemperature() {
        System.out.println("Notifying new temperature update");
        //Do something
        for (WeatherUpdate w : weatherUpdateList){
            w.update();
        }
    }

    @Override
    public int getTemperature() {
        return 50;
    }
}
