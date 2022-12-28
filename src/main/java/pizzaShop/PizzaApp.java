package main.java.pizzaShop;

public class PizzaApp {
    public static void main(String[] args) {
        PizzaStore dominosPizzaStore = new DominosPizzaStore();
        dominosPizzaStore.orderPizza("shoarma");

        PizzaStore nyPizzaStore = new NYPizzaStore();
        nyPizzaStore.orderPizza("shoarma");
    }
}
