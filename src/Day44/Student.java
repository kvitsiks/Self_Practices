package Day44;

public class Student {
    String name;
    int age;
    char gender;

    static String university;

    static {
        university = "Cybertek";
    }
    public Student(String name, int age, char gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public String toString(){
        return "Name: " + name + ", age: " + age + ", gender: " + gender + ", university: " + university;
    }
}
