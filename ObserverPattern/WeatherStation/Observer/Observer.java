package ObserverPattern.WeatherStation.Observer;

public interface Observer {
    void update(float temperature, float humidity, float pressure);
}
