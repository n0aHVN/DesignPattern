package ObserverPattern.WeatherStation.Subject;

import java.util.ArrayList;
import java.util.List;

import ObserverPattern.WeatherStation.Observer.Observer;

public class WeatherData implements Subject {
    private List<Observer> observers;
    public WeatherData(){
        observers = new ArrayList<Observer>();
    }
    @Override
    public void registerObserver(Observer O){
        observers.add(O);
    }
    @Override
    public void deleteObserver(Observer O){
        observers.remove(O);
    }
    @Override
    public void notifyObservers(float temperature, float humidity, float pressure){
        for (Observer observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }
    // Example of state change
    public void measurementsChanged(float temperature, float humidity, float pressure) {
        notifyObservers(temperature, humidity, pressure);
    }
}
