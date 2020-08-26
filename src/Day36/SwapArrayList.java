package Day36;

import java.util.ArrayList;
import java.util.Collections;

public class SwapArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        Collections.swap(list, 0, list.size()-1);
        System.out.println(list);
    }
}
