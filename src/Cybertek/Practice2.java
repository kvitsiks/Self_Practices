package Cybertek;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import java.util.Arrays;
import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
//
//        float f1 = (1_560.00 > 12_60.00) ? 10 : 20;
//        System.out.println(f1);
//        int age = 20;
//        boolean eligible = true;
//
//        if (age >= 21) {
//            eligible = true;
//        }
//        else
//            eligible =  false;
//        System.out.println(eligible);
//
//        boolean eligible2 = (age >= 21) ? true : false;
//
//        int n1 = -100;
//        int n2 = 100;
//
//        String max = (n1 > n2) ? "a is greater" : (n1 < n2) ? "b is greater" : "a is equal to b";
//        System.out.println (max);
//
//        short monthNum = 10;
//
//        switch (monthNum) {
//            case 1:
//                System.out.println("January");
//
//            case 2:
//                System.out.println("February");
//
//            default:
//                System.out.println("invalid");
//        }
//    }


//}
//

//
//
//        //DO NOT CHANGE:
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Enter age:");
//        int age = input.nextInt();
//
//
//        //WRITE YOUR CODE HERE
//        String result = "";
//        if (age >=2 && age <= 18) {
//           if (age <= 3) {
//               result = "toddler";
//           }
//           else if (age <= 5) {
//                result = "early childhood";
//            }
//           else if (age <= 7) {
//               result = "young reader";
//           }
//           else if (age <= 10) {
//               result = "elementary";
//           }
//           else if (age <= 12) {
//               result = "middle";
//           }
//           else if (age == 13) {
//               result = "impossible";
//           }
//           else if (age <= 16) {
//               result = "high school";
//           }
//           else if (age < 18) {
//               result = "scholar";
//           }
//        } else {
//            result = "ineligible";
//        }
//        System.out.println(result);
//
//        // DO NOT CHANGE:
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter vehicle's year:");
//        int vehicleYear = input.nextInt();
//
//        //WRITE YOUR CODE HERE:
//        String result = "";
//        if ((vehicleYear >= 1995 && vehicleYear <= 1998) ||
//                (vehicleYear >= 2001 && vehicleYear <= 2002) ||
//                (vehicleYear >= 2004 && vehicleYear <= 2006) ||
//                (vehicleYear >= 2015 && vehicleYear <= 2017)) {
//            result = "Your vehicle needs to be recalled!";
//        } else {
//            result = "Your vehicle is fine, enjoy!";
//        }
//        System.out.println(result);
//    }
//}


//short s = 13 + 3 * (10 - 6) % 2;
//boolean b = s != 25;
//    System.out.println(s);


//        byte b = 104;
//        boolean check = b < 100;
//
//        if (!check) {
//            b -= 100;
//        }
//        else { b = 50;}
//        System.out.println(b);

//boolean b = 119 % 5 ==0;
//double pi = 3.14;
//int num = 0;
//if (pi > 3.14 && !b) {
//    num += 50;
//}
//    else {
//        num -= 50;
//    }
//    if (b) {
//        num +=50;
//    }
//        System.out.println(num);

//int i = 132;
//String s = "";
//if (i % 2 == 0) {
//s += i;
////if (i % 5 != 0) {
////s = "500";
////}
//}
//        System.out.println(s);

//byte b1 = 100;
//byte b2 = 15;
//byte b3 = 92;
//
//int max = (b3 > b2) ? b3 + 2 : (b2 > b1) ? b2 -4 : b1 * -1;
//        System.out.println(max);


//    String first = "J";
//    String last = "B";
//    int n = 7;
//    String fullName = "";
//    if (n % 2 == 0) {
//        fullName = first + " " + last;
//    } else {
//        fullName = "Not valid";
//
//    }
//        System.out.println(fullName);

//int cookies = 10;
//String day = "tuesday";
//
//switch (day) {
//    case "sunday":
//        cookies++;
//    case "monday":
//        cookies+=5;
//        break;
//    case "tuesday":
//    case "wednesday":
//        cookies +=10;
//    case "thursday":
//        cookies+=5;
//        break;
//    case "friday":
//        break;
//    case "saturday":
//        cookies--;
//        break;
//    default:
//        cookies = 0;
//}
//        System.out.println(cookies);
//
//    }
//
//}

