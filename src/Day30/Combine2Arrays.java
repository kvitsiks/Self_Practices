package Day30;

import java.util.Arrays;

public class Combine2Arrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 4, 3, 88, 100, 0, -15};
        int[] arr2 = {13, 41, 36, 88, 1000, 0, -155};
        int[] a3 = combine2Arrays(arr1, arr2);
        System.out.println(Arrays.toString(a3));
    }

    public static int[] combine2Arrays(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];
        int i = 0;
        for (int each : arr1) {
            arr3[i] = each;
            i++;
        }
        for (int each : arr2) {
            arr3[i] = each;
            i++;
        }
        return arr3;
    }
}


