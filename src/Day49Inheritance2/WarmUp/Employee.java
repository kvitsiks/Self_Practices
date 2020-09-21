package Day49Inheritance2.WarmUp;

public class Employee extends Person {
    /*
    create a subclass of Person called Employee
                attributes: name, age, gender, Salary, ID, jobTitle
                methods: work, setEmployeeInfo
     */
    public int salary;
    public int ID;
    public String jobTitle;

    public void setID(int ID){
        this.ID = ID;
    }
    public void work(){
        System.out.println(name + " is working hard");
    }
    public void setEmployeeInfo(String name, int age, char gender, int salary, int ID, String jobTitle){
        setPersonInfo(name, age, gender);
        this.salary = salary;
        this.ID = ID;
        this.jobTitle = jobTitle;
    }
    public String toString() {
        return "| " + "ID: " + ID + ", Job Title: " + jobTitle +
                ", Name: " + name + ", Age: "  + age + ", Gender: " +
                gender + ", Salary: $" + salary;
    }
}
