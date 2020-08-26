package codingbat;

import java.util.Arrays;

public class WarmUp3 {
    public static void main(String[] args) {
        //String str = "Java is fun!";
        String str1 = "hellhohe";
        String str2 = "W";
        //System.out.println(doubleChar(str));
        //System.out.println(countHi(str));
        //System.out.println(catDog(str));
        //System.out.println(countCode(str));
        //System.out.println(endOther(str1, str2));
        //System.out.println(xyzThere(str1));
        //System.out.println(anagram(str1, str2));
        //System.out.println(mixString(str1, str2));
        //System.out.println(repeatEnd(str1, 2));
        //System.out.println(repeatFront(str1, 3));
        System.out.println(prefixAgain(str1, 2));
    }

    /*
Given a string, return a string where for every char in the original, there are two chars.
doubleChar("The") → "TThhee"
doubleChar("AAbb") → "AAAAbbbb"
doubleChar("Hi-There") → "HHii--TThheerree"
 */
    public static String doubleChar(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            result += "" + ch + ch;
        }
        return result;
    }

    /*
    Return the number of times that the string "hi" appears anywhere in the given string.
countHi("abc hi ho") → 1
countHi("ABChi hi") → 2
countHi("hihi") → 2
     */
    public static int countHi(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            System.out.println(str.substring(i, i + 2));
            if (str.substring(i, i + 2).equals("hi")) {
                count++;
            }
        }
        return count;
    }

    /*
Return true if the string "cat" and "dog" appear the same number of times in the given string.
catDog("catdog") → true
catDog("catcat") → false
catDog("1cat1cadodog") → true
     */
    public static boolean catDog(String str) {
        int countCat = 0;
        int countDog = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            System.out.println(str.substring(i, i + 3));
            if (str.substring(i, i + 3).equals("cat")) {
                countCat++;
            } else if (str.substring(i, i + 3).equals("dog")) {
                countDog++;
            }
        }
        return countCat == countDog;
    }

    /*
    Return the number of times that the string "code" appears anywhere in the given string,
    except we'll accept any letter for the 'd', so "cope" and "cooe" count.
countCode("aaacodebbb") → 1
countCode("codexxcode") → 2
countCode("cozexxcope") → 2
     */
    public static int countCode(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 3; i++) {
            if (str.substring(i, i + 2).equals("co") && str.charAt(i + 3) == 'e') {
                count++;
            }
        }
        return count;
    }

    /*
    Given two strings, return true if either of the strings appears at the very end of the other string,
    ignoring upper/lower case differences (in other words, the computation should not be "case sensitive").
    Note: str.toLowerCase() returns the lowercase version of a string.
     */
    public static boolean endOther(String a, String b) {
        //int len = Math.max(a.length(), b.length());
        for (int i = 0; i < a.length(); i++) {
            if (a.toLowerCase().endsWith(b.toLowerCase()) || b.toLowerCase().endsWith(a.toLowerCase())) {
                return true;
            }
        }
        return false;
    }

    /*
Return true if the given string contains an appearance of "xyz" where the xyz is not directly preceeded
by a period (.). So "xxyz" counts but "x.xyz" does not.
     */
    public static boolean xyzThere(String str) {
        return str.replace(".xyz", "").contains("xyz");
    }

    /*
Return true if the given string contains a "bob" string, but where the middle 'o' char can be any char.
     */
    public static boolean bobThere(String str) {
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 1).equals("b") && str.charAt(i + 2) == 'b') return true;
        }
        return false;
    }

    /*
    We'll say that a String is xy-balanced if for all the 'x' chars in the string, there exists a 'y'
    char somewhere later in the string. So "xxy" is balanced, but "xyx" is not. One 'y' can balance multiple 'x's.
    Return true if the given string is xy-balanced.
     */
    public boolean xyBalance(String str) {
        return (str.indexOf('x') == -1) || str.lastIndexOf('x') < str.lastIndexOf('y');
    }

    /*
    Write a function to check whether two given strings are anagram of each other or not.
    An anagram of a string is another string that contains same characters, only the order of characters can be different.
    For example, “abcd” and “dabc” are anagram of each other.
     */
    public static boolean anagram(String str1, String str2) {
        String[] arr1 = str1.toLowerCase().split("");
        String[] arr2 = str2.toLowerCase().split("");

        if (arr1.length != arr2.length) {
            return false;
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

    /*
    Given two strings, a and b, create a bigger string made of the first char of a, the first char of b, the second char of a,
    the second char of b, and so on. Any leftover chars go at the end of the result.
mixString("abc", "xyz") → "axbycz"
mixString("Hi", "There") → "HTihere"
mixString("xxxx", "There") → "xTxhxexre"
     */
    public static String mixString(String a, String b) {
        String result = "";
        int i = 0;
        while (i < a.length() && i < b.length()) {
            result += "" + a.charAt(i) + b.charAt(i);
            i++;
        }
        return result + a.substring(i) + b.substring(i);
    }
    /*
    Given a string and an int n, return a string made of n repetitions of the last n characters of the string.
    You may assume that n is between 0 and the length of the string, inclusive.
repeatEnd("Hello", 3) → "llollollo"
repeatEnd("Hello", 2) → "lolo"
repeatEnd("Hello", 1) → "o"
     */
    public static String repeatEnd(String str, int n) {
        String result = "";
        for (int i = 0; i < n; i++) {
            result += str.substring(str.length() - n);
        }
        return result;
    }
    /*
Given a string and an int n, return a string made of the first n characters of the string, followed by the first n-1 characters of the string, and so on.
You may assume that n is between 0 and the length of the string, inclusive (i.e. n >= 0 and n <= str.length()).
repeatFront("Chocolate", 4) → "ChocChoChC"
repeatFront("Chocolate", 3) → "ChoChC"
repeatFront("Ice Cream", 2) → "IcI"
     */
    public static String repeatFront(String str, int n) {
        String result = "";
        result += str.substring(0, n);
        int k = 1;
        for (int i = 0; i < n; i++) {
            result += str.substring(0, n - k);
            k++;
        }
        return result;
    }
    /*
    Given a string, consider the prefix string made of the first N chars of the string.
Does that prefix string appear somewhere else in the string? Assume that the string is not empty and that N is in the range 1..str.length().
prefixAgain("abXYabc", 1) → true
prefixAgain("abXYabc", 2) → true
prefixAgain("abXYabc", 3) → false
     */
    public static boolean prefixAgain(String str, int n) {
        String prefix = str.substring(0, n);
        System.out.println( prefix);
        for (int i = 0; i < str.length() - n; i++) {
            System.out.println(str.substring(n));
            if (str.substring(n).contains(prefix)) {
                return true;
            }
        }
        return false;
    }
    /*

Given a string, does "xyz" appear in the middle of the string? To define middle, we'll say that the number of chars to the left and right of the "xyz"
must differ by at most one. This problem is harder than it looks.
xyzMiddle("AAxyzBB") → true
xyzMiddle("AxyzBB") → true
xyzMiddle("AxyzBBB") → false
     */
    public static boolean xyzMiddle(String str) {
       return false;
    }
}