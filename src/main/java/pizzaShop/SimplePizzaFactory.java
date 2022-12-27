package main.java.pizzaShop;

public class SimplePizzaFactory {

    public Pizza createPizza(String type) {
        return switch (type) {
            case "hawaii" -> new HawaiiPizza("Hawaii pizza", "thick", "BBQ sauce");
            case "margaritha" -> new MargarithaPizza("Margaritha pizza", "thick", "Tomato sauce");
            case "pepperoni" -> new PepperoniPizza("Pepperoni Pizza", "thick", "Tomato sauce");
            case "shoarma" -> new ShoarmaPizza("Shoarma pizza", "thick", "Garlic sauce");
            default -> throw new IllegalArgumentException("Unknown value" + type);
        };
    }
}