//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter vehicle's year:");
//        int vehicleYear = scan.nextInt();
//        if(vehicleYear >= 1995 && vehicleYear <= 1998){
//            System.out.println("Your vehicle needs to be recalled!");
//        }else if(vehicleYear<=2002 && vehicleYear >=2001){
//            System.out.println("Your vehicle needs to be recalled!");
//        }else if(vehicleYear<=2006 && vehicleYear >=2004){
//            System.out.println("Your vehicle needs to be recalled!");
//        }else if(vehicleYear<=2017 && vehicleYear >=2015){
//            System.out.println("Your vehicle needs to be recalled!");
//        }else{
//            System.out.println("Your vehicle is fine, enjoy!");
//        }

//        Scanner scan = new Scanner(System.in);
//        String str = scan.nextLine();
//        if (str.length() !=0) {
//            if (str.length() > 3) {
//                String lastChar = str.substring(str.length() -3);
//                System.out.println(lastChar);
//            } else {
//                System.out.println(str);
//            }
//        } else {
//            System.out.println("Empty");
//        }

//        Scanner scan = new Scanner (System.in);
//        String str1 = scan.nextLine();
//        String str2 = scan.nextLine();
//        String str3 = scan.nextLine();
//
//        boolean same = str1.length() == str2.length() && str2.length() == str3.length();
//        boolean different = str1.length() != str2.length() && str2.length() != str3.length();
//
//        if (same) {
//            System.out.println("Same length");
//        }
//        else if (different) {
//            System.out.println("All different");
//        }
//        else {
//            System.out.println("Some different");
//        }


//        Scanner scan = new Scanner(System.in);
//        String word1 = scan.next();
//        String word2 = scan.next();
//        //YOUR CODE HERE
//        if (word1.length() == 3 && word2.length() == 3) {
//            char ch1w1 = word1.charAt(0);
//            char ch2w1 = word1.charAt(1);
//            char ch3w1 = word1.charAt(2);
//
//            char ch1w2 = word2.charAt(0);
//            char ch2w2 = word2.charAt(1);
//            char ch3w2 = word2.charAt(2);
//
//            System.out.print(ch1w1+""+ch1w2+""+ch2w1+""+ch2w2+""+ch3w1+""+ch3w2);
//        } else {
//            System.out.println("cannot merge");
//        }


//        //WRITE YOUR CODE HERE
//        Scanner input=new Scanner(System.in);
//        String item=input.nextLine();
//        int price=0;
//        boolean over100$=item.equals("Smartphone")||item.equals("Laptop");
//        boolean under100$=item.equals("Charger")||item.equals("USB cable")||item.equals("Headphones")||
//                item.equals("Pants")||item.equals("Hat")||item.equals("Socks")||item.equals("Blanket")||item.equals("Pillow");
//        if(over100$){
//            System.out.println("Sorry, not enough funds on your gift card!");
//        }else if(under100$){
//            String display="";
//            if(item.equals("Charger")){
//                price=100-15;
//                display="Your current balance is: "+price+"$";
//            }else if(item.equals("USB cable")){
//                price=100-10;
//                display="Your current balance is: "+price+"$";
//            }else if(item.equals("Headphones")) {
//                price = 100 - 30;
//                display = "Your current balance is: " + price + "$";
//            }else if(item.equals("Pants")) {
//                price = 100 - 50;
//                display = "Your current balance is: " + price + "$";
//            }else if(item.equals("Hat")) {
//                price = 100 - 25;
//                display = "Your current balance is: " + price + "$";
//            }else if(item.equals("Socks")) {
//                price = 100 - 5;
//                display = "Your current balance is: " + price + "$";
//            }else if(item.equals("Blanket")) {
//                price = 100 - 60;
//                display = "Your current balance is: " + price + "$";
//            }else if(item.equals("Pillow")) {
//                price = 100 - 40;
//                display = "Your current balance is: " + price + "$";
//            }
//            System.out.println("Thank you for your purchase!");
//            System.out.println(display);
//        }else{
//            System.out.println("Invalid item!");
//        }


//        Scanner scan = new Scanner(System.in);
//        //WRITE YOUR CODE HERE
//        String name1 = "max pain";
//        String name2 = "alan wake";
//        System.out.println("Enter full name:");
//        String fullName = scan.nextLine().toLowerCase();
//        if (fullName.equals(name1) || fullName.equals(name2)) {
//            System.out.println("User found!");
//        } else {
//            System.out.println("User not found!");
//        }


