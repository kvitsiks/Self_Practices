package Day41;

import java.util.ArrayList;
import java.util.Arrays;

public class CatObjects2 {
    public static void main(String[] args) {
        Cat[] cats = {new Cat(), new Cat(),new Cat(),new Cat(),new Cat()};

        cats[0].setCatInfo("Vas'ka", 3, "m", "black");
        cats[1].setCatInfo("Tom", 2, "m", "white");
        cats[2].setCatInfo("Murzik", 5, "m", "brown");
        cats[3].setCatInfo("Bon'ka", 1, "f", "red");
        cats[4].setCatInfo("Mashka", 4, "f", "gray");

        ArrayList<Cat> maleCats = new ArrayList<>(Arrays.asList(cats));
        ArrayList<Cat> femaleCats = new ArrayList<>(Arrays.asList(cats));

        maleCats.removeIf(p -> p.gender.equals("f"));
        System.out.println(maleCats);
        femaleCats.removeAll(maleCats);
        System.out.println(femaleCats);
    }
}
