package Day26;

import java.util.Arrays;

public class SortDescending {
    public static void main(String[] args) {
        int[] arr = {1,2,3,55,13,33,6};
        Arrays.sort(arr);
        int[] desc = new int[arr.length];

        int k = arr.length-1;
        for (int i = 0; i < desc.length; i++) { //0,1,2
            desc[i] = arr[k];
            k--; //2,1,0
        }
        System.out.println(Arrays.toString(desc));
    }
}
