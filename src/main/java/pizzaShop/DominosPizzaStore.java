package main.java.pizzaShop;

public class DominosPizzaStore extends PizzaStore {
    public Pizza createPizza(String type) {
        return switch (type) {
            case "hawaii" -> new DominosHawaiiPizza("Hawaii pizza", "thick", "BBQ sauce");
            case "margaritha" -> new DominosMargarithaPizza("Margaritha pizza", "thick", "Tomato sauce");
            case "pepperoni" -> new DominosPepperoniPizza("Pepperoni Pizza", "thick", "Tomato sauce");
            case "shoarma" -> new DominosShoarmaPizza("Shoarma pizza", "thick", "Garlic sauce");
            default -> throw new IllegalArgumentException("Unknown value: " + type);
        };
    }
}
