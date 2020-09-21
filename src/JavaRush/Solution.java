package JavaRush;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

//public class Solution {
//    public static void main (String[] args) throws IOException {
//        //напишите тут ваш код
//        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
//        String name = reader.readLine();
//        String number = reader.readLine();
//        int number2 = Integer.parseInt(number);
//        System.out.println(name + " захватит мир через " + number2 + " лет. Му-ха-ха!");
//          int sAge = Integer.parseInt(reader.readLine());
//    }
//}

//public class Solution {
//    public static void main(String[] args) {
//        displayClosestToTen(8, 11);
//        displayClosestToTen(7, 14);
//        displayClosestToTen(9, 11);
//    }
//
//    public static void displayClosestToTen(int a, int b) {
//        // напишите тут ваш код
//        int c = 10;
//        if (abs(a-c)<(abs(b-c))) {
//            System.out.println(a);
//        }
//        else if (abs(a-c)>(abs(b-c))) {
//            System.out.println(b);
//        }
//        else
//            System.out.println(a);
//    }
//
//    public static int abs(int a) {
//        if (a < 0) {
//            return -a;
//        } else {
//            return a;
//        }
//    }
//}

///*
//Попадём-не-попадём
//*/
//
//public class Solution {
//    public static void main(String[] args) {
//        checkInterval(60);
//        checkInterval(112);
//        checkInterval(10);
//    }
//
//    public static void checkInterval(int a) {
//        //напишите тут ваш код
//        if (a <= 100 && a >= 50) {
//            System.out.println("Число " + a + " содержится в интервале.");
//        }
//        else
//            System.out.println("Число " + a + " не содержится в интервале.");
//    }
//}

///*
//Времена года на Терре
//*/
//
//public class Solution {
//    public static void main(String[] args) {
//        checkSeason(12);
//        checkSeason(4);
//        checkSeason(7);
//        checkSeason(10);
//    }
//
//    public static void checkSeason(int month) {
//        //напишите тут ваш код
//        if (month == 1 && month == 2 && month == 12) {
//            System.out.println("");
//        }
//        else if (month == 3 && month == 4 && month == 5) {
//            System.out.println("");
//        }
//        else if (month == 6 && month == 7 && month == 8) {
//            System.out.println("");
//        }
//        else if (month == 9 && month == 10 && month == 11) {
//            System.out.println("");
//        }
//        else
//            System.out.println("");
//    }
//}

/*
Положительное и отрицательное число
*/

//public class Solution {
//    public static void main(String[] args) throws Exception {
//        //напишите тут ваш код
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        int number = Integer.parseInt(reader.readLine());
//        if (number > 0) {
//            System.out.println(number * 2);
//        }
//        else if (number < 0) {
//            System.out.println((number + 1));
//        }
//        else if (number == 0) {
//            System.out.println(0);
//        }
//    }
//}

//public class Solution {
//    public static void main(String[] args) throws Exception {
//        //напишите тут ваш код
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        int day = Integer.parseInt(reader.readLine());
//        if (day == 1) {
//            System.out.println("");
//        }
//        else if (day == 2) {
//            System.out.println("");
//        }
//        else if (day == 3) {
//            System.out.println("");
//        }
//        else if (day == 4) {
//            System.out.println("");
//        }
//        else if (day == 5) {
//            System.out.println("");
//        }
//        else if (day == 6) {
//            System.out.println("");
//        }
//        else if (day == 7) {
//            System.out.println("");
//        }
//        else
//            System.out.println("");
//    }
//}


///*
//Минимум двух чисел Ӏ Java Syntax: 4 уровень, 6 лекция
//*/
//
//public class Solution {
//    public static void main(String[] args) throws Exception {
//        //напишите тут ваш код
//        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
//        int number1 = Integer.parseInt(reader.readLine());
//        int number2 = Integer.parseInt(reader.readLine());
//        if (number1 < number2) {
//            System.out.println(number1);
//        }
//        else if (number1 > number2) {
//            System.out.println(number2);
//        }
//        else
//            System.out.println(number1);
//    }
//}

