package Day45_Constructor;

import java.util.ArrayList;
import java.util.Arrays;

public class EmpSalary {
    public static void main(String[] args) {
        SalaryCalculator emp1 = new SalaryCalculator(16, 40, 0.05, 0.06);
        SalaryCalculator emp2 = new SalaryCalculator(25, 40, 0.03, 0.06);
        SalaryCalculator emp3 = new SalaryCalculator(50, 40, 0, 0.06);
        SalaryCalculator emp4 = new SalaryCalculator(18, 40, 0.07, 0.06);
        SalaryCalculator emp5 = new SalaryCalculator(60, 40, 0, 0.06);

        ArrayList<SalaryCalculator> list = new ArrayList<>();
        list.addAll(Arrays.asList(emp1, emp2, emp3, emp3, emp4, emp5));
        System.out.println(list);

//        double em1Salary = emp1.salary();
//        double em1SalaryAfterTax = emp1.salaryAftertax();
//
//        System.out.println("em1Salary = " + em1Salary);
//        System.out.println("em1SalaryAfterTax = " + em1SalaryAfterTax);


        double salaryBeforeTax = 0;
        double salaryAfterTax = 0;
        int k = 1;
        for (SalaryCalculator each : list) {
            salaryBeforeTax = each.salary();
            System.out.println("salaryBeforeTax for employee " + k + " = " + salaryBeforeTax);
            salaryAfterTax = each.salaryAftertax();
            System.out.println("salaryAfterTax for employee " + k + " = " + salaryAfterTax);
            k++;
        }

    }
}
