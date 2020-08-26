package Day45_Constructor;
/*
Task02:
        Create class called SalaryCalculator
                instance variables:
                    hourlyRate, weeklyHours, stateTaxRate, fedralTaxRate
                add a constructor can initialize those fields
                instance methods:
                    salary(): returns the total salary as double  (hourlyRate * weeklyHours * 48)
                    salaryAftertax(): retuns the salary after tax as double ( salary - stateTax - federalTax)
                    stateTax(): retuns the total state tax as double ( salary * stateTaxRate)
                    federalTax(): retuns the total federal tax as double ( salary * fedralTaxRate)

                    toString(): returns the hourlyRate, weeklyHours and salary info as calculated by salary()

 */

public class SalaryCalculator {
    double hourlyRate;
    int weeklyHours;
    double stateTaxRate;
    double federalTaxRate;

    public SalaryCalculator(double hourlyRate, int weeklyHours, double stateTaxRate, double federalTaxRate){
        this.hourlyRate = hourlyRate;
        this.weeklyHours = weeklyHours;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
    }
    public double salary(){
        return hourlyRate * weeklyHours * 48;
    }
    public double stateTax(){
        return salary() * stateTaxRate;
    }
    public double federalTax(){
        return salary() * federalTaxRate;
    }
    public double salaryAftertax(){
        return salary() - federalTax() - stateTax();
    }
    public String toString(){
        return "\nhourlyRate " + hourlyRate + ", weeklyHours " + weeklyHours + ", salary is " + salary() + ", salary after tax is " + salaryAftertax();
    }
}
