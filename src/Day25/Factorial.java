package Day25;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int result = 1;
        int num = scan.nextInt();
        for (int i = num; i >= 1; i--) {
            result = result * i;
        }
        System.out.println(result);
    }
}
