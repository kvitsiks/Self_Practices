package Day42;

public class Circle {
    double radius;
    double diameter;
    static double pi;

    public void setInfo(double radius){
        this.radius = radius;
        diameter = radius * 2;
    }
    public double calcArea(){
        return radius * radius * pi;
    }
    public double calcPerimeter(){
        return diameter * pi;
    }
    public String toString(){
        return "Area is: " + calcArea() + "\nPerimeter is: " + calcPerimeter();
    }

}
