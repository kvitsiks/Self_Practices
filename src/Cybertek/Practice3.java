package Cybertek;

import java.util.*;
import java.util.Arrays;

public class Practice3 {
    public static void main(String[] args) {
//        //DO NOT CHANGE
//        Scanner scan = new Scanner(System.in);
//        String word = scan.next();
//        //WRITE YOUR CODE HERE
//        char first = word.charAt(0);
//        char last = word.charAt(word.length()-1);
//        System.out.println(first+""+last);
//    }
//}

//        //Print out the number of times that the string "hi" appears anywhere in the given string.
//        Scanner scan = new Scanner(System.in);
//        String str = scan.nextLine();
//        String[] arr = str.split(" ");
//        for (int i = 0; i <arr.length ; i++) {
//            if (arr[i].contains("hi")) {
//                count ++;
//            }
//        }
//        System.out.println(count);
//        int count = 0;
//        for (int i = 0; i <= str.length()-2; i++) {
//            String str2 = str.substring(i, i+2);
//            String strLow = str2.toLowerCase();
//            if (strLow.equalsIgnoreCase("hi")) {
//                count++;
//            }
//        }
//        System.out.println(count);
//    }
//}


///*
//Given a string, consider the prefix string made of the first n chars of the string. Does that prefix string appear
//somewhere else in the string?
//Assume that the string is not empty and that n is in the range from 1 till str.length().
// */
//        Scanner scan = new Scanner(System.in);
//        String str = scan.next();
//        int n = scan.nextInt();
//        int count = 0;
//        String str2 = str.substring(0, n);
//        if (str.length() != 0 && n <= str.length()) {
//            for (int i = 0; i <= str.length() - n; i++) {
//                if (str.substring(i, i + n).equals(str2)) {
//                    count++;
//                }
//            }
//            if (count == 1) {
//                System.out.println(str2 + " appears once only");
//            } else if (count == 2) {
//                System.out.println(str2 + " appears twice");
//            } else {
//                System.out.println(str2 + " appears " + count + " times");
//            }
//        }
//    }
//}


///*
//A sandwich is two pieces of bread with something in between. Print the string that is between the first and last
//appearance of "bread" in the given string, or return string "nothing" if there are not two pieces of bread.
//
// */
//        Scanner scan = new Scanner(System.in);
//        String str = scan.next();
//        if (str.indexOf("bread") < str.lastIndexOf("bread")) {
//            System.out.println(str.substring(str.indexOf("bread") + 5, str.lastIndexOf("bread")));
//        } else {
//            System.out.println("nothing");
//        }
//    }
//}

//        /*
//        Given a string, print out true if the number of appearances of "java" anywhere in the string is equal to the
//        number of appearances of "python" anywhere in the string (case sensitive).
//         */
//
//        Scanner scan = new Scanner(System.in);
//        String sentence = scan.nextLine();
//        int javaCount = 0;
//        int pythonCount = 0;
//        String word1 = "java";
//        String word2 = "python";
//
//        for (int i = 0; i <= sentence.length() - 6; i++) {
//            if (sentence.substring(i, i + 4).equals(word1)) {
//                javaCount++;
//            } else if (sentence.substring(i, i + 6).equals(word2)) {
//                pythonCount++;
//            }
//        }
//        System.out.println(javaCount == pythonCount);
//    }
//}
/*
//Write a program, that will read html variable and output attribute value of id attribute (tag) into the console.
//Input will be provided in a single line as outlined below. If html variable doesn't contain <html> attribute,
//print out into the console message: "Invalid input!".
//<!DOCTYPE html><html><head><title>Java</class="myid"title></head><body><p id="myid"></p>class="myid"</body></html>
// */
//
//        Scanner scan = new Scanner(System.in);
//        String html = scan.nextLine();
//        int id = html.indexOf("id=\"");
//        int quotes = html.lastIndexOf("\"");
//        if (html.contains("html")){
//            String idAttribute = html.substring(id+4, quotes);
//            System.out.println(idAttribute);
//        } else {
//            System.out.println("Invalid input!");
//        }
//    }
//}


//        /*
//        Write a program that will find out shortest words in the given string str.
//        If there are few words that are evenly short, print them all. Use split method in order
//        to split str string variable and create an array of strings.  Print array with Arrays.toString() method.
//        Sort array before printing.
//
//Split values by comma: split(", ");
//
//olive, fish, pursuit, old, warning, python, java, coffee, cat, ray
//volt, olive, fish, hot pursuit, warning, python, java, coffee, part
//olive, hot pursuit, warning, python, angle, coffee, beech, boost, trainer
//         */
//
//        Scanner scan = new Scanner(System.in);
//        String str = scan.nextLine();
//        String[] arr = str.split(", ");
//        ArrayList<String> shortestArr = new ArrayList<>();
//
//        String minValue = arr[0];
//        for(int i=1;i<arr.length;i++){
//            if(arr[i].length() < minValue.length()){
//                minValue = arr[i];
//            }
//        }
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i].length() <= minValue.length()) {
//                shortestArr.add(arr[i]);
//            }
//        }
//        Collections.sort(shortestArr);
//        System.out.println(shortestArr);
//    }
//}


///*
//Given an array temps of doubles, containing temperature data, compute the average temperature.
//Store the average in a variable called avgTemp.
//Besides temps and avgTemp, you may use only two other variables -- an int variable k and a double
//variable named total, which have been declared.
//Example:
//input: 80 88 88 84 82 78 60 68
//output: 78.5
// */
//
//        Scanner scan = new Scanner(System.in);
//        int k = 0;
//        double total = 0;
//        double avgTemp = 0;
//        double[] temps = { scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(),
//                scan.nextDouble(), scan.nextDouble(), scan.nextDouble() , scan.nextDouble()  };
//        for (int i = 0; i < temps.length; i++) {
//            total += temps[i];
//            avgTemp = total / temps.length;
//        }
//        System.out.println(avgTemp);
//    }
//}

/*
The Utopian Tree grows exactly 1 cm for the first three years, and after that it grows by 2 cm every year,
this is a simple implementation of the algorithm. You will need to use loops to create it.
Show 10 years of growth of the Utopian Tree.

Output:
year 1 - growth 1 cm
tree size: 1cm
year 2 - growth 1 cm
tree size: 2cm
year 3  - growth 1 cm
tree size:3cm
year 4 - growth 2 cm
tree size: 5cm
year 5 - growth 2 cm
tree size: 7cm
year 6 - growth 2 cm
tree size: 9cm
... until you reach year 10
 */


//        int size = 0;
//        for (int i = 1; i <= 10; i++) {
//            if (i <= 3) {
//                size++;
//                System.out.println("year " + i + " - growth " + 1 + " cm");
//                System.out.println("tree size: " + size + "cm");
//            } else {
//                size += 2;
//                System.out.println("year " + i + " - growth " + 2 + " cm");
//                System.out.println("tree size: " + size + "cm");
//            }
//        }


/*
In the sport of diving, seven judges award a score between 0 and 10, where each score may be a
floating-point value.
The highest and lowest scores are thrown out, and the remaining scores are added together.
The sum is then multiplied by the degree of difficulty for that dive.
The degree of difficulty ranges from 1.2 to 3.8 points. The total is then multiplied by
0.6 to determine the divers score.
Use System.out.printf("Total: %.2f",total); in order to get rid of extra floating points.
 */


//        Scanner input = new Scanner(System.in);
//        float[] score = new float[7];
//        float total = 0;
//        float difficulty = 0;
//        float sum = 0;
//        //WRITE YOUR CODE HERE
//        int judge = 1;
//        for (int i = 0; i < score.length; i++) {
//            System.out.println("Enter score for judge " + judge + ":");
//            score[i] = input.nextFloat();
//            judge ++;
//        }
//        Arrays.sort(score);
//        for (int j = 1; j < score.length-1; j++) {
//            sum += score[j];
//        }
//        System.out.println("Enter difficulty:");
//        difficulty = input.nextFloat();
//        if (difficulty >= 1.2 && difficulty <= 3.8) {
//            total = (float) (sum * difficulty * 0.6);
//        } else {
//            System.out.println("Wrong difficulty, fix the difficulty and try again");
//        }
//        // FINAL OUTPUT
//        System.out.printf("Total: %.2f", total);
//    }
//}


///*
//Given a String variable sentence, write code to type each word in separate lines.
// */
//
//
//        Scanner input = new Scanner(System.in);
//        String sentence = input.nextLine();
//
//        //type your code below
//        String[] arr = sentence.split(" ");
//        for (int i = arr.length-1; i >= 0; i--) {
//            System.out.println(arr[i]);
//        }
//    }
//}


//        Scanner scan = new Scanner(System.in);
//        int size = scan.nextInt();
//        int[] num = new int[size];
//        for (int i = 0; i < size; i++) {
//            num[i] = scan.nextInt();
//        }
//        //WRITE YOUR CODE HERE
//        int[] arrTwo = new int[2];
//        int[] arrOne = new int[1];
//
//        if (size >= 2) {
//            arrTwo[0] = num[0];
//            arrTwo[1] = num[1];
//            System.out.print(Arrays.toString(arrTwo));
//        } else {
//            arrOne[0] = num[0];
//            System.out.print(Arrays.toString(arrOne));
//        }
//    }
//}
/*
//Given a String array words, iterate through each word and print first and last letter of
//each element in the format below.
//Example:
//
//hello
//why
//by
//apple
//note
// */
//
//        Scanner input = new Scanner(System.in);
//        String[] words = {input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine()};
//        String result = "";
//        String[] resultArr = new String[words.length];
//
//        for (int i = 0; i < words.length; i++) {
//            char first = words[i].charAt(0);
//            char last = words[i].charAt(words[i].length()-1);
//            result += first + "" + last + " ";
//            resultArr = result.split(" ");
//        }
//        System.out.println(Arrays.toString(resultArr));
//    }
//}


/*
Given an int array, print a new array with double the length where its last element is the same
as the original array, and all the other elements are 0. The original array will be
length 1 or more. Note: by default, a new int array contains all 0's.
 */

        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = scan.nextInt();
        }
        //WRITE YOUR CODE HERE
        int[] newArr = new int[size * 2];
        for (int i = 0; i < newArr.length-1; i++) {
            newArr[i] = 0;
            newArr[newArr.length-1] = nums[nums.length-1];
        }
        System.out.println(Arrays.toString(newArr));
    }
}