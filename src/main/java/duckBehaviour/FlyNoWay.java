package main.java.duckBehaviour;

public class FlyNoWay implements FlyingBehaviour{
    @Override
    public void fly() {
        System.out.println("I can't fly!");
    }
}
