package Day48Inheritance;

public class Quiz {
    public Quiz(){
        System.out.println("A ");
    }
    public Quiz(int a){
        this(2.5);
        System.out.println("B ");
    }
    public Quiz(double c){
        this();
        System.out.println("C ");
    }

    public static void main(String[] args) {
        Quiz o = new Quiz(100);
    }
}
