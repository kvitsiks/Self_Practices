package Day55_Abstraction;
final class A {
    int a = 10;
    static int b = 20;

    public void instanceMethod(){
        System.out.println("instance method");
    }
    public static void staticMethod(){
        System.out.println("static method");
    }
    public A() {}

    static {
    }
    //public abstract void abstractMethod ();
}

abstract class B {
    int a = 10;
    static int b = 20;

    public void instanceMethod(){
        System.out.println("instance method");
    }
    public static void staticMethod(){
        System.out.println("static method");
    }

    static {
    }

    public B() {}

    public abstract void abstractMethod ();
}

public class AbstractClassVsRegularClass {

}
