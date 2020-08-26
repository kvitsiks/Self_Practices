package Day41;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CatObjects {
    public static void main(String[] args) {

        Cat[] cats = {new Cat(), new Cat(), new Cat(), new Cat(), new Cat()};

        cats[0].setCatInfo("Vas'ka", 3, "m", "black");
        cats[1].setCatInfo("Tom", 2, "m", "white");
        cats[2].setCatInfo("Murzik", 5, "m", "brown");
        cats[3].setCatInfo("Bon'ka", 1, "f", "red");
        cats[4].setCatInfo("Mashka", 4, "f", "gray");

//        for (int i = 0; i < cats.length; i++) {
//            System.out.println(cats[i]);
//        }
        ArrayList<Cat> maleCats = new ArrayList<>();
        ArrayList<Cat> femaleCats = new ArrayList<>();

//        for (int i = 0; i < cats.length; i++) {
//            if (cats[i].gender.equals("m")) maleCats.add(cats[i]);
//        }
//        System.out.println("Male Cats are: " + maleCats);

        for (Cat each : cats) {
            if (each.gender.equals("m")) maleCats.add(each);
        }
        //System.out.println("Male Cats are: " + maleCats);


//        for (int i = 0; i < cats.length; i++) {
//            if (cats[i].gender.equals("f")) femaleCats.add(cats[i]);
//        }
//        System.out.println("Female Cats are: " + femaleCats);

        for (Cat each : cats) {
            if (each.gender.equals("f")) femaleCats.add(each);
        }
        //System.out.println("Female Cats are: " + femaleCats);

        System.out.println("The number of male cats is: " + maleCats.size());
        System.out.println("The number of female cats is: " + femaleCats.size());
    }
}
