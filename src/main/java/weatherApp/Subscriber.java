package main.java.weatherApp;

public interface Subscriber {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
