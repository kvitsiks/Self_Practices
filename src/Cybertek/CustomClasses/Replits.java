package Cybertek.CustomClasses;

import java.util.Arrays;
import java.util.Collections;

public class Replits {
    public static void main(String[] args) {
        int[][] a = {
                {1, 1, 2}, //sum = 4
                {3, 1, 2}, //sum = 6
                {3, 5, 3}, //sum = 11
                {0, 1, 4}  //sum = 5
        };

        int[] sums = rowSums(a);

        for (int sum : sums)
            System.out.println(sum);
        //this should print 4 6 11 3
        int[] arr = {1,2,3,4,5};
        //System.out.println(Arrays.toString(do_switch(arr)));
        String[] first_names = {"Bulent","Ebrahim"};
        String[] last_names = {"Pola","Emam"};
        System.out.println(Arrays.toString(combineNames(first_names, last_names)));
    }

    public static int[] rowSums(int[][] nums) {
        // write your codes here
        int sum = 0;
        int[] sumOfEach1DArr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            sum = 0;
            for (int num : nums[i]) {
                sum += num;
            }
            sumOfEach1DArr[i] = sum;
        }
        return sumOfEach1DArr;

//        int[] arr = {1,2,3,4,5};
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            sum += arr[i];
//        }
//        System.out.println(sum);
    }
    public static int[] do_switch(int[] i) {
        int first = i[0];
        int last = i[i.length-1];
        i[0] = last;
        i[i.length-1] = first;
        return i;
    }
    public static String[] combineNames(String[] first_names, String[] last_names)
    {
        // write your codes here
        String[] fullNames = new String[first_names.length];
        for (int i = 0; i < first_names.length; i++) {
            fullNames[i] = first_names[i] + " " + last_names[i];
        }
        return fullNames;
    }
}


