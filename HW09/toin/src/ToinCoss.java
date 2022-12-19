
/**
 * Toin coss and arrays
 * @author Klara Makek
 * @version 11.11.2022.
 * Course: ISTE-120
 * HW 09
 */
/************** JAVADOC ************************/
import java.lang.Math;

public class ToinCoss {
    private int heads;
    private int tails;
    private int numbOfTos; // number of tosses
    private char[] tosses = new char[numbOfTos];
    private char outcomeLong = 'x';
    private int runLong = 0;

    // constructor
    public ToinCoss(int numbOfTos) {

        this.numbOfTos = numbOfTos;

        tosses = new char[numbOfTos];

        // * toss coin
        for (int i = 0; i < numbOfTos; i++) {
            double random = Math.random(); // makes it random
            if (random < 0.5) { // if number of tosses are less then 0.5
                tosses[i] = 'h'; // * then heads are result
                heads++; // heads
            } else { // * else the result is tails
                tosses[i] = 't';
                tails++; // tails
            }

        }
        calculateRunLong();
    }

    // accessor and getters
    public double getHeads() {
        return this.heads;
    }

    public double getTails() {
        return this.tails;
    }

    public char getOutcome() {
        return this.outcomeLong;
    }

    public int getNumbOfTos() {
        return this.numbOfTos;
    }

    public int getRunLong() {
        return this.runLong;
    }

    // calculates the longest run
    private void calculateRunLong() {
        char outcome = 'x';
        int lenghtOfTheRun = 0;

        for (int i = 0; i < this.numbOfTos; i++) {
            if (tosses[i] == outcome) {
                lenghtOfTheRun++;
            }
            if (lenghtOfTheRun > this.runLong) {
                this.runLong = lenghtOfTheRun;
                this.outcomeLong = outcome;
            } else {
                outcome = tosses[i];
                lenghtOfTheRun = 1;
            }
        }
    }

    // for printing the outcome
    public String toString() {
        String string = "Number of tosses = %d \nFraction of heads = %2.3f \nFraction of tails = %2.3f \nLongest run is %d %s";
        return string;
    }
}
