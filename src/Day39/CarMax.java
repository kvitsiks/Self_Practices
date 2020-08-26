package Day39;

public class CarMax {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        Car car4 = new Car();
        Car car5 = new Car();

        car1.setInfo("Lexus", "RX350", 2019, "blue", 30000, 45000);
        car2.setInfo("Mercedes", "600", 2016, "white", 34000, 23000);
        car3.setInfo("Buick", "RS", 2018, "green", 20000, 30000);
        car4.setInfo("Bugatti", "Veyron", 2015, "black", 15000, 500000);
        car5.setInfo("Lotus", "1", 2019, "yellow", 12000, 30000);

        car1.getInfo();
        System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
        car2.getInfo();
        System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
        car3.getInfo();
        System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
        car4.getInfo();
        System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
        car5.getInfo();
        System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
        car1.start();
    }
}
