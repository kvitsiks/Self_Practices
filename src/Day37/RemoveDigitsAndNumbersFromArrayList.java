package Day37;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDigitsAndNumbersFromArrayList {
    public static void main(String[] args) {
        /*
          3. write a program that can remove digits and
          letters from an ArrayList of characters
            list: {a,b,c,3,4,5,6,&,%,@,#,*}
            output: {&,%,@,#,*};
         */
        ArrayList<Character> removeNumsAndLetters = new ArrayList<>(Arrays.asList('a','b','c','3','4','5','6','&','%','@','#','*'));
        removeNumsAndLetters.removeIf(each -> Character.isDigit(each) || Character.isAlphabetic(each));
        System.out.println(removeNumsAndLetters);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++");

        ArrayList<Character> list = new ArrayList<>(Arrays.asList('a','b','c','3','4','5','6','&','%','@','#','*'));
        ArrayList<Character> digits = new ArrayList<>();
        ArrayList<Character> letters = new ArrayList<>();
        ArrayList<Character> specialCharacters = new ArrayList<>();

        digits.addAll(list);
        digits.removeIf(each -> !Character.isDigit(each));

        letters.addAll(list);
        letters.removeIf(each -> !Character.isLetter(each));

        specialCharacters.addAll(list);
        specialCharacters.removeIf(each -> Character.isLetter(each) || Character.isDigit(each));

        System.out.println("Digits" + digits);
        System.out.println("Letters" + letters);
        System.out.println("SpacialChar" + specialCharacters);
     }
}
