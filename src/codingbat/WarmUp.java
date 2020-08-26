package codingbat;

import java.util.ArrayList;
import java.util.Arrays;

public class WarmUp {
    public static void main(String[] args) {
        //System.out.println(nearHundred(111));
        //System.out.println(posNeg(-4, 5, true));
        //System.out.println(notString("not"));
        //System.out.println(missingChar("kitten", 1));
        //System.out.println(frontBack("ab"));
        //System.out.println(front3("ab"));
        //System.out.println(backAround("hello"));
        //System.out.println(or35(0));
        //System.out.println(altPairs("abc"));
        //System.out.println(stringYak("pterris"));
        int[] arr = {4, 6, 3, 13, 2};
        //System.out.println(array667(arr));
        //System.out.println(noTriples(arr));
        //System.out.println(has271(arr));
        //System.out.println(stringTimes("Hi", 3));
        //System.out.println(doubleX("aaaax"));
        //System.out.println(last2("a"));
        //System.out.println(array123(arr));
        //System.out.println(frontTimes("", 4));
        //System.out.println(stringBits("Heeololeo"));
        //System.out.println("Code");
        //System.out.println(stringMatch("abc", "abc"));
        //System.out.println(stringX("xabxxxcdx"));
        //System.out.println(stringSplosion1("Code"));
        //System.out.println(countXX("xxx"));
        //System.out.println(arrayFront9(arr));
        //System.out.println(countEvens(arr));
        //System.out.println(bigDiff(arr));
        //System.out.println(centeredAverage(arr));
        System.out.println(sum13(arr));
        //System.out.println(has22(arr));
        //System.out.println(sum67(arr));
    }

    /*
    Given an int n, return true if it is within 10 of 100 or 200.
    Note: Math.abs(num) computes the absolute value of a number.
    nearHundred(93) → true
    nearHundred(90) → true
    nearHundred(89) → false
     */
    public static boolean nearHundred(int n) {
        return ((Math.abs(100 - n) <= 10) || (Math.abs(200 - n) <= 10));
    }

    /*
    Given 2 int values, return true if one is negative and one is positive.
    Except if the parameter "negative" is true, then return true only if both are negative.
    posNeg(1, -1, false) → true
    posNeg(-1, 1, false) → true
    posNeg(-4, -5, true) → true
     */
    public static boolean posNeg(int a, int b, boolean negative) {
        if (negative) {
            return (a < 0 && b < 0);
        } else {
            return ((a < 0 && b > 0) || (a > 0 && b < 0));
        }
    }

    /*
Given a string, return a new string where "not " has been added to the front.
However, if the string already begins with "not", return the string unchanged. Note: use .equals() to compare 2 strings.
notString("candy") → "not candy"
notString("x") → "not x"
notString("not bad") → "not bad"
     */
    public static String notString(String str) {
        if (str.length() >= 3 && str.substring(0, 3).equals("not")) {
            return str;
        }
        return "not " + str;
    }
/*
Given a non-empty string and an int n, return a new string where the char at index n has been removed.
The value of n will be a valid index of a char in the original string
(i.e. n will be in the range 0..str.length()-1 inclusive).
missingChar("kitten", 1) → "ktten"
missingChar("kitten", 0) → "itten"
missingChar("kitten", 4) → "kittn"
 */

    public static String missingChar(String str, int n) {
        String result = "";
        if (n <= str.length()) {
            result = str.substring(0, n) + str.substring(n + 1);
        }
        return result;
    }

    /*
    Given a string, return a new string where the first and last chars have been exchanged.
    frontBack("code") → "eodc"
    frontBack("a") → "a"
    frontBack("ab") → "ba"
     */
    public static String frontBack(String str) {
        if (str.length() <= 1) return str;
        String mid = str.substring(1, str.length() - 1);
        String first = "" + str.charAt(0);
        String last = "" + str.charAt(str.length() - 1);
        return last + mid + first;
    }
    /*
Given a string, we'll say that the front is the first 3 chars of the string.
If the string length is less than 3, the front is whatever is there.
Return a new string which is 3 copies of the front.
front3("Java") → "JavJavJav"
front3("Chocolate") → "ChoChoCho"
front3("abc") → "abcabcabc"
     */

    public static String front3(String str) {
        if (str.length() < 3) return str + str + str;
        return str.substring(0, 3) + str.substring(0, 3) + str.substring(0, 3);
    }

