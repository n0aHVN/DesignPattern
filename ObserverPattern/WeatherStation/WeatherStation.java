package ObserverPattern.WeatherStation;


import ObserverPattern.WeatherStation.Observer.CurrentConditionDisplay;
import ObserverPattern.WeatherStation.Observer.Observer;
import ObserverPattern.WeatherStation.Subject.WeatherData;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        Observer currentDisplay = new CurrentConditionDisplay();
        
        weatherData.registerObserver(currentDisplay);
        weatherData.measurementsChanged(80.f, 65.f, 30.f);
        weatherData.measurementsChanged(82.f, 70.f, 29.f);
        weatherData.measurementsChanged(78.f, 90.f, 29.f);
    }
}
