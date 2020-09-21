package Day48Inheritance.DeviceTask;

public class Laptop extends Device {
    /*
    create a sub class of Device called Laptop:
                    attributes: brand, model, price, MadeIn, hasBattery, hasMemory, screenSize, hasCPU, hasMouse, hasKeyBoard, OS
                    methods: coding, watching, setInfo, toString
                    add a constructor that can set the fileds
     */
    public static boolean hasCPU, hasMouse, hasKeyBoard;
    public String os;

    static {
        hasCPU = true;
        hasMouse = false;
        hasKeyBoard = true;
    }

    public Laptop(String brand, String model, double price, boolean hasBattery, boolean hasMemory, String screenSize, String os){
        setInfo(brand, model, price, hasBattery, hasMemory, screenSize);
        this.os = os;
    }
    public void coding(String language){
        System.out.println(language.toUpperCase() + " coding is FUN!" + " in " + brand + " " + model);
    }
}
