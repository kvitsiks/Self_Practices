package Day37;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperationsPractice {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Mon");
        list.add("Tue");
        list.add("Wed");
        list.add("Fri ");

        boolean b = list.containsAll(Arrays.asList("Mon", "Tue"));
        System.out.println(b);

        System.out.println("+++++++++++++++++++++++++++++++++++");
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8,0));
        System.out.println(numbers);

        System.out.println("+++++++++++++++++++++++++++++++++++");

        ArrayList<String> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList("Jan", "Feb", "Mar", "Apr", "May"));
        boolean contains = list2.containsAll(Arrays.asList("May", "Mar"));
        System.out.println(list2);
        System.out.println(contains);

        System.out.println("+++++++++++++++++++++++++++++++++++");
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,1,1,2,3,3,4,5,6));
        nums.removeAll(Arrays.asList(1,3));
        System.out.println(nums);

    }
}
