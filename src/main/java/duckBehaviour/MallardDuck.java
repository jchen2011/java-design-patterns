package main.java.duckBehaviour;

public class MallardDuck extends Duck{

    public MallardDuck() {
        flyingBehaviour = new FlyWithWings();
        quackBehaviour = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("I am a mallard duck");
    }
}
