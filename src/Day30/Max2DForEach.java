package Day30;

public class Max2DForEach {
    public static void main(String[] args) {
        int[][] arr2D = {{1,2,3}, {4,5,6,7}, {8,9,10,11}};
        int max = arr2D[0][0];

        for (int[] each1D : arr2D) {
            for (int each : each1D) {
                if (each > max) {
                    max = each;
                }
            }
        }
        System.out.println(max);
    }
}
