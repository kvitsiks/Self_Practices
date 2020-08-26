package Day37;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniquesNoLoops {
    public static void main(String[] args) {
        /*
        2. write a program that can remove the elements that are not unique from the ArrayList
            NOTE:
                DO NOT USE:
                        for loop
                        while loop
                        for each loop
                        do-while
                        list: {1,1,2,2,3,3,4,5,6,7,7}
                        output: {4,5,6,7}

         */
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,1,2,2,3,3,4,5,6,7,7));
        nums.removeIf(p -> Collections.frequency(nums, p) > 1);
        System.out.println(nums);
    }
}
