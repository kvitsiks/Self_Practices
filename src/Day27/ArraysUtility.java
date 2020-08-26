package Day27;

import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {
        String[] names = {"Alex", "Sergio", "Slava", "Ali"};
        int[] score = {80, -2, 44, 90, 100, 15, 0};

        Arrays.sort(names);
        Arrays.sort(score);
        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(score));
        int max = score[score.length-1];
        int min = score[0];
        System.out.println("max is "+max + " " +"min is " + min);


        String[] str1 = {"Alex", "Sergio", "Slava", "Ali"};
        String[] str2 = {"Peter", "Veronica", "Putin", "Trump"};
        System.out.println(Arrays.equals(str1, str2));
    }
}
