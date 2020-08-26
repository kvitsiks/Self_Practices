package Day41;

public class Developer {
    String name;
    double salary;
    String gender;
    int age;

    public void coding(){
        System.out.println(name + " is coding");
    }
    public void fixBugs(){
        System.out.println(name + " is crying");
    }
    public void setInfo(String name, double salary, String gender, int age){
        this.name = name;
        this.salary = salary;
        this.gender = gender;
        this.age = age;
    }
    public String toString(){
        return "Name " + name + ", gender " + gender + ", Salary " + salary + " |||";
    }

}

class DeveloperObject{
    public static void main(String[] args) {
        Developer[] developers = {new Developer(), new Developer(), new Developer(), new Developer(), new Developer()};
        developers[0].setInfo("Garry", 130000, "M", 33);
        developers[1].setInfo("Bill", 150000, "M", 33);
        developers[2].setInfo("Grace", 125000, "F", 33);
        developers[3].setInfo("Sergi", 142000, "M", 33);
        developers[4].setInfo("Eva", 127000, "F", 33);

        for (Developer each : developers) {
            each.coding();
        }
        developers[0].fixBugs();
        developers[4].fixBugs();
    }
}

