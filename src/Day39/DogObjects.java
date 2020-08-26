package Day39;

public class DogObjects {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();

        dog1.setDogInfo("Vasia", "taxa", "small", 4, "brown");
        dog1.getDogInfo();
        System.out.println("_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+");
        dog2.setDogInfo("Bobik", "shavka", "little", 10, "white");
        dog2.getDogInfo();
        System.out.println("_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+");
        dog3.setDogInfo("Rex", "pitbul", "medium", 2, "black");
        dog3.getDogInfo();
        System.out.println("_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+");

        dog1.eat("bones;");
        dog2.eat("dog's food;");
        dog3.eat("people;");
        System.out.println("_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+");
        dog1.drink("milk");
        dog2.drink("water");
        dog3.drink("blood");
        System.out.println("_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+");
        dog1.bark(true);
        dog1.bark(false);
        dog1.bark(true);
    }

}
