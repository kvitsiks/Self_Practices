package Day52;

import Day43.Test;

import java.util.ArrayList;
import java.util.Arrays;

/*
    4. create a class called Google
            create 5 objects of the Tester and 5 objects of Developer
            create an arrayList of Tester and an ArrayList of Developer, store those 5 objects of the Tester & Developers
            use for each loop to iterate Tester & Developer objects from in those arrayLists
                print out the tester & developer who has the highest salary
 */
public class Google{

    public static void main(String[] args) {
        Tester tester1 = new Tester("Igor", 43, "male", 12345, 90000, "Tester");
        Tester tester2 = new Tester("Sergi", 35, "male", 23456, 120000, "SDET");
        Developer developer1 = new Developer("Mark", 25, "male", 34567, 130000, "Dev I");
        Developer developer2 = new Developer("Bonny", 22, "female", 567890, 10000, "Junior dev");
        Developer developer3 = new Developer("Jen", 40, "female", 123098, 150000, "Dev lead");
        Developer developer4 = new Developer("Jim", 34, "male", 87964, 130000, "Dev II");

    ArrayList<Tester> testers = new ArrayList<>(Arrays.asList(tester1, tester2));
    ArrayList<Developer> developers = new ArrayList<>(Arrays.asList(developer1, developer2, developer3, developer4));
        int maxSalaryTester = 0;
        String testerName = "";
        String testerTitle = "";
        for (Tester each : testers) {
            if (each.salary > maxSalaryTester) {
                maxSalaryTester = each.salary;
                testerName = each.name;
                testerTitle = each.jobTitle;
            }
        }
        System.out.println(testerName + " is " + testerTitle + " and has the biggest salary: $" + maxSalaryTester);

        String devName = "";
        String devTitle = "";
        int maxSalaryDeveloper = 0;
        for (Developer each : developers) {
            if (each.salary > maxSalaryDeveloper) {
                maxSalaryDeveloper = each.salary;
                devName = each.name;
                devTitle = each.jobTitle;
            }
        }
        System.out.println(devName + " is " + devTitle + " and has the biggest salary: $" + maxSalaryDeveloper);

        System.out.println(tester1);
        System.out.println(tester2);
    }
}
