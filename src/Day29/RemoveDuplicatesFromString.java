package Day29;

import java.beans.beancontext.BeanContext;
import java.util.Scanner;

public class RemoveDuplicatesFromString {
    public static void main(String[] args) {
        //dups();
        dups2("vvaaerrhy");

    }
    public static void dups(){
       String result = "";
       Scanner scan = new Scanner(System.in);
       String str = scan.nextLine();
        for (int i = 0; i < str.length(); i++) {
            String s = str.substring(i, i+1);
            if (!result.contains(s)) {
                result += s;
            }
        }
        System.out.println(result);
    }

    public static void dups2(String str) {
        String result = "";
        for (String each : str.split("")) {
            if (!result.contains(each)) {
                result += each;
            }
        }
        System.out.println(result);
    }
}
