import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class Order implements Serializable {
    private int id;
    public static int idCounter;
    private ArrayList<Recipe> recipes;
    private Customer customer;
    private Date dateOfOrder;
    private Date dateOfDelivery;
    private OrderStatus status;
    private OrderType type;
    private int discountPercent;
    private double totalPrice;
    public Order(ArrayList<Recipe>recipes,Customer customer,Date dateOfDelivery,OrderStatus status,OrderType type,int discountPercent,double totalPrice){
        idCounter++;
        id=idCounter;
        this.recipes=recipes;
        this.customer=customer;
        dateOfOrder=new Date();
        this.dateOfDelivery=dateOfDelivery;
        this.status=status;
        this.type=type;
        this.discountPercent=discountPercent;
        this.totalPrice-=discountPercent*totalPrice/100;
    }

    public void setDateOfDelivery(Date dateOfDelivery) {
        this.dateOfDelivery = dateOfDelivery;
    }

    public int getId() {
        return id;
    }

    public ArrayList<Recipe> getRecipes() {
        return recipes;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Date getDateOfOrder() {
        return dateOfOrder;
    }

    public Date getDateOfDelivery() {
        return dateOfDelivery;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public OrderType getType() {
        return type;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}
