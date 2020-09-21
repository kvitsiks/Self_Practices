package codingbat;

public class WarmUp4 {
    public static void main(String[] args) {
        //System.out.println(missingChar("code", 2));
        System.out.println(front22("c"));
    }

    /*
    Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count,
    but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there
    is not an alphabetic letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
countYZ("fez day") → 2
countYZ("day fez") → 2
countYZ("day fyyyz") → 2
     */
    public int countYZ(String str) {
        int count = 0;

        return count;
    }

    /*
    The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation.
    We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
sleepIn(false, false) → true
sleepIn(true, false) → false
sleepIn(false, true) → true
     */
    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (weekday == false && vacation == true || weekday == false && vacation == false || weekday == true && vacation == true) {
            return true;
        }
        return false;
    }

    /*
    We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling.
    We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.
monkeyTrouble(true, true) → true
monkeyTrouble(false, false) → true
monkeyTrouble(true, false) → false
     */
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (aSmile == false && bSmile == false || aSmile == true && bSmile == true) return false;
        return true;
    }

    /*
    Given an int n, return the absolute difference between n and 21, except return double
    the absolute difference if n is over 21.
diff21(19) → 2
diff21(10) → 11
diff21(21) → 0
     */
    public int diff21(int n) {
        if (n > 21) {
            return ((21 - n) * -1) * 2;
        }
        return 21 - n;
    }

    public boolean posNeg(int a, int b, boolean negative) {
        negative = false;
        if (!negative) return (a < 0 && b < 0);
        else if (negative)
            return ((b > 0 && a < 0) || (a > 0 && b < 0));
        return negative;
    }
    /*
    Given a non-empty string and an int n, return a new string where the char at index n has been removed.
    The value of n will be a valid index of a char in the original string (i.e. n will be in the range 0..str.length()-1 inclusive).
missingChar("kitten", 1) → "ktten"
missingChar("kitten", 0) → "itten"
missingChar("kitten", 4) → "kittn"
     */
    public static String missingChar(String str, int n) {
        String result = "";
        String first = str.substring(0, n);
        String last = str.substring(n+1, str.length());
            result = first + last;
        return result;
    }
    /*
    Given a string, take the first 2 chars and return the string with the 2 chars added at both the front and back,
    so "kitten" yields"kikittenki". If the string length is less than 2, use whatever chars are there.
front22("kitten") → "kikittenki"
front22("Ha") → "HaHaHa"
front22("abc") → "ababcab"
     */
    public static String front22(String str) {
        String res = "";
        if (str.length() >= 2) {
            String first2 = str.substring(0, 2);
            res = first2 + str + first2;
        } else {
            res = str + str + str;
        }
        return res;
    }
    /*
    We'll say that a number is "teen" if it is in the range 13..19 inclusive.
    Given 2 int values, return true if one or the other is teen, but not both.
loneTeen(13, 99) → true
loneTeen(21, 19) → true
loneTeen(13, 13) → false
     */
    public boolean loneTeen(int a, int b) {
        boolean aTeen = (a >= 13 && a <= 19);
        boolean bTeen = (b >= 13 && b <= 19);
        return (aTeen && !bTeen) || (!aTeen && bTeen);
    }
    /*
    Given a string, if the string "del" appears starting at index 1, return a string where that "del"
    has been deleted. Otherwise, return the string unchanged.
delDel("adelbc") → "abc"
delDel("adelHello") → "aHello"
delDel("adedbc") → "adedbc"
     */
    public String delDel(String str) {
        String result = "";
        if (str.startsWith("del",1)){
            result = str.replace(str.substring(1, 4), "");
        } else return str;
        return result;
    }
    /*
    Return true if the given string begins with "mix",
    except the 'm' can be anything, so "pix", "9ix" .. all count.
mixStart("mix snacks") → true
mixStart("pix snacks") → true
mixStart("piz snacks") → false
     */
    public boolean mixStart(String str) {
        if (str.startsWith("ix", 1)) {
            return true;
        }
        return false;

    }
}