//public class Solution {
//    public static void main(String[] args) throws Exception {
//        //напишите тут ваш код
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        int a = Integer.parseInt(reader.readLine());
//        int b = Integer.parseInt(reader.readLine());
//        int c = Integer.parseInt(reader.readLine());
//        if (c>b && b>a){
//            System.out.println(c+" "+b+" "+a);
//        }
//        else if (c>a && a>b){
//            System.out.println(c+" "+a+" "+b);
//        }
//        else if (a>b && b>a){
//            System.out.println(a+" "+b+" "+c);
//        }
//        else if (a>c && c>b){
//            System.out.println(a+" "+c+" "+b);
//        }
//        else if (b>a && a>c){
//            System.out.println(b+" "+a+" "+c);
//        }
//        else if (b>c && c>a){
//            System.out.println(b+" "+c+" "+a);
//        }
//    }
//}
/*
//Ярлыки и числа
//        */
//
//public class Solution {
//    public static void main(String[] args) throws Exception {
//        //напишите тут ваш код
//        BufferedReader reader = new BufferedReader(new InputStreamReader (System.in));
//        int number = Integer.parseInt(reader.readLine());
//        if (number % 2 == 0 && number < 0) {
//            System.out.println("отрицательное четное число");
//        }
//        else if (number % 2 != 0 && number < 0) {
//            System.out.println("отрицательное нечетное число");
//        }
//        else if (number == 0) {
//            System.out.println("ноль");
//        }
//        else if (number % 2 == 0 && number > 0) {
//            System.out.println("положительное четное число");
//        }
//        else if (number % 2 != 0 && number > 0) {
//            System.out.println("положительное нечетное число");
//        }
//    }
//}

///*
//От 1 до 10
//*/
//
//public class Solution {
//    public static void main(String[] args) {
//        //напишите тут ваш к
//        int i =10;
//        while (i >= 1)
//        {
//            System.out.println(i);
//            i--;
//        }
//    }
//}

///*
//Хорошего много не бывает
//*/
//
//public class Solution {
//    public static void main(String[] args) throws Exception {
//        //напишите тут ваш код
//        BufferedReader reader = new BufferedReader(new InputStreamReader (System.in));
//        String string = reader.readLine();
//        int number = Integer.parseInt(reader.readLine());
//        int i = 1;
//        while (i <= number) {
//            System.out.println(string);
//            i++;
//        }
//    }
//}


///*
//Таблица умножения
//*/
//
//public class Solution {
//    public static void main(String[] args) {
//        //напишите тут ваш код
//        int i =1;
//        int j = 1;
//        while (j<=10) {
//            while (i<=10) {
//                System.out.print(j*i + " ");
//                i++;
//            }
//            i=1;
//            j++;
//            System.out.println();
//        }
//
//    }
//}


///*
//Четные числа
//*/
//
//public class Solution {
//    public static void main(String[] args) {
//        //напишите тут ваш код
//        for (int i=1; i<=100; i++){
//            if (i%2==0) {
//                System.out.println(i);
//            }
//        }
//    }
//}


///*
//Рисуем прямоугольник
//*/
//
//public class Solution {
//    public static void main(String[] args) throws Exception {
//        //напишите тут ваш код
//        BufferedReader reader = new BufferedReader(new InputStreamReader (System.in));
//        int m = Integer.parseInt(reader.readLine());
//        int n = Integer.parseInt(reader.readLine());
//        for (int i=0; i<m; i++){
//           for (int j=0; j<n; j++){
//               System.out.print(8);
//           }
//            System.out.println(" ");
//        }
//    }
//}


///*
//Треугольник из восьмерок
//*/
//
//public class Solution {
//    public static void main(String[] args) {
//        //напишите тут ваш код
//        for (int i=0; i<10; i++){
//            for (int j=0; j<=i;j++){
//                System.out.print(8);
//            }
//            System.out.println(" ");
//        }
//    }
//}


///*
//Рисуем линии
//*/
//
//public class Solution {
//    public static void main(String[] args) {
//        //напишите тут ваш код
//        for (int i=0; i<9;i++){
//            System.out.print(8 + "   ");
//        }
//        for (int i=0; i<11;i++){
//            System.out.println(8);
//        }
//    }
//}


///*
//Письмо счастья
//*/
//
//public class Solution {
//    public static void main(String[] args) throws Exception {
//        //напишите тут ваш код
//        Scanner myObj = new Scanner(System.in);
//        String name = myObj.nextLine();
//        for (int i=0; i<=9; i++){
//            System.out.println(name + " любит меня.");
//        }
//    }
//}


///*
//Как назвали, так назвали
//*/
//
//public class Solution {
//    public static void main(String[] args) throws Exception {
//        //напишите тут ваш код
//        Scanner scanner = new Scanner(System.in);
//        String name = scanner.nextLine();
//        int day = scanner.nextInt();
//        int month = scanner.nextInt();
//        int year = scanner.nextInt();
//        System.out.println("Меня зовут " + name + "\n" +
//                "Я родился " + day + "." + month + "." + year);
//    }
//}

