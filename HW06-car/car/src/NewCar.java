/**
 * A program to calculate car purchase information
 * @author Klara Makek
 * @version 19.10.2022.
 * Course: ISTE-120
 * HW06
 */
/************** JAVADOC ************************/
public class NewCar {
    // initialize
    private String year;
    private String make;
    private String model;
    private double sticker_price;
    private double discount;
    private double sales_tax;
    private int numberMonth;
    private String abb;

    // starter
    public NewCar(String year, String make, String model) {
        this.year = year;
        this.make = make;
        this.model = model;
        sticker_price = 0;
        discount = 0;
        sales_tax = 0;
        numberMonth = 0;
        // calculating the abbreviation
        abb = year.substring(2, 4) + make.substring(0, 1) + model.substring(0, 1);
    }

    /**
     * sets the sticker price
     * 
     * @param sticker_price
     */
    public void sticker_price(double sticker_price) {
        this.sticker_price = sticker_price;
    }

    /**
     * sets the discount
     * 
     * @param discount
     */
    public void discount(double discount) {
        this.discount = discount;
    }

    /**
     * sets the sales tax
     * 
     * @param sales_tax
     */
    public void sales_tax(double sales_tax) {
        this.sales_tax = sales_tax;
    }

    /**
     * sets the number of months
     * 
     * @param numberMonth
     */
    public void numberMonth(int numberMonth) {
        this.numberMonth = numberMonth;
    }

    /**
     * calculates the sales tax
     * 
     * @return sales_tax
     */
    public double getSales_tax() {
        return (sticker_price - discount) * (sales_tax / 100);
    }

    /**
     * calculates the final cost of the car
     * 
     * @return calcFinalPrice
     */
    public double calcFinalPrice() {
        return (sticker_price - discount) + getSales_tax();
    }

    /**
     * Calculates the percentage of the monthly payments
     * 
     * @param numberMonth double
     * @return the calcZeroPctMonPmt
     */
    public double calcZeroPctMonPmt(int numberMonth) {
        return calcFinalPrice() / numberMonth;
    }

    /**
     * string to print the end result
     */
    public String toString() {
        return String
                .format("\nYou want to purchase a: " + year + " " + make + " " + model + ", Abbreviation: " + abb
                        + "\nFinal Price: " + calcFinalPrice()
                        + "\nMonthly Payment at zero percent:  %.2f", calcZeroPctMonPmt(numberMonth));
    }
}
