package main.java.weatherApp;

public interface Observer {
    void update(float temp, float humidity, float pressure);
}
