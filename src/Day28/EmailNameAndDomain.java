package Day28;

import java.util.Scanner;

public class EmailNameAndDomain {
    public static void main(String[] args) {
        /*
        write a program that can get the name and domain of any given email address
        Ex:
            cybertek@gmail.com
            output:
                name: cybertek
                domain: gmail
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter email");
        String email = scan.nextLine();
        int at = email.indexOf("@");
        int dot = email.lastIndexOf(".");
        String name = email.substring(0, at);
        String domain = email.substring(at+1, dot);
        System.out.println("name: " + name);
        System.out.println("domain: " + domain);
    }
}
