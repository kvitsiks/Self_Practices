package Cybertek;

import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        //        Scanner inp = new Scanner(System.in);
//        System.out.print("In:");
//        String word = inp.nextLine();
//        //write your code below
//        for (int i = 0; i < word.length(); i ++) {
//            System.out.println(word.charAt(i));
//        }
//    }
//}


//        Scanner inp = new Scanner(System.in);
//        System.out.print("In:");
//        String word = inp.nextLine();
//        //write your code below
//
//        for (int i = 0; i < word.length(); i++) {
//            char character = word.charAt(i);
//            if(character=='a' || character=='A' || character=='e' || character=='E' ||
//                    character=='i' || character=='I' || character=='o' || character=='O' ||
//                    character=='u' || character=='U') {
//                System.out.print(character);
//            }
//        }
//    }
//}


//        Scanner scan = new Scanner(System.in);
//        String email = scan.next();
//        //craig_federighi@apple.com
//        int underscore = email.indexOf("_");
//        int at = email.indexOf("@");
//        int dot = email.indexOf(".");
//
//        String name = email.substring(0, underscore);
//        char firstLetter = name.charAt(0);
//        char firstLetterUp = Character.toUpperCase(firstLetter);
//        String nameUp = email.substring(0+1, underscore);
//
//        String surname = email.substring(underscore+1, at);
//        char firstLetterSur = surname.charAt(0);
//        char firstLetterSurUp = Character.toUpperCase(firstLetterSur);
//        String surnameUp = email.substring(underscore+2, at);
//
//        String domainName = email.substring(at+1, dot);
//        String topDomain = email.substring(dot+1);
//
//        System.out.println("First name: " + firstLetterUp + nameUp);
//        System.out.println("Last name: " + firstLetterSurUp + surnameUp);
//        System.out.println("Domain: " + domainName);
//        System.out.println("Top-Level Domain: " + topDomain);
//    }
//}


/*
Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving}
 */
//        Scanner scan = new Scanner(System.in);
//        String message = scan.nextLine();
//        String sender;
//        String phoneNumber;
//        String messageBody;
//        int less = message.indexOf("<");
//        int more = message.indexOf(">");
//        int bracketOpen = message.indexOf("[");
//        int bracketClose = message.indexOf("]");
//        int curlyBracketOpen = message.indexOf("{");
//        int curlyBracketClose = message.indexOf("}");
//
//        sender = message.substring(less+1, more);
//        phoneNumber = message.substring(bracketOpen+1, bracketClose);
//        messageBody = message.substring(curlyBracketOpen+1, curlyBracketClose);
//
//        System.out.println("Sender: " + sender);
//        System.out.println("Phone Number: " + phoneNumber);
//        System.out.println("Message body: " + messageBody);
//    }
//}

///*
//Given a string word, if the first or last chars are 'x' or 'X',
// print the string without those 'x' or 'X' chars,  otherwise print the string unchanged.
// */
//
//        Scanner scan = new Scanner(System.in);
//        String word = scan.next();
//        char first = word.charAt(0);
//        char last = word.charAt(word.length()-1);
//
//        if ((first == 'x' || first == 'X') && (last == 'x' || last == 'X')) {
//            System.out.println(word.substring(1, word.length()-1));
//        }
//        else if (first == 'x' || first == 'X') {
//            System.out.println(word.substring(1));
//        }
//        else if (last == 'x' || last == 'X') {
//            System.out.println(word.substring(0, word.length()-1));
//        } else {
//            System.out.println(word);
//        }
//    }
//}


//        Scanner scan = new Scanner(System.in);
//        String start = scan.next();
//        String end = scan.next();
//
//        if (!start.equals(end)) {
//            if (start.equals("D") && end.equals("A")) {
//                System.out.println("up: " + end + " found");
//            }
//            else if (start.equals("D") && end.equals("B")) {
//                System.out.println("up > right: " + end + " found");
//            }
//            else if (start.equals("D") && end.equals("C")) {
//                System.out.println("up > right > down: " + end + " found");
//            }
//            else if (start.equals("A") && end.equals("B")) {
//                System.out.println("right: " + end + " found");
//            }
//            else if (start.equals("A") && end.equals("C")) {
//                System.out.println("right > down: " + end + " found");
//            }
//            else if (start.equals("A") && end.equals("D")) {
//                System.out.println("right > down > left: " + end + " found");
//            }
//            else if (start.equals("B") && end.equals("C")) {
//                System.out.println("down: " + end + " found");
//            }
//            else if (start.equals("B") && end.equals("D")) {
//                System.out.println("down > left: " + end + " found");
//            }
//            else if (start.equals("B") && end.equals("A")) {
//                System.out.println("down > left > up: " + end + " found");
//            }
//            else if (start.equals("C") && end.equals("D")) {
//                System.out.println("left: " + end + " found");
//            }
//            else if (start.equals("C") && end.equals("A")) {
//                System.out.println("left > up: " + end + " found");
//            }
//            else if (start.equals("C") && end.equals("B")) {
//                System.out.println("left > up > right: " + end + " found");
//            }
//        } else {
//            System.out.println(end + " found");
//        }
//    }
//}


//            int freeBooks = 0;
//            Scanner scan = new Scanner(System.in);
//            boolean isPremiumCustomer = scan.nextBoolean();
//            int nbooksPurchased = scan.nextInt();
//
//            if (isPremiumCustomer) {
//                if (nbooksPurchased >= 5 && nbooksPurchased <= 8) {
//                    freeBooks = 1;
//                    System.out.println(freeBooks);
//                }
//                else if (nbooksPurchased > 8) {
//                    freeBooks = 2;
//                    System.out.println(freeBooks);
//                } else {
//                    System.out.println(0);
//                }
//            } else {
//                if (nbooksPurchased >= 7 && nbooksPurchased <= 11) {
//                    freeBooks = 1;
//                    System.out.println(freeBooks);
//                }
//                else if (nbooksPurchased >= 12) {
//                    freeBooks = 2;
//                    System.out.println(freeBooks);
//                } else {
//                    System.out.println(0);
//                }
//            }
//        }
//    }


//        int i = 1;
//        int j = 1;
//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//        // outer loop to handle number of rows
//        //  n in this case
//        for (i = 0; i < n; i++) {
//            //  inner loop to handle number of columns
//            //  values changing acc. to outer loop
//            for (j = 0; j <= i; j++) {
//                System.out.print("*");
//            }
//            // ending line after each row
//            System.out.println("");
//        }
//    }
//}





    }
}
