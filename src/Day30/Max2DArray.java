package Day30;

public class Max2DArray {
    public static void main(String[] args) {
        int[][] arr2D = {{1, 2, 3}, {4, 5, 6, 7}, {8, 9, 10, 11}};

        int max = arr2D[0][0];

        for (int J = 0; J < arr2D.length; J++) {
            int[] eachArray = arr2D[J];
            for (int i = 0; i < eachArray.length; i++) {
                int eachNum = eachArray[i];
                if (eachNum > max) {
                    max = eachNum;
                }
            }
        }
        System.out.println(max);
    }
}
