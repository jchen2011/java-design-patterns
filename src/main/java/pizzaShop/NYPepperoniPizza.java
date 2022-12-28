package main.java.pizzaShop;

public class NYPepperoniPizza extends Pizza{
    public NYPepperoniPizza(String name, String dough, String sauce) {
        super(name, dough, sauce);
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
