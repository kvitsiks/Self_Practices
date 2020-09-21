package Day49Inheritance2.WarmUp;

public class Developer extends Employee {
    /*
    create a subclass of Employee called called Developer
                    Attributes:
                        name, age, gender, Salary, ID, jobTitle
                    Actions:
                        setInfo(), coding(),  fixBug(), toString()
     */
    public Developer(String name, int age, char gender, int salary, int ID, String jobTitle){
        setEmployeeInfo(name, age, gender, salary, ID, jobTitle);
    }
    public void coding(){
        System.out.println(name + " " + jobTitle + " is coding");
    }
    public void fixBug(){
        System.out.println(name + " " + jobTitle + " is fixing bugs!");
    }
}
