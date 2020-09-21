package Day49Inheritance2.WarmUp;

import JavaRush.Solution2;

public class AppleInc {
    /*
    create a class called AppleInc:
                    1. create an array of Testers and store the testers info in your group
                    2. create an array of developers store the developers info in your group
                    3. create an object of ScrumTeam and store the testers & developers above to the scrum team

                 Tester tester = new Tester("Ali", 33, 'M', 80000, 42345, "Tester");
        developers.add(new Developer("Mike", 50, 'M', 200000, 82345, "Dev Manager"));
     */

    public static void main(String[] args) {
        Tester[] testersArr = {new Tester("Jonny", 30, 'M', 130000, 12345, "Lead SDET"),
                new Tester("Jen", 38, 'F', 140000, 22345, "QA Manager"),
                new Tester("Billy", 45, 'M', 120000, 32345, "Senior tester")};

        Developer[] developersArr = {new Developer("Macy", 31, 'F', 150000, 52345, "Lead Developer"),
                new Developer("Tommy", 27, 'M', 145000, 62345, "DeveloperII"),
                new Developer("Jerry", 25, 'M', 130000, 72345, "Junior Developer")};


        ScrumTeam team1 = new ScrumTeam(testersArr, developersArr);
        System.out.println(team1);
        System.out.println(team1.testers);
        System.out.println(team1.developers);
    }
}