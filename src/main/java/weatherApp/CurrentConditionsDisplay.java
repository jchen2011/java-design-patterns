package main.java.weatherApp;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temp;
    private float humidity;
    private final WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    @Override
    public void update() {
        this.temp = weatherData.getTemp();
        this.humidity = weatherData.getHumidty();
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions:" + this.temp + "F degrees and " + this.humidity + "% humidity");
    }
}
