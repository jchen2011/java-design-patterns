package main.java.pizzaShop;

import main.java.pizzaShop.pizza.*;

public class NYPizzaStore extends PizzaStore {

    public Pizza createPizza(String type) {
        NYIngredientFactory ingredientFactory = new NYIngredientFactory();
        return switch (type) {
            case "hawaii" -> new HawaiiPizza("New York hawaii pizza", ingredientFactory);
            case "margaritha" -> new MargarithaPizza("New York margaritha pizza", ingredientFactory);
            case "pepperoni" -> new PepperoniPizza("New York pepperoni pizza", ingredientFactory);
            case "shoarma" -> new ShoarmaPizza("New York shoarma pizza", ingredientFactory);
            default -> throw new IllegalArgumentException("Unknown value: " + type);
        };
    }
}
