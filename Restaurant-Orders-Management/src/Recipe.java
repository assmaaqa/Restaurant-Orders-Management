import java.util.ArrayList;

public class Recipe {
    private String name;
    private RecipeType type;
    private double price;
    private int ordersCounter;
    private ArrayList<Ingredients> ingredients;
    public Recipe(String name, RecipeType type, double price, ArrayList<Ingredients>ingredients){
        this.name=name;
        this.type=type;
        this.price=price;
        ordersCounter++;
        this.ingredients=ingredients;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
