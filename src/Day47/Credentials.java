package Day47;

public class Credentials {
    public String name;
    public int age;

    public static String companyName;

    private String userName;
    private String password;

    static {
        companyName = "FaceBook";
    }

    public Credentials(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void setUserName(String userName){
        this.userName = userName;
    }
    public String getUserName(){
        return userName;
    }

    public void setPassword(String password){
        this.password = password;
    }
    public String getPassword(){
        return password;
    }

}
