package Day30;


import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;

public class WarmUpTasks {
    public static void main(String[] args) {
        /*
    1. create a function that can print out the maximum number between two numbers
    2. create a function that can print out the array of integers in descending order
    3. create a function that can print out the combination of two integer arrays
    4.
        step1: create a function that can check if the given integer is positive, negative or zero
        step2: Use the above method to  write a program that can check every single elements of an array of Integers
        MUST use for each loop

         */
        //maxNumber(5,5);
        int[] arr1 = {1, 4, 3, 88, 100, 0, -15};
        int[] arr2 = {13, 41, 36, 88, 1000, 0, -155};
        //printArrayDescending(arr1);
        //combinationOf2Arrays(arr1, arr2);
        //positiveNegativeZero(0);
        checkNumbersInArray(arr1);

    }


    public static void maxNumber(int num1, int num2) {

        if (num1 == num2) {
            System.out.println("Equal");
            return;
        }

        if (num1 > num2) {
            System.out.println(num1 + " is bigger");
        } else {
            System.out.println(num2 + " is bigger");
        }
    }

    public static void printArrayDescending(int[] arr) {
        Arrays.sort(arr);
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }


    public static void combinationOf2Arrays(int[] arr1, int[] arr2) {
        int currentPosition = 0;
        int[] arr3 = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arr3[currentPosition] = arr1[i];
            currentPosition++;
        }
        for (int j = 0; j < arr2.length; j++) {
            arr3[currentPosition] = arr2[j];
            currentPosition++;
        }
//        int i = 0;
//        for (int each : arr1) {
//            arr3[i] = each;
//            i++;
//        }
//        for (int each : arr2) {
//            arr3[i] = each;
//            i++;
//        }
        System.out.println(Arrays.toString(arr3));
    }

    public static void positiveNegativeZero(int number) {
        if (number > 0) {
            System.out.println("positive");
        }
        else if (number < 0) {
            System.out.println("negative");
        }
        else {
            System.out.println("zero");
        }
    }

    public static void checkNumbersInArray(int[] arr) {
        for (int each : arr) {
            positiveNegativeZero(each);
        }
    }
}
