package main.java.pizzaShop;

import main.java.pizzaShop.pizza.*;

public class DominosPizzaStore extends PizzaStore {
    public Pizza createPizza(String type) {
        DominosIngredientFactory ingredientFactory = new DominosIngredientFactory();
        return switch (type) {
            case "hawaii" -> new HawaiiPizza("Domino's hawaii pizza", ingredientFactory);
            case "margaritha" -> new MargarithaPizza("Domino's margaritha pizza", ingredientFactory);
            case "pepperoni" -> new PepperoniPizza("Domino's pepperoni pizza", ingredientFactory);
            case "shoarma" -> new ShoarmaPizza("Domino's shoarma pizza", ingredientFactory);
            default -> throw new IllegalArgumentException("Unknown value: " + type);
        };
    }
}
