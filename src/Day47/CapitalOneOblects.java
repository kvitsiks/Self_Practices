package Day47;

import Day39.CapitalOne;

public class CapitalOneOblects {
    public static void main(String[] args) {
        CapitalOneEmployee emp1 = new CapitalOneEmployee("John", 28, "Bank clerk");

        emp1.setSalary(75000);
        emp1.setID(12345);
        emp1.setAddress("Austin, TX");

        System.out.println(emp1.getSalary());
        System.out.println(emp1.getID());
        System.out.println(emp1.getAddress());
        System.out.println("===========================================");
        System.out.println(emp1);
    }
}
