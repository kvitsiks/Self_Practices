package Day50InheritanceOverriding.CarTask;

public class CarObjects {
    public static void main(String[] args) {
        Mercedes mercedes = new Mercedes();
        mercedes.start();
        System.out.println("==============================");
        Tesla tesla = new Tesla();
        tesla.start();
        System.out.println("==============================");
        Jeep jeep = new Jeep();
        jeep.start();
    }
}
