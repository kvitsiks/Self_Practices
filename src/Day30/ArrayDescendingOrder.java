package Day30;

import java.util.Arrays;

public class ArrayDescendingOrder {
    public static void main(String[] args) {
        int[] arr = {22, -1, 0, 66, 8, 999};
        Arrays.sort(arr);
        int[] arrDesc = new int[arr.length];
        int k = 0;
        for (int i = arr.length-1; i >= 0; i--) {
            arrDesc[k] = arr[i];
            k++;
        }
        System.out.println(Arrays.toString(arrDesc));
    }
}
