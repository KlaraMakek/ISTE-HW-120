/**
 * Description: an gregorian calendar using API-s
 * @author Klara Makek
 * @version 28.9.2022.
 * Course: ISTE-120
 * HW -03
 */
/**************JAVADOC************************/

//importing the doc
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Greg {

        public static void main(String[] args) throws Exception {

                // making new class
                GregorianCalendar today = new GregorianCalendar();
                GregorianCalendar bday = new GregorianCalendar(2003, 10, 30); // set my bday as initial value

                /**
                 * Printing the todays date.
                 */
                System.out.print("\nTodays date is:" + " " + today.get(Calendar.DAY_OF_MONTH) + "."
                                + (today.get(Calendar.MONTH) + 1) + "."
                                + today.get(Calendar.YEAR) + ".");

                // setting the date 100 days in advance
                today.add(Calendar.DAY_OF_MONTH, 100);
                // printing the date 100 days in advance
                System.out.print("\nIn 100 days will be:" + " " + today.get(Calendar.DAY_OF_MONTH) + "."
                                + (today.get(Calendar.MONTH) + 1) + "."
                                + today.get(Calendar.YEAR) + "."
                                + ", whitch is" + " " + (today.get(Calendar.DAY_OF_WEEK) - 1) + " "
                                + "day of the week.");
                /**
                 * Printing the date of my bday
                 * geting the day of the week my bday is
                 */
                System.out.print("\nMy bday is: " + bday.get(Calendar.DAY_OF_MONTH) + "."
                                + bday.get(Calendar.MONTH) + "."
                                + bday.get(Calendar.YEAR) + "." + ", "
                                + "and that is " + (bday.get(Calendar.DAY_OF_WEEK) + 3) + " day of the week.");

                // setting the date 10000 days in advance
                bday.add(Calendar.DAY_OF_MONTH, 10000);
                // Printing the date that will be 10000 days in future
                System.out.print("\nIn 10k days from my bday it will be: " + bday.get(Calendar.DAY_OF_MONTH) + "."
                                + bday.get(Calendar.MONTH) + "."
                                + bday.get(Calendar.YEAR) + "."
                                + " and that is: " + (bday.get(Calendar.DAY_OF_WEEK) - 4) + " of the week.");
        }

}