///*
//Суммирование
//*/
//
//public class Solution {
//    public static void main(String[] args) throws Exception {
//        //напишите тут ваш код
//        int num1 = 0;
//        int num2 = 0;
//        Scanner scanner = new Scanner(System.in);
//        while (num2 != -1) {
//            num2 = scanner.nextInt();
//            num1 = num1+num2;
//            if (num2 == -1) {
//                break;
//            }
//        }
//        System.out.println(num1);
//    }
//}


/*
Как-то средненько
*/

//public class Solution {
//    public static void main(String[] args) throws Exception {
//        //напишите тут ваш код
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String s = reader.readLine();
//        String s2 = reader.readLine();
//        String s3 = reader.readLine();
//        int a = Integer.parseInt(s);
//        int b = Integer.parseInt(s2);
//        int c = Integer.parseInt(s3);

//        int number = 10;
//        if (--number > 10) {
//            System.out.println(" "+number);
//        }
//        else if (number == 9) {
//            System.out.println(" 2 "+number);
//        }
//            int num =9;
//            if (num ++ == 10) {
//                System.out.println(" " + num);
//            }
//            else System.out.println(" 2 " + num);
//        int x = 10;
//        int y = x++;
//        System.out.println(y++ + " " + x++ + " " + y);
//        if(a==b&&a==b&a==c) {
//            System.out.println(a);
//        }
//        else
//            System.out.println("r");
//        else if(a==b){
//            System.out.println(a);
//        }
//        else if(a>b && a>c) {
//            System.out.println(a);
//        }
//        else if (b>a &&b>c) {
//            System.out.println(b);
//        }
//        else if(c>a && c>b) {
//            System.out.println(c);
//        }
//        else if(a>b && a<c){
//            System.out.println(a);
//        }
//        else if(b>a && b<c){
//            System.out.println(b);
//        }
//        else if (c>a && c<b){
//            System.out.println(c);
//        }
//   }}


///*
//Геттеры и сеттеры для класса Dog
//*/
//
//public class Solution {
//    //напишите тут ваш код
//    String name;
//    int age;
//
//    public String getName(){
//        return name;
//    }
//    public int getAge(){
//        return age;
//    }
//    public void setName(String name){
//        this.name = name;
//    }
//    public void setAge(int age){
//        this.age = age;
//    }
//
//    public static void main(String[] args) {
//
//    }
//}


///*
//Трикотаж
//*/
//
//public class Solution {
//    public static void main(String[] args) {
//        //напишите тут ваш код
//        Cat cat1 = new Cat("Vasia", 3, 4, 7);
//        Cat cat2 = new Cat("Vasia2", 4, 5, 8);
//        Cat cat3 = new Cat("Vasia3", 5, 6, 9);
//
//    }
//
//    public static class Cat {
//        private String name;
//        private int age;
//        private int weight;
//        private int strength;
//
//        public Cat(String name, int age, int weight, int strength) {
//            this.name = name;
//            this.age = age;
//            this.weight = weight;
//            this.strength = strength;
//        }
//    }
//}


///*
//Кошачья бойня
//*/
//
//public class Solution {
//
//    public static void main(String[] args) {
//        //напишите тут ваш код
//        Cat cat1 = new Cat("Vasia", 3, 4, 7);
//        Cat cat2 = new Cat("Vasia2", 4, 5, 8);
//        Cat cat3 = new Cat("Vasia3", 5, 6, 9);
//        System.out.println(cat1.fight(cat2));
//        System.out.println(cat2.fight(cat3));
//        System.out.println(cat3.fight(cat1));
//    }
//
//    public static class Cat {
//
//        protected String name;
//        protected int age;
//        protected int weight;
//        protected int strength;
//
//        public Cat(String name, int age, int weight, int strength) {
//            this.name = name;
//            this.age = age;
//            this.weight = weight;
//            this.strength = strength;
//        }
//
//        public boolean fight(Cat anotherCat) {
//            int ageScore = Integer.compare(this.age, anotherCat.age);
//            int weightScore = Integer.compare(this.weight, anotherCat.weight);
//            int strengthScore = Integer.compare(this.strength, anotherCat.strength);
//
//            int score = ageScore + weightScore + strengthScore;
//            return score > 0; // return score > 0 ? true : false;
//        }
//    }
//}


