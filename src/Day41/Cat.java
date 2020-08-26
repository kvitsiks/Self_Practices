package Day41;

import javax.sound.midi.Soundbank;
/*
Task:
    Cat:
        attributes:
                name, age, gender, color, breed
        Actions:
                setInfo, eat, drink, toString
                use this. keyword
    Make sure that you can print out the objects of the Cat in the print statement
    CatObjects:
            create 5 objects of Cat and store them into an array variable
            print out the informations of every single cat
                    (DO NOT use getInfo method)
            ArrayList:
                maleCats
                femaleCats
                first approach: apply loop ( both for each loop and for loop)
                second approach: do not use loop

 */

public class Cat {

    String name;
    int age;
    String gender;
    String color;

    public void setCatInfo(String name, int age, String gender, String color) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.color = color;
    }
    public void eat(String food){
        System.out.println("Cat eats " + food);
    }
    public void drink(String drink){
        System.out.println("Cat eats " + drink);
    }
    public String toString(){
        return "Cat's name is " + name + " age is " + age + " gender is " + gender + " color is " + color + "|||";
    }
}
