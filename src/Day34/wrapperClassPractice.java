package Day34;

import java.util.Arrays;

public class wrapperClassPractice {
    public static void main(String[] args) {
        String str = "123";
        int num = Integer.parseInt(str);

        int a = Integer.MAX_VALUE;
        int a1 = Integer.MIN_VALUE;
        double d = Double.MAX_VALUE;
        System.out.println(a);
        System.out.println(d);

        String[] str1 = {"1", "12", "55", "8", "22"};
        int[] arr = new int[str1.length];
        for (int i = 0; i < str1.length; i++) {
            arr[i] = Integer.parseInt(str1[i]);
        }
        System.out.println(Arrays.toString(arr));
    }
}
