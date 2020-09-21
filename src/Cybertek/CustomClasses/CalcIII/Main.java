package Cybertek.CustomClasses.CalcIII;

import Cybertek.CustomClasses.CalcIII.Calc;

public class Main {
    public static void main(String[] args) {

        Calc a = new Calc();
        a.setX(10);
        a.setY(30);
        a.minus();
        System.out.println("1+1 = "+ a.getResult());//1+1 = 2

    }
}