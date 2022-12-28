package main.java.pizzaShop;

public class HawaiiPizza extends Pizza{

    public HawaiiPizza(PizzaIngredientFactory factory) {
        super(factory);
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
