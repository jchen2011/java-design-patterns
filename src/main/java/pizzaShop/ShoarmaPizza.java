package main.java.pizzaShop;

public class ShoarmaPizza extends Pizza{
    public ShoarmaPizza(PizzaIngredientFactory factory) {
        super(factory);
    }

    @Override
    public void prepare() {
        System.out.println("Preparing: " + getName());
        Dough dough = getIngredientFactory().createDough();
        Sauce sauce = getIngredientFactory().createSauce();
        Cheese cheese = getIngredientFactory().createCheese();
    }
}