///*
//Среднее арифметическое
//*/
//
//public class Solution {
//    public static void main(String[] args) throws Exception {
//        //напишите тут ваш код
//        double number1 = 0;
//        double number2 =0;
//        int count = 0;
//        Scanner scanner = new Scanner (System.in);
//        while (number2 !=-1) {
//            number2 = scanner.nextInt();
//            count = count+1;
//            number1 = (number1+number2);
//            if (number2 == -1){
//                number1 = ((number1+1)/(count-1));
//                break;
//            }
//        }
//        System.out.println(number1);
//    }
//}


///*
//Создать класс Friend
//*/
//
//public class Solution {
//    //напишите тут ваш код
//    String name;
//    int age;
//    char sex;
//
//    public void initialize1(String name){
//        this.name = name;
//    }
//    public void initialize2(String name, int age){
//        this.name = name;
//        this.age = age;
//    }
//    public void initialize3(String name, int age, char sex){
//        this.name = name;
//        this.age = age;
//        this.sex = sex;
//    }
//
//    public static void main(String[] args) {
//
//    }
//}

///*
//И целой утки мало
//*/
//
//public class Solution {
//
//    public static void main(String[] args) {
//        Duck duck1 = new Duck();
//        Duck duck2 = new Duck();
//        System.out.println(duck1);
//        System.out.println(duck2);
//
//        //напишите тут ваш код
//        Cat cat1 = new Cat();
//        Cat cat2 = new Cat();
//        System.out.println(cat1);
//        System.out.println(cat2);
//
//        Dog dog1 = new Dog();
//        Dog dog2 = new Dog();
//        System.out.println(dog1);
//        System.out.println(dog2);
//    }
//
//    public static class Duck {
//        public String toString() {
//            return "Duck";
//        }
//    }
//    public static class Cat {
//        public String toString() {
//            return "Cat";
//        }
//    }
//    public static class Dog {
//        public String toString() {
//            return "Dog";
//        }
//    }
//
//    //напишите тут ваш код
//}


///*
//Мужчина и женщина
//*/
//
//public class Solution {
//    public static void main(String[] args) {
//        //напишите тут ваш код
//        Man man1 = new Man("Nick", 22, "121212");
//        Man man2 = new Man("Jim", 44, "4324324");
//        System.out.println(man1.name + " " + man1.age + " " + man1.address);
//        System.out.println(man2.name + " " + man2.age + " " + man2.address);
//        Woman woman1 = new Woman("Jen", 40, "13123");
//        Woman woman2 = new Woman("Hilda", 32, "254343");
//        System.out.println(woman1.name + " " + woman1.age + " " + woman1.address);
//        System.out.println(woman2.name + " " + woman2.age + " " + woman2.address);
//    }
//
//    //напишите тут ваш код
//    public static class Man {
//        String name;
//        int age;
//        String address;
//        public Man (String name, int age, String address) {
//            this.name = name;
//            this.age = age;
//            this.address = address;
//        }
//    }
//    public static class Woman {
//        String name;
//        int age;
//        String address;
//        public Woman (String name, int age, String address) {
//            this.name = name;
//            this.age = age;
//            this.address = address;
//        }
//    }
//}

///*
//Консоль-копилка
//*/
//
//public class Solution {
//    public static void main(String[] args) throws Exception {
//        //напишите тут ваш код
//        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
//        int num1;
//        int sum = 0;
//        String exit = scanner.readLine();
//        while (!exit.equals("сумма"))
//        {
//            num1 = Integer.parseInt(exit);
//            sum += num1;
//            exit = scanner.readLine();
//        }
//        System.out.println(sum);
//    }
//}


//public class Solution {
//
//    public static void main(String[] args) throws Exception {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        int a = Integer.parseInt(reader.readLine());
//        int b = Integer.parseInt(reader.readLine());
//        int c = Integer.parseInt(reader.readLine());
//        int d = Integer.parseInt(reader.readLine());
//        int e = Integer.parseInt(reader.readLine());
//
//        int minimum = min(a, b, c, d, e);
//
//        System.out.println("Minimum = " + minimum);
//    }
//
//
//    public static int min(int a, int b, int c, int d, int e) {
//        int min = Math.min(e, (Math.min(d, (Math.min(a, Math.min(b, c))))));
//        return min;
//    }
//}


//public class Solution {
//    public static void main(String[] args) throws Exception {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        int N = Integer.parseInt(reader.readLine());
//        int maximum = Integer.parseInt(reader.readLine());
//        if (N > 0) {
//            for (int i = 0; i < N - 1; i++) {
//                int number = Integer.parseInt(reader.readLine());
//                if (number > maximum) maximum = number;
//            }
//            System.out.println(maximum);
//        }
//    }
//}


