package Day48Inheritance.DeviceTask;

public class Tv extends Device {
    public boolean hasRemoteControl;

    public Tv(String brand, String model, double price, boolean hasBattery, boolean hasMemory, String screenSize, boolean hasRemoteControl){
        setInfo(brand, model, price, hasBattery, hasMemory, screenSize);
        this.hasRemoteControl = hasRemoteControl;
    }

    public void watchCableTv(){
        System.out.println("You are watching a cable channel on " + brand + " TV");
    }
}
