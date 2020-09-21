package Day53_FinalKeyword;

import Day42.ExtraWarmUpTask.LocalRestaurant;

import java.time.LocalDate;

public class FinalVariable {
    public static void main(String[] args) {
        final LocalDate dateOfBirth = LocalDate.of(2000, 12, 01);
        //dateOfBirth = LocalDate.of(2001, 11, 01);
        System.out.println(dateOfBirth);
    }
}
