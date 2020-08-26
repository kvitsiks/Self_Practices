package Day28;

import java.util.Arrays;
import java.util.Scanner;

public class FrequencyOfWordInArray {
    public static void main(String[] args) {
        /*
        write a program that can count the frequency of a word from an array of string
            Ex:
                arr: {"Java", "C#", "Python", "Java"};
                word: "java"
                output:
                        2
            MUST USE for each loop
Java
C#
Python
java
         */

//        Scanner scan = new Scanner(System.in);
//        System.out.println("How many words?");
//        int n = scan.nextInt();
//        String[] arr = new String[n];
//
//        System.out.println("Enter " + n +  " words");
//        for (int i = 0; i < n; i++) {
//          arr[i] = scan.nextLine();
//        }
//        scan.nextLine();
//        System.out.println("Enter your word");
//        String word = scan.nextLine();
//
//        int count = 0;
//        for (String each : arr) {
//            if (word.equalsIgnoreCase(each)) {
//                count++;
//            }
//        }
//        System.out.println(count);


        char[] arr = {'D', 'C', 'A', 'B'};
        Arrays.sort(arr);
        for (char each:arr) {
            System.out.println(each + " ");
            if (each == 'D') {
                continue;
            }
        }

//        int[] num1 = new int[3];
//        int[] num2 = {1,2,3,4,5};
//        num1 =num2;
//        for (int i = 0; i < num1.length; i++) {
//            System.out.println(num1[i]);
//
//        }

//        int[] intArr = {15,30,45,60,75};
//        intArr[2] = intArr[4];
//        intArr[4] = 90;
//        System.out.println(Arrays.toString(intArr));

    }
}
