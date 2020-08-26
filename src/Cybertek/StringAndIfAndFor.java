package Cybertek;

import com.sun.tools.javac.util.ArrayUtils;

import java.util.Arrays;
import java.util.Scanner;

public class StringAndIfAndFor {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        String word = scan.next();
//        //YOUR CODE HERE
//        if (word.length() >= 5 && word.length() %2 != 0) {
//            int middle = word.length()/2;
//            String midChar = word.substring(middle-1, middle+2);
//            System.out.println(midChar);
//        } else
//            System.out.println("invalid");
//    }
//}


//        Scanner s = new Scanner(System.in);
//        String a = s.nextLine();
//
//        //your code here
//        String nameLow = "alejandro";
//        String nameUp = "Alejandro";
//        String projectLow = "project";
//        String projectUp = "Project";
//        boolean read = (a.contains(nameLow) || a.contains(nameUp)) && (a.contains(projectLow) || a.contains(projectUp));
//        if (read){
//            System.out.println("read this mail");
//        } else {
//            System.out.println("dont read");
//        }
//    }
//}


//        Scanner s = new Scanner(System.in);
//        int house = s.nextInt();
//        int player = s.nextInt();
//
//        //your code here
//        if (player <= 21 && house <= 21) {
//            if (player < house) {
//                System.out.println("player loss");
//            }
//            else if (player > house) {
//                System.out.println("player wins");
//            }
//            else {
//                System.out.println("its a tie");
//            }
//        } else {
//            System.out.println("bust");
//        }
//    }
//}


//        Scanner s = new Scanner(System.in);
//
//        String in = s.next();
//
//        //your code here
//        float priceFood = 10;
//        float priceDrink = 2;
//        if (in.equals("burger") || in.equals("chicken")) {
//            System.out.println(priceFood);
//        }
//        if (in.equals("soda")) {
//            System.out.println(priceDrink);
//        }
//    }
//}


//        Scanner s = new Scanner(System.in);
//        int n = s.nextInt();
//        int sum = 0;
//        for (int i = 1; i <= n; i++) {
//            sum += i;
//        }
//        System.out.println(sum);
//    }
//}

//        System.out.println("How many numbers to enter?");
//        Scanner scan = new Scanner(System.in);
//        int num = scan.nextInt();
//        int[] arr = new int[num];
//        int max = arr[0];
//        int min = arr[0];
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = scan.nextInt();
//        }
//        for (int j = 0; j < arr.length; j++) {
//            if (arr[j] > max) {
//                max = arr[j];
//            }
//            else if (arr[j] < min) {
//                min = arr[j];
//            }
//        }
//        System.out.println(max + " " + min);
//    }
//}


//        Scanner scan = new Scanner(System.in);
//        int inhabitants = scan.nextInt();
//
//        int day = 0;
//        while (inhabitants > 0) {
//
//            System.out.println("Day " + day + " " + "[" + inhabitants + "]");
//            inhabitants = inhabitants / 2;
//            day++;
//
//        }
//        if (inhabitants == 0) ;
//        System.out.println("---- EXTINCT ----");
//    }
//}


//        Scanner input = new Scanner(System.in);
//        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
//        // yes above code will ask user 5 numbers while creating an array
//        // just assume that you have int array with 5 numbers and start working on requirement
//        // loop through the array and find the max number.
//
//        //TODO: Write your code below .
//        int max = nums[0];
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] > max) {
//                max = nums[i];
//            }
//        }
//        System.out.println(max);
//    }
//}


///*
//Given a String array words, iterate through each word and print first and last letter of each element in separate lines.
//
//Example:
//
//words → ["hello", "why", "by", "apple" , "note"]
//print:
//       ho
//       wy
//       by
//       ae
//       ne
//
// */
//        Scanner input = new Scanner(System.in);
//        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
//
//        // leave above code alone :)
//        // assume you have String array of 5 items
//        //and print first and last char of each items in one line
//
//        //TODO: Write your code below
//        char first = 0;
//        char last = 0;
//        for (int i = 0; i < words.length; i ++) {
//            first = words[i].charAt(0);
//            last = words[i].charAt(words[i].length()-1);
//            System.out.println(first + "" + last);
//        }
//
//    }
//}


//            Scanner input = new Scanner(System.in);
//            String[] arr = new String[5];
//            for (int i=0;i<5;i++)
//            {
//                arr[i] = input.nextLine();
//            }
//            //leave above alone! :)
//            //assume you have String array of 5 items
//
//            //write your code below:
//            for (int i = 0; i < arr.length; i++) {
//                String str = arr[i].substring(0, 3);
//                System.out.println(str);
//            }
//        }
//    }


//        Scanner input = new Scanner(System.in);
//        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
//        // yes above code will ask user 5 numbers while creating an array
//        // just assume that you have int array with 5 numbers and start working on requirement
//        // loop through the array and get the sum of the numbers
//
//        //TODO: Write your code below
//        int sum = 0;
//        for (int i = 0; i < nums.length; i++) {
//            sum += nums[i];
//        }
//        System.out.println(sum);
//    }
//}


//        Scanner input = new Scanner(System.in);
//        String[] arr = new String[8];
//        for (int i=0;i<8;i++)
//        {
//            arr[i] = input.nextLine();
//        }
//        //leave above alone! :)
//        //assume you have String array of 8 items
//        //and print two items at a time in 4 line
//        //write your code below
//
//        for(int j=0; j<arr.length; j+=2){
//            System.out.println(arr[j]+" , "+ arr[j+1]);
//        }
//    }
//}


//        Scanner scan = new Scanner(System.in);
//        int countOfCats = 0;
//        int countOfDogs = 0;
//        String word = scan.next();
//
//        for (int i=0; i <= word.length()-3; i++) {
//            if(word.substring(i, i+3).equals("cat")) {
//                countOfCats++;
//            } else if(word.substring(i, i+3).equals("dog")) {
//                countOfDogs++;
//            }
//        }
//        System.out.println(countOfCats==countOfDogs);
//    }
//}


//        boolean exists = false;
//        Scanner scan = new Scanner(System.in);
//        String word = scan.next();
//
//        if (word.length() >=4) {
//            if (word.substring(0, 4).equals("java") || word.substring(1, 5).equals("java")) {
//                System.out.println(true);
//            } else {
//                System.out.println(false);
//            }
//        }
//        else {
//            System.out.println(false);
//        }
//    }
//}


//        Scanner scan= new Scanner(System.in);
//        String word = scan.next();
//
//        int count = 0;
//        for (int i = 0; i <= word.length()-4; i++) {
//            if (word.substring(i, i+4).equals("java")) {
//                count +=1;
//            }
//        }
//        System.out.println(count);
//    }
//}


//        Scanner inp = new Scanner(System.in);
//        System.out.print("In:");
//        String word = inp.nextLine();
//        //write your code below
//
//        for (int i = 0; i <word.length(); i++) {
//            char ch = word.charAt(i);
//            if (ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='u' || ch=='U') {
//                System.out.print(ch);
//            }
//        }
//    }
//}


//        Scanner scan = new Scanner(System.in);
//        char start = scan.next().charAt(0);
//        char end = scan.next().charAt(0);
//
//        for (int i = start; i <= end; i++) {
//            System.out.print(""+(char)i);
//        }


//        Scanner scan = new Scanner(System.in);
//        String word = scan.next();
//        String separator = scan.next();
//        int count = scan.nextInt();
//        String result = "";
//        for (int i = 0; i < count; i++) {
//            if (i < count-1) {
//                result = result + word + separator;
//            } else {
//                result = result + word;
//            }
//        }
//        System.out.println(result);
//    }
//}


//        Scanner input = new Scanner(System.in);
//        int[] nums = new int[10];
//        for(int i = 0 ; i<=9 ; i ++){
//            nums[i] = input.nextInt();
//        }
//        // above code will ask user 10 numbers while creating an array
//        // just assume that you have int array with 10 numbers and start working on requirement
//        // loop through the array and get the count of the even numbers
//        //TODO: Write your code below
//
//        int count = 0;
//
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] % 2 == 0) {
//                count +=1;
//            }
//        }
//        System.out.println(count);
//    }
//}


//        Scanner input = new Scanner(System.in);
//        String[] arr = new String[6];
//        for (int i = 0; i < 6; i++) {
//            arr[i] = input.nextLine();
//        }
//        //leave above alone! :)
//        //assume you have String array of 6 items
//        //and print three neibouring items at a time till last item
//        //write your code below
//
//        /*
//"apple"
//"banana"
//"kiwi"
//"grape"
//"milk"
//"soda"
//         */
//
//
//        for (int j = 0; j < 3; j++) {
//            if (j < 2) {
//                System.out.print(arr[j] + " , ");
//            } else {
//                System.out.print(arr[j]);
//            }
//        }
//        System.out.println();
//        for (int j = 1; j < 4; j++) {
//            if (j < 3) {
//                System.out.print(arr[j] + " , ");
//            } else {
//                System.out.print(arr[j]);
//            }
//        }
//        System.out.println();
//        for (int j = 2; j < 5; j++) {
//            if (j < 4) {
//                System.out.print(arr[j] + " , ");
//            } else {
//                System.out.print(arr[j]);
//            }
//        }
//        System.out.println();
//        for (int j = 3; j < 6; j++) {
//            if (j < 5) {
//                System.out.print(arr[j] + " , ");
//            } else {
//                System.out.print(arr[j]);
//            }
//        }
//    }
//}


//        Scanner input = new Scanner(System.in);
//        String email = input.nextLine();
//
//        //Write your code below
//        int count = 0;
//        char atChar = '@';
//        for (int i = 0; i < email.length(); i++) {
//            if (email.charAt(i) == atChar) {
//                count += 1;
//            }
//        }
//        if (email.contains("@") && count == 1) {
//            String[] str = email.split("@");
//            System.out.println("Email id: " + str[0]);
//            System.out.println("Email domain: " + str[1]);
//        } else {
//            System.out.println("invalid email");
//        }
//    }
//}


//        //DO NOT CHANGE
//        int num, digit1, digit2, digit3, digit4, digit5;
//        //WRITE YOUR CODE HERE
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter your number: ");
//        int number = scan.nextInt();
//        String str = String.valueOf(number);
//        String[] splited = str.split("");
//        for (int i = 0; i < splited.length; i++) {
//            System.out.println(splited[i]);
//
//        }
//    }
//}


//        Scanner input = new Scanner(System.in);
//        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),
//                input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
//
//        //TODO: write your code below
//        int count = 0;
//        for (int i = 0; i < nums.length; i++) {
//            count = 0;
//            int num = nums[i];
//            for (int j = 0; j < nums.length; j++) {
//                int each = nums[j];
//                if (each == num) {
//                    count++;
//                }
//            }
//            if(count == 1){
//                System.out.print(num);
//            }
//        }
//    }
//}


//        Scanner input = new Scanner(System.in);
//        String[] words = new String[5];
//        for (int i = 0; i < 5; i++) {
//
//            words[i] = input.nextLine();
//
//        }
//
//        /*
//"aaa"
//"bbbbb"
//"whasstupppp"
//"longg"
//"jaaaaavvaaaaaaaaaa"
//         */
//
//        //write your code below
//        String longest = "";
//        for (int i = 0; i < words.length; i++) {
//            if (words[i].length() > longest.length()) {
//                longest = words[i];
//            }
//        }
//        System.out.println(longest);
//    }
//}



//        Scanner input = new Scanner(System.in);
//        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),
//                input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
//
//        //TODO: write your code below
//
//
//
//        //Do not change below statement:
//        for (int i = 0; i < nums.length/2; i++) {
//            int n = nums[i]; // n = 3
//            nums[i] = nums[nums.length - i - 1];
//            nums[nums.length - i - 1] = n;
//        }
//            System.out.println(Arrays.toString(nums));
//    }
//}



//        Scanner scan = new Scanner(System.in);
//        String[] str = {scan.next(), scan.next(), scan.next(),
//                scan.next(), scan.next(), scan.next()};
//        String shortest = str[0];
//        for (int i = 0; i < str.length; i++) {
//            if (str[i].length() < shortest.length()) {
//                shortest = str[i];
//            }
//        }
//        System.out.println(shortest);
//    }
//}

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        //TODO: Write your code below
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
