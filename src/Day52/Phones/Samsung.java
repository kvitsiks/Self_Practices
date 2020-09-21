package Day52.Phones;
/*
 3. creata a subclass of Phone called Samsung
                initialize all the variables using constructor & static block
                methods: call, text, selfie, setInfo, toString, freeze
 */
public class Samsung extends Phone {

    public Samsung (){
        super("Galaxy S8");
        setInfo(800, 5.5);
    }

    static {
        brand = "Samsung";
        operatingSystem = "Android";
        madeIn = "Korea";
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

    public void freeze(){
        System.out.println("Samsung is freeze... ");
    }

}
