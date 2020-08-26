package Day39;

import java.util.ArrayList;
import java.util.Arrays;

public class CapitalOne {
    public static void main(String[] args) {
        Employees emp1 = new Employees();
        Employees emp2 = new Employees();
        Employees emp3 = new Employees();

        emp1.setEmployeeInfo("Slava", 'm', 123456789, "Cleaner", 30000);
        emp2.setEmployeeInfo("Sergi", 'm', 213836490, "Driver", 25000);
        emp3.setEmployeeInfo("Alla", 'f', 736548462, "CEO", 400000);

        emp1.getEmployeeInfo();
        System.out.println("-----------------------------------------");
        emp2.getEmployeeInfo();
        System.out.println("-----------------------------------------");
        emp3.getEmployeeInfo();
        System.out.println();
        System.out.println();

        ArrayList<Employees> list = new ArrayList<>(Arrays.asList(emp1, emp2, emp3));
        for (Employees eachEmployee : list) {
            eachEmployee.getEmployeeInfo();
            System.out.println("+++++++++++++++++++++++++++++++++++++++++");
        }
        double max = Integer.MIN_VALUE;
        String name = "";
        for (Employees eachEmployee : list) {
            if (eachEmployee.salary > max) {
                max = eachEmployee.salary;
                name = eachEmployee.name;
            }
        }
        System.out.println(name + " has the biggest salary: " + max);


        list.removeIf(predicate -> predicate.salary < 30000 && predicate.jobTitle.equals("CEO"));
        System.out.println();
        for (Employees eachEmployee : list) {
            eachEmployee.getEmployeeInfo();
            System.out.println("+++++++++++++++++++++++++++++++++++++++++");
            System.out.println(eachEmployee.name + " : " + eachEmployee.salary);
        }
    }
}
