package Day48Inheritance.EmployeeTask;

public class Employee {
    public String name;
    public int salary;
    public int id;
    public String jobTitle;
    public char gender;



    public void setEmployeeInfo(String name, int salary, int id, String jobTitle, char gender){
        this.name = name;
        this.salary = salary;
        this.id = id;
        this.jobTitle = jobTitle;
        this.gender = gender;
    }
    public String toString(){
        return "ID of employee " + id + "\nName: " + name + "\nSalary is: " + salary + "\nJob title: " + jobTitle;
    }
}
