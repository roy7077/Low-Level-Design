package interfaces;

import classes.WeatherData;

public interface WeatherStationInterface {

    void addObserver(ObserverInterface obj);
    void removeObserver(ObserverInterface obj);
    void notifyObservers();
    void updateWeatherData(WeatherData data);
}
