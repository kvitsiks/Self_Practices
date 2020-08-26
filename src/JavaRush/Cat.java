package JavaRush;

//public class Cat {
//    private String name = "безымянный кот";
//
//    public void setName(String name) {
//        //напишите тут ваш код
//        this.name = name;
//    }
//
//    public static void main(String[] args) {
//        Cat cat = new Cat();
//        cat.setName("Жужик");
//        System.out.println(cat.name);
//    }
//}

//public class Cat {
//    private static int catsCount = 0;
//
//    public static void addNewCat() {
//        //напишите тут ваш код
//        Cat.catsCount = catsCount + 1;
//    }
//
//    public static void main(String[] args) {
//
//    }
//}

//public class Cat {
//    private static int catsCount = 0;
//
//    public static void setCatsCount(int catsCount) {
//        //напишите тут ваш код
//        Cat.catsCount = catsCount;
//    }
//
//    public static void main(String[] args) {
//
//    }
//}


//public class Cat {
//    private String fullName;
//
//    public void setName(String firstName, String lastName) {
//        String fullName = firstName + " " + lastName;
//
//        //напишите тут ваш код
//        this.fullName = fullName;
//    }
//
//    public static void main(String[] args) {
//
//    }
//}

//public class Cat {
//    public static void main(String[] args) {
//        Cat1 cat1 = new Cat1();
//        //напишите тут ваш код
//        Cat1.count = Cat1.count + 1;
//
//        Cat1 cat2 = new Cat1();
//        //напишите тут ваш код
//        Cat1.count = Cat1.count + 1;
//
//        System.out.println("The cat count is " + Cat1.count);
//    }
//
//    public static class Cat1 {
//        public static int count = 0;
//    }
//}


//public class Cat {
//    public static int catCount = 0;
//
//    //напишите тут ваш код
//    public Cat() {
//        catCount = catCount+1;
//    }
//    protected void finalize(){
//        catCount = catCount-1;
//    }
//
//    public static void main(String[] args) {
//
//    }
//}

///*
//Статические коты
//*/
//
//import java.util.ArrayList;
//
//public class Cat {
//    //напишите тут ваш код
//    public static ArrayList<Cat> cats = new ArrayList<Cat>();
//
//    public Cat() {
//    }
//
//    public static void main(String[] args) {
//        //напишите тут ваш код
//        for (int i = 0; i < 10; i++) {
//            Cat cat1 = new Cat();
//            cats.add(cat1);
//        }
//        printCats();
//    }
//
//    public static void printCats() {
//        //напишите тут ваш код
//        for (int n = 0; n < 10; n++) {
//            System.out.println(cats.get(n));
//        }
//    }
//}