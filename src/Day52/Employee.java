package Day52;
/*
2. create a subclass of person called Employee
            attributes: name, age, gender, ID, jobTitle, salary
            first constructor: can initialize name, age, gender of the employee
            second constructor: can initialize the entire attributes of the Employee class
            override the toString method  that can help you to print out the EmployeeObject
 */
public class Employee extends Person {

    int ID, salary;
    String jobTitle;

    public Employee(String name, int age, String gender){
        super(name, age, gender);
    }

    public Employee(String name, int age, String gender, int ID, int salary, String jobTitle){
        super(name, age, gender);
        this.ID = ID;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    @Override
    public String toString() {
        return name + " is a " + gender + ", who is " + age + " years old, has ID: " + ID + ", and salary is " + salary + ", works as " + jobTitle;
    }
}
