package Day39;

public class Car {
    /*
        Attributes:
            model, brand, year, color, mileage, price
     */


    String brand;
    String model;
    int year;
    String color;
    double mileage;
    double price;

    public void setInfo(String brand, String model, int year, String color, double mileage, double price){
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.mileage = mileage;
        this.price = price;
    }  // sets the info of the car objects

    // 2012 Toyota Corolla, Red, 10000, $ 45000
    public void getInfo() {
        System.out.println(year+" "+brand+" "+model+" "+color+" "+mileage+" "+price);
    }

    public void start() {
        System.out.println(brand+" "+model+" is started");
    }

    /*
    car1: Toyota
    car2: BMW
    car3: Tesla
     */

}