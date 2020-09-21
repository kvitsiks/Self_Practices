package Day50InheritanceOverriding.ShapeTask;

public class Shape {
    /*
            1. create a class called Shape
                        vairables: area, perimeter
                        methods: calculateArea(), calculatePerimeter()
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
    public double area;
    public double perimeter;

    public double calculateArea(){
        return 0;
    }
    public double calculatePerimeter(){
        return 0;
    }
}
