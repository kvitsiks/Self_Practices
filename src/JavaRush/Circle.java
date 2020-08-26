package JavaRush;

///*
//Вызов конструктора из конструктора
//*/
//
//public class Circle {
//
//    public double x;
//    public double y;
//    public double radius;
//
//    public Circle(double x, double y, double radius) {
//        this.x = x;
//        this.y = y;
//        this.radius = radius;
//    }
//
//    public Circle(double x, double y) {
//        //напишите тут ваш код
//        this(x,y, 10.0);
//        this.x = x;
//        this.y = y;
//        this.radius = 10.0;
//    }
//
//    public Circle() {
//        this(5, 5, 1);
//    }
//
//    public static void main(String[] args) {
//        Circle circle = new Circle();
//        System.out.println(circle.x + " " + circle.y + " " + circle.radius);
//        Circle anotherCircle = new Circle(10, 5);
//        System.out.println(anotherCircle.x + " " + anotherCircle.y + " " + anotherCircle.radius);
//    }
//}



///*
//Конструктор
//*/
//
//public class Circle {
//    public Color color;
//
//    public static void main(String[] args) {
//        Circle circle = new Circle();
//        circle.color.setDescription("Red");
//        System.out.println(circle.color.getDescription());
//    }
//
//    public Circle() {
//       Color color = new Color();
//       this.color = color;
//    }
//
//    public class Color {
//        String description;
//
//        public String getDescription() {
//            return description;
//        }
//
//        public void setDescription(String description) {
//            this.description = description;
//        }
//    }
//}

