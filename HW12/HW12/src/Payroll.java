import java.util.ArrayList;
import java.util.Scanner;

/**
 *  Company thing
 * @author Klara Makek
 * @version 29.11.2022.
 * Course: ISTE-120
 * HW 12
 */
/************** JAVADOC ************************/
public class Payroll {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Company> lista = new ArrayList<Company>();
        String text = "\nWhat do you want to do?\n\t1. Crate a new employee.\n\t2. Set pay.\n\t3. Show weekly pay.\n\t4. Show annual pay.\n\t5. Show Summary.\n\t6. Qit \nEnter Options: ";
        System.out.print(text);
        int options = in.nextInt();
        int employee = 0;
        in.nextLine();
        while (options != 1 && options != 6) { // 22-27
            System.out.println("\nError, create and employee!");
            System.out.print(text);
            options = in.nextInt();
            in.nextLine();
        } // 22-27
        while (options != 6) { // 28-100

            while (options < 1 || options > 6) { //30-35
                System.out.println("\nError, bad option, try again!");
                System.out.print(text);
                options = in.nextInt();
                in.nextLine();
            } //30-35
            if (lista.size() > 1 && options != 1) { //36 -40
                employee = in.nextInt();
                in.nextLine();
            } //36 -40
            if (options == 1) { //41-69
                System.out.print("\nWhat type of employee would you like to crate?");
                System.out.println("\n******** pick SALARIED or HOURLY ********");
                String thing = in.nextLine().toLowerCase();
                while (!thing.equals("salaried") && !thing.equals("hourly")) { // 45 -50
                    System.out.println("\nError, invalid input!");
                    System.out.print("\nWhat type of acc would you like to create?");
                    System.out.println("\n******** pick 1 for SALARIED, 2 for CD ********");
                    thing = in.nextLine();
                } // 45 -50
                if (thing == "salaried" || thing == "Salaried" || thing == "SALARIED") { // 51 - 68
                    System.out.print("Enter your name: ");
                    String name = in.nextLine();
                    System.out.print("Enter your SSN: ");
                    String ssn = in.nextLine();
                    System.out.print("Enter your annual pay: ");
                    double pay = in.nextDouble();
                    in.nextLine();
                    while (pay <= 0) { // 59 -64
                        System.out.println("\nError, the input must be grater then 0.");
                        System.out.print("Enter the annual pay.");
                        pay = in.nextDouble();
                        in.nextLine();
                    }// 59 -64
                    Salaried salary = new Salaried(name, ssn,pay);
                    lista.add(salary);
                    System.out.println("\nEmployee " + lista.size() + " has been crated.");
                // 51 - 68
                 //41-69
            } else { // 70-98
                System.out.print("Enter your name: ");
                String name = in.nextLine();
                System.out.print("Enter your SSN: ");
                String ssn = in.nextLine();
                System.out.print("Enter your annual pay: ");
                double pay = in.nextDouble();
                in.nextLine();
                while (pay <= 0) { //78 -83
                    System.out.println("Error, the input must be grater then 0.");
                    System.out.print("Enter the annual pay: ");
                    pay = in.nextDouble();
                } //78 -83
                System.out.print("Enter the average number of hours you worked per week: ");
                double hours = in.nextDouble();
                in.nextLine();

                while (hours <= 15 || hours >= 60) { //88 - 93
                    System.out.println("Error, must be between 15 and 60, exclusively.");
                    System.out.print("Enter the average number of hours you worked per week: ");
                    hours = in.nextDouble();
                    in.nextLine(); 
                } //88 - 93
                Hourly hourly = new Hourly(name, ssn, pay, hours);
                lista.add(hourly);
                System.out.println("Employee " + lista.size() + " has been created.");

            } // 70-98
        } 
        // 28 -100
        else if (options == 2) { //101 -112
            System.out.print("How much money would you like to set the annual pay to? ");
            double pay = in.nextDouble();
            in.nextLine();
            while (pay <= 0) { //105-110
                System.out.println("Error, must be grater then 0.");
                System.out.print("How much money would you like to set the annual pay to? ");
                pay = in.nextDouble();
                in.nextLine();
            }//105-110
            lista.get(employee).setPay(pay);
            //101 -112
        } else if (options == 3) { //113 -115
            System.out.printf("The weekly pay is: $%.2f", lista.get(employee).calcWeeklyPay());
            //113 -115
        } else if (options == 4) { //116 -118
            System.out.printf( "The annual pay is $%.2f", lista.get(employee).calcAnnualPay());
            //116 -118
        } else if (options == 5) { //119 -121
            System.out.println(lista.get(employee).toString());
        }//119 -121
        System.out.println(text);
        options = in.nextInt();
        in.nextLine();
    } 
} // args
}// payroll
