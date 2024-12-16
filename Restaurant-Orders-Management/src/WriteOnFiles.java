import java.io.*;

public class WriteOnFiles {

    public static FileOutputStream fileOutputStream;
    public static <T> void write(T object){
        File file=null;
        try {
            if (object instanceof Order){
                file=Files.ordersFile;
                fileOutputStream = new FileOutputStream(file,true);
            } else if (object instanceof Customer) {
                file = Files.customersFile;
                fileOutputStream = new FileOutputStream(file,true);
            } else if (object instanceof  Employee) {
                file = Files.employeesFile;
                fileOutputStream = new FileOutputStream(file,true);
            } else if (object instanceof Recipe) {
                file = Files.recipesFile;
                fileOutputStream = new FileOutputStream(file,true);
            }
            if(file.length()==0) {
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
                objectOutputStream.writeObject(object);
                objectOutputStream.close();
            }else {
                RestaurantOutputStream outputStream = new RestaurantOutputStream(fileOutputStream);
                outputStream.writeObject(object);
                outputStream.close();
            }
        } catch (FileNotFoundException e){
        } catch (IOException e){
        }

    }

}
