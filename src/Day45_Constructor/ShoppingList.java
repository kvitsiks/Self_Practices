package Day45_Constructor;

import java.util.ArrayList;
import java.util.Arrays;

public class ShoppingList {
    public static void main(String[] args) {
        Item apple = new Item("Apple", 1,5);
        Item orange = new Item("Orange", 2,8);
        Item banana = new Item("Banana", 0.5,10);
        Item lambMeet = new Item("Lamb",5,10);
        Item iceCream = new Item("IceCream",10,1);

        ArrayList<Item> list = new ArrayList<>();

        list.addAll(Arrays.asList(apple, orange, banana, lambMeet, iceCream));

        double totalCost = 0;
        for (Item each : list) {
            totalCost += each.calcCost();
        }
        System.out.println("Total cost: " + totalCost);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
        Item[] items = {apple, orange, banana, lambMeet, iceCream};
        double totalCost2 = 0;
        for (int i = 0; i < items.length; i++) {
            totalCost2 += items[i].calcCost();
        }
        System.out.println("Total cost 2: " + totalCost2);
    }
}
