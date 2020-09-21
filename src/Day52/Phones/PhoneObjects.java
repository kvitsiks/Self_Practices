package Day52.Phones;
/*
create a class called phone objects:
                         create three objects of each phone and test everything out
 */
public class PhoneObjects {
    public static void main(String[] args) {
        iPhone iPhone1 = new iPhone();
        //Samsung samsung1 = new Samsung();

        System.out.println(iPhone1);
        System.out.println();
        System.out.println();
        iPhone1.call(832867626);
        System.out.println();
        iPhone1.text(832867626);

    }
}
