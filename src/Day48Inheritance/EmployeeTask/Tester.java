package Day48Inheritance.EmployeeTask;

public class Tester extends Employee {
    public Tester(String name, int salary, int id, String jobTitle, char gender){
        setEmployeeInfo(name, salary, id, jobTitle, gender);
    }
    public void findingBugs(){
        System.out.println("The bug is found, needs to be fixed!");
    }
}
