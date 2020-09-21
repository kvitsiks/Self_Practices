package Day48Inheritance.AnimalTask;

public class AnimalObjects {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Rex", "Medium", 5, 'M', "shavka");
        dog1.eat();
        dog1.sleep();
        dog1.bark();
        System.out.println("==========================");
        System.out.println(dog1);
        System.out.println("==========================");
        Cat cat1 = new Cat("Shipa", "Small", 3, 'F', "unknown");
        cat1.meow();
        System.out.println(cat1);
    }
}
