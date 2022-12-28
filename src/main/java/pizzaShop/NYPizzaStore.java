package main.java.pizzaShop;

public class NYPizzaStore extends PizzaStore {
    public Pizza createPizza(String type) {
        return switch (type) {
            case "hawaii" -> new NYHawaiiPizza("Hawaii pizza", "thin", "Tomato Sauce");
            case "margaritha" -> new NYMargarithaPizza("Margaritha pizza", "thin", "Tomato sauce");
            case "pepperoni" -> new NYPepperoniPizza("Pepperoni Pizza", "thin", "Tomato sauce");
            case "shoarma" -> new NYShoarmaPizza("Shoarma pizza", "thin", "Garlic sauce");
            default -> throw new IllegalArgumentException("Unknown value: " + type);
        };
    }
}
