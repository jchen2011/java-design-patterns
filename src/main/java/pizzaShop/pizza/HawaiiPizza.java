package main.java.pizzaShop.pizza;

import main.java.pizzaShop.PizzaIngredientFactory;
import main.java.pizzaShop.toppings.Cheese;
import main.java.pizzaShop.toppings.Dough;
import main.java.pizzaShop.toppings.Sauce;

public class HawaiiPizza extends Pizza{

    public HawaiiPizza(String name, PizzaIngredientFactory factory) {
        super(name, factory);
    }

    @Override
    public void prepare() {
        System.out.println("Preparing: " + getName());
        Dough dough = getIngredientFactory().createDough();
        Sauce sauce = getIngredientFactory().createSauce();
        Cheese cheese = getIngredientFactory().createCheese();
        System.out.println(dough.getClass());
    }
}
