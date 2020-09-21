package Day48Inheritance.EmployeeTask;

import Day43.Test;

public class EmployeeObjects {
    public static void main(String[] args) {
        Tester tester = new Tester("Sergi", 120000, 12345, "SDET Team Lead", 'M');
        System.out.println(tester);
        System.out.println("=================================");
        tester.findingBugs();

        Developer dev = new Developer("Brian", 150000, 54321, "Dev Team Lead", 'M');
        System.out.println(dev);
        System.out.println("=================================");
        dev.fixingBugs();
        }
    }

