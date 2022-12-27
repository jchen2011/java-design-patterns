package main.java.pizzaShop;

public class SimplePizzaFactory {

    public Pizza createPizza(String type) {
        return switch (type) {
            case "hawaii" -> new HawaiiPizza();
            case "margaritha" -> new MargarithaPizza();
            case "pepperoni" -> new PepperoniPizza();
            case "shoarma" -> new ShoarmaPizza();
            default -> throw new IllegalArgumentException("Unknown value" + type);
        };
    }
}
