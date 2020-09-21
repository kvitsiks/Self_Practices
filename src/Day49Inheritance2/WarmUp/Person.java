package Day49Inheritance2.WarmUp;

public class Person {
    /*
    warmup tasks:
        create a class called Person
                attributes:  name, age, gender
                methods: eat, walk, sleep, setPersonInfo
     */
    public String name;
    public int age;
    public char gender;
    private long ssn;

    public long getSsn(){
        return ssn;
    }
    public void setSsn(long ssn){
        this.ssn = ssn;
    }

    private void eat(){ //we don't want this to be inherited
        System.out.println(name + " is eating...");
    }
    private void walk(){
        System.out.println(name + " is walking...");
    }
    public void sleep(){
        System.out.println(name + " is sleeping...");
    }
    public void setPersonInfo(String name, int age, char gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}
