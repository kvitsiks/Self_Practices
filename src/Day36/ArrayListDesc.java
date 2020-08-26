package Day36;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDesc {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(29);
        list.add(-1);
        list.add(0);
        list.add(44);
        list.add(61);
        ArrayList<Integer> listRev = new ArrayList<>();
        Collections.sort(list);
        for (int i = list.size()-1; i >= 0 ; i--) {
            //System.out.print(list.get(i)+ " ");
            listRev.add(list.get(i));
        }
        System.out.println(listRev);
    }
}
