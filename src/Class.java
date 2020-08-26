import javax.crypto.spec.PSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Class {
    public static void main(String[] args) {

//        //System.out.println(mrthod6("mark"));
//        String str = method7("on the weekend" ,20);
//        System.out.println(str);

//        Scanner input = new Scanner(System.in);
//        int size = input.nextInt();
//
//        int[] a = new int[size];
//        int i = 0;
//        while(i < size) {
//            a[i++] = input.nextInt();
//        }
//        mrthod8(a);

//        Scanner scan = new Scanner(System.in);
//        String str = method9(scan.next(), scan.next(),scan.next());
//        System.out.println(str);

//        double number = add(3.4);
//
//        number += add("dual");
//        number += add(Integer.parseInt("100"));
//        number += add(11341L);
//        number += add(Float.parseFloat("50.8"));
//
//        System.out.println(number);



//        String [] cities = {"Boston", "Houston","Austin", "lincoln", "Tulsa"};
//        ArrayList<String> list = new ArrayList<>(Arrays.asList(cities));
//        int a = list.size();
//
//        for (String str: list) {
//            String rev = "";
//            for (int i = str.length()-1; i >= 0 ; i--) {
//                rev += str.charAt(i);
//            }
//            list.set(--a, rev);
//        }
//        System.out.println(list);
//
//        ArrayList<Integer> numbers = new ArrayList<>();
//        numbers.addAll(Arrays.asList(2,97,2,56,46,73,6,2,3,7));
//        String s = "";
//        for (int i = 0; i < numbers.size(); i++) {
//            if (i ==2 || i ==5 || i == 9) {
//                continue;
//            }
//            if (numbers.get(i) == 2 || numbers.get(i) % 3 == 0) {
//                s += "1";
//            } else {
//                s += "0";
//            }
//        }
//        System.out.println(s);
    }
//    public static int [] mrthod6(String str) {
//        int [] arr = new int[str.length()];
//        int n = 10;
//
//        for (int i = 0; i < arr.length; i++) {
//            if (n == 20 || n == 50 || n == 70) {
//                continue;
//            }
//            arr[i] = n;
//            n += 10;
//        }
//        return arr;
//    }

//    public static String method7(String str, int s){
//        str = str.substring(6);
//        if (s < 10) {
//            str= str.substring(8);
//        } else {
//            if(str.length() > s) {
//                str = "weekday";
//            } else if (s > 10 || s == -10) {
//                str = str.substring(5);
//            }
//        }
//        return str;
//    }

//    public static void mrthod8 (int[] arr){
//        for (int n : arr) {
//            if (n % 4 == 0) {
//                continue;
//            }
//            System.out.println(n);
//        }
//    }

//    public static String method9(String one, String two, String three) {
//        return "" + middle(one) + middle(two) + middle(three);
//    }
//    public static char middle(String s) {
//        return s.charAt(s.length()/2);
//    }
    public static int add(int n) {
        return 5;
    }
    public static double add(double d) {
        return 2.5;
    }
    public static long add(long d) {
        return 10;
    }

}
