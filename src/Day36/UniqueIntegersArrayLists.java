package Day36;

import java.util.ArrayList;
import java.util.Collections;

public class UniqueIntegersArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(3);

        ArrayList<Integer> uniques = new ArrayList<>();

        for (Integer each : list) {
            int count = Collections.frequency(list, each);
            if (count == 1) {
                uniques.add(each);
            }
        }
        System.out.println(uniques);
    }
}
