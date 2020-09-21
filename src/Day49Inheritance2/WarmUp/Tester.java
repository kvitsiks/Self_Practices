package Day49Inheritance2.WarmUp;

public class Tester extends Employee {
    /*
    create a subclass of Employee called Testers
                    Attributes:
                        name, age, gender, Salary, ID, jobTitle
                    Actions:
                        setInfo(), smokeTesting(),  creatingTicket(), toString()
     */

    public Tester(String name, int age, char gender, int salary, int ID, String jobTitle){
        setEmployeeInfo(name, age, gender, salary, ID, jobTitle);
    }
    public void smokeTesting(){
        System.out.println(name + " is doing smoke testing");
    }
    public void creatingTicket(){
        System.out.println(name + " is creating a ticket");
    }
}
