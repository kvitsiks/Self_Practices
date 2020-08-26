package Day37;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(20,-10,8,99));
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));

        System.out.println("________________________________");

        ArrayList<String> days = new ArrayList<>(Arrays.asList("Mon", "Tue", "Wed", "Tue"));
        Collections.replaceAll(days, "Tue", "Sun");
        System.out.println(days);
    }
}
