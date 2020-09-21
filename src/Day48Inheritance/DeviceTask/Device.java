package Day48Inheritance.DeviceTask;
/*
Device Task:
        1. create a class called Device
                    attributes: brand, model, price, MadeIn, hasBattery, hasMemory, screenSize,
                    methods: setInfo, toString
        2. create a sub class of Device called TV:
                    attributes: brand, model, price, MadeIn, hasBattery, hasMemory, screenSize, RemoteControl
                    methods: watch, setInfo, toString
                    add a constructor that can set the fileds
        3. create a sub class of device called phone:
                    attributes: brand, model, price, MadeIn, screenSize, hasBattery, hasMemory, hasSimCard, OS
                    methods: call, text, setInfo, toString
                    add a constructor that can set the fileds
        4. create a sub class of Device called Laptop:
                    attributes: brand, model, price, MadeIn, hasBattery, hasMemory, screenSize, hasCPU, hasMouse, hasKeyBoard, OS
                    methods: coding, watching, setInfo, toString
                    add a constructor that can set the fileds


 */
public class Device {
    public String brand;
    String model;
    double price;
    boolean hasBattery;
    boolean hasMemory;
    String screenSize;

    static String madeIn;
    static boolean isElectronics;

    public void setInfo(String brand, String model, double price, boolean hasBattery, boolean hasMemory, String screenSize) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.hasBattery = hasBattery;
        this.hasMemory = hasMemory;
        this.screenSize = screenSize;
    }

    static {
        madeIn = "China";
        isElectronics = true;


        }

        public String toString(){
            return "================================"+
                    "\nBrand: "+brand+
                    "\nModel: "+model+
                    "\nMade in: "+madeIn+
                    "\nScreen Size: "+screenSize+
                    "\nPrice: "+price+
                    "\nDoes it have battery? "+hasBattery+
                    "\nDoes it have memory? "+hasMemory+
                    "================================";
        }

    }

