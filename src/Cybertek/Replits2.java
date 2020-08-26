package Cybertek;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Replits2 {
    public static void main(String[] args) {
//        ArrayList<Integer>  arr = new ArrayList<>();
//        Integer[] nums = new Integer[]{1,1,2,3};
//        arr.addAll(Arrays.asList(nums));
//        System.out.print(removeInst(arr,1));


//        ArrayList<String>  arr = new ArrayList<>();
//        arr.add("2");
//        arr.add("6");
//        arr.add("foo bar");
//        arr.add("abc");
//        String find_tst = search(arr,"foo");
//        System.out.print(find_tst);//foo bar
//        ArrayList<Integer>  arr = new ArrayList<>(Arrays.asList(1,2,3,4,5));
//        System.out.println(twoTimes(arr));



    }
    public static ArrayList<Integer> removeInst(ArrayList<Integer> r, Integer n) {
        //r.removeIf(each -> each.equals(n));
        r.removeAll(Arrays.asList(n));
        return r;
    }

    public static void removeAll (ArrayList<String> wordList, String targetWord) {
        wordList.removeAll(Arrays.asList(targetWord));
    }

    public static String search(ArrayList<String> r, String find) {
        String result = "";
        for (String each : r) {
            if (each.toLowerCase().contains(find.toLowerCase())) {
                result += each;

            }
        }
        if (result.equals("")) {
            result = "search failed";
        }
        return result;
    }

    public static ArrayList<Integer> twoTimes (ArrayList<Integer> arr) {
        ArrayList<Integer> newArr = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            newArr.add(arr.get(i));
            newArr.add(arr.get(i));
        }
        return newArr;
    }

}
