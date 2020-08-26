package Day29;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
//        printOdd(0);
//        printEven(0);
        ageCalc(1957, 1957);
    }

    public static void printOdd(int n) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter n1");
        n = scan.nextInt();
        String result = "";
        for (int i = 1; i <= n; i += 2) {
            if (i < n - 1) {
                result = result + i + ", ";
            } else {
                result += i;
            }
        }
        System.out.println(result);
    }

    public static void printEven(int n) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter n2");
        n = scan.nextInt();
        String result = "";
        for (int i = 2; i <= n; i += 2) {
            if (i < n - 1) {
                result = result + i + ", ";
            } else {
                result += i;
            }

        }
        System.out.println(result);
    }

    public static void ageCalc(int currentYear, int birthYear){
        if (currentYear < birthYear) {
            System.out.println("Invalid input");
        } else {
            int age = currentYear - birthYear;
            System.out.println(age);
        }
    }
}
