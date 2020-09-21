package Day53_FinalKeyword;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

class A {
    public static void method1() {
        System.out.println("Enter un and pass");
    }
    public static void method1(int a) {
        System.out.println("Enter un and pass");
    }
}


public class FinalMethod extends A {
    public static void method1() {
        System.out.println("Enter something else");
    }

    public static void main(String[] args) {
        method1();
    }
}
