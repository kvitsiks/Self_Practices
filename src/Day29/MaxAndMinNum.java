package Day29;

public class MaxAndMinNum {
    public static void main(String[] args) {
        int[] arr = {200, 0, -13, 777};
        max(arr);
        min(arr);
    }
    public static void max(int[] arr){
        int max = arr[0];
        for (int each : arr) {
            if (each > max) {
                max = each;
            }
        }
        System.out.println(max);
    }

    public static void min(int[] arr){
        int min = arr[0];
        for (int each : arr) {
            if (each < min) {
                min = each;
            }
        }
        System.out.println(min);
    }
}
