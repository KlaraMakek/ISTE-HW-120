import java.util.Scanner;

/**
 * A program to calculate car purchase information
 * @author Klara Makek
 * @version 19.10.2022.
 * Course: ISTE-120
 * HW06
 */
/************** JAVADOC ************************/
public class TestNewCar {
    public static void main(String[] args) {
        /**
         * initialize scanner
         */

        Scanner car = new Scanner(System.in);
        // prints...
        System.out.print("Enter the car's Year, Make and Model: ");
        String year = car.next(); // scans the year
        String make = car.next(); // scans the make
        String model = car.next();// scans the model

        // prints...
        System.out.print("Enter the Sticker Price: ");
        // scans for the sticker price
        double sticker_price = car.nextDouble();

        // prints...
        System.out.print("Enter the Discount: ");
        // scans for the discount
        double discount = car.nextDouble();

        // prints...
        System.out.print("Enter the Sales Tax Rate: ");
        // scans for the sales tax
        double sales_tax = car.nextDouble();

        // prints...
        System.out.print("Enter the Number of Months at Zero Percent Interest: ");
        // scans for the number of months
        int numberMonth = car.nextInt();

        // initialize car 1
        NewCar car1 = new NewCar(year, make, model);
        car1.sticker_price(sticker_price);
        car1.discount(discount);
        car1.sales_tax(sales_tax);
        car1.numberMonth(numberMonth);
        // prints...
        System.out.print(car1);

        // close scanner car
        car.close();
    }
}
