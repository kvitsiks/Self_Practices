package Day43;

public class CybertekStudent {
    //for the advantages of static

    String studentName;
    int age;
    char gender;

    static String schoolName = "Cybertek School";

    public void getInfo(){
        System.out.println(studentName);
    }

    public static void printSchoolName(){
        System.out.println(schoolName);
    }


}
