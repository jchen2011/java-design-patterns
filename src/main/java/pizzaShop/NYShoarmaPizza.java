package main.java.pizzaShop;

public class NYShoarmaPizza extends Pizza{
    public NYShoarmaPizza(String name, String dough, String sauce) {
        super(name, dough, sauce);
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
