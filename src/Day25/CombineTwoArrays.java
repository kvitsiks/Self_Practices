package Day25;

import java.util.Arrays;

public class CombineTwoArrays {
    public static void main(String[] args) {
        /*
        write a program that can combine two arrays of integers and then print out the maximum number
    Ex:
        arr1 = { 1,2,3,4}
        arr2 = {5,6,7,8}
        output:
            arr3 = {1,2,3,4,5,6,7,8}
            max: 8
         */
        int[] arr1 = { 1,2,3,4};
        int[] arr2 = {5,6,7,8};
        int size = arr1.length + arr2.length;
        int[] arr3 = new int[size];

//        for (int i = 0; i < arr3.length; i++) {
//            arr3[i] = arr1[i];
//        }
//        System.out.println(Arrays.toString(arr3));

        int index = 0;
        for (int each : arr1) {
          arr3[index] = each;
          index +=1;
        }
        for (int each: arr2) {
            arr3[index] = each;
            index ++;
        }
        System.out.println(Arrays.toString(arr3));
        Arrays.sort(arr3);
        System.out.println("max is " + arr3[arr3.length-1]);
    }
}
