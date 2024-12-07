import java.util.ArrayList;
import java.util.Date;

public class Order {
    private int id;
    public static int idCounter;
    public ArrayList<Recipe> recipes;
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
}
