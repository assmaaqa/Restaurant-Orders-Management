import java.io.File;
import java.io.IOException;

public class Files {
    public static File ordersFile = new File("ordersFile.txt");
    public static File customersFile = new File("customersFile.txt");
    public static File employeesFile = new File("employeesFile.txt");
    public static File recipesFile = new File("recipesFile.txt");
    public static void createFiles(){
        try {
            ordersFile.createNewFile();
            customersFile.createNewFile();
            employeesFile.createNewFile();
            recipesFile.createNewFile();
        } catch (IOException e) {
        }
    }
}
