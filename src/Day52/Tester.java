package Day52;
/*
 3. create subclasses of Employee called:
                        1. Tester
                        2. Developer
 */
public class Tester extends Employee {

    public Tester(String name, int age, String gender) {
        super(name, age, gender);
    }

    public Tester(String name, int age, String gender, int ID, int salary, String jobTitle) {
        super(name, age, gender, ID, salary, jobTitle);
    }
}
