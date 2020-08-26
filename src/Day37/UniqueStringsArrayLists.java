package Day37;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueStringsArrayLists {
    public static void main(String[] args) {
            /*
    Task:
        1. write a program that can find the unique characters from a string
                DO NOT use nested loop
                "ABABCDEE"
                output: C D
        2. write a program that can find the frequency of character from a String
                DO NOT use nested loop
                "AABBCCDDEE"  ==> "ABCDE"
                output: A2B2C2D2E2
     */
//        String str = "ABABCDEE";
//        String[] arr = str.split("");
//        ArrayList<String> list = new ArrayList<>();
//        for (String each : arr) {
//            list.add(each);
//        }
//        String result = "";
//        for (int i = 0; i < list.size(); i++) {
//            int count = Collections.frequency(list, list.get(i));
//            if (count == 1) {
//                result += list.get(i);
//            }
//        }
//        System.out.println(result);



//        String str = "ABABCDEE";
//        String result = "";
//        int count = 0;
//        for (int j = 0; j < str.length(); j++) {
//            char ch = str.charAt(j);
//            count = 0;
//            for (int i = 0; i < str.length(); i++) {
//                if (ch == str.charAt(i)) {
//                    count++;
//                }
//            }
//            if (count == 1) {
//                result += ch;
//            }
//        }
//
//        System.out.println(result);


//        String str = "AAABBCCDDEEF";
//        String noDup = "";
//        for (int i = 0; i < str.length(); i++) {
//            char ch = str.charAt(i);
//            if (!noDup.contains(""+ch)) {
//                noDup += ch;
//            }
//        }
//
//        for (int j = 0; j < noDup.length(); j++) {
//            int count = 0;
//            char ch = noDup.charAt(j);
//            for (int i = 0; i < str.length(); i++) {
//                if (ch == str.charAt(i)) {
//                    count ++;
//                }
//            }
//            System.out.print("" + ch + count);
//        }



        //MUHA'S SOLUTION
        String str = "AAABBCCDDEEF";
        ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split("")));

        ArrayList<String> nonDup = new ArrayList<>();
        for (String each : list) {
            if (!nonDup.contains(each)) {
                nonDup.add(each);
            }
        }
        for (String each : nonDup) {
            int count = Collections.frequency(list, each);
            System.out.print(each + count);
        }

    }
}