///*
//Чётные и нечётные циферки
//*/
//
//public class Solution {
//
//    public static int even = 0;
//    public static int odd = 0;
//
//    public static void main(String[] args) throws IOException {
//        Scanner s = new Scanner(System.in);
//        int a = s.nextInt();
//        while (a!=0){
//            if(a%2 == 0){
//                even++;
//            }
//            else if (a%2 != 0) {
//                odd++;
//            }
//            a/=10;
//        }
//        System.out.println("Even: " + even + " Odd: " + odd);
//    }
//}

//public class Solution {
//    public static double getDistance(int x1, int y1, int x2, int y2) {
//        //напишите тут ваш код
//        double a = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
//        return a;
//    }
//
//    public static void main(String[] args) {
//
//    }
//}

//public class Solution {
//    public static String multiply(String s) {
//        String result = "";
//        //напишите тут ваш код
//        for (int i = 0; i < 5; i++) {
//            return s;
//        }
//        return result;
//    }
//
//    public static String multiply(String s, int count) {
//        String result = "";
//        //напишите тут ваш код
//        System.out.println();
//        for (int i = 1; i <= count; i++) {
//            System.out.print(s);
//        }
//        int a;
//
//        return result;
//    }
//
//    public static void main(String[] args) {
//        multiply("Amigo");
//        multiply("Amigo", 10);
//
//    }
//}


///*
//Контролируем массу тела
//*/
//
//public class Solution {
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
//        double weight = Double.parseDouble(bis.readLine());
//        double height = Double.parseDouble(bis.readLine());
//
//        Body.calculateMassIndex(weight, height);
//    }
//
//    public static class Body {
//        public static void calculateMassIndex(double weight, double height) {
//            // напишите тут ваш код
//            double massIndex = weight / (height * height);
//            String x = (massIndex < 18.5) ? "Недовес: меньше чем 18.5" :
//                    (massIndex > 18.5 && massIndex < 25) ? "Нормальный: между 18.5 и 25" :
//                            (massIndex > 25 && massIndex < 30) ? "Избыточный вес: между 25 и 30" :
//                                     "Ожирение: 30 или больше";
//            System.out.println(x);
//        }
//    }
//}


///*
//Калькулятор
//*/
//
//public class Solution {
//    public static int plus(int a, int b) {
//        //напишите тут ваш код
//        return a + b;
//    }
//
//    public static int minus(int a, int b) {
//        //напишите тут ваш код
//        return a - b;
//    }
//
//    public static int multiply(int a, int b) {
//        //напишите тут ваш код
//        return a * b;
//    }
//
//    public static double division(int a, int b) {
//        //напишите тут ваш код
//        double result1 = (double)a / b;
//        return result1;
//    }
//
//    public static double percent(int a, int b) {
//        //напишите тут ваш код
//        double percents = (double)a * (double)(b/100);
//        return percents;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(multiply(100, 5));
//        System.out.println(division(10, 12));
//        System.out.println(percent(20, 20));
//    }
//}

///*
//Кот и статика
//*/
//
//public class Solution {
//    public static void main(String[] args) {
//        // Создай 10 котов
//        for (int i = 0; i < 10; i++) {
//            Cat cat = new Cat();
//        }
//        // Выведи значение переменной catCount
//        System.out.println(Cat.catCount);
//    }
//
//    public static class Cat {
//        // Создай статическую переменную catCount
//        public static int catCount;
//        // Создай конструктор
//        public Cat () {
//            catCount ++;
//        }
//    }
//}

///*
//Блокнот для новых идей
//*/
//
//public class Solution {
//    public static void main(String[] args) {
//        printIdea(new Idea());
//    }
//    public static void printIdea(Idea idea) {
//        System.out.println(idea.getDescription());
//    }
//
//    //напишите тут ваш код
//    public static class Idea {
//        public String getDescription() {
//            return "Idea";
//        }
//    }
//}


///*
//Исправляем ошибки юности
//*/
//
//public class Solution {
//    public static int max = 100;
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//
//        String max = "The max is ";
//        int a = Integer.parseInt(reader.readLine());
//        int b = Integer.parseInt(reader.readLine());
//        int max1 = a > b ? a : b;
//
//        System.out.println(max + max1);
//    }
//
//}

