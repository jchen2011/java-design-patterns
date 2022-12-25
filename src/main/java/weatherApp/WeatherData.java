package main.java.weatherApp;

import java.util.ArrayList;

public class WeatherData implements Subscriber{
    private ArrayList<Observer> observers;
    private float temp;
    private float humidty;
    private float pressure;

    public WeatherData() {
        this.observers = new ArrayList<>();
    }

    public void setWeatherConditions(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidty = humidity;
        this.pressure = pressure;
        this.measurementsChanged();
    }

    @Override
    public void registerObserver(Observer o) {
        this.observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        this.observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(getTemp(), getHumidty(), getPressure());
        }
    }

    public void measurementsChanged() {
        this.notifyObservers();
    }

    public float getHumidty() {
        return this.humidty;
    }

    public float getTemp() {
        return this.temp;
    }

    public float getPressure() {
        return this.pressure;
    }




}
