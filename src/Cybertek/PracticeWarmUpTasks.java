package Cybertek;

import apple.laf.JRSUIConstants;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import sun.font.CStrike;
import sun.security.x509.AttributeNameEnumeration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class PracticeWarmUpTasks {
    public static void main(String[] args) {

        /*

    1. Write a program that calculates the sum of numbers entered by the user until user enters a negative number.
            hint: you need an infinite loop

    1. Write a program that calculates unique numbers

    1. write a program return the frequency of a word from a string
            ex:
                str = "JavajavaJAVA";
                word = "java";
                output:
                    3
        do not use same the approach we did in last office hour
    1. write a program that can count the frequency of a word from an array of string
            Ex:
                arr: {"Java", "C#", "Python", "Java"};
                word: "java"
                output:
                        2
            MUST USE for each loop

    1. write a program that can combine two arrays of integers and then print out the maximum number
    Ex:
        arr1 = { 1,2,3,4}
        arr2 = {5,6,7,8}
        output:
            arr3 = {1,2,3,4,5,6,7,8}
            max: 8

    1. write a program that can sort the array in descending order
        ex:
            arr1: { 10, 11, 8, 9, 12, 5, 15};
            output:
                arr2: {15, 12, 11, 10, 9, 8, 5}
            NOTE: at the end, you must have have an array that contains the desending order of the original array

     1. write a prgram that can return the frequency of every single characters from the string:
            ex:
                str1 = "aabbccaa";
                output: a4b2c2
                HINT:
                    easier approach:
                            1. remove duplicates ==> str2 = "abc"
                            2. then find each of str2' character' frequency in str1 ==> 4, 2, 2
                            3. result: a4b2c2
                        previous section we leaned how to find the frequency of one character.
                        you will need to repeat the same steps
         */

//        String str = "aabbccaa";
//        String nonDup = "";
//        String result = "";
//        int count = 0;
//        String[] arr1 = str.split("");
//        for (String each : arr1) {
//            if (!nonDup.contains(each)) {
//                nonDup += each;
//            }
//        }
//        System.out.println(nonDup);

//        for (int j = 0; j < nonDup.length(); j++) {
//            char ch = nonDup.charAt(j);
//            count = 0;
//            for (int i = 0; i < str.length(); i++) {
//                if (str.charAt(i) == ch) {
//                    count++;
//                }
//            }
//            result += "" + ch + count;
//
//        }
//        System.out.println(result);


//        int[] arr1 = {10, 11, 8, 9, 12, 5, 15, -99};
//        Arrays.sort(arr1);
//        int[] arrDesc = new int[arr1.length];
//        int k = 0;
//        for (int i = arr1.length-1; i >= 0; i--) {
//            arrDesc[k] = arr1[i];
//            k++;
//        }
//        System.out.println(Arrays.toString(arrDesc));

//        int[] arr1 = {1,2,3,4};
//        int[] arr2 = {5,6,7,8};
//        int[] arr3 = new int[arr1.length + arr2.length];
//        int k = 0;
//
//        for (int i = 0; i < arr1.length; i++) {
//            arr3[k] = arr1[i];
//            k++;
//        }
//        for (int i = 0; i < arr2.length; i++) {
//            arr3[k] = arr2[i];
//            k++;
//        }
//        System.out.println(Arrays.toString(arr3));


//        String[] arr = {"Java", "C#", "Python", "Java", "java", "JaVa"};
//        String word = "java";
//        int count = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i].equalsIgnoreCase(word)) {
//                count++;
//            }
//        }
//        System.out.println(count);


//        String str = "JavajavaJAVA";
//        String word = "jaVa";
//        int count = 0;
//
//
//        for (int i = 0; i <= str.length()-word.length(); i++) {
//            String s = str.substring(i, i+word.length());
//            if (s.equalsIgnoreCase(word)) {
//                count++;
//            }
//        }
//        System.out.println(count);

//        int[] arr = {1,1,2,3,3,4,5,5,6,7,7,8,9,9};
//
//        for (int j = 0; j < arr.length; j++) {
//            int count = 0;
//            int num = arr[j];
//
//            for (int i = 0; i < arr.length; i++) {
//                int each = arr[i];
//                if (each == num) {
//                    count++;
//                }
//            }
//            if (count == 1){
//                System.out.print(num + " ");
//            }
//        }

//        Scanner scan = new Scanner(System.in);
//        int sum = 0;
//        for (int i = 0; i == 0;) {
//            System.out.println("Enter a number: ");
//            int num = scan.nextInt();
//            if (num > 0) {
//                sum += num;
//            } else {
//                break;
//            }
//        }
//        System.out.println(sum);

/////////////////////////////////////////////////////////////////////////////////////////////////////////////
        /*
        Write a return method that can find the frequency of characters
Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
         */
//        String str = "AAABBCDD";
//        String result = "";
//        String deDup = "";
//        String[] arr = str.split("");
//
//        for (String each : arr) {
//            if (!deDup.contains(each)) {
//                deDup += each;
//            }
//        }
//        System.out.println(deDup);
//
//        for (int j = 0; j < deDup.length(); j++) {
//            int count = 0;
//            char ch = deDup.charAt(j);
//            for (int i = 0; i < str.length(); i++) {
//                if (str.charAt(i) == ch) {
//                    count++;
//                }
//            }
//            System.out.print("" + ch + count);
//        }
//    }
//}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////

///*
//Write a return method that can reverse  String
//
//Ex: Reverse("ABCD"); ==> DCBA
// */
//        String str = "ABCD";
//        String result = "";
//
//        for (int i = str.length()-1; i >= 0; i--) {
//            result += str.charAt(i);
//        }
//        System.out.println(result);
//    }
//}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////
///*
//Write a return method that check if a string is build out of the same letters as another string.
//Ex:  same("abc",  "cab"); -> true
//same("abc",  "abb"); -> false:
// */
//        System.out.println(compareStrings("abc", "cabf"));
//
//    }
//    public static boolean compareStrings(String str1, String str2) {
//        char[] ch1 = str1.toCharArray();
//        char[] ch2 = str2.toCharArray();
//
//        Arrays.sort(ch1);
//        Arrays.sort(ch2);
//
//        String a1 = "";
//        String a2 = "";
//
//        for (char each : ch1) {
//            a1 += each;
//        }
//        for (char each : ch2) {
//            a2 += each;
//        }
//       return a1.equals(a2);
//    }
//}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////
///*
//Write a return method that can remove the duplicated values from String
//Ex:  removeDup("AAABBBCCC")  ==> ABC
// */
//        String str = "AABABBBCCCA";
//        System.out.println(removeDups(str));
//    }
//    public static String removeDups(String str) {
//
//        String nonDup = "";
//        String[] arr = str.split("");
//
//        for (String each : arr) {
//            if (!nonDup.contains(each)) {
//                nonDup += each;
//            }
//        }
//        return nonDup;
//    }
//}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////
///*
//Write a return  method that can find the unique characters from the String
//Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";
// */
//        String str = "AAABBBCCCDEFF";
//
//        for (int j = 0; j < str.length(); j++) {
//            int count = 0;
//            char ch = str.charAt(j);
//            for (int i = 0; i < str.length(); i++) {
//                if (str.charAt(i) == ch) {
//                    count++;
//                }
//            }
//            if (count == 1) {
//                System.out.print(ch);
//            }
//        }
//    }
//}


/////////////////////////////////////////////////////////////////////////////////////////////////////////////
///*
//Write a return method that can concate two arrays
// */
//        String[] arr1 = {"aaa", "bbb", "ccc"};
//        String[] arr2 = {"ddd", "eee", "fff"};
//        String[] arrCombine = new String[arr1.length + arr2.length];
//        int k = 0;
//        for (String each : arr1) {
//            arrCombine[k] = each;
//            k++;
//        }
//        for (String each : arr2) {
//            arrCombine[k] = each;
//            k++;
//        }
//        System.out.println(Arrays.toString(arrCombine));
//    }
//}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////
///*
//Write a method that can divide two numbers without using division operator
// */
//
//        devides(20, 3);
//    }
//    public static void devides(int num1, int num2) {
//       if (num2 == 0) {
//           System.out.println("Invalid input");
//           return;
//       }
//       int count = 0;
//       while (num1 >= num2) {
//           num1 -= num2;
//           count++;
//       }
//        System.out.println(count + " and reminder is " + num1);
//    }
//}


/////////////////////////////////////////////////////////////////////////////////////////////////////////////
///*
//Write a method which prints out the numbers from 1 to 30 but for numbers which are a multiple of 3,
//print "FIN" instead of the number and for numbers which are a multiple of 5,
//print "RA" instead of the number. for numbers which are a multiple of both 3 and 5,
//print "FINRA" instead of the number.
// */
//        String result = "";
//        for (int i = 0; i < 30; i++) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                result = "FINRA";
//            } else if (i % 5 == 0) {
//                result = "RA";
//            } else if (i % 3 == 0) {
//                result = "FIN";
//            } else
//                result += i+" ";
//            System.out.println(result);
//        }
//
//    }
//}


/////////////////////////////////////////////////////////////////////////////////////////////////////////////
///*
//Write a program that can print the numbers between 1 ~ 100 that can be divisible by 3, 5, and 15.
// */
//        String result15 = "";
//        String result5 = "";
//        String result3 = "";
//        for (int i = 1; i <= 100; i++) {
//
//            if (i % 3 == 0) {
//                result3 += i + " ";
//            }
//            if (i % 5 == 0) {
//                result5 += i + " ";
//            }
//            if (i % 15 == 0) {
//                result15 += i + " ";
//            }
//        }
//        System.out.println("result 3: " + result3);
//        System.out.println("result 5: " + result5);
//        System.out.println("result 15: " + result15);
//    }
//}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////
///*
//Write a return method that returns the factorial number of any given number
// */
//        System.out.println(factorial(3));
//    }
//    public static int factorial(int n) {
//        int result = 1;
//        for (int i = 1; i <= n; i++) {
//            result = result*i;
//        }
//        return result;
//    }
//}

//        String s = "the game was tied";
//        String s2 = s.substring(5);
//
//        int index1 = s.indexOf("game");
//        int index2 = s2.indexOf("game");
//
//        if (index1 == index2) {
//            System.out.println(index1);
//        } else
//            System.out.println(index2);

//        String z = "popcorn";
//        z = z.substring(1,8);
//
//        if (z.equals("opcorn")) {
//            System.out.println(z.length());
//        }

        String input = "Today it will be 100 degrees !";
        String word = "";
//        boolean b = a.contains("i");
//        boolean c = a.substring(12).startsWith("go");

//        String str = "The whole time it was raining.";
//        do {
//            System.out.print(str.charAt(0));
//            str = str.substring(3);
//        } while (!str.isEmpty()) ;

//        for (int i = a.length()-1; i <= 0 ; i--) {
//            word += a.charAt(i);
//        }
//        System.out.println(word);

//        int n = 0;
//        while (n++ < input.length()) {
//            if (n == 8) {
//                continue;
//            } else if (n == 9) {
//                break;
//            }
//            System.out.println(input.charAt(++n));
//        }

//        int num1 = 2;
//        int num2 = 6;
//        int iterator = 5;
//        int total = 0;
//        for (int i = 0; i < iterator; i++) {
//            if (i % 3 == 0) {
//                continue;
//            }
//            total += num1 + num2;
//        }
//        System.out.println(total);

//        int count = 0;
//        for (int i = 0; i < 4; i++) {
//            if (i == 3) continue;
//            for (int j = i+1; j < 5; j++) {
//                count++;
//                if (j == 3) {
//                    break;
//                }
//            }
//        }
//        System.out.println(count);

//        int[] nums = new int[5];
//        int a =5;
//        nums[2] = a--;
//        nums[0] = a*2;
//        nums[4] = --a + (a - 9);
//        nums[1] = nums[2];
//        nums[3] = nums[a-3];
//        System.out.println(Arrays.toString(nums));

//        double[] doub = new double[4];
//        doub[0] = 1.0;
//        doub[2] = 42.1;
//        doub = new double[4];
//        doub[1] = 17.2;
//        doub[3] = doub.length;
//        System.out.println(Arrays.toString(doub));

//        String result = 3425 > (9 * 1000) ? "garden" : "patio";
//        result = result.substring(2);
//        System.out.println(result);

//        int[] b = new int[5];
//        for (int i = 0; i < b.length; i++) {
//            b[i] = (i * 2);
//        }
//        System.out.println(Arrays.toString(b));


/*
 1. write a program that can print the list of integers in reversed order
        ex:
            list=> {1,2,3,4,5}
            output: 5 4 3 2 1
 */
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        String result = "";
        for (int i = list.size()-1; i >=0 ; i--) {
            result += list.get(i) + " ";
        }
        System.out.println(result);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        /*
2. write a program that can return the sum of all the digits from a string
ex:
    input: "a1b2c3"
    output: 6
        (1+2+3= 6)
    input: "Today's date is 04/27/2020"
    output: 17
        (0+4+2+7+2+0+2+0=17)
HINT: on ascii table, the characters between #48 ~ #57 are digits
         */

        String str = "04/27/2020";
        int sum = 0;
        char[] arr = str.toCharArray();
        for (char each : arr) {
            if (Character.isDigit(each)) {
               sum += Integer.parseInt("" + each);
            }
        }
        System.out.println(sum);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

     /*

2. write a program that can multiply each odd number by 2
        ex: list = [1,2,3,4,5];
            output: [2,2,6,4,10]
3.  write a program that can find the unique elements from an ArrayList of integers and stores into another list called uniques
        ex: list==> {1,1,2,3,3,4,5}
            uniques ==> {2,4,5}
         */

/*
1. write a program that can set the last element of the Integer arraylist to zero
        ex:
            list = [1,2,3,4,5];
            output: [1,2,3,4,0];
 */
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        list2.set(list2.size()-1, 0);
        System.out.println(list2);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        /*

         */

        ArrayList<String> list3 = new ArrayList<>(Arrays.asList("Bob", "Tom", "Bob", "Garry", "Tom", "Irma", "Jerry","Jerry"));
        ArrayList<String> uniques = new ArrayList<>(list3);
        uniques.removeIf(each -> Collections.frequency(list3, each) > 1);
        System.out.println(uniques);
    }
}