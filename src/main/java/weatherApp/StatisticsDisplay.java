package main.java.weatherApp;

public class StatisticsDisplay implements Observer, DisplayElement{
    private final WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update() {
        display();
    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature = ");
    }
}
