package Day35;

public class SumOfDigits {
    public static void main(String[] args) {
        /*
        write a program that can return the sum of all the digits from a string
            ex:
                input: "a1b2c3"
                output: 6
                    (1+2+3= 6)
                input: "Today's date is 04/27/2020"
                output: 17
                    (0+4+2+7+2+0+2+0=17)
            HINT: on ascii table, the characters between #48 ~ #57 are digits
         */

        // SOLUTION ONE
        String str1 = "a1b2c3";
        String str2 = "04/27/2020";
        int sum = 0;
        int sum2 = 0;

        for (int i = 0; i < str1.length(); i++) {
            char each = str1.charAt(i);
            if (each >= 48 && each <= 57 ) {
                sum += Integer.parseInt(each+"");
            }
        }
        System.out.println(sum);

        //SOLUTION TWO
        for (char each: str1.toCharArray()) {
            if (Character.isDigit(each)) {
                //sum2 += Integer.parseInt(""+each);
                sum2 += each - 48;
            }
        }
        System.out.println(sum);
    }
}
