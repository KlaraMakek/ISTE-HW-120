import java.util.Scanner;

/**
 * Description: A program to calculate persons (BMR) and (BMI)
 * @author Klara Makek
 * @version 26.10.2022.
 * Course: ISTE-120
 * HW07
 */
/************** JAVADOC ************************/
public class HowHelthy {

    public static void main(String[] args) {
        // scanner
        Scanner in = new Scanner(System.in);
        /**
         * starter
         */
        String name;
        char gender;
        double weight;
        double height;
        int age;
        int activity;

        // constructor
        Heathy person = new Heathy();

        /**
         * scans for a name
         * if name invalid prints error
         */

        System.out.print("Enter your name: ");
        name = in.nextLine();
        if (!person.setName(name)) {
            System.out.println("Invalid name - Try again!");
            System.exit(0);
        }
        /**
         * scans for a gender
         * if gender invalid prints error
         */
        System.out.print("Enter your gender: ");
        gender = in.next().charAt(0);
        if (!person.setGender(gender)) {
            System.out.println("Invalid gender - You can chose from M(m) or F(f)");
            System.exit(0);
        }
        /**
         * scans for a weight
         * if weight invalid prints error
         */
        System.out.print("Enter your weight in lbs: ");
        weight = in.nextDouble();
        if (!person.setWeight(weight)) {
            System.out.println("Invalid weight - You must be 100 or more!");
            System.exit(0);
        }
        /**
         * scans for a height
         * if height invalid prints error
         */
        System.out.print("Enter your height in inc: ");
        height = in.nextDouble();
        if (!person.setHeight(height)) {
            System.out.println("Invalid height - You must be between 60 and 84!");
            System.exit(0);
        }
        /**
         * scans for a age
         * if age invalid prints error
         */
        System.out.print("Enter your age: ");
        age = in.nextInt();
        if (!person.setAge(age)) {
            System.out.println("Invalid age - You must be 18 or older!");
            System.exit(age);
        }

        // prints options for activity
        System.out.println("Activity categories: Use this categories:" +
                "\n1 - Sedentary(little or no exercise, desk job)" +
                "\n2 - Lightly active(light exercise/sports 1-3 days/wk)" +
                "\n3 - Moderate active(moderate exercise/sports 3-5 days/wk)" +
                "\n4 - Very active(hard exercise/sports 6-7 days/wk)" +
                "\n5 - Extra active(hard daily exercise/sports & physical job or 2 * day training, i.e. marathon, contest etc.)");

        /**
         * scans fro your answer
         * if invalid prints error
         */
        System.out.print("How active are you?: ");
        activity = in.nextInt();
        if (!person.setActivity(activity)) {
            System.out.println("Invalid enter - Try again!");
            System.exit(activity);
        }
        // prints string of information for a female
        if (gender == 'F' || gender == 'f') {
            System.out.printf(
                    "\n%s's Information: \nWeight: %.2f pounds \nHeight: %.2f inches: \nAge: %d years \nThis are for a Female.",
                    name, weight, height, age);
        }
        // prints string of information for a male
        if (gender == 'M' || gender == 'm') {
            System.out.printf(
                    "\n%s's Information: \nWeight: %.2f pounds \nHeight: %.2f inches: \nAge: %5d years \nThis are for a Male.",
                    name, weight, height, age);
        }

        // prints the calculations
        System.out.printf("\n\nYou BMR is: %.2f", person.getBMR());
        System.out.printf("\nYou BMI is: %.2f", person.getBMI());
        System.out.printf("\nYour TDEE is %.2f: ", person.getTDEE());
        System.out.printf("\nYour BMI classifies you as: %s", person.setBMI());

        // close
        in.close();
    }

}
