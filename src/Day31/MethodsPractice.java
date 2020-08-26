package Day31;

public class MethodsPractice {
    public static void main(String[] args) {
        reverse("kayak");

    }

    public static String reverse(String word) {
        String result = "";
        for (int i = word.length()-1; i >= 0; i--) {
            result += word.charAt(i);
        }
            System.out.println(result.equalsIgnoreCase(word));
        return result;
    }
}
