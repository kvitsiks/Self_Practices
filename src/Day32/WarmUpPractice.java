package Day32;

import java.util.Arrays;

public class WarmUpPractice {
    public static void main(String[] args) {


    /*
    Warmup tasks:
    1. write a method that can retunr the full name of a person in reugral format
            ex:
                fullName("cYbErTeK", "SCHOOL"); ==> "Cybertek School"
    2. write a return method that accepts two numbers and an operator, then returns
    calculation result.
             if the oerator is invalid, return zero
             otherwise return the result
    3. write a method that can add element to an array, the method accepts an array
    and and a number, then returns the new array by appending the number to the last
    index of the given array
        Ex:
            int[] arr = {1,2,3};
            int num = 4;
            addElement(arr, num); ===> {1,2,3,4}
     */
//        String fullName = formatFullName("cYbErTeK", "SCHOOL");
//        System.out.println(fullName);
//

//        double result = calculator(2,'*',2);
//        System.out.println(result);

        int[] arr = {1,2,3};
        int num = 4;
        int[] arr2 = addNumberToArray(arr, num);
        System.out.println(Arrays.toString(arr2));

    }

    public static String formatFullName(String first, String last){
        first = first.substring(0, 1).toUpperCase() + first.substring(1).toLowerCase();
        last = last.substring(0,1).toUpperCase() + last.substring(1).toLowerCase();
        return first + " " + last;
    }

    public static double calculator(int num1, char operator, int num2) {
        double result = (operator == '+' ? num1 + num2 : (operator == '-') ? num1 - num2
                : (operator == '*') ? num1 * num2 : (operator == '/') ? num1 / num2
                : (operator == '%') ? num1 % num2 : 0);

        return result;
    }

    public static int[] addNumberToArray(int[] arr, int number){
        int[] arrNew = new int[arr.length+1];
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            arrNew[k] = arr[i];
            k++;
        }
        arrNew[arrNew.length-1] = number;
        return arrNew;
    }
}
