package Day27;

public class ForEachLoop {
    public static void main(String[] args) {
        int[] scores = {10,20,30,40,50,60,70,80,90};
        int count = 0;

        for (int each : scores) {
            if (each % 3 != 0) {
                continue;
            }
                count++;
                System.out.print(each + " ");
            }
        System.out.println();
        System.out.println(count);

        int[] score = {80, -2, 44, 90, 100, 15, 0};

        int max = score[0];
        int min = score[0];

        for (int each : score) {
            if (each > max) {
                max = each;
            }
            if (each < min) {
                min = each;
            }
        }
        System.out.println("max: "+ max + ", min: " + min);

    }
}
