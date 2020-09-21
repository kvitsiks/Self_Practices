package Day52;
/*
Task01:
    1. create a class called Person
            attributes:
                name, age, gender
            add a constructor that can initialize the attributes
            generate a toString method that can print any Person object
 */

public class Person {
    String name;
    int age;
    String gender;

    public Person(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String toString(){
        return name + "is a " + gender + " who is " + age + " years old" ;
    }
}
