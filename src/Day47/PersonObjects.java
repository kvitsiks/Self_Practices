package Day47;

import java.time.LocalDate;

public class PersonObjects {
    public static void main(String[] args) {
        Person person1 = new Person("Sergio", 22, 'M', LocalDate.of(1985, 01, 22));
        person1.setSsn(123456789);
        person1.setAddress("Austin");
        person1.setID(1234);


    }
}
