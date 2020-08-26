package Day42;

public class Student {
    String name;
    int age;
    int groupNumber;
    char gender; //belongs to the object

    static String schoolName = "Cybertek";//belongs to the class
    static String favoriteTeacher = "Muha";

    public void setInfo(String name, int age, int groupNumber, char gender){
        this.name = name;
        this.age = age;
        this.groupNumber = groupNumber;
        this.gender = gender;
    }
    public String toString(){//instance method (doesn't have static) belongs to the object
        return "School name: " + schoolName + " group number " + groupNumber;
    }
    /*
    class car - blueprint
    object car1 Mercedes is instance (we created to store different data)
    object car2 BMW is instance
    object car3 Toyota is instance
    instance need to m

    static method is a class member and only accept static members
     */
}
