package Day29;

import java.util.Scanner;

public class ReverseStringMethod {
    public static void main(String[] args) {
        reverseStringByChars();
        reverseStringByWords();
    }

    public static void reverseStringByChars(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your string");
        String str = scan.nextLine();
        String result = "";

        for (int i = str.length()-1; i >= 0 ; i--) {
            result += str.charAt(i);
        }
        System.out.println(result);
    }

    public static void reverseStringByWords(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your string");
        String str = scan.nextLine();
        String[] arr = str.split(" ");
        String result = "";
        // coffee milk basil coke

        for (int i = arr.length-1; i >= 0 ; i--) {
            if (i > 0) {
                result += arr[i] + ", ";
            } else {
                result += arr[i];
            }
        }
        System.out.println(result);
    }

}
