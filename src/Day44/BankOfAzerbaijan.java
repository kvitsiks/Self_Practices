package Day44;

import java.util.ArrayList;
import java.util.Arrays;
import static Day44.HumanResources.*;

public class BankOfAzerbaijan {
    /*
    warmup task:


    3. create class called BankOfAzerbaijan
        in the main method:
                1. create a List of Employees
                2. add random two employees from HumanResources to the List
                3. use for each loop to print out the employee info

     */
    public static void main(String[] args) {
        //without using static import
        ArrayList<Employee> employees = new ArrayList<>(Arrays.asList(HumanResources.employee1, HumanResources.employee3, HumanResources.employee5));
        //with using static import
        //ArrayList<Employee> employees = new ArrayList<>(Arrays.asList(employee1, employee3, employee5));


        for (Employee each : employees) {//each represents object in the arrayList
            System.out.println(each.name + " " + each.asString());
        }
    }
}
