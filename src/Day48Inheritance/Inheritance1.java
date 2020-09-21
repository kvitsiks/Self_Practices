package Day48Inheritance;

class A {
    int a = 1;
}

class B extends A {
    int b = 2;
}

class C extends B {
    int c = 3;
    public String toString (){
        return a + " " + + b + " " + c;
    }
}

public class Inheritance1 {
    public static void main(String[] args) {
        C c = new C();
        System.out.println(c);
    }
}
