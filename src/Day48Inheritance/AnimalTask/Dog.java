package Day48Inheritance.AnimalTask;

public class        Dog         extends     Animal {
             //subClass(child)         superClass(parent)

    public void bark() {
        System.out.println(name + " is barking");
    }
    public Dog(String name, String size, int age, char gender, String breed){
        setInfo(name, size, age, gender, breed);
    }

}
