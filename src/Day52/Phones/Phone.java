package Day52.Phones;
/*
PhoneTaks:
        1. create a class called Phone
                instance variables: model, price, screenSize
                static variabless (DO NOT initialize them): brand, operatingSystem, madeIn
                            No static block is neede!
                methods: call, text, selfie, setInfo, toString
 */
public class Phone {
    String model;
    int price;
    double screenSize;

    public static String brand, operatingSystem, madeIn;

    public Phone(String model){
        this.model = model;
    }

    public void call(long number){
        System.out.println(model + " phone is calling " + number);
    }
    public void text(long number){
        System.out.println(model + " phone is sending text at " + number);
    }
    public void selfie(){
        System.out.println(model + " phone is taking a selfie, smile ))");
    }
    public void setInfo(int price, double screenSize){
        this.price = price;
        this.screenSize = screenSize;
    }
    public String toString(){
        return "model: " + model + " brand: " + brand + "\noperatingSystem: " + operatingSystem + " madeIn: " + madeIn + "\nprice $" + price + " screenSize: " + screenSize;
    }

}
