package Day44;

import Day42.Tester;

public class HumanResources {
    /*
     2. create a class called HumanResources - not a custom class
     (we will not create any objects from it), this class just holds the data
            declare 5 variables of Employee as static
            use static block to:
                        1. initialize those static variables
                        2. set all the info of the Employees
     */


    static Employee employee1;//creating the variable, we cam call it from the class name because it's static
    static Employee employee2;
    static Employee employee3;
    static Employee employee4;
    static Employee employee5;

    static { // as soon as the class is called, the static vars will be set
        employee1 = new Employee();// initialisation of the variable - assigning the new Employee object to the variable
        employee2 = new Employee();
        employee3 = new Employee();
        employee4 = new Employee();
        employee5 = new Employee();

        employee1.setEmployeeInfo("David", 1234, 123456789, "Tester", 60000, 'M');
        employee2.setEmployeeInfo("Mark", 2345, 234567890, "QA", 80000, 'M');
        employee3.setEmployeeInfo("Liza", 3456, 345678901, "SDET", 120000, 'F');
        employee4.setEmployeeInfo("Brian", 4567, 456789012, "Tester", 75000, 'M');
        employee5.setEmployeeInfo("Jen", 3456, 567890123, "SDET", 140000, 'F');

    }
}
