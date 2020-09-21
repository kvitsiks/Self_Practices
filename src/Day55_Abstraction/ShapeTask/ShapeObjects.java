package Day55_Abstraction.ShapeTask;
/*
6. create a class called shape objects:
            create objects of each shapes and calculate thier area, perimeter, and volume
    HINT: Math.PI will give you the actual value of PI
 */
public class ShapeObjects {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(5, 4);
        Cylinder cylinder = new Cylinder(6, 3);

        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(cylinder);
    }
}
