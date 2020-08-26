package Cybertek;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import javax.imageio.stream.ImageInputStream;
import java.util.Scanner;

public class practice {

//    private static int areaCode;
//    private static int localNumber;
//
//    public static void main(String[] args) {
//        //WRITE YOUR CODE HERE:
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter 3 digit area code:");
//        for (int i = 0; i < 3; i++){
//            practice.areaCode = scan.nextInt();
//        }
//
//        System.out.println("Enter 7 digit phone number:");
//        for (int i = 0; i < 7; i++){
//            localNumber = scan.nextInt();
//        }
//
//        String phoneNumber = "(" + areaCode + ")" + "-" + localNumber;
//        System.out.println(phoneNumber);
//
//    }

//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int j;
//        do {
//            System.out.println("Please enter a 3-digit number: ");
//            while (!scan.hasNextInt()) {
//                System.out.println("That's not a 3-digit number! Try again!");
//                scan.next(); // this is important!
//            }
//            j = scan.nextInt();
//        } while (j != 3);
//    }
//}

//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int inputSeconds, hours, minutes, seconds;
//        System.out.println("Enter seconds:");
//        inputSeconds = scan.nextInt();
//
//        hours = inputSeconds / 3600;
//        minutes = (inputSeconds % 3600) / 60;
//        seconds = inputSeconds % 3600 % 60;
//
//        System.out.println(hours + " hours, " + minutes + " minutes, and " + seconds + " seconds");
//
//    }
//}

//    public static void main(String[] args) {
//        int seniorCitizens, nonSeniorCitizens, age;
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter current count for seniorCitizens and nonSeniorCitizens:");
//        seniorCitizens = scan.nextInt();
//        nonSeniorCitizens = scan.nextInt();
//        System.out.println("What is new citizen's age?");
//        age = scan.nextInt();
//
//        if (age > 0 && age < 120) {
//
//            if (age >= 65) {
//                System.out.println("Senior Citizen");
//                seniorCitizens++;
//            } else {
//                System.out.println("Non senior Citizen");
//                nonSeniorCitizens++;
//            }
//        } else {
//            System.out.println("Invalid input");
//        }
//        System.out.println("New seniorCitizens count " + seniorCitizens);
//        System.out.println("New nonSeniorCitizens count " + nonSeniorCitizens);
//    }
//}

