package main.java.pizzaShop;

public class NYPizzaStore extends PizzaStore {

    public Pizza createPizza(String type) {
        NYIngredientFactory ingredientFactory = new NYIngredientFactory();
        return switch (type) {
            case "hawaii" -> {
                Pizza pizza = new HawaiiPizza(ingredientFactory);
                pizza.setName("New York hawaii pizza");
                yield pizza;
            }
            case "margaritha" -> {
                Pizza pizza = new MargarithaPizza(ingredientFactory);
                pizza.setName("New York margaritha pizza");
                yield pizza;
            }
            case "pepperoni" -> {
                Pizza pizza = new PepperoniPizza(ingredientFactory);
                pizza.setName("New York pepperoni pizza");
                yield pizza;
            }

            case "shoarma" -> {
                Pizza pizza = new ShoarmaPizza(ingredientFactory);
                pizza.setName("New York shoarma pizza");
                yield pizza;
            }
            default -> throw new IllegalArgumentException("Unknown value: " + type);
        };
    }
}
