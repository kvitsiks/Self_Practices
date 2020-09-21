package Day52.Phones;

/*
 2. creata a subclass of Phone called iPhone
                initialize all the variables using constructor & static block
                methods: call, text, selfie, setInfo, toString, faceTime
 */
public class iPhone extends Phone {

    public iPhone() {
        super("X");
        setInfo(1000, 5.3);
    }

    static {
        brand = "iPhone";
        operatingSystem = "iOS";
        madeIn = "China";
    }

    @Override
    public void call(long number) {
        super.call(number);
        System.out.println("Additional override info model " + model);
    }

    @Override
    public void text(long number) {
        super.text(number);
        System.out.println("Additional override info price " + price);
    }

    @Override
    public void selfie() {
        super.selfie();
        System.out.println("Additional override info screenSize " + screenSize);
    }

    public void faceTime(String faceTimeID){
        System.out.println("Calling faceTime...");
    }

}
