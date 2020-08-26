package Cybertek;

import Library.Util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;

public class PracticeInterviewTasks {
    public static void main(String[] args) {
        /*
Write a return method that can find the frequency of characters
Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
         */
        String str = "abc";
        String str2 = "cab";
        int[] arr = {1, 2, 3, 4, 5};
        //System.out.println(countChars(str));
        //System.out.println(reverseString(str));
        //System.out.println(Arrays.toString(reverseArray(arr)));
        //System.out.println(reverseArrayReturnAsString(arr));
        //System.out.println(sameLetters(str, str2));
        //System.out.println(uniques("AAABBBCCCDEF"));
        //System.out.println(factorial(5));
        divide();

    }

    public static String countChars(String str) {
        String noDup = "";
        for (int i = 0; i < str.length(); i++) {
            if (!noDup.contains("" + str.charAt(i))) {
                noDup += str.charAt(i);
            }
        }

        String expected = "";
        int count = 0;

        String[] arr = str.split("");

        for (int i = 0; i < noDup.length(); i++) {
            count = Collections.frequency(Arrays.asList(arr), "" + noDup.charAt(i));
            expected += "" + noDup.charAt(i) + count;
        }
        return expected;
    }

    /*
Write a return method that can reverse  String
Ex: Reverse("ABCD"); ==> DCBA
     */
    public static String reverseString(String str) {
        String result = "";
        for (int i = str.length() - 1; i > 0; i--) {
            result += "" + str.charAt(i);
        }
        return result;
    }

    public static int[] reverseArray(int[] arr) {
        int[] arr2 = new int[arr.length];
        int k = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            arr2[k] = arr[i];
            k++;
        }
        return arr2;
    }

    public static String reverseArrayReturnAsString(int[] arr) {
        String result = "";
        int[] arr2 = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            int k = 0;
            arr2[k] = arr[i];
            result += arr2[k] + "";
        }
        return result;
    }

    /*
    Write a return method that check if a string is build out of the same letters as another string.
 Ex:  same("abc",  "cab"); -> true
 same("abc",  "abb"); -> false:
     */
    public static boolean sameLetters(String str, String str2) {
        if (str.length() != str2.length()) {
            return false;
        } else
            for (int i = 0; i < str.length() - 1; i++) {
                if (!(str).contains(str2.substring(i, i + 1))) return false;
            }
        return true;
    }

    /*
Write a return  method that can find the unique characters from the String
Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";
     */
    public static String uniques(String str) {
        String result = "";
        int count = 0;
        for (int j = 0; j < str.length(); j++) {
            count = 0;
            char ch = str.charAt(j);
            for (int i = 0; i < str.length(); i++) {
                char ch2 = str.charAt(i);
                if (ch == ch2) {
                    count++;
                }
            }
            if (count == 1) {
                result += ch + "";
            }
        }
        return result;
    }

    /*
    Write a return method that returns the factorial number of any given number
Ex:
Input: 5
outPut: 120
     */
    public static int factorial(int num) {
        int res = 1;
        for (int i = 0; i < num; i++) {
            res += res * i;
        }
        return res;
    }

    /*
    Write a program that can print the numbers between 1 ~ 100 that can be divisible by 3, 5, and 15.
if the number can be divisible by 3, 5 and 15, then it should only be displayed in DivisibelBy15' section
if the number can be divisible by 3 but cannot be divisible by 15, then it should only be displayed in DivisibelBy3' section
if the number can be divisible by 5 but cannot be divisible by 15, then it should only be displayed in DivisibelBy5' section
ex:
OutPut:
Divisible By 15 15 30 45 60 75 90
Divisible By 5 5 10 20 25 35 40 50 55 65 70 80 85 95 100
Divisible By 3 3 6 9 12 18 21 24 27 33 36 39 42 48 51 54 57 63 66 69 72 78 81 84 87 93 96 99
     */
    public static void divide() {
        System.out.print("Divisible By 3: ");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.print("Divisible By 5: ");
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.print("Divisible By 15: ");
        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0) {
                System.out.print(i + " ");
            }
        }
    }


}
