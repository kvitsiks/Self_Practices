package Day55_Abstraction.ShapeTask;

import java.text.DecimalFormat;

/*
2. create a sbub class of shape called Circle (meant to be subclass ONLY)
            attributes: radius, name(static), area, perimeter, hasVolume(static), volume
            override the abstract methods
            (if the shape does not have volume, return 0 for the colume)
            add a constructor that takes an argument for radius of the circle and initialize the instance variables:
            radius, area, perimeter, volume
            add a static block that can initialize the static variables of the circle
 */
public final class Circle extends Shape {

    public int radius;
    //inherited from the super class
//    public double area;
//    public double perimeter;
//    public double volume;
//    public static String name;
//    public static boolean hasVolume;

    public Circle(int radius) {
        if (radius <= 0) {
            throw new RuntimeException("Radius can't be 0 or negative");
        }
        this.name = "Circle";
        this.radius = radius;
        area = calculateArea();
        perimeter = calculatePerimeter();
        volume = calculateVolume();
    }

    @Override
    public double calculateArea() {
        return Math.pow(radius, 2) * pi;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * radius * pi;
    }

    @Override
    public double calculateVolume() {
        return 0;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        return name + " " +
                "radius= " + radius +
                ", area= " + df.format(area) +
                ", perimeter= " + df.format(perimeter) +
                ", volume= " + df.format(volume);
    }
}

