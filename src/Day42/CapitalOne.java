package Day42;

import java.util.Arrays;

public class CapitalOne {
    public static void main(String[] args) {
        ScrumTeam team1 = new ScrumTeam();
        team1.setInfo("Garry Pong", "Mat Zeek", "Charley O'Donnell");

        Tester[] testers = {new Tester(), new Tester(), new Tester()};
        testers[0].setInfo("Aalia", 'F', 15111L, "Lead Tester", 110000);
        testers[1].setInfo("Naz", 'F', 15222L, "Tester", 130000);
        testers[2].setInfo("Kalbinur", 'F', 15333L, "Tester", 125000);
        team1.addTesters(testers);


        Developer[] developers = {new Developer(), new Developer(), new Developer(), new Developer(), new Developer()};
        developers[0].setInfo("Waqar", 'M', 2111L, "Dev Lead", 150000);
        developers[1].setInfo("Roza", 'F', 3222L, "Dev", 160000);
        developers[2].setInfo("Burak", 'M', 43333L, "Dev", 170000);
        developers[3].setInfo("Fatih", 'M', 1234L, "Dev", 145000);
        developers[4].setInfo("Farris", 'M', 56789L, "Dev", 200000);
        team1.addDeveloper(developers);
        System.out.println(team1);

//        System.out.println("++++++++++++++++++++++++++++++++++++");
//        for (Tester each : team1.testersList) {
//            System.out.println("Tester: " + each.name + "'s salary is $" + each.salary);
//        }
//        System.out.println("++++++++++++++++++++++++++++++++++++");
//        for (Developer each : team1.developersList) {
//            System.out.println("Developer: " + each.name + "'s salary is $" + each.salary);
//        }
//        System.out.println("++++++++++++++++++++++++++++++++++++");
//        team1.removeTester(15222L);
//        team1.removeDeveloper(56789L);
//        System.out.println(team1);

//        Developer developer = new Developer();
//        developers[0].setInfo("luisa", 'f', 2113L, "Dev Lead", 5000000);
//        team1.addDeveloper(developer);
//        System.out.println("++++++++++++++++++++++++++++++++++++");
//        double testerMaxSalary = Integer.MIN_VALUE;
//        double testerMinSalary = Integer.MAX_VALUE;
//        double devMaxSalary = Integer.MIN_VALUE;
//        ;
//        double devMinSalary = Integer.MAX_VALUE;
//        String testerName = "";
//
//        for (Tester each : team1.testersList) {
//            if (each.salary > testerMaxSalary)
//                testerMaxSalary = each.salary;
//                testerName = each.name;
//        }
//        System.out.println(testerName + " " + testerMaxSalary);


    }
}
