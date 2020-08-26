package Day36;

import java.util.ArrayList;

public class UniqueIntegersArrayListWithLoops {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>() {{
            add(1);
            add(1);
            add(3);
            add(4);
            add(4);
            add(5);
            add(1);
            add(4);
        }};
        ArrayList<Integer> uniques = new ArrayList<>();

        for (int j = 0; j < list.size(); j++) {
            int count = 0;
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).equals(list.get(j))) {
                    count++;
                }
            }
            if (count == 1) {
                uniques.add(list.get(j));
            }
        }
        System.out.println(uniques);
    }
}
