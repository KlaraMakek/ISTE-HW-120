/**
 * A program to calculate car purchase information part 2
 * @author Klara Makek
 * @version 12.11.2022.
 * Course: ISTE-120
 * HW 09
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
    private double finalPrice = 0;

    // starter
    public NewCar(String year, String make, String model, double sticker_price, double discount, double sales_tax) {
        this.year = year;
        this.make = make;
        this.model = model;
        // calculating the abbreviation
        abb = year.substring(2, 4) + make.substring(0, 1) + model.substring(0, 1);
        calcFinalPrice(sticker_price, discount, sales_tax);
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
        return (sticker_price - discount) * (sales_tax);
    }

    /**
     * accessor for final price
     * 
     * @return
     */
    public double getFinalPrice() {
        return finalPrice;
    }

    /**
     * calculates the final cost of the car
     * 
     * @return calcFinalPrice
     */
    public double calcFinalPrice(double sticker_price, double discount, double sales_tax) {
        finalPrice = (sticker_price - discount) + ((sticker_price - discount) * (sales_tax));
        return finalPrice;
    }

    /**
     * Calculates the percentage of the monthly payments
     * 
     * @param numberMonth double
     * @return the calcZeroPctMonPmt
     */
    public double calcZeroPctMonPmt(int numberMonth) {
        return getFinalPrice() / numberMonth;
    }

    /**
     * string to print the end result
     */
    public String toString() {
        return String.format("You want to purchase a %s %s %s \n Abbreviaton: %s \n %.1f", year, make, model, abb,
                getFinalPrice());
    }
}
