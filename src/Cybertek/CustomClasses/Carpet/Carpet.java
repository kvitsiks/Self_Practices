package Cybertek.CustomClasses.Carpet;

public class Carpet {
    //do not change -- Start
    public double width,length,unitPrice,totalPrice;
    public boolean isPersian;
    //do not change -- End

    //Add constructors below
    public Carpet(double width, double length, double unitPrice, boolean isPersian){
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
        if (isPersian) {
            totalPrice = (width + length) * unitPrice + 200;
        } else
        totalPrice = (width + length) * unitPrice;
    }
    public Carpet(){
        width = 300;
        length = 300;
        unitPrice = 0;
        totalPrice = 200;
        isPersian = false;
    }
}