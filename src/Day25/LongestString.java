package Day25;

public class LongestString {
    public static void main(String[] args) {
        String[] arr = {"Adam", "john", "Tom"};

        int max = arr[0].length();

        for (String each : arr) {
            if (each.length() > max) {
                max = each.length();
            }
        }
        for (String each : arr) {
            if (each.length() == max) {
                System.out.println(each);
            }
        }


    }
}
