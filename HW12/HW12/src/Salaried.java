/**
 *  Company thing
 * @author Klara Makek
 * @version 29.11.2022.
 * Course: ISTE-120
 * HW 12
 */
/************** JAVADOC ************************/
public class Salaried implements Company{
    private String name;
    private String ssn;
    private double hourlyRate;
    private double healthInsDeduction = 125.50;


    public Salaried(String name, String ssn, double hourlyRate) {
        name = "";
        ssn = "";
        hourlyRate = 0;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getSsn() {
        return ssn;
    }


    public void setSsn(String ssn) {
        this.ssn = ssn;
    }


    public double getHourlyRate() {
        return hourlyRate;
    }


    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }


    public double getHealthInsDeduction() {
        return healthInsDeduction;
    }


    public void setHealthInsDeduction(double healthInsDeduction) {
        this.healthInsDeduction = healthInsDeduction;
    }


    public double calcAnnualPay(){
        return calcWeeklyPay() * weepPaid;
    }
    public double calcWeeklyPay(){
        return (double)((hourlyRate / weepPaid) - healthInsDeduction);
    }

    @Override
    public String toString() {
        return String.format("Name: %s\nSSN: %s\n%-20sAnnual Salary: $%.2f\n%-20sAnnual Pay: $%.2f\n%-20sWeekly pay: $%.2f", name, ssn, hourlyRate, calcAnnualPay(), calcWeeklyPay());
    }


    @Override
    public void setPay(double pay) {
        hourlyRate = pay;
    }


    
}
