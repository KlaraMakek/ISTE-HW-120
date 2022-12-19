import java.util.ArrayList;
import java.util.Scanner;

/**
 * Inheritance
 * @author Klara Makek
 * @version 25.1.2022.
 * Course: ISTE-120
 * HW 11
 */
/************** JAVADOC ************************/
public class StudentTest {
    public static void main(String[] args) {
        // scanner
        Scanner test = new Scanner(System.in);
        // array list
        ArrayList<Student> in = new ArrayList<Student>();

        // printing and scanning
        System.out.println("\nWhat type of student do you want to enter?\n1. Undergrad\n2. Grad\n3. Done");
        System.out.print("Choice: ");
        int choice = test.nextInt();
        test.nextLine();

        // if choice is 1 then scan and print
        while (choice != 3) {
            System.out.print("Student Name: ");
            String name = test.nextLine();

            System.out.print("Student ID: ");
            String id = test.nextLine();

            System.out.print("Number of credits: ");
            int numCredits = test.nextInt();
            test.nextLine();

            // if choice is 1 then scan and print
            if (choice == 1) {

                System.out.print("Level: ");
                int yearLevel = test.nextInt();
                test.nextLine();

                Undergrad un = new Undergrad();

                un.setName(name);
                un.setId(id);
                un.setNumCredits(numCredits);
                un.setYearLevel(yearLevel);

                in.add(un);

            } else { // else(if choice 2) scan and print
                System.out.print("Researched Area: ");
                String researchArea = test.nextLine();

                Grad st1 = new Grad();

                st1.setName(name);
                st1.setId(id);
                st1.setNumCredits(numCredits);
                st1.setResearchArea(researchArea);

                in.add(st1);
            }
            // loop, scan and print
            System.out.println("\nWhat type of student do you want to enter?\n1. Undergrad\n2. Grad\n3. Done");
            System.out.print("Choice: ");
            choice = test.nextInt();
            test.nextLine();
        }
        // for choices 1 or 2 print....
        for (int i = 0; i < in.size(); i++) {
            System.out.printf("%s %-20s $%.2f", in.get(i).toString(), "\n\tTuition: ", in.get(i).calcTuition());
        }

    }
}
