package Cybertek.Quizes;

import sun.font.CStrike;

import java.io.IOException;

public class quiz {
    static int a = 50;
    public static void main(String[] args) throws RuntimeException {
        a = 100;
        try {
            a = 200;
        } catch (Exception e){
            a = 300;
        } finally {
            a = 400;
        }
        System.out.println(a);
    }
    static {
        a = 500;
    }

}
