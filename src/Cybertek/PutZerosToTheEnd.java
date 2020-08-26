package Cybertek;

import java.util.ArrayList;
import java.util.Collections;

public class PutZerosToTheEnd {
    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 4, 0, 4, 7, 0};
        System.out.println(moveZeros(arr));

    }

    public static ArrayList<Integer> moveZeros(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            Collections.addAll(list, arr[i]);
        }

        int size1 = list.size();
        list.removeIf(p -> p == 0);
        int size2 = list.size();
        int dif = size1 - size2;
        for (int i = 0; i < dif; i++) {
            list.add(0);
        }
        return list;
    }
}
