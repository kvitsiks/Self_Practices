package Day29;

public class ReturnKeyword {
    public static void main(String[] args) {
        //calculate the garde of the student based on the score
        grade(100);

    }

    public static void grade(int score) {
        if (score < 0 || score > 100) {
            System.out.println("Invalid");
            //System.exit(0);
            return;
        }
        char grade = score >= 80 ? 'A' : score >= 70 ? 'C' : score >= 60 ? 'D' : 'F';
        System.out.println("Grade is: " + grade);
    }
}
