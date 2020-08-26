package Day30;

public class Max2DArrayMix {
    public static void main(String[] args) {
        int[][] arr2D = {{1, 2, 3}, {4, 5, 6, 7}, {8, 9, 10, 11}};

        int max = arr2D[0][0];

        for (int i = 0; i < arr2D.length; i++) {
            for (int eachNum : arr2D[i]) {
                if (eachNum > max) {
                    max = eachNum;
                }
            }
        }
        System.out.println(max);
    }
}