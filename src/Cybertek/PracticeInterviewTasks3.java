package Cybertek;

import java.util.Arrays;

public class PracticeInterviewTasks3 {
    //Reverse String – For Loop
    public static void main(String[] args) {
        //System.out.println(reverseString("hello"));
        //System.out.println(palindrome("racecar"));
        //System.out.println(anagram("geter", "reteg"));
        //System.out.println(factorial(5));
        //System.out.println(sumOfDigitsInString("jav123a"));
        System.out.println(sumOfDigitsInInt(123));

    }

    public static String reverseString(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }
//Palindrome madam, racecar.

    public static boolean palindrome(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        if (str.equals(reverse)) {
            return true;
        } else
            return false;
    }

    public static boolean anagram(String str1, String str2) {
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }

    //Factorial
    public static int factorial(int num) {
        int res = 1;
        for (int i = 1; i <= num; i++) {
            res = res * i;
        }
        return res;
    }

    //Write a method that can return the sum of the digits in a string
    public static int sumOfDigitsInString(String str) {
        int sum = 0;
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (Character.isDigit(arr[i])) {
                sum += Integer.parseInt("" + arr[i]);
            }
        }
        return sum;
    }

    public static int sumOfDigitsInInt(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num = num / 10;
            System.out.println(sum);
            System.out.println("num "+num);
        }
        return sum;
    }


}
