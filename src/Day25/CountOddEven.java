package Day25;

public class CountOddEven {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int countEven = 0;
        int countOdd = 0;

        String even = "";
        String odd = "";

        for (int each : nums) {
            if (each % 2 == 0) {
                countEven += 1;
                even = even + each + " ";
            } else {
                countOdd += 1;
                odd = odd + each + " ";
            }
//            if (each % 2 == 0) {
//                countEven +=1;
//                continue;
//            }
//            countOdd++;
//        }
        }
        System.out.println(countEven + " " + countOdd);
        System.out.println("Evens are " + even + " Odds are " + odd);
    }
}
