package Day47;

import Day39.CapitalOne;

public class CapitalOneEmployee {
    /*
       2. create a class called CapitalOneEmployees
                instance variables:
                        employeeName
                        employeeAge
                        jobTitle
                    private ID
                    private salary
                    private address
                    company name = "Capital One"
                    generate getters & setters for private variables
     */
    public String employeeName;
    public int employeeAge;
    public String jobTitle;

    private int ID;
    private int salary;
    private String address;

    public static String companyName;

    static {
        companyName = "Capital One";
    }

    public CapitalOneEmployee(String employeeName, int employeeAge, String jobTitle){
        this.employeeName = employeeName;
        this.employeeAge = employeeAge;
        this.jobTitle = jobTitle;
    }

    public void setID(int ID){
        this.ID = ID;
    }
    public int getID(){
        return ID;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }
    public int getSalary(){
        return salary;
    }

    public void setAddress(String address){
        this.address = address;
    }
    public String getAddress(){
        return address;
    }

    public String toString(){
        return "Name is " + employeeName + "\nAge is " + employeeAge + "\nJob title is " + jobTitle;
    }

}
