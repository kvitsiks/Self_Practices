package Day25;

import java.util.Arrays;

public class Array_1_100 {
    public static void main(String[] args) {
        int[] numbers = new int[100];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i+1;
        }

        System.out.print(Arrays.toString(numbers));

        for (int each : numbers) {
            if (each % 2 != 0) {
                continue;
            }
            System.out.print(each + " ");
        }
    }
}
