package Day48Inheritance.DeviceTask;

public class Phone extends Device {
    /*
    reate a sub class of device called phone:
                    attributes: brand, model, price, MadeIn, screenSize, hasBattery, hasMemory, hasSimCard, OS
                    methods: call, text, setInfo, toString
                    add a constructor that can set the fileds
     */
    public static boolean hasSimCard = true;
    public String os;

    public Phone(String brand, String model, double price, boolean hasBattery, boolean hasMemory, String screenSize, String os){
        setInfo(brand, model, price, hasBattery, hasMemory, screenSize);
        this.os = os;
    }
    public void call(long phoneNumber){
        System.out.println("Calling " + phoneNumber);
    }
    public void text(long phoneNumber){
        System.out.println("Texting to " + phoneNumber);
    }
}
