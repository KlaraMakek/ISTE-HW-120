import java.util.Scanner;

/**
 *  Magic square
 * @author Klara Makek
 * @version 19.11.2022.
 * Course: ISTE-120
 * HW 10
 */
/************** JAVADOC ************************/
// * assesseMe desired to turn of and I didn't notice so im writing this again
// */
public class TestSquare {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Square test = new Square();

        do {
            System.out.print("Enter an integer(or x to exit): ");
            int i;

            try {
                i = Integer.parseInt(in.next());
            } catch (NumberFormatException e) {
                break;
            }
            if (i < 1) {
                System.out.println("****Invalid data****");
                continue;
            }
            test.add(i);
        } while (true);

        if (!test.isSquare()) {
            System.out.println(
                    "Step 1. Numbers do not make a square. Program stopped. \nPress any key to continue..... ");
            System.exit(0);
        }
        System.out.println("Step 1. Numbers make a square***");
        if (!test.isUnique()) {
            System.out.println("Step 2. Number are not unique. Program stopped. \nPress any key to continue..... ");
            System.exit(0);
        }
        System.out.println("Step 2. Numbers are unique ***");

        if (test.isMagic()) {
            System.out.println("Step 3. Yes, it is a Magic square! ***");
        } else {
            System.out.println("Step 3. But it is not a Magic Square.****");
        }
        in.close();
    }
}
