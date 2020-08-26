package Cybertek.CustomClasses.CalcII;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Calc {
    private int x;
    private int y;
    private int result;

    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public void plus(){
        result = x + y;
    }
    public void minus(){
        result = x - y;
    }
    public int getResult(){
        return result;
    }
}
