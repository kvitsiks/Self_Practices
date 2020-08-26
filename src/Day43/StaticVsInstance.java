package Day43;

import Day42.StaticMethods;

public class StaticVsInstance {
    static int staticVar; //1 copy for all objects
    int instanceVar;      //1 copy for each object

    public static void main(String[] args) {
        StaticVsInstance obj1 = new StaticVsInstance();
        obj1.instanceVar = 100;
        obj1.staticVar = 500;

        StaticVsInstance obj2 = new StaticVsInstance();
        obj2.instanceVar = 200;
        obj2.staticVar = 400;

        System.out.println(obj1.instanceVar); //100
        System.out.println(obj2.instanceVar); //200

        System.out.println("====================================");

//        System.out.println(obj1.staticVar); //100
//        System.out.println(obj2.staticVar); //200

        System.out.println(StaticVsInstance.staticVar);




    }
}
