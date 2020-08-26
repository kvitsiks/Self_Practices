package Day43;

public class StudentObjects {
    public static void main(String[] args) {
        CybertekStudent obj1 = new CybertekStudent();
        obj1.studentName = "Ivan";

        CybertekStudent obj2 = new CybertekStudent();
        obj1.studentName = "Cristina";

        System.out.println(obj1.studentName);
        System.out.println(obj2.studentName);

        System.out.println(CybertekStudent.schoolName);
    }
}
