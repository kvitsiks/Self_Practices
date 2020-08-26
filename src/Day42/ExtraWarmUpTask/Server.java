package Day42.ExtraWarmUpTask;

import javax.crypto.spec.PSource;
import java.security.PublicKey;

public class Server {
    /*
    Extra Task:
Scenario: We will create three custom classes related around a restaurant
------------------------------------------------------------------
        Create a class called Server

            Attributes:
                name (String), employeeID (int), hourlyRate (double), fullTime (boolean)
            Actions: (all void methods)

                setInfo(): sets all of the instance variables with some values taken from the parameters.
                toString:
                takeOrder(): server's name + "is taking an order"
                cleanTable(): server's name + "is cleaning the table"
                toString(): Returns (String) all the information of a Server
                    -> Extra: For fullTime status, instead of printing a boolean value, print "full-time" or "part-time"
------------------------------------------------------------------
     */
    String name;
    int employeeID;
    double hourlyRate;
    boolean fullTime;

    public void setServerInfo(String name, int employeeID, double hourlyRate, boolean fullTime) {
        this.name = name;
        this.employeeID = employeeID;
        this.hourlyRate = hourlyRate;
        this.fullTime = fullTime;
    }

    public void takeOrder() {
        System.out.println(name + " is taking an order");
    }

    public void cleanTable() {
        System.out.println(name + " is cleaning the table");
    }

    public String toString() {
        if (fullTime) {
            return "Server's name is: " + name + ", ID is: " + employeeID + ", hourly rate is: " + hourlyRate + " " + ", full-time |";
        }
        else {
            return "Server's name is: " + name + ", ID is: " + employeeID + ", hourly rate is: " + hourlyRate + " " + ", part-time |";
        }

    }

}
