package Day50InheritanceOverriding.ShapeTask;

import org.w3c.dom.css.Rect;

public class Rectangle extends Shape {
    /*
2. create sub classes of Shape:
                        Circle
                        Rectangle
                        Square
             give the instance variables that are needed to calculate the Area, perimeter, of those shapes
    AFTER TODAY'S TOPIC:
        3. override super class' calculateArea(), calculatePerimeter() methods to the sub classes:
                Area of the circle:    3.14 * radius * radius
                Area of the rectangle:  width * length
                Area of the square:    side * side
                Perimeter of circle:   3.14 * 2 * radius
                Perimeter of rectangle: (width + length) * 2
 */
    public double width, length;

    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
        area = calculateArea();
        perimeter = calculatePerimeter();
    }

    public double calculateArea(){
        return width * length;
    }
    public double calculatePerimeter(){
        return (width + length) * 2;
    }
}
