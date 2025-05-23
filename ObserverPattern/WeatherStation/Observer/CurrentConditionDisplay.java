package ObserverPattern.WeatherStation.Observer;

public class CurrentConditionDisplay implements Observer{
    private float temperature;
    private float humidity;
    @Override
    public void update(float temperature, float humidity, float pressure){
        System.out.println("Temperature: "+ temperature);
        System.out.println("Humidity"+humidity);
        this.temperature = temperature;
        this.humidity = humidity;
    }
}
