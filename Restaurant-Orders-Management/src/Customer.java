import java.util.ArrayList;

public class Customer {
    private int id;
    public static int idCounter;
    private String name;
    private ArrayList<Order> orders;
    private int discountPercent;
    private int ordersCounter;
    private String address;
    public Customer(String name,ArrayList<Order> orders,int discountPercent,String address){
        idCounter++;
        id=idCounter;
        ordersCounter++;
        this.name=name;
        this.orders=orders;
        this.discountPercent=discountPercent;
        this.address=address;
    }
}
