package Day34;

public class MergeStringsOneByOne {
    public static void main(String[] args) {
        String one = "123456";
        String two = "abcde";
        System.out.println(mergeStrings(one, two));
    }
    public static String mergeStrings(String one, String two) {
        String result = "";
        for (int i = 0; i < one.length() || i < two.length(); i++) {
            if (i < one.length()) {
                result += one.charAt(i);
            }
            if (i < two.length()) {
                result += two.charAt(i);
            }
        }
        return result;
    }
}
