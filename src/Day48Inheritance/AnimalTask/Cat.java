package Day48Inheritance.AnimalTask;

public class Cat extends Animal {

    public Cat(String name, String size, int age, char gender, String breed) {
        setInfo(name, size, age, gender, breed);
    }
    public void meow(){
        System.out.println(name + " is meowing");
    }
}
