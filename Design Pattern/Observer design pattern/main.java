import classes.Observer1Class;
import classes.WeatherData;
import classes.WeatherStationClass;

public class main {
  public static void main(String[] args) {
    
    // make weather station
    WeatherStationClass weatherStation = new WeatherStationClass();

    // make obersers
    Observer1Class observer1 = new Observer1Class();
    Observer1Class observer2 = new Observer1Class();

    // subscribe to weather station
    weatherStation.addObserver(observer1);
    weatherStation.addObserver(observer2);

    System.out.println("Weather before : ");
    System.out.println(observer1.getWeatherData());
    System.out.println(observer2.getWeatherData());


    // make weather data
    WeatherData weatherData = new WeatherData(30, 1, 10);
    weatherStation.updateWeatherData(weatherData);

    System.out.println("Weather After : ");
    System.out.println(observer1.getWeatherData());
    System.out.println(observer2.getWeatherData());
  }
}