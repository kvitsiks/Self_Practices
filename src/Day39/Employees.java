package Day39;

public class Employees {

    /*
    Attributes:
		employeeName, gender, SSN, JobTitle, Salary
     */

    String name;
    char gender;
    int SSN;
    String jobTitle;
    double salary;

    public void setEmployeeInfo(String employeeName, char employeeGender, int employeeSSN, String employeeJobTitle, double employeeSalary){
        name = employeeName;
        gender = employeeGender;
        SSN = employeeSSN;
        jobTitle = employeeJobTitle;
        salary = employeeSalary;
    }

    public void getEmployeeInfo(){
        System.out.println("Name: "+name+", Gender: "+gender+", JobTitle: "+jobTitle+", Salary: "+salary);
        String ssn = ""+SSN;
        System.out.println("Last four digits of SSN: "+  ssn.substring(ssn.length()-4)    );
    }



}