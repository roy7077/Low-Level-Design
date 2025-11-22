package classes;

import interfaces.ObserverInterface;

public class Observer1Class implements ObserverInterface {

    private WeatherData data;

    public Observer1Class() {
        this.data = new WeatherData(0, 0, 0);
    }

    @Override
    public void update(WeatherData data) {
        this.data = data;
    }

    // Getters to access WeatherData fields
    public double getTemperature() {
        return data.getTemperature();
    }

    public double getHumidity() {
        return data.getHumidity();
    }

    public double getPressure() {
        return data.getPressure();
    }

    // return the whole WeatherData object
    public WeatherData getWeatherData() {
        return data;
    }
}
