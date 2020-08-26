package Day37;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class LambdaExpressions {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,4,8,12,5,3));

        //Predicate<Integer> lessThan5 = p -> p < 5;
        //list.removeIf(lessThan5);
        //OR
        list.removeIf(p -> p < 5);
        System.out.println(list);

        System.out.println("_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_");

        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            list2.add(i);
        }
        ArrayList<Integer> list3 = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            list3.add(i);
        }
        Predicate<Integer> oddNumbers = p -> p % 2 != 0; //remove if number is odd
        list2.removeIf(oddNumbers);
        System.out.println(list2);

        list3.removeIf(p -> p % 2 == 0); //remove if number is even
        System.out.println(list3);

        System.out.println("_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_");

        ArrayList<String> names = new ArrayList<>(Arrays.asList("Alla", "Slava", "Koala", "Mykola", "Timur"));
        //names.removeIf(each -> each.charAt(0) == 'S');
        names.removeIf(each -> each.startsWith("A") || each.endsWith("r"));
        System.out.println(names);

        System.out.println("_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_");


    }
}
