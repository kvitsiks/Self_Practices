package Day25;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SumTillNegativeNumber {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i == 0;) {
            System.out.println("Enter a number: ");
            int num = scan.nextInt();
            if (num >= 0) {
                sum += num;
            } else {
                break;
            }
        }
        System.out.println(sum);
    }
}
