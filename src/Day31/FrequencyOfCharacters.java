package Day31;

import Library.*;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String str = "AABBBCDDDDEFFFFFFFFFRR";
        String expected = "";
        String nonDup = Util.removeDup(str);

//        for (char each : nonDup.toCharArray()) {
//            int count = Util.frequency(str, each);
//            expected += "" + each + count;
//        }
//        System.out.println(expected);
//
//        for (int i = 0; i < nonDup.length(); i++) {
//            char ch = nonDup.charAt(i);
//            int count = Util.frequency(str, ch);
//            expected += "" + ch + count;
//        }
//        System.out.println(expected);
//    }

        System.out.println(frequencyOfChars(str));
    }

    public static String frequencyOfChars(String str) {
        String expected = "";
        String nonDup = Util.removeDup(str);

        for (char each : nonDup.toCharArray()) {
            int count = Util.frequency(str, each);
            expected += "" + each + count;
        }
        return expected;
    }
}
