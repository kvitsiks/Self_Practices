package Day55_Abstraction.ShapeTask;

import java.text.DecimalFormat;

/*
 3. create a sub class of shape called Rectangle
            attributes: width, length, name(static), area, perimeter, hasVolume(static), volume
            override the abstract methods
            (if the shape does not have volume, return 0 for the colume)
            add a constructor that takes two arguments for W & L of rectangle the and initialize
            the instance variables: width, length, area, perimeter, volume
            add a static block that can initialize the static variables of the rectangle
 */
public final class Rectangle extends Shape {

    public double width, length;
    //inherited from the super class
//    public double area;
//    public double perimeter;
//    public double volume;
//    public static String name;
//    public static boolean hasVolume;


    public Rectangle(double width, double length) {
        if (width <= 0 || length <= 0) {
            throw new RuntimeException("Width or length can't be 0 or negative");
        }
        this.name = "Rectangle";
        this.width = width;
        this.length = length;
        area = calculateArea();
        perimeter = calculatePerimeter();
        volume = calculateVolume();
    }

    @Override
    public double calculateArea() {
        return width * length;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (width + length);
    }

    @Override
    public double calculateVolume() {
        return 0;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        return name + " " +
                "width= " + width +
                ", length= " + length +
                ", area= " + df.format(area) +
                ", perimeter= " + df.format(perimeter) +
                ", volume= " + volume;
    }
}
