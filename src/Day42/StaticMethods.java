package Day42;

public class StaticMethods {
    int a = 200;
    static int b = 400;

    public static void main(String[] args) {
        StaticMethods obj = new StaticMethods();
        System.out.println(b);
        staticMethod();
        obj.instanceMethod();//instanceMethod can be only called through object

    }
    public static void staticMethod(){

    }
    public void instanceMethod(){

    }
}