    /*
Given a string, take the last char and return a new string with the last char added at the front and back,
so "cat" yields "tcatt". The original string will be length 1 or more.
backAround("cat") → "tcatt"
backAround("Hello") → "oHelloo"
backAround("a") → "aaa"
     */
    public static String backAround(String str) {
        return str.charAt(str.length() - 1) + str + str.charAt(str.length() - 1);
    }

    /*

Return true if the given non-negative number is a multiple of 3 or a multiple of 5.
Use the % "mod" operator -- see Introduction to Mod
or35(3) → true
or35(10) → true
or35(8) → false
     */
    public static boolean or35(int n) {
        return n % 3 == 0 || n % 5 == 0;
    }

    /*
Given a string, return true if the string starts with "hi" and false otherwise.
startHi("hi there") → true
startHi("hi") → true
startHi("hello hi") → false
     */
    public boolean startHi(String str) {
        return str.toLowerCase().startsWith("hi".toLowerCase());
    }

    /*
Given two temperatures, return true if one is less than 0 and the other is greater than 100.
icyHot(120, -1) → true
icyHot(-1, 120) → true
icyHot(2, 120) → false
     */
    public static boolean icyHot(int temp1, int temp2) {
        return (temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0);
    }

    /*
Given 2 int values, return true if either of them is in the range 10..20 inclusive.
in1020(12, 99) → true
in1020(21, 12) → true
in1020(8, 99) → false
     */
    public boolean in1020(int a, int b) {
        return (a >= 10 && a <= 20) || (b >= 10 && b <= 20);
    }

    /*
Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".
altPairs("kitten") → "kien"
altPairs("Chocolate") → "Chole"
altPairs("CodingHorror") → "Congrr"
     */
    public static String altPairs(String str) {
        String result = "";
        // Run i by 4 to hit 0, 4, 8, ...
        for (int i = 0; i < str.length(); i += 4) {
            // Append the chars between i and i+2
            int end = i + 2;
            if (end > str.length()) {
                end = str.length();
            }
            result = result + str.substring(i, end);
        }
        return result;
    }

    /*
Suppose the string "yak" is unlucky. Given a string, return a version where all the "yak" are removed,
but the "a" can be any char. The "yak" strings will not overlap.
stringYak("yakpak") → "pak"
stringYak("pakyak") → "pak"
stringYak("yak123ya") → "123ya"
     */
    public static String stringYak(String str) {
        String result = "";
        String word = "yak";
        for (int i = 0; i <= str.length() - word.length(); i++) {
            if (str.toLowerCase().substring(i, i + word.length()).equals("yak")) {
                result = str.replace(word, "");
            }
        }
        return result;
    }

