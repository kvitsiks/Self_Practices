package Day55_Abstraction.ShapeTask;
/*
 1. create an abstract class called Shape
        attributes:
            name(static), area, perimeter, hasVolume(static), volume
        abstract methods: calculateArea(), calculatePerimeter, calculateVolume()
                            return-types: double
    5. create the following sub classes of shapes:
                Square
                Triangle
                Cube
                ...
                and repeat the same steps
 */
public abstract class Shape { //cannot create object, can't be final

    public String name;
    public boolean hasVolume;
    public double area;
    public double perimeter;
    public double volume;
    public static final double pi = Math.PI;

    public abstract double calculateArea();
    public abstract double calculatePerimeter();
    public abstract double calculateVolume();

    public String toString(){
        return "name: " + name + ", area: " + area + ", perimeter: " + perimeter + ", hasVolume: " + hasVolume + ", volume: " + volume;
    }
}
