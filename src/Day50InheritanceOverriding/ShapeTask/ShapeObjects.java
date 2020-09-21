package Day50InheritanceOverriding.ShapeTask;

import com.sun.webkit.dom.RectImpl;

public class ShapeObjects {
    public static void main(String[] args) {
        Circle circle = new Circle(3);
        System.out.println("Circle area is: " + circle.calculateArea());
        System.out.println("Circle perimeter is: " + circle.calculatePerimeter());
        System.out.println("=================================");

        Rectangle rectangle = new Rectangle(3,4);
        System.out.println("Rectangle area is: " + rectangle.calculateArea());
        System.out.println("=================================");
    }
}
