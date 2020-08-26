package Day30;

public class ReturnMethod {
    public static void main(String[] args) {
        int sum = addition(1,2);
        System.out.println(sum);
        System.out.println(sum + sum);
        System.out.println(addition(2, 4) * 2);
    }

    public static int addition(int a, int b) {
        return a + b;
    }
}
