package Day43;

import Day42.Tester;

public class StaticBlock2 {
    static int a;
    static String b;
    static Tester tester1;

    //static ExcelSheet excel;

    static {
        a = 100;
        b = "Cybertek";

        tester1 = new Tester();
        tester1.setInfo("Sergi", 'm', 123345, "SDET", 120000);
    }

    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(b);
    }
}
