public class Employee {
    private int id;
    public static int idCounter;
    private static String password="employeesPassword";
    private String name;
    public Employee(String name){
        this.name=name;
    }

    public static void setPassword(String oldPassword,String password) {
        if(oldPassword.equals(Employee.password))
            Employee.password = password;
    }
}
