package main.java.weatherApp;

public class ForecastDisplay implements Observer, DisplayElement{
    private final WeatherData weatherData;

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    @Override
    public void update() {
        display();
    }

    @Override
    public void display() {
        System.out.println("Forecast:");
    }
}
