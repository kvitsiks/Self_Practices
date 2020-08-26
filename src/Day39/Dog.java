package Day39;

import java.sql.SQLOutput;

public class Dog {
    String name;
    String breed;
    String size;
    int age;
    String color;

    public void setDogInfo(String name, String breed, String size, int age, String color) {
        this.name = name;
        this.breed = breed;
        this.size = size;
        this.age = age;
        this.color = color;
    }
    public void getDogInfo() {
        System.out.println("Dogs's name is " + name + ", breed is " + breed + ", and color is " + color);
    }
    public void eat(String food){
        System.out.println(name + " eats " + food);
    }
    public void drink(String drink){
        System.out.println(name + " drinks " + drink);
    }
    public void bark(boolean bark){
        System.out.println(name + " barks " + bark);
    }
}
