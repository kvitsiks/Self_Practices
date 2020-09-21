package Day55_Abstraction.ShapeTask;

import java.text.DecimalFormat;

/*
 4. create a sub class of shape called Cylinder
            attributes: radius, height, name(static), area, perimeter, hasVolume(static), volume
            override the abstrat methods
            add a constructor that takes two arguments for r & h of the cylinder  and initialize the instance variables: radius, height, perimeter, area, and volume
            add a static block that can initialize the static variables of the cylinder
 */
public final class Cylinder extends Shape {

    public int radius;
    public int height;
    //inherited from the super class
//    public double area;
//    public double perimeter;
//    public double volume;
//    public static String name;
//    public static boolean hasVolume;


    public Cylinder(int radius, int height){
        if (radius <= 0 || height <= 0) {
            throw new RuntimeException("Radius or height can't be 0 or negative");
        }
        this.name = "Cylinder";
        this.radius = radius;
        this.height = height;
        area = calculateArea();
        perimeter = calculatePerimeter();
        volume = calculateVolume();
    }

    @Override
    public double calculateArea() {
        return radius*height*Math.PI;
    }
    @Override
    public double calculatePerimeter() {
        return (2*Math.PI*height)+(4*Math.PI*Math.pow(radius,2));
    }
    @Override
    public double calculateVolume() {
        return Math.pow(radius,2)*height*Math.PI;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        return name + " " +
                "radius= " + radius +
                ", height= " + height +
                ", area= " + df.format(area) +
                ", perimeter= " + df.format(perimeter) +
                ", volume= " + df.format(volume);
    }
}
