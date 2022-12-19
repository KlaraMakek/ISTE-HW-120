import java.util.Scanner;

/**
 * Toin coss and arrays
 * 
 * @author Klara Makek
 * @version 11.11.2022.
 *          Course: ISTE-120
 *          HW 09
 */
public class TestToinCoss {
    public static void main(String[] args) {
        // scanner
        Scanner test = new Scanner(System.in);

        // loop for truth
        while (true) {
            // print...
            System.out.print("\nEnter integer that is more then 1 for number of tosses: ");
            // scanner
            int numbToss = test.nextInt();
            // if number of tosses les then 1 then exit
            if (numbToss < 1) {
                System.out.println("Exit");
                System.exit(0);
            }
            // constructor
            ToinCoss testTC = new ToinCoss(numbToss);
            // print
            System.out.printf(testTC.toString(), testTC.getNumbOfTos(), testTC.getHeads() / numbToss,
                    testTC.getTails() / numbToss, testTC.getRunLong(), testTC.getOutcome());
        }
    }
}
