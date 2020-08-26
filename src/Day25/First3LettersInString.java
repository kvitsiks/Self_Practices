package Day25;

import java.util.Scanner;

public class First3LettersInString {
    public static void main(String[] args) {
        /*
        Write a program that will take five Strings and save them into an array called arr.
        and  Use for loop to print out the first three letter of each element of arr, one per line.
            You can assume that every element of arr is at least 3 letters long.
                Example: arr -> ["apple", "banana"]
                        prints:  appban
         */

        Scanner scan = new Scanner(System.in);
        String[] arr = new String[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextLine();
        }
        for (int j = 0; j < arr.length; j++) {
            String str = arr[j].substring(0,3);
            System.out.print(str);
        }
    }
}
