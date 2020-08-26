package Day26;

import java.util.Arrays;

public class MultiDArray {
    public static void main(String[] args) {
        char[] ch1 = {'A', 'B'};
        char[] ch2 = {'C', 'D', 'E'};
        char[] ch3 = {'F', 'G', 'H'};

        char[][] ch2D = {ch1, ch2, ch3};

        System.out.println(Arrays.toString(ch2D[1]));

        for (int i = 0; i < ch2D.length; i++) {
            System.out.println(Arrays.toString(ch2D[i]));
        }

    }
}
