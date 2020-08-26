package JavaRush;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

//public class Solution3 {
//    public static void main(String[] args) {
//        ArrayList<String> list = new ArrayList<String>();
//        Scanner scan = new Scanner(System.in);
//        for (int i = 0; i < 5; i ++) {
//            String str = scan.nextLine();
//            list.add(0, str);
//        }
//        System.out.println(list.size());
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }
//    }


/*
Выражаемся покороче
*/

//public class Solution3 {
//    public static void main(String[] args) throws Exception {
//        ArrayList<String> list = new ArrayList<>();
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String min = reader.readLine();
//
//        for (int i = 0; i < 5; i++){
//            String s = reader.readLine();
//            list.add(s);
//
//            if (list.get(i).length() < min.length()){
//                min = list.get(i);
//            }
//        }
//
//        for (int i = 0; i < list.size(); i++){
//            if (min.length() == list.get(i).length()){
//                System.out.println(list.get(i));
//            }
//        }
//    }
//}

///*
//Удалить и вставить
//*/
//
//public class Solution3 {
//    public static void main(String[] args) throws Exception {
//        //напишите тут ваш код
//        ArrayList<String> list = new ArrayList<>();
//        Scanner scan = new Scanner(System.in);
//        String str = "";
//        for (int i = 0; i < 5; i++) {
//            str = scan.nextLine();
//            list.add(str);
//        }
//        for (int j = 0; j < 13; j++) {
//            list.add(0, list.get(4));
//            list.remove(5);
//        }
//        for (int k = 0; k < list.size(); k++) {
//            System.out.println(list.get(k));
//        }
//    }
//}


/*
Самая длинная строка
*/

public class Solution3 {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
//        ArrayList<String> list = new ArrayList<>();
//        Scanner scan = new Scanner(System.in);
//        String max = scan.nextLine();
//        for (int i = 0; i < 3; i++) {
//            String str = scan.nextLine();
//            list.add(str);
//            if (max.length() < list.get(i).length()) {
//                max = list.get(i);
//            }
//        }
        int z = 5;
        for (int i=5; i>0; i--) {
            z+=i;
        }
        System.out.println(z);

    }
}

