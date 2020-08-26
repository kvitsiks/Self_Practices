package Day30;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class ReturnMethod2 {
    public static void main(String[] args) {
        String name = "Level";
        System.out.println(name.equalsIgnoreCase(reverseString1(name)));
    }

    public static String reverseString1(String str) {
        String result = "";
        for (int i = str.length()-1; i >= 0 ; i--) {
            result += str.charAt(i);
        }
        return result;
    }
}
