package Day42;

public class Car {
    String brand;
    String model;
    int year;
    String vin;
    String color;
    double price;

    static boolean hasWheel = true;
    static int numberOfTires = 4;
    static boolean hasEngine = true;

    public void start(){
        System.out.println("Starting " + brand + " " + model);
    }
    public static void printTires(){
        System.out.println("Number Of Tires is " + numberOfTires);
    }
    public String toString(){
        return brand + ", " + model + ", " + year + "\n" + " Has engine: " + hasEngine
                + " Has wheel: " + hasWheel;
    }
}
