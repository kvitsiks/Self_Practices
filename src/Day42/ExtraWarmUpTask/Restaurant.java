package Day42.ExtraWarmUpTask;

import java.util.ArrayList;
import java.util.Arrays;

public class Restaurant {
    /*
      Create a class called Restaurant

            Attributes:
                Owner (String), Location (String), numberOfStars (int)
                Servers (ArrayList of Server objects)
                Chefs (ArrayList of Chef objects)
            Actions: (all void methods)

                setInfo(): sets the owner, location, and number of stars with the given parameters
                hireServer(Server server): accepts a server object and adds it to the Servers ArrayList
                hireServer(Server [] servers): accepts an array of Server objects and adds all of them to the Servers ArrayList
                hireServer(String name, int employeeID, double hourlyRate, boolean fullTime):
                this overloaded version accept the given parameters/information of a Server and
                will add the given Server to the ArrayList of Servers

                hireChef(Chef chef): accepts a chef object and adds it to the Chefs ArrayList
                hireChef(Chef [] chefs): accepts an array of Chef objects and adds all of them to the Chef ArrayList
                hireChef(String name, int employeeID, double hourlyRate, boolean fullTime):
                this overloaded version accept the given parameters/information of a Chef and
                will add the given Chef to the ArrayList of Chefs

        - Extra optional tasks
                terminateEmployee(String title, int employeeID): Create a method that will accept a String
                title which can only be "server" or "chef". If any other String is given it is invalid and
                the no action should be done (an error message can be given "invalid employee type").
                Once you know which type of employee you are terminating use their given employeeID in
                the correct ArrayList type and remove them (you can give a message if you want: "$name was terminated").
------------------------------------------------------------------
     */
    String owner;
    String location;
    int numberOfStars;
    ArrayList<Server> serversList = new ArrayList<>();
    ArrayList<Chef> chefsList = new ArrayList<>();

    public void setRestaurantInfo(String owner, String location, int numberOfStars) {
        this.owner = owner;
        this.location = location;
        this.numberOfStars = numberOfStars;
    }

    public void hireServer(Server server) {
        serversList.add(server);
    }

    public void hireServer(Server[] servers) {
        if (servers.length == 0) {
            return;
        }
        this.serversList.addAll(Arrays.asList(servers));
    }

    public void hireServer(String name, int employeeID, double hourlyRate, boolean fullTime) {
        Server server = new Server();
        server.name = name;
        server.employeeID = employeeID;
        server.hourlyRate = hourlyRate;
        server.fullTime = fullTime;
        serversList.add(server);
    }

    public void hireChef(Chef chef) {
        chefsList.add(chef);
    }

    public void hireChef(Chef[] chef) {
        if (chef.length == 0) {
            return;
        }
        this.chefsList.addAll(Arrays.asList(chef));
    }

    public void hireChef(String name, int employeeID, double hourlyRate, boolean fullTime) {
        Chef chef = new Chef();
        chef.name = name;
        chef.employeeID = employeeID;
        chef.hourlyRate = hourlyRate;
        chef.fullTime = fullTime;
        chefsList.add(chef);
    }

    public void terminateEmployee(String title, int employeeID) {
        if (title.toLowerCase().equals("server")) {
            serversList.removeIf(p -> p.employeeID == employeeID);
            for (Server each : serversList) {
                if (each.employeeID == employeeID) {
                    System.out.println(each.name + " was terminated");
                } else System.out.println("Incorrect ID");
            }
        } else if (title.toLowerCase().equals("chef")) {
            chefsList.removeIf(p -> p.employeeID == employeeID);
            for (Chef each : chefsList) {
                if (each.employeeID == employeeID) {
                    System.out.println(each.name + " was terminated");
                } else System.out.println("Incorrect ID");
            }
        } else {
            System.out.println("Invalid employee type, try again");
        }
    }

    public String toString() {
        return serversList.size() + " servers, " + chefsList.size() + " chefs, Owner: " + owner + ", Location: " + location + ", stars: " + numberOfStars;
    }
}
