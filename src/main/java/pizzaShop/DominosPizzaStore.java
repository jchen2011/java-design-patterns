package main.java.pizzaShop;

public class DominosPizzaStore extends PizzaStore {
    public Pizza createPizza(String type) {
        DominosIngredientFactory ingredientFactory = new DominosIngredientFactory();
        return switch (type) {
            case "hawaii" -> {
                Pizza pizza = new HawaiiPizza(ingredientFactory);
                pizza.setName("Domino's hawaii pizza");
                yield pizza;
            }
            case "margaritha" -> {
                Pizza pizza = new MargarithaPizza(ingredientFactory);
                pizza.setName("Domino's margaritha pizza");
                yield pizza;
            }
            case "pepperoni" -> {
                Pizza pizza = new PepperoniPizza(ingredientFactory);
                pizza.setName("Domino's pepperoni pizza");
                yield pizza;
            }

            case "shoarma" -> {
                Pizza pizza = new ShoarmaPizza(ingredientFactory);
                pizza.setName("Domino's shoarma pizza");
                yield pizza;
            }
            default -> throw new IllegalArgumentException("Unknown value: " + type);
        };
    }
}
