package Day26;

import Cybertek.Arrays;

public class FindSameWordsInArray {
    public static void main(String[] args) {
        /*
        write a program that can return the number of appearances of “java” and “python” anywhere in the sentence
            ex:
                input: I love Java, Python is cool
                output: 1 Java 1 Python
                input: Java Java Python Python Python
                output: 2 Java 3 Python

         */

        String sentence = "Java Java Python Python Python java python javascript";
        String[] words = sentence.split(" ");
        int countJava = 0;
        int countPython = 0;
        for (String each : words) {
            if (each.toLowerCase().contains("java")) {
                countJava +=1;
            }
            else if (each.toLowerCase().contains("python")) {
                countPython +=1;
            }
        }
        System.out.println("countJava = " + countJava + " " + "countPython = " + countPython);
        System.out.println(countJava == countPython);
    }
}
