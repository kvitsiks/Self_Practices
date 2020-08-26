package Day42;

class Test{
    int a;
    static int b;
}

public class StaticVariable {
    public static void main(String[] args) {
        Test obj1 = new Test();
        obj1.a = 5;
        obj1.b = 20;
        obj1.b = 30;

        Test obj2 = new Test();
        obj2.a = 10;

        System.out.println(obj1.a);
        System.out.println(obj2.a);
        System.out.println(obj1.b);
        System.out.println(obj2.b);

    }
}
