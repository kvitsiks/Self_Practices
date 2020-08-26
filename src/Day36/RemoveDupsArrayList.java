package Day36;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDupsArrayList {
    public static void main(String[] args) {
        ArrayList<Character> list = new ArrayList<>();
        list.addAll(Arrays.asList('A', 'A', 'B', 'C', 'C','D'));
        ArrayList<Character> nonDup = new ArrayList<>();

        for (Character each : list) {
            if (!nonDup.contains(each)) {
                nonDup.add(each);
            }
        }
        System.out.println(nonDup);
    }
}
