package main.java.duckBehaviour;

public class MuteQuack implements QuackBehaviour{
    @Override
    public void quack() {
        System.out.println("mute");
    }
}