//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter first number:");
//        int num1 = scan.nextInt();
//        System.out.println("Enter second number:");
//        int num2 = scan.nextInt();
//        System.out.println("Enter third number:");
//        int num3 = scan.nextInt();
//
//        if (num1 > num2 && num1 < num3) {
//            System.out.println("Medium value is: " + num1);
//        }
//        else if (num2 > num1 && num2 < num3) {
//            System.out.println("Medium value is: " + num2);
//        }
//        else if (num3 > num1 && num3 < num2) {
//            System.out.println("Medium value is: " + num3);
//        }


//        Scanner s = new Scanner(System.in);
//
//        System.out.println("what is the farthest planet in the solar system:" );
//        System.out.println("a)venus" );
//        System.out.println("b)pluto" );
//        System.out.println("c)neptune" );
//
//        String a = s.nextLine();
//
//        //your code here
//        switch (a) {
//            case "a":
//                System.out.println(a + " is wrong");
//                break;
//            case "b":
//                System.out.println(a + " is correct");
//                break;
//            case "c":
//                System.out.println(a + " is wrong");
//                break;
//            default:
//                System.out.println(a + " is not a valid answer");
//                break;
//        }


//        Scanner scan = new Scanner(System.in);
//        String word = scan.nextLine();
//        if (word.charAt(0) == 'x' || word.charAt(0) == 'X') {
//            System.out.println(word.substring(1));
//        } else {
//            System.out.println("Word doesn't start with x or X");
//        }

//        Scanner scan = new Scanner(System.in);
//        String word = scan.nextLine();
//        boolean str1 = ((word.charAt(0) == 'x') && (word.charAt(1) != 'x'));
//        boolean str2 = ((word.charAt(0) != 'x') && (word.charAt(1) == 'x'));
//        boolean str3 = ((word.charAt(0) == 'x') && (word.charAt(1) == 'x'));
//        if (str1) {
//            System.out.println(word.substring(1));
//        } else if (str2) {
//            System.out.println(word.charAt(0) + word.substring(2));
//        } else if (str3) {
//            System.out.println(word.substring(2));
//        }

//        Scanner scan = new Scanner(System.in);
//        String word1 = scan.nextLine();
//        String word2 = scan.nextLine();
//        char ch1 = word1.charAt(word1.length() -1);
//        char ch2 = word2.charAt(0);
//        if (ch1 != ch2) {
//            System.out.println(word1+""+word2);
//        } else
//            System.out.println(word1+""+word2.substring(1));


//        Scanner scan = new Scanner(System.in);
//        String first = scan.nextLine();
//        String last = scan.nextLine();
//
//        String initials = (first.substring(0,1)) + "." + (last.substring(0,1)) + ".";
//        System.out.println(initials);


//        String str = "Java";
//        char ch1 = str.charAt(str.length() -1);
//        char ch2 = str.charAt(str.length() -2);
//        char ch3 = str.charAt(str.length() -3);
//        char ch4 = str.charAt(str.length() -4);
//        System.out.println(ch1+""+ch2+""+ch3+""+ch4);
//
//        String str1 = str.substring(0,1);
//        String str2 = str.substring(1,2);
//        String str3 = str.substring(2,3);
//        String str4 = str.substring(3,4);
//        System.out.println(str4+""+str3+""+str2+""+str1);


//        Scanner scan = new Scanner(System.in);
//        String email = scan.nextLine();
//
//        int str1 = email.indexOf("@");
//        int str2 = email.indexOf(".");
//
//        String domain = email.substring(str1+1, str2);
//        System.out.println(domain);

//        Scanner s = new Scanner(System.in);
//        String word1 = s.next();
//        String word2 = s.next();
//
//        //your code here
//        if (word1.equals(word2)) {
//            System.out.println("word1 equal word2");
//
//        } else {
//            System.out.println("word1 does not equal word2");
//        }

//        String str = "Batch 20";
//        int Z = str.trim().length();
//        System.out.println(Z);


//        Scanner scan = new Scanner(System.in);
//        String word = scan.next();
//        //WRITE YOUR CODE HERE
//        char first = word.charAt(0);
//        char last = word.charAt(word.length()-1);
//        System.out.println(first+""+last);
//    }
//}



        Scanner scan = new Scanner(System.in);
        String email = scan.next();
        //mike_tyson@gmail.com
        if (email.contains("_") && email.contains("@")) {
            System.out.println("Zero");
            int underscore = email.indexOf('_');
            int at = email.indexOf('@');
            String name = email.substring(0, underscore);
            String surname = email.substring(underscore+1, at);
            String domain = email.substring(at, email.length());
            System.out.println(surname+"_"+name+domain);
        } else {
            System.out.println(email);
        }
    }
}
