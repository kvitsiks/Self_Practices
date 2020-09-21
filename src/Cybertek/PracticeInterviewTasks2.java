package Cybertek;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.sql.Struct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PracticeInterviewTasks2 {
    public static void main(String[] args) {
        String str1 = "AAA2BB3BCCCDEF5";
        String str2 = "AAA2BB3BCCCDEF5";
        String[] arr1 = {"1", "2", "3"};
        String[] arr2 = {"4", "5", "6", "7"};
        int  a = 10;
        int  b  = 20;

        //System.out.println(reverseString(str));
        //System.out.println(findUniques(str));
        //System.out.println(sumOfDigits(str));
        //System.out.println(sameLetters(str1, str2));
        //System.out.println(Arrays.toString(concat2Arrs(arr1, arr2)));
        //divide(5, 2);
        //swap(a, b);
        //factorial(5);
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,101,200,300));
        //System.out.println(removeAhmed(list));
        System.out.println(removeIf100(list));

       /*
Write a return method that can find the frequency of characters
Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
        */

//int count;
//String deDup = "";
//
//        for (int i = 0; i < str.length(); i++) {
//            String ch = "" + str.charAt(i);
//            if (!deDup.contains(ch)) {
//                deDup += ch;
//            }
//        }
//        System.out.println(deDup);

//        for (int j = 0; j < deDup.length(); j++) {
//            count = 0;
//            char ch = deDup.charAt(j);
//            for (int i = 0; i < str.length(); i++) {
//                if (ch == str.charAt(i)) {
//                    count ++;
//                }
//            }
//            System.out.print("" + ch + count);
//        }

//        String[] arr = str.split("");
//        ArrayList<String> list = new ArrayList<>();
//        for (int i = 0; i < deDup.length(); i++) {
//            count = Collections.frequency(Arrays.asList(arr), "" + deDup.charAt(i));
//            System.out.print("" + deDup.charAt(i) + count);
//        }

/*
Write a return method that can reverse  String
Ex: Reverse("ABCD"); ==> DCBA
 */
    }

    public static String reverseString(String str) {
        String result = "";
        for (int i = str.length() - 1; i > 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }

    /*
    Write a return  method that can find the unique characters from the String
    Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";
     */
    public static String findUniques(String str) {
        String result = "";
        int count = 0;
        char ch = 0;

        for (int j = 0; j < str.length(); j++) {
            count = 0;
            ch = str.charAt(j);
            for (int i = 0; i < str.length(); i++) {
                if (ch == str.charAt(i)) {
                    count++;
                }
            }
            if (count == 1) {
                result += ch;
            }
        }
        return result;
    }
    /*
    Write a method that can return the sum of the digits in a string
     */

    public static int sumOfDigits(String str) {
        char[] arr = str.toCharArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (Character.isDigit(arr[i])) {
                sum += Integer.parseInt("" + arr[i]);
            }
        }
        return sum;
    }

    /*
    Write a return method that check if a string is build out of the same letters as another string.
Ex:  same("abc",  "cab"); -> true
same("abc",  "abb"); -> false:
     */
    public static boolean sameLetters(String str1, String str2) {
        String[] arr1 = str1.split("");
        String[] arr2 = str2.split("");
        if (arr1.length != arr2.length) {
            return false;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for (int i = 0; i < arr1.length; i++) {
            if (Arrays.equals(arr1, arr2)) {
                return true;
            }
        }
        return false;
    }

    /*
    Write a return method that can concate two arrays
     */
    public static String[] concat2Arrs(String[] arr1, String[] arr2) {
        String[] arr = new String[arr1.length + arr2.length];
        int k = 0;
        for (int i = 0; i < arr1.length; i++) {
            arr[k] = arr1[i];
            k++;
        }
        for (int i = 0; i < arr2.length; i++) {
            arr[k] = arr2[i];
            k++;
        }
        return arr;
    }

    /*
    Write a method that can divide two numbers without using division operator
     */
    public static void divide(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("Invalid Number");
            return;
        }
        System.out.print(num1 + " devid by " + num2 + " is: ");
        int count = 0;
        while (num1 >= num2) {
            num1 -= num2;
            count++;
        }
        System.out.println(count + " and remainder is " + num1);
    }
    /*
    Swap two variable' values without using a third variable
     */
    public static void swap (int a, int b) {//a = 10, b = 20
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a);
        System.out.println(b);
    }
    /*
    Write a return method that returns the factorial number of any given number
Ex:
Input: 5
outPut: 120
     */
    public static void factorial (int a) {
        int res = 1;
        for (int i = 1; i <= a; i++) {
            res = res * i;
        }
        System.out.println(res);
    }
    /*
    Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
Write a java operation to remove all the names named Ahmed
     */
    public static ArrayList<String> removeAhmed(ArrayList<String> list){
        list.removeIf(p -> p.equals("Ahmed"));
        return list;
    }
    /*
    Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
     */
    public static ArrayList<Integer> removeIf100(ArrayList<Integer> list){
        list.removeIf(p -> p >= 100);
        return list;
    }
}