///*
//Числа по возрастанию
//*/
//
//public class Solution {
//    public static void main(String[] args) {
//
//        Scanner input = new Scanner(System.in);
//        int[] mas = new int[5];
//        for (int i = 0; i < mas.length; i++)
//        {
//            mas[i] = input.nextInt();
//        }
//        boolean isSorted = false;
//        int buf;
//        while(!isSorted) {
//            isSorted = true;
//            for (int i = 0; i < mas.length-1; i++) {
//                if(mas[i] > mas[i+1]){
//                    isSorted = false;
//
//                    buf = mas[i];
//                    mas[i] = mas[i+1];
//                    mas[i+1] = buf;
//                }
//            }
//        }
//        for (int i = 0; i < 5; i++)
//            System.out.println(mas[i]);
//        //System.out.println(Arrays.toString(mas));
//    }
//}


///*
//Массивный максимум
//*/
//
//public class Solution {
//    public static void main(String[] args) throws Exception {
//        int[] array = initializeArray();
//        int max = max(array);
//        System.out.println(max);
//    }
//
//    public static int[] initializeArray() throws IOException {
//        // создай и заполни массив
//        int [] array = new int[3];
//        Scanner scan = new Scanner(System.in);
//        for (int i = 0; i < array.length; i++) {
//            array[i] = scan.nextInt();
//        }
//        return array;
//    }
//
//    public static int max(int[] array) {
//        // найди максимальное значение
//        int i;
//        // Initialize maximum element
//        int max = array[0];
//        for (i = 1; i < array.length; i++)
//            if (array[i] > max)
//                max = array[i];
//        return max;
//    }
//}


///*
//Массив из строчек в обратном порядке
//*/
//
//public class Solution {
//    public static void main(String[] args) throws Exception {
//        //напишите тут ваш код
//        String [] array = new String[1];
//        Scanner scan = new Scanner(System.in);
//        for (int i = 0; i < 1; i++) {
//            array[i] = scan.nextLine();
//        }
//        for (int i = array.length; i > 0; i--) {
//            System.out.println(array[i - 1]);
//        }
//    }
//}


///*
//Общение одиноких массивов
//*/
//
//public class Solution {
//    public static void main(String[] args) throws Exception {
//        //напишите тут ваш код
//        Scanner scan = new Scanner(System.in);
//        String [] stringArray = new String[3];
//        int [] intArray = new int[3];
//        for (int k = 0; k < stringArray.length; k++) {
//            stringArray [k] = scan.nextLine();
//            intArray [k] = stringArray[k].length();
//        }
//        for (int i = 0; i < intArray.length; i++){
//            System.out.println(intArray[i]);
//        }
//    }
//}


///*
//Переверни массив
//*/
//
//public class Solution {
//    public static void main(String[] args) throws Exception {
//        //напишите тут ваш код
//        Scanner scan = new Scanner(System.in);
//        int [] intArray = new int[3];
//        for (int i = 0; i < intArray.length; i++) {
//            intArray[i] = scan.nextInt();
//        }
//        for (int j = intArray.length; j > 0; j--) {
//            System.out.println(intArray[j-1]);
//        }
//    }
//}

///*
//Один большой массив и два маленьких
//*/
//
//public class Solution {
//    public static void main(String[] args) throws Exception {
//        //напишите тут ваш код
//        Scanner scan = new Scanner(System.in);
//        int [] arrBig = new int[4];
//        int n = arrBig.length;
//        int [] a = new int[(n+1)/2];
//        int [] b = new int[n - a.length];
//
//        for (int i = 0; i < arrBig.length; i++){
//            arrBig[i] = scan.nextInt();
//        }
//
//        for (int i = 0; i < n; i++) {
//            if (i < b.length) {
//                a[i] = arrBig[i];
//            } else {
//                b[i - a.length] = arrBig[i];
//            }
//        }
//
////        //OR
////        System.arraycopy(arrBig, 0, a, 0, a.length);
////        System.arraycopy(arrBig, a.length, b, 0, b.length);
//
//        System.out.println(Arrays.toString(b));
//    }
//}

/*
Улицы и дома
*/

public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) {
        //напишите тут ваш код
        strings = new ArrayList<String>();
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            strings.add(scan.nextLine());
        }
        int max = Integer.MIN_VALUE;
        for (String each: strings) {
            if (each.length() >= max) {
                max = each.length();
            }
        }
        for (int i = 0; i < strings.size(); i++)
        {
            if (strings.get(i).length() == max)
                System.out.println(strings.get(i));
        }

    }
}

