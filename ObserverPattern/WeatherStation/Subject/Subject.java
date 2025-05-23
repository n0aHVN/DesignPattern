package ObserverPattern.WeatherStation.Subject;

import ObserverPattern.WeatherStation.Observer.Observer;

public interface Subject {
    void registerObserver(Observer O);
    void deleteObserver(Observer O);
    void notifyObservers(float temperature, float humidity, float pressure);
}
