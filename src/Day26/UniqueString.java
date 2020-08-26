package Day26;

public class UniqueString {
    public static void main(String[] args) {
        String str = "ABACCHHJ";
        String expected = "";


        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                char each = str.charAt(i);
                if (ch == each) {
                    count += 1;
                }
            }
            if (count == 1) {
                expected += ch;
            }
        }
        System.out.println(expected);
    }
}
