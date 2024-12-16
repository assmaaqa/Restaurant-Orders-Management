public class Manager {
    private String password;
    public Manager(){

    }

    public void setPassword(String password, String oldPassword) {
        if(oldPassword.equals(password))
            this.password = password;
    }
}
