package Day42.ExtraWarmUpTask;

import java.util.ArrayList;
import java.util.Arrays;

public class LocalRestaurant {
    /*
    Create a class LocalRestaurant that has a main method with the following:
            - Make a Restaurant object
            - Create an array of servers with their information set. Add those initial servers to the ArrayList of Servers
            - Create an array of chefs with their information set. Add those initial chefs to the ArrayList of Chefs
            - Print your whole restaurants information
            - After setting everything up spend some time interacting with the objects, try to call the methods of the objects,
            access the instance variables.
        - Extra optional tasks (Should still be done in the LocalRestaurant main method)
            - Find out the cost of all the employees (servers + chefs) by checking all of their hourly rates
            - Make two new ArrayLists that will separate all the employees (servers + chefs) by full time and part time.
            Their position of server or chef does not matter for these ArrayList, only their employment status
            - Make sure the Restaurant is staffed enough for the level of stars it is using the following requirements:
                5 stars: need at least 6 chefs and 10 servers
                4 stars: need at least 3 chefs and 7 servers
                3 stars: need at least 1 chefs and 4 servers

                - if the restaurant does not have the correct number of chefs or servers based on their number of stars you should print a message: "Need to hire more $chefs or $servers (maybe both). Otherwise you can print: "Up to standard"
------------------------
     */

    public static void main(String[] args) {
        Restaurant restaurant1 = new Restaurant();
        restaurant1.setRestaurantInfo("Billy English", "Austin, TX", 5);

        Server[] servers = {new Server(), new Server(),new Server()};
        servers[0].setServerInfo("Bob", 1234, 15, true);
        servers[1].setServerInfo("Bill", 2345, 12, false);
        servers[2].setServerInfo("Pedro", 3456, 16, true);
        restaurant1.hireServer(servers);
        System.out.println(Arrays.toString(servers));

        Chef[] chefs = {new Chef(), new Chef(),new Chef()};
        chefs[0].setChefInfo("John", 4567, 30, true);
        chefs[1].setChefInfo("Jessica", 5678, 35, true);
        chefs[2].setChefInfo("Dillon", 6789, 40, true);
        restaurant1.hireChef(chefs);
        System.out.println(Arrays.toString(chefs));

        System.out.println(restaurant1);

        restaurant1.terminateEmployee("server", 1234);
        System.out.println(restaurant1);
    }
}
