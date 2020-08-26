package Day35;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.List;

public class WarmUpTasks {
    public static void main(String[] args) {
/*
Warmup tasks:
    1. write a program that can print the list of integers in reversed order
        ex:
            list=> {1,2,3,4,5}
            output: 5 4 3 2 1

    2. write a program that can combine two String arrays into one arrayList
            ex:
                arr1 = {"A", "B", "C"};
                arr2 = {"D", "E", "F", "G"};
                list ==> {"A", "B", "C", "D", "E", "F", "G"}
 */
        ArrayList<Integer> list = new ArrayList<Integer>() {{
            add(1);
            add(2);
            add(3);
            add(4);
            add(5);
        }};

        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        System.out.println("*****************************************************************");

        String[] arr1 = {"A", "B", "C"};
        String[] arr2 = {"D", "E", "F", "G"};
        ArrayList<String> list1 = new ArrayList<>();

        for (String each : arr1) {
            list1.add(each);
        }
        for (String each : arr2) {
            list1.add(each);
        }
        System.out.println(list1);

    }
}
