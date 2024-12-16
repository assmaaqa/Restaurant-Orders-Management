import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Restaurant {
    private final static String name="restaurant";
    private static Manager manager=new Manager();
    private static int ordersCounter;
    private static double dailyReturns;
    public static ArrayList<Employee> employees=new ArrayList<>();
    public static Queue<Order> orders=new LinkedList<>();
    public static PriorityQueue<Recipe> recipes=new PriorityQueue<>();
    public static PriorityQueue<Customer> customers=new PriorityQueue<>();

}
