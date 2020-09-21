package Day48Inheritance.EmployeeTask;

public class Developer extends Employee {
    public Developer(String name, int salary, int id, String jobTitle, char gender){
        setEmployeeInfo(name, salary, id, jobTitle, gender);
    }
    public void fixingBugs(){

        System.out.println("Bug is fixed, ready for verification");
    }
}
