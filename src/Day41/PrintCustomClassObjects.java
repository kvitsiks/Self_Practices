package Day41;

public class PrintCustomClassObjects {
    public static void main(String[] args) {
        String str = new String ("Cybertek");
        System.out.println(str);
        Carpet c1 = new Carpet();
        c1.customOrder(5,6,19,true);
        System.out.println(c1);
    }
}
