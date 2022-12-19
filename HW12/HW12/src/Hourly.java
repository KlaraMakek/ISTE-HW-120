/**
 *  Company thing
 * @author Klara Makek
 * @version 29.11.2022.
 * Course: ISTE-120
 * HW 12
 */
/************** JAVADOC ************************/
public class Hourly implements Company {
    private String name;
    private String ssn;
    private double hourlyRate;
    private double avgHoursPerWeek;

    private int standard = 40;
    private double overtime = 1.5;

    public Hourly(String name, String ssn, double hourlyRate, double avgHoursPerWeek) {
        this.name = name;
        this.ssn = ssn;
        this.hourlyRate = hourlyRate;
        this.avgHoursPerWeek = avgHoursPerWeek;
    }

    public Hourly() {
        name = "";
        ssn = "";
        hourlyRate = 0;
        avgHoursPerWeek = 0;
    }

    @Override
    public void setPay(double pay) {
        hourlyRate = pay;

    }

    @Override
    public double calcAnnualPay() {
        return (hourlyRate * weepPaid * standard);
    }

    @Override
    public double calcWeeklyPay() {
        if (avgHoursPerWeek <= standard) {
            return ((avgHoursPerWeek * hourlyRate));
        } else {
            return (hourlyRate * weepPaid) + ((avgHoursPerWeek - standard) * hourlyRate * overtime);
        }
    }

    @Override
    public String toString() {
        return String.format(
                "Name: %s\nSSN: %s\n%-20sAverage Hours Worked: %.2f \n%-20sAnnual Salary: $%.2f\n%-20sAnnual Pay: $%.2f\n%-20sWeekly pay: $%.2f",
                name, ssn, avgHoursPerWeek, hourlyRate, calcAnnualPay(), calcWeeklyPay());
    }

}
