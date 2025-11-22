package classes;
import java.util.ArrayList;
import java.util.List;

import interfaces.ObserverInterface;
import interfaces.WeatherStationInterface;

public class WeatherStationClass implements WeatherStationInterface{
    private List<ObserverInterface> observerList = new ArrayList<>();
    private WeatherData weatherData;

    public WeatherStationClass(){
        this.weatherData=new WeatherData(0, 0, 0);
    }
    public void addObserver(ObserverInterface obj){
        this.observerList.add(obj);
    }

    public void removeObserver(ObserverInterface obj){
        this.observerList.remove(obj);
    }

    public void updateWeatherData(WeatherData data){
        this.weatherData=data;
        this.notifyObservers();
    }

    public void notifyObservers(){
        for (ObserverInterface observerInterface : observerList) {
            observerInterface.update(this.weatherData);
        }
    }
}