    /*
Given an array of ints, return the number of times that two 6's are next to each other in the array.
Also count instances where the second "6" is actually a 7.
array667([6, 6, 2]) → 1
array667([6, 6, 2, 6]) → 1
array667([6, 7, 2, 6]) → 1
     */
    public static int array667(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if ((nums[i] == 6 && nums[i + 1] == 6)) count++;
            else if ((nums[i] == 6 && nums[i + 1] == 7)) count++;
        }
        return count;
    }

    /*

Given an array of ints, we'll say that a triple is a value appearing 3 times in a row in the array.
Return true if the array does not contain any triples.
noTriples([1, 1, 2, 2, 1]) → true
noTriples([1, 1, 2, 2, 2, 1]) → false
noTriples([1, 1, 1, 2, 2, 2, 1]) → false
     */
    public static boolean noTriples(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == nums[i + 1] && nums[i] == nums[i + 2]) return false;
        }
        return true;
    }

    /*
Given an array of ints, return true if it contains a 2, 7, 1 pattern: a value,
followed by the value plus 5, followed by the value minus 1. Additionally the
271 counts even if the "1" differs by 2 or less from the correct value.
has271([1, 2, 7, 1]) → true
has271([1, 2, 8, 1]) → false
has271([2, 7, 1]) → true
     */
    public static boolean has271(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            int val = nums[i];
            if (nums[i + 1] == (val + 5) && (nums[i + 2] - (val - 1)) <= 2) return true;
        }
        return false;
    }

    /*
Given a string and a non-negative int n, return a larger string that is n copies of the original string.
stringTimes("Hi", 2) → "HiHi"
stringTimes("Hi", 3) → "HiHiHi"
stringTimes("Hi", 1) → "Hi"
     */
    public static String stringTimes(String str, int n) {
        String res = "";
        for (int i = 0; i < n; i++) {
            res += str;
        }
        return res;
    }

    /*
Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".
doubleX("axxbb") → true
doubleX("axaxax") → false
doubleX("xxxxx") → true
     */
    public static boolean doubleX(String str) {
        int first = str.indexOf("x");
        for (int i = 0; i <= str.length() - first - 2; i++) {
            if (str.contains("x") && str.substring(first, first + 2).equals("xx")) return true;
        }
        return false;
    }

    /*

Given a string, return the count of the number of times that a substring length 2 appears in the
string and also as the last 2 chars of the string, so "hixxxhi" yields 1 (we won't count the end substring).
last2("hixxhi") → 1
last2("xaxxaxaxx") → 1
last2("axxxaaxx") → 2
     */
    public static int last2(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 2).equals(str.substring(str.length() - 2))) count++;
        }
        return count;
    }

    /*
Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.
array123([1, 1, 2, 3, 1]) → true
array123([1, 1, 2, 4, 1]) → false
array123([1, 1, 2, 1, 2, 3]) → true
     */
    public static boolean array123(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3) return true;
        }
        return false;
    }

    /*
Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars,
or whatever is there if the string is less than length 3. Return n copies of the front;
frontTimes("Chocolate", 2) → "ChoCho"
frontTimes("Chocolate", 3) → "ChoChoCho"
frontTimes("Abc", 3) → "AbcAbcAbc"
     */
    public static String frontTimes(String str, int n) {
        String res = "";
        for (int i = 0; i < n; i++) {
            if (str.length() < 3) res += str;
            else res += str.substring(0, 3);
        }
        return res;
    }

    /*
Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".
stringBits("Hello") → "Hlo"
stringBits("Hi") → "H"
stringBits("Heeololeo") → "Hello"
     */
    public static String stringBits(String str) {
        String res = "";
        for (int i = 0; i < str.length(); i += 2) {
            res += str.charAt(i);
        }
        return res;
    }

    /*
Given a non-empty string like "Code" return a string like "CCoCodCode".
stringSplosion("Code") → "CCoCodCode"
stringSplosion("abc") → "aababc"
stringSplosion("ab") → "aab"
     */
    public String stringSplosion(String str) {
        int k = 0;
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            res += str.charAt(i + k);
            k++;
        }
        return res;
    }

    /*
Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring.
So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings appear in the same place in both strings.
stringMatch("xxcaazz", "xxbaaz") → 3
stringMatch("abc", "abc") → 2
stringMatch("abc", "axc") → 0
     */
    public static int stringMatch(String a, String b) {
        int count = 0;
        int len = Math.min(a.length(), b.length());
        for (int i = 0; i <= len - 2; i++) {
            if (a.substring(i, i + 2).equals(b.substring(i, i + 2))) count++;
        }
        return count;

    }

    /*
Given a string, return a version where all the "x" have been removed.
Except an "x" at the very start or end should not be removed.
stringX("xxHxix") → "xHix"
stringX("abxxxcd") → "abcd"
stringX("xabxxxcdx") → "xabcdx"
     */
    public static String stringX(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            // Only append the char if it is not the "x" case
            if (!(i > 0 && i < (str.length() - 1) && str.substring(i, i + 1).equals("x"))) {
                result += str.substring(i, i + 1); // Could use str.charAt(i) here
            }
        }
        return result;
    }

    /*
Given a non-empty string like "Code" return a string like "CCoCodCode".
stringSplosion("Code") → "CCoCodCode"
stringSplosion("abc") → "aababc"
stringSplosion("ab") → "aab"
     */
    public static String stringSplosion1(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result += str.substring(0, i + 1);
        }
        return result;
    }

    /*

Count the number of "xx" in the given string.
We'll say that overlapping is allowed, so "xxx" contains 2 "xx".
countXX("abcxx") → 1
countXX("xxx") → 2
countXX("xxxx") → 3
     */
    static int countXX(String str) {
        int count = 0;
        for (int i = 0; i <= str.length() - 2; i++) {
            if (str.substring(i, i + 2).equals("xx")) {
                count++;
            }
        }
        return count;
    }

    /*
Given an array of ints, return the number of 9's in the array.
arrayCount9([1, 2, 9]) → 1
arrayCount9([1, 9, 9]) → 2
arrayCount9([1, 9, 9, 3, 9]) → 3
     */
    public static int arrayCount9(int[] nums) {
        int count = 0;
        for (int each : nums) {
            if (each == 9) count++;
        }
        return count;
    }

    /*
Given an array of ints, return true if one of the first 4 elements in the array is a 9.
The array length may be less than 4.
arrayFront9([1, 2, 9, 3, 4]) → true
arrayFront9([1, 2, 3, 4, 9]) → false
arrayFront9([1, 2, 3, 4, 5]) → false
     */
    public static boolean arrayFront9(int[] nums) {
        int end = nums.length;
        if (nums.length > 4) end = 4;
        for (int i = 0; i < end; i++) {
            if (nums[i] == 9) return true;
        }
        return false;
    }

    /*
Return the number of even ints in the given array. Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.
countEvens([2, 1, 2, 3, 4]) → 3
countEvens([2, 2, 0]) → 3
countEvens([1, 3, 5]) → 0
     */
    public static int countEvens(int[] nums) {
        int count = 0;
        for (int each : nums) {
            if (each % 2 == 0) count++;
        }
        return count;
    }

    /*
Given an array length 1 or more of ints, return the difference between the largest and smallest values in the array.
Note: the built-in Math.min(v1, v2) and Math.max(v1, v2) methods return the smaller or larger of two values.
bigDiff([10, 3, 5, 6]) → 7
bigDiff([7, 2, 10, 9]) → 8
bigDiff([2, 10, 7, 2]) → 8
     */
    public static int bigDiff(int[] nums) {
        int dif;
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) max = nums[i];
            if (nums[i] < min) min = nums[i];
        }
        dif = max - min;
        return dif;
    }

    /*
Return the "centered" average of an array of ints, which we'll say is the mean average of the values,
except ignoring the largest and smallest values in the array.
If there are multiple copies of the smallest value, ignore just one copy,
and likewise for the largest value. Use int division to produce the final average.
You may assume that the array is length 3 or more.

centeredAverage([1, 2, 3, 4, 100]) → 3
centeredAverage([1, 1, 5, 5, 10, 8, 7]) → 5
centeredAverage([-10, -4, -2, -4, -2, 0]) → -3
     */
    public static int centeredAverage(int[] nums) {
        int aver;
        int sum = 0;
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }
        list.remove(list.get(0));
        list.remove(list.get(list.size() - 1));
        for (int each : list) {
            sum += each;
        }
        aver = sum / list.size();
        return aver;
    }

    /*
Return the sum of the numbers in the array, returning 0 for an empty array.
Except the number 13 is very unlucky, so it does not count and numbers that come immediately after a 13 also do not count.
sum13([1, 2, 2, 1]) → 6
sum13([1, 1]) → 2
sum13([1, 2, 2, 1, 13]) → 6
     */
    public static int sum13(int[] nums) {
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 13) {
                i++;
                continue;
            } else
                sum += nums[i];
        }
        return sum;
    }
    /*
Return the sum of the numbers in the array, except ignore sections of numbers starting with a
6 and extending to the next 7 (every 6 will be followed by at least one 7). Return 0 for no numbers.
sum67([1, 2, 2]) → 5
sum67([1, 2, 2, 6, 99, 99, 7]) → 5
sum67([1, 1, 6, 7, 2]) → 4
     */

    public static int sum67(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 6) {
                sum += nums[i];
            } else {
                while (nums[i] != 7) {
                    i++;
                }
            }
        }
        return sum;
    }

    /*
Given an array of ints, return true if the array contains a 2 next to a 2 somewhere.
has22([1, 2, 2]) → true
has22([1, 2, 1, 2]) → false
has22([2, 1, 2]) → false
     */
    public static boolean has22(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 2) return true;
        }
        return false;
    }
    /*
Given an array of ints, return true if the array contains no 1's and no 3's.
lucky13([0, 2, 4]) → true
lucky13([1, 2, 3]) → false
lucky13([1, 2, 4]) → false
     */

    public static boolean lucky13(int[] nums) {
        for (int i = 0; i < nums.length; i ++) {
            if (nums[i] == 1 || nums[i] == 3) return false;
        }
        return true;
    }

}
