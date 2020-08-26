package Day37;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RemoveIfDuplicates {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,4,5,6,5,1));
        System.out.println(list);
        list.removeIf(each -> Collections.frequency(list, each) == 1);
        System.out.println(list);

        System.out.println("++++++++++++++++++++++++++++++++++++");

        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("Mom", "Dad", "Wed", "poop", "Greet", "GOOG"));
        list2.removeIf(each -> each.toLowerCase().charAt(0) != each.toLowerCase().charAt(each.length()-1));
        System.out.println(list2);

        System.out.println("++++++++++++++++++++++++++++++++++++");

        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(100,90,65,45,35,50,85,95,60,70,55,60,100,90));
        ArrayList<Integer> gradeA = new ArrayList<>(list3); //90-100
        gradeA.removeIf(each -> each < 90);
        int countA = gradeA.size();
        System.out.println("Grade A have " + countA + " students");

        ArrayList<Integer> gradeB = new ArrayList<>(list3); //80-89
        gradeB.removeIf(each -> each < 80 || each >= 90);
        int countB = gradeB.size();
        System.out.println("Grade B have " + countB + " students");

        ArrayList<Integer> gradeC = new ArrayList<>(list3); //70-79
        gradeC.removeIf(each -> each < 70 || each > 80);
        int countC = gradeC.size();
        System.out.println("Grade C have " + countC + " students");

        ArrayList<Integer> gradeD = new ArrayList<>(list3); //60-69
        gradeD.removeIf(each -> each < 60 || each > 70);
        int countD = gradeD.size();
        System.out.println("Grade D have " + countD + " students");

        ArrayList<Integer> gradeF = new ArrayList<>(list3); //below 60
        gradeF.removeIf(each -> each < 60);
        int countF = gradeF.size();
        System.out.println("Grade F have " + countF + " students");
        /*
        how many A,B,C,D and failed
         */




    }
}
