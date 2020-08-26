package codingbat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WarmUp2 {
    public static void main(String[] args) {
        int[] arr1 = {4, 5, 2, 0, 1, 2, 5};
        int[] arr2 = {4, 4, 2, 2, 3, 2};
        String str = "jav34ajs4jk6";
        //System.out.println(sum28(arr));
        //System.out.println(only14(arr));
        //System.out.println(either24(arr));
        //System.out.println(matchUp(arr1, arr2));
        //System.out.println(has77(arr1));
        //System.out.println(has12(arr1));
        //System.out.println(modThree(arr1));
        //sumOfIntsInString("z", "zebra");
        //System.out.println(sumOfIntsInString(str));
        System.out.println(twoTwo(arr2));

    }

    /*
Given an array of ints, return true if the sum of all the 2's in the array is exactly 8.
sum28([2, 3, 2, 2, 4, 2]) → true
sum28([2, 3, 2, 2, 4, 2, 2]) → false
sum28([1, 2, 3, 4]) → false
     */
    public static boolean sum28(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2) sum += nums[i];
        }
        if (sum != 8) return false;
        return true;
    }

    /*
Given an array of ints, return true if the number of 1's is greater than the number of 4's
more14([1, 4, 1]) → true
more14([1, 4, 1, 4]) → false
more14([1, 1]) → true
*/
    public static boolean more14(int[] nums) {
        int countOne = 0;
        int countFour = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) countOne++;
            if (nums[i] == 4) countFour++;
        }
        if (countOne > countFour) return true;
        return false;
    }

    /*
Given an array of ints, return true if every element is a 1 or a 4.
only14([1, 4, 1, 4]) → true
only14([1, 4, 2, 4]) → false
only14([1, 1]) → true
     */
    public static boolean only14(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 4 && nums[i] != 1) {
                return false;
            }
        }
        return true;
    }

    /*
We'll say that a value is "everywhere" in an array if for every pair of adjacent elements in the array,
at least one of the pair is that value. Return true if the given value is everywhere in the array.
isEverywhere([1, 2, 1, 3], 1) → true
isEverywhere([1, 2, 1, 3], 2) → false
isEverywhere([1, 2, 1, 3, 4], 1) → false
     */
    public static boolean isEverywhere(int[] nums, int val) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != val && nums[i + 1] != val) return false;
        }
        return true;
    }

    /*
Given an array of ints, return true if the array contains a 2 next to a 2 or a 4 next to a 4, but not both.
either24([1, 2, 2]) → true
either24([4, 4, 1]) → true
either24([4, 4, 1, 2, 2]) → false
     */
    public static boolean either24(int[] nums) {
        int two = 0;
        int four = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 2) {
                two++;
            }
            if (nums[i] == 4 && nums[i + 1] == 4) {
                four++;
            }
        }
        if (two != 0 && four != 0) {
            return false;
        } else if (two != 0 || four != 0) {
            return true;
        } else {
            return false;
        }
    }

    /*
Given arrays nums1 and nums2 of the same length, for every element in nums1,
consider the corresponding element in nums2 (at the same index).
Return the count of the number of times that the two elements differ by 2 or less, but are not equal.
matchUp([1, 2, 3], [2, 3, 10]) → 2
matchUp([1, 2, 3], [2, 3, 5]) → 3
matchUp([1, 2, 3], [2, 3, 3]) → 2
     */
    public static int matchUp(int[] nums1, int[] nums2) {
        int count = 0;
        for (int i = 0; i < nums1.length; i++) {
            int dif = Math.abs(nums1[i] - nums2[i]);
            if (dif <= 2 && dif != 0) count++;
        }
        return count;
    }

    /*
Given an array of ints, return true if the array contains two 7's next to each other, or there are two 7's
separated by one element, such as with {7, 1, 7}.
has77([1, 7, 7]) → true
has77([1, 7, 1, 7]) → true
has77([1, 7, 1, 1, 7]) → false
     */
    public static boolean has77(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            System.out.println(nums[i] + " " + nums[i + 1]);
            if (nums[i] == 7 && nums[i + 1] == 7) return true;
        }
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == 7 && nums[i + 2] == 7) return true;
        }
        return false;
    }

    /*
Given an array of ints, return true if there is a 1 in the array with a 2 somewhere later in the array.
has12([1, 3, 2]) → true
has12([3, 1, 2]) → true
has12([3, 1, 4, 5, 2]) → true
     */
    public static boolean has12(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                while (i < nums.length - 1) {
                    i++;
                    if (nums[i] == 2) return true;
                }
            }
        }
        return false;
    }

    /*
Given an array of ints, return true if the array contains either 3 even or 3 odd values all next to each other.
modThree([2, 1, 3, 5]) → true
modThree([2, 1, 2, 5]) → false
modThree([2, 4, 2, 5]) → true
     */
    public static boolean modThree(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if ((nums[i] % 2 == 0 && nums[i + 1] % 2 == 0 && nums[i + 2] % 2 == 0) || nums[i] % 2 != 0 && nums[i + 1] % 2 != 0 && nums[i + 2] % 2 != 0)
                return true;
        }
        return false;
    }

    /*
Given an array of ints, return true if the value 3 appears in the array exactly 3 times, and no 3's are next to each other.
haveThree([3, 1, 3, 1, 3]) → true
haveThree([3, 1, 3, 3]) → false
haveThree([3, 4, 3, 3, 4]) → false
     */
    public boolean haveThree(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 3) {
                count++;
                i++;
            }
        }
        if (count == 3) {
            return true;
        } else {
            return false;
        }
    }

    /*
    Given an array of integers. how do you put zeros at the end of array without sorting an array?
    For example: input: [4,5,0,0,2,0,1,0] output: [4,5,2,1,0,0,0,0]
     */
    public static ArrayList<Integer> moveZeros(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            Collections.addAll(list, arr[i]);
        }
        int size1 = list.size();
        list.removeIf(p -> p == 0);
        int size2 = list.size();
        int diff = size1 - size2;
        for (int i = 0; i < diff; i++) {
            list.add(0);
        }
        return list;
    }

    /*
    Given a String with numbers and letters. Output the sum of all numbers in given String.
    For example: Input: String str = “jav34ajs4jk6”; Output: 44 (34 + 4 + 6 = 44)
     */
    public static int sumOfIntsInString(String str) {
        int l = str.length();
        int sum = 0;
        for (int i = 0; i < l; i++) {
            if (Character.isDigit(str.charAt(i))) {
                String tmp = str.substring(i, i + 1);
                sum += Integer.parseInt(tmp);
            }
        }
        return sum;
    }

    /*
    Given an array of ints, return true if every 2 that appears in the array is next to another 2.
twoTwo([4, 2, 2, 3]) → true
twoTwo([2, 2, 4]) → true
twoTwo([2, 2, 4, 2]) → false
     */
    public static boolean twoTwo(int[] nums) {
        if (nums.length == 0) {
            return true;
        }

        if (nums.length == 1 && nums[0] == 2)
            return false;

        if (nums[nums.length - 1] == 2 && nums[nums.length - 2] != 2)
            return false;

        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] == 2) {
                if (nums[i - 1] != 2 && nums[i + 1] != 2) {
                    return false;
                }
            }
        }
        return true;
    }
}
