package main.java.pizzaShop.pizza;


import main.java.pizzaShop.PizzaIngredientFactory;
import main.java.pizzaShop.toppings.*;

public abstract class Pizza {
    private PizzaIngredientFactory ingredientFactory;
    private String name;
    private Dough dough;
    private Sauce sauce;
    private Veggies veggies[];
    private Cheese cheese;
    private Pepperoni pepperoni;
    private Clams clam;

    public Pizza(String name, PizzaIngredientFactory ingredientFactory) {
        this.name = name;
        this.ingredientFactory = ingredientFactory;
    }
    public abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return this.name;
    }

    public PizzaIngredientFactory getIngredientFactory() {
        return this.ingredientFactory;
    }
}
