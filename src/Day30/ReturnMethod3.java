package Day30;


import java.util.Arrays;

public class ReturnMethod3 {
    public static void main(String[] args) {

    }

    public static int max(int[] arr) {
        Arrays.sort(arr);
        int max = arr[arr.length-1];
        return max;
    }
}
