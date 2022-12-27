package main.java.pizzaShop;

public class PizzaApp {
    public static void main(String[] args) {
        SimplePizzaFactory simplePizzaFactory = new SimplePizzaFactory();
        PizzaStore store = new PizzaStore(simplePizzaFactory);
        store.orderPizza("shoarma");
    }
}
