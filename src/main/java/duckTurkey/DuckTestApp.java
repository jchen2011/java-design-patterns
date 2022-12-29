package main.java.duckTurkey;

public class DuckTestApp {
    public static void main(String[] args) {
        Turkey turkey = new WildTurkey();
        Duck adapter = new TurkeyAdapter(turkey);

        adapter.quack();
        adapter.fly();
    }
}
