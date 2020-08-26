package Day33;

import java.util.Arrays;

public class WarmUpTasks {
    public static void main(String[] args) {
        /*
    Task01:
        1. create a method that can calculate the addition of two integers
        2. create a method that can calculate the addition of two decimals
        3. create a method that can calculate the multiplication of two integers
        4. create a method that can calculate the multiplication of two decimals
    Task02:
        1. create a return method that can return an int array in descending order
        2. create a return method that can return a double array in descending order
        3. create a return method that can return a String array in descending order
        4. create a return method that can return a char array in descending order
    Task03:
        1. create a method that can print out the unique numbers from an array of integer
        2. create a method that can print out the unique numbers from an array of double
        3. create a method that can print out the unique words from an array of String
        4. creata a method that can print out the unique characters from an array of chars
         */
        int[] arr = {1,2,3,4,5,5};
        int[] arr2 = {1,1,2,2,3,4,5,5};
        String[] arrStr = {"London", "Paris", "Kiev", "New York"};
        //System.out.println(Arrays.toString(arrDesc(arrStr)));
       uniques(arr2);
    }

    public static int addition (int a, int b) {
        return a + b;
    }
    public static double addition (double a, double b) {
        return a + b;
    }
    public static int multiplication (int a, int b) {
        return a * b;
    }
    public static double multiplication (double a, double b) {
        return a * b;
    }
    /////////////////////////////////////////////////////////////////////////////////
    public static int[] arrDesc (int[] arr) {
        int[] arrDesc = new int[arr.length];
        int k = 0;
        for (int i = arr.length-1; i >= 0 ; i--) {
            arrDesc[k] = arr[i];
            k++;
        }
        return arrDesc;
    }
    public static double[] arrDesc (double[] arr) {
        double[] arrDesc = new double[arr.length];
        int k = 0;
        for (int i = arr.length-1; i >= 0 ; i--) {
            arrDesc[k] = arr[i];
            k++;
        }
        return arrDesc;
    }
    public static String[] arrDesc (String[] arr) {
        String[] arrDesc = new String[arr.length];
        int k = 0;
        for (int i = arr.length-1; i >= 0 ; i--) {
            arrDesc[k] = arr[i];
            k++;
        }
        return arrDesc;
    }
    public static char[] arrDesc (char[] arr) {
        char[] arrDesc = new char[arr.length];
        int k = 0;
        for (int i = arr.length-1; i >= 0 ; i--) {
            arrDesc[k] = arr[i];
            k++;
        }
        return arrDesc;
    }
    /////////////////////////////////////////////////////////////////////////////////
    public static void uniques(int[] arr) {
        int count = 0;
        for (int element : arr) {
            count = 0;
            for (int each : arr) {
                if (element == each) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(element+ " ");
            }
        }
        System.out.println();
    }
    public static void uniques(double[] arr) {
        int count = 0;
        for (double element : arr) {
            count = 0;
            for (double each : arr) {
                if (element == each) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(element+ " ");
            }
        }
        System.out.println();
    }
    public static void uniques(String[] arr) {
        int count = 0;
        for (String element : arr) {
            count = 0;
            for (String each : arr) {
                if (element.equals(each)) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(element+ " ");
            }
        }
        System.out.println();
    }
    public static void uniques(char[] arr) {
        int count;
        for (char element : arr) {
            count = 0;
            for (char each : arr) {
                if (element == each) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(element+ " ");
            }
        }
        System.out.println();
    }
}
