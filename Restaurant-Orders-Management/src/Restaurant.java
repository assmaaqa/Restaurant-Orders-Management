import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Restaurant {
    private String name;
    private Manager manager;
    private int ordersCounter;
    private double dailyReturns;
    public ArrayList<Employee> employees;
    public Queue<Order> orders;
    public PriorityQueue<Recipe> recipes;
    public PriorityQueue<Customer> customers;
    public Restaurant(String name,Manager manager){
        this.name=name;
        this.manager=manager;
    }
}
