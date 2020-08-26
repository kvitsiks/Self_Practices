package Day36;

import java.util.ArrayList;

public class WarmUpTasks {
    public static void main(String[] args) {
//
//       /*
//        1. write a program that can set the last element of the Integer arraylist to zero
//            ex:
//                list = [1,2,3,4,5];
//                output: [1,2,3,4,0];
//    2. write a program that can multiply each odd number by 2
//            ex: list = [1,2,3,4,5];
//                output: [2,2,6,4,10]
//    3.  write a program that can find the unique elements from an ArrayList of integers and stores into another list called uniques
//            ex: list==> {1,1,2,3,3,4,5}
//                uniques ==> {2,4,5}
//
//         */
////1
//
//        System.out.println();
//        System.out.println("*****************************************************************");
//
//        ArrayList<Integer> list = new ArrayList<Integer>() {{
//            add(1);
//            add(2);
//            add(3);
//            add(4);
//            add(5);
//            add(6);
//        }};
//        list.set(list.size() - 1, 0);
//        System.out.println(list);
//
//
//        System.out.println();
//        System.out.println("*****************************************************************");
//
//
////2
//
//        ArrayList<Integer> list2 = new ArrayList<Integer>() {{
//            add(1);
//            add(2);
//            add(3);
//            add(4);
//            add(5);
//            add(6);
//            add(7);
//            add(8);
//        }};
//
//        for (int i = 1; i < list2.size(); i++) {
//            Integer each = list2.get(i);
//            if (each % 2 != 0) {
//                list2.set(i, each*2);
//            } else {
//                list2.set(i, each*3);
//            }
//        }
//        System.out.println(list2);
//
////        ArrayList<Integer> list3New = new ArrayList<>();
////        for (int i = 1; i <= list3.size(); i++) {
////            if (i % 2 == 0) {
////                list3New.add(i*3);
////            }
////            if (i % 2 != 0) {
////                list3New.add(i * 2);
////            }
////        }
////        System.out.println(list3New);
//
//
////3
//
//        System.out.println();
//        System.out.println("*****************************************************************");
//
        ArrayList<Integer> list4 = new ArrayList<Integer>() {{
            add(1);
            add(1);
            add(3);
            add(4);
            add(4);
            add(5);
            add(1);
            add(4);
        }};
//        ArrayList<Integer> uniques = new ArrayList<>();
//
//
//        for (int j = 0; j < list4.size(); j++) {
//            int count = 0;
//            Integer element = list4.get(j);
//            for (int i = 0; i < list4.size(); i++) {
//                if (list4.get(i) == element) {
//                    count++;
//                }
//            }
//            if (count == 1) {
//                uniques.add(element);
//            }
//        }
//        System.out.println(uniques);
//
        ArrayList<Integer> uniques = new ArrayList<>();

        for (int i = 0; i < list4.size(); i++) {
            int count = 0;
            Integer element = list4.get(i);
            for (Integer each : list4) {
                if (each == element) {
                    count++;
                }
            }
            if (count == 1) {
                uniques.add(element);
            }
        }
        System.out.println(uniques);
    }

}
