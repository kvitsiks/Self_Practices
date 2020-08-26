package Day26;

public class UniqueWord {
    public static void main(String[] args) {
        String[] words = {"Java", "C#", "Python", "C#", "Python"};

        for (String b : words) {
            int count = 0;
            for (String a : words) {
                if (a.equals(b)) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(b);
            }
        }
    }
}
