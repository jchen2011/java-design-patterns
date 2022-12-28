package main.java.pizzaShop;

public class NYMargarithaPizza extends Pizza{
    public NYMargarithaPizza(String name, String dough, String sauce) {
        super(name, dough, sauce);
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
