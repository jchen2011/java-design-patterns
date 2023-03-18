package main.java.duckBehaviour;

public abstract class Duck {
    FlyingBehaviour flyingBehaviour;
    QuackBehaviour quackBehaviour;


    public void fly() {
        flyingBehaviour.fly();
    }

    public void quack() {
        quackBehaviour.quack();
    }

    public abstract void display();
}
