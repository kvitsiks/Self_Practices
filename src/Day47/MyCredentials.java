package Day47;

public class MyCredentials {
    public static void main(String[] args) {
        Credentials obj1 = new Credentials("Mike", 33);

        obj1.setUserName("user1");
        obj1.setPassword("123321");

        System.out.println(obj1.getUserName());
        System.out.println(obj1.getPassword());

        System.out.println(obj1.name);
        System.out.println(obj1.age);
        System.out.println(obj1.companyName);
    }
}
