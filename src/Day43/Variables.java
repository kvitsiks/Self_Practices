package Day43;

public class Variables {
    int b = 10;
    static int e;

    public void method2(){
        System.out.println(b);
    }

    public static void main(String[] args) {
        Variables obj = new Variables();
        System.out.println(obj.b);
    }
    public static void method(){
        int a = 10;
        System.out.println(a);
    }
}