    //    public static void main(String[] args) {
/*
The video game machines at your local arcade output coupons according to
how well you play the game. You can redeem 10 coupons for a candy bar or 3
coupons for a gumball. You prefer candy bars to gumballs. Write a program that
defines a variable initially assigned to the number of coupons you win. Next,
the program should output how many candy bars and gumballs you can get if
you spend all of your coupons on candy bars first, and any remaining coupons
on gumballs.

if you the coupons are not enough for any redeem, display message:
"Not enough coupons"


Example1:

Display prompt: "Enter number of coupons:"
13
Display prompt: "Number of Candies: 1"
Display prompt: "Number of Gumballs: 1"

Example2:

Display prompt: "Enter number of coupons:"
23
Display prompt: "Number of Candies: 2"
Display prompt: "Number of Gumballs: 1"

Example3:

Display prompt: "Enter number of coupons:"
2
Display prompt: "Not enough coupons"
 */
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter number of coupons:");
//        int numberOfCoupons = scan.nextInt();
//        int candyBar = numberOfCoupons / 10;
//        int gumball = (numberOfCoupons % 10) / 3;
//
//        if (numberOfCoupons <= 2) {
//            System.out.println("Not enough coupons");
//        } else {
//            System.out.println("Number of Candies: " + candyBar);
//            System.out.println("Number of Gumballs: " + gumball);
//        }
//    }
//}
//
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter Item1 and its price:");
//        String Item1 = scan.nextLine();
//        double price1 = scan.nextDouble();
//        System.out.println("Enter Item2 and its price:");
//        scan.nextLine();
//        String Item2 = scan.nextLine();
//        double price2 = scan.nextDouble();
//        System.out.println("Enter Item3 and its price:");
//        scan.nextLine();
//        String Item3 = scan.nextLine();
//        double price3 = scan.nextDouble();
//        double total = price1 + price2 + price3;
//        System.out.println("Item1: " + Item1 + " Price: " + price1 +
//                ", Item2: " + Item2 + " Price: " + price2 + ", Item3: " + Item3 + " Price: " + price3);
//        System.out.println("Total price: " + total);
//    }
//}

//}
//
//    public static void main(String[] args) {
//        //Enter your code here
//        String firstName, lastName, fullName, email, street, state, city, address, contacts;
//        int age, zipcode;
//        double height, weight;
//        boolean isMarried;
//        long workPhoneNumber, personalPhoneNumber;
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Welcome to the patient portal!");
//        System.out.println("Please enter your personal information");
//        System.out.println("Enter your first name");
//        firstName = scan.nextLine();
//        System.out.println("Enter your last name");
//        lastName = scan.nextLine();
//        // this part is already provided DO NOT CHANGE
//        System.out.println("Enter your email");
//        email = scan.next();
//        scan.nextLine();//to capture Enter key press
//        System.out.println("Enter your street");
//        street = scan.nextLine();
//        // continue for city
//        System.out.println("Enter your city");
//        city = scan.nextLine();
//        System.out.println("Enter your state");
//        state = scan.nextLine();
//        System.out.println("Enter your zip code");
//        zipcode = scan.nextInt();
//        System.out.println("Enter your work phone number");
//        workPhoneNumber = scan.nextLong();
//        System.out.println("Enter your personal phone number");
//        personalPhoneNumber = scan.nextLong();
//        System.out.println("Enter your age");
//        age = scan.nextInt();
//        System.out.println("Enter your height");
//        height = scan.nextDouble();
//        System.out.println("Enter your weight");
//        weight = scan.nextDouble();
//        System.out.println("Are you married?");
//        isMarried = scan.nextBoolean();
//
//        contacts = "work phone number - " + workPhoneNumber +", personal phone number - " + personalPhoneNumber + ", email: " + email;
//        fullName = lastName + ", " + firstName;
//        address = street + ", " + city + ", " + state + " " + zipcode;
//        System.out.println("Patient personal information");
//        System.out.println("Full name: " + fullName);
//        System.out.println("Address: " + address);
//        System.out.println("Contacts: " + contacts);
//        System.out.println("Age: " + age);
//        System.out.println("Height: " + height);
//        System.out.println("Weight: " + weight + " pounds");
//        System.out.println("Married?: " + isMarried);
//    }
//}
//
//    public static void main(String[] args) {
//        // Enter your code here
//        String subject1,  subject2, subject3,  subject4, subject5, summary;
//        double grade1,  grade2, grade3,  grade4, grade5, average;
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Welcome to the Grader!");
//        System.out.println("Please enter subject name number 1 and score for this subject");
//        subject1 = scan.nextLine();
//        grade1 = scan.nextDouble();
//        scan.nextLine();
//        System.out.println("Please enter subject name number 2 and score for this subject");
//        subject2 = scan.nextLine();
//        grade2 = scan.nextDouble();
//        scan.nextLine();
//        System.out.println("Please enter subject name number 3 and score for this subject");
//        subject3 = scan.nextLine();
//        grade3 = scan.nextDouble();
//        scan.nextLine();
//        System.out.println("Please enter subject name number 4 and score for this subject");
//        subject4 = scan.nextLine();
//        grade4 = scan.nextDouble();
//        scan.nextLine();
//        System.out.println("Please enter subject name number 5 and score for this subject");
//        subject5 = scan.nextLine();
//        grade5 = scan.nextDouble();
//
//        summary = "Summary: " + subject1 + " - " + grade1 + ", " + subject2 + " - " + grade2 +
//                ", " + subject3 + " - " + grade3 + ", " + subject4 + " - " +
//                grade4 + ", " + subject5 + " - " + grade5;
//        double aver = (grade1 + grade2 + grade3 + grade4 + grade5) / 5;
//        System.out.println(summary);
//        System.out.println("Your average score is: " + aver);
//        System.out.println("Thank you for using Grader!");
//        System.out.println("Goodbye!");
//    }
//}
//
//    public static void main(String[] args) {
//        String item1, item2, item3, report;
//        int count1, count2, count3;
//        double price1, price2, price3, totalPrice;
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter Item1, count and its price:");
//        item1 = scan.nextLine();
//        count1 = scan.nextInt();
//        price1 = scan.nextDouble();
//        scan.nextLine();
//        System.out.println("Enter Item2, count and its price:");
//        item2 = scan.nextLine();
//        count2 = scan.nextInt();
//        price2 = scan.nextDouble();
//        scan.nextLine();
//        System.out.println("Enter Item3, count and its price:");
//        item3 = scan.nextLine();
//        count3 = scan.nextInt();
//        price3 = scan.nextDouble();
//        scan.nextLine();
//
//        if (count1 > 0 && count2 > 0 && count3 > 0) {
//            report = "Item1: " +  item1 + " Price: " + price1 * count1 + ", " + "Item2: " +
//                    item2 + " Price: " + price2 * count2 + ", " + "Item3: " +  item3 + " Price: " + price3 * count3;
//            System.out.println(report);
//        }
//        else if (count1 > 0 && count2 <= 0 && count3 > 0) {
//            report = "Item1: " +  item1 + " Price: " + price1 * count1 + ", " + "Item3: " +
//                    item3 + " Price: " + price3 * count3;
//            System.out.println(report);
//        }
//        else if (count1 <= 0 && count2 > 0 && count3 > 0) {
//            report = "Item2: " + item2 + " Price: " + price2 * count2 + ", " +
//                    "Item3: " +  item3 + " Price: " + price3 * count3;
//            System.out.println(report);
//        }
//        else if (count1 > 0 && count2 > 0) {
//            report = "Item1: " +  item1 + " Price: " + price1 * count1 + ", " + "Item2: " +
//                    item2 + " Price: " + price2 * count2;
//            System.out.println(report);
//        }
//        else if (count1 <= 0 && count2 <= 0 && count3 <= 0) {
//            report = "";
//            System.out.println(report);
//        }
//        else if (count1 > 0) {
//            report = "Item1: " +  item1 + " Price: " + price1 * count1;
//            System.out.println(report);
//        }
//        else if (count2 > 0) {
//            report = "Item2: " + item2 + " Price: " + price2 * count2;
//            System.out.println(report);
//        }
//
//        if (count2 > 0 && count3 > 0) {
//            totalPrice = price1 * count1 + price2 * count2 + price3 * count3;
//            System.out.println("Total price: " + totalPrice);
//        } else if (count2 <= 0 && count3 > 0) {
//            totalPrice = price1 * count1 + price3 * count3;
//            System.out.println("Total price: " + totalPrice);
//        } else {
//            totalPrice = price1 * count1 + price2 * count2;
//            System.out.println("Total price: " + totalPrice);
//        }
//    }
//}
//
//
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter price in cents:");
//        int itemPrice = scan.nextInt();
//        int quarters = 0, dimes = 0, nickels = 0;
//        int max = 100;
//
//
//        if ((itemPrice >= 25 && itemPrice <= 100) && (itemPrice % 5 == 0)) {
//            switch (itemPrice) {
//                case 25:
//                    quarters = 3;
//                    System.out.println("Your change is " + quarters + " quarters, " + dimes + " dimes, and " + nickels + " nickels.");
//                    break;
//                case 30:
//                    quarters = 2;
//                    dimes = 7;
//                    System.out.println("Your change is " + quarters + " quarters, " + dimes + " dimes, and " + nickels + " nickels.");
//                    break;
//                case 35:
//                    quarters = 2;
//                    dimes = 1;
//                    nickels = 1;
//                    System.out.println("Your change is " + quarters + " quarters, " + dimes + " dimes, and " + nickels + " nickels.");
//                    break;
//                case 40:
//                    quarters = 2;
//                    dimes = 1;
//                    nickels = 0;
//                    System.out.println("Your change is " + quarters + " quarters, " + dimes + " dimes, and " + nickels + " nickels.");
//                    break;
//                case 45:
//                    quarters = 2;
//                    dimes = 0;
//                    nickels = 1;
//                    System.out.println("Your change is " + quarters + " quarters, " + dimes + " dimes, and " + nickels + " nickels.");
//                    break;
//                case 50:
//                    quarters = 2;
//                    dimes = 0;
//                    nickels = 0;
//                    System.out.println("Your change is " + quarters + " quarters, " + dimes + " dimes, and " + nickels + " nickels.");
//                    break;
//                case 55:
//                    quarters = 1;
//                    dimes = 2;
//                    nickels = 0;
//                    System.out.println("Your change is " + quarters + " quarters, " + dimes + " dimes, and " + nickels + " nickels.");
//                    break;
//                case 60:
//                    quarters = 1;
//                    dimes = 1;
//                    nickels = 1;
//                    System.out.println("Your change is " + quarters + " quarters, " + dimes + " dimes, and " + nickels + " nickels.");
//                    break;
//                case 65:
//                    quarters = 1;
//                    dimes = 1;
//                    nickels = 0;
//                    System.out.println("Your change is " + quarters + " quarters, " + dimes + " dimes, and " + nickels + " nickels.");
//                    break;
//                case 70:
//                    quarters = 1;
//                    dimes = 0;
//                    nickels = 1;
//                    System.out.println("Your change is " + quarters + " quarters, " + dimes + " dimes, and " + nickels + " nickels.");
//                    break;
//                case 75:
//                    quarters = 1;
//                    dimes = 0;
//                    nickels = 0;
//                    System.out.println("Your change is " + quarters + " quarters, " + dimes + " dimes, and " + nickels + " nickels.");
//                    break;
//                case 80:
//                    quarters = 0;
//                    dimes = 2;
//                    nickels = 0;
//                    System.out.println("Your change is " + quarters + " quarters, " + dimes + " dimes, and " + nickels + " nickels.");
//                    break;
//                case 85:
//                    dimes = 1;
//                    nickels = 1;
//                    System.out.println("Your change is " + quarters + " quarters, " + dimes + " dimes, and " + nickels + " nickels.");
//                    break;
//                case 90:
//                    dimes = 1;
//                    nickels = 0;
//                    System.out.println("Your change is " + quarters + " quarters, " + dimes + " dimes, and " + nickels + " nickels.");
//                    break;
//                case 95:
//                    dimes = 0;
//                    nickels = 1;
//                    System.out.println("Your change is " + quarters + " quarters, " + dimes + " dimes, and " + nickels + " nickels.");
//                    break;
//            }
//        } else
//            System.out.println("Invalid price!");
//    }
//}

    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter any sentence");
//        String string = scan.nextLine();
//
//        int stringMinusOne = string.length() - 1;
//        char lastChar = string.charAt(stringMinusOne);
//        System.out.println(lastChar);

//        Scanner scan = new Scanner(System.in);
//        String fn = scan.nextLine();
//        String ln = scan.nextLine();
//        String fullName = fn.concat(" ".concat(ln));
//        System.out.println(fullName);

//        Scanner scan = new Scanner(System.in);
//        String first = scan.nextLine();
//        String last = scan.nextLine();
//
//        String fullName = first.toUpperCase() + " " + last.toUpperCase();
//        System.out.println(fullName);

//        System.out.println("Please enter the text:");
//        String name = "";
//        int l = name.length();
//        System.out.println("Length is: " +l);
//
//        Scanner scan = new Scanner(System.in);
//        String word = scan.next();
//        //WRITE YOUR CODE HERE
//        scan.close();
//        char last = word.charAt(word.length() -1);
//        System.out.println(last);

//        Scanner scan = new Scanner(System.in);
//        String word = scan.next();
//        scan.close();
//        //YOUR CODE HERE
//        if (word.length() % 2 != 0) {
//            if (word.length() == 3) {
//                System.out.println(word.charAt(1));
//            } else if (word.length() > 3) {
//                int divide = word.length() / 2;
//                char middle = word.charAt(divide);
//                System.out.println(middle);
//            } else {
//                System.out.println(word + word + word);
//            }
//        } else {
//            if (word.length() >= 4) {
//                int divide1 = (word.length() / 2)-1;
//                int divide2 = word.length() / 2;
//
//                char middle1 = word.charAt(divide1);
//                char middle2 = word.charAt(divide2);
//                System.out.print(middle1);
//                System.out.print(middle2);
//            } else {
//                System.out.println(word + word);
//            }




//        Scanner scan = new Scanner(System.in);
//        String word = scan.next();
//        //YOUR CODE HERE
//        String [] str = new String[5];
//        if (word.length() < 5) {
//            System.out.println("Too short");
//        }
//        else if (word.length() > 5) {
//            System.out.println("Too long");
//        } else {
//            char ch1 = word.charAt(word.length() - 1);
//            char ch2 = word.charAt(word.length() - 2);
//            char ch3 = word.charAt(word.length() - 3);
//            char ch4 = word.charAt(word.length() - 4);
//            char ch5 = word.charAt(word.length() - 5);
//            System.out.print(ch1);
//            System.out.print(ch2);
//            System.out.print(ch3);
//            System.out.print(ch4);
//            System.out.print(ch5);
//        }


//        //WRITE YOUR CODE HERE
//        Scanner scan = new Scanner(System.in);
//        String word = scan.next();
//        int divide = (word.length() / 2);
//        String middle = word.substring(0, divide);
//        System.out.println(middle + middle);

        //DO NOT CHANGE
        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();
        //WIRTE YOUR CODE HERE
        if (word1.length() > word2.length()) {
            System.out.println(word1);
        } else {
            System.out.println(word2);
        }
    }
}
