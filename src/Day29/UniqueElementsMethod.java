package Day29;

import java.sql.SQLOutput;
import java.util.Scanner;

public class UniqueElementsMethod {
    public static void main(String[] args) {
        // write a method that can print out the unique elements from an array of string
        //uniques();
        uniques2();
    }

    public static void uniques() {
        /*
        coffee milk basil coke
         */
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String[] arr = str.split(" ");
        for (String each : arr) {
            int count = 0;
            for (String word : arr) {
                if (word.equalsIgnoreCase(each)) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(each);
            }
        }
    }

    public static void uniques2(){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String expected = "";
        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                char each = str.charAt(i);
                if (ch == each) {
                    count += 1;
                }
            }
            if (count == 1) {
                expected += ch;
            }
        }
        System.out.println(expected);
    }
}
