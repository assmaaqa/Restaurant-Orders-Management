import java.io.*;

public class ReadFiles {
    public static FileInputStream fileInputStream;
    public static ObjectInputStream objectInputStream;
    public static void read(){
        File file;
        try {
            file=Files.ordersFile;
            fileInputStream = new FileInputStream(file);
            objectInputStream=new ObjectInputStream(fileInputStream);
            while (fileInputStream.available()!=0){
                Restaurant.orders.add((Order) objectInputStream.readObject());
            }
            file = Files.customersFile;
            fileInputStream = new FileInputStream(file);
            objectInputStream=new ObjectInputStream(fileInputStream);
            while (fileInputStream.available()!=0) {
                Restaurant.customers.add((Customer) objectInputStream.readObject());
            }
            file = Files.employeesFile;
            fileInputStream = new FileInputStream(file);
            objectInputStream=new ObjectInputStream(fileInputStream);
            while (fileInputStream.available()!=0) {
                Restaurant.employees.add((Employee) objectInputStream.readObject());
            }
            file = Files.recipesFile;
            fileInputStream = new FileInputStream(file);
            objectInputStream = new ObjectInputStream(fileInputStream);
            while (fileInputStream.available() != 0) {
                Restaurant.recipes.add((Recipe) objectInputStream.readObject());
            }
        }
        catch (FileNotFoundException e){
        }catch (IOException e){
        }catch (ClassNotFoundException e){
        }
    }
}
