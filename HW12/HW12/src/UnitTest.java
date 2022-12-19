
/**
 *  Company thing
 * @author Klara Makek
 * @version 29.11.2022.
 * Course: ISTE-120
 * HW 12
 */
/************** JAVADOC ************************/
public class UnitTest {
    public static void main(String[] args) {
        System.out.println("Testing the Salaried >");
        if(testSalaried()){
            System.out.println("\nTest is passed!");
        } else System.out.println("\nTest failed!");

        System.out.println("\nTesting the Hourly >");
        if(testHourly()){
            System.out.println("\nTest is passed!");
        } else System.out.println("\nTest failed!");
    }
    static boolean testSalaried(){
        Salaried test = new Salaried(" ", " ", 57000);
        test.setPay(65000);
        System.out.print("\nAnnual >");
        boolean out = true;
        if(test.calcAnnualPay() != 58474){
            System.out.print("      Fail");
            out = false;
        } else System.out.print("      Pass!");

        System.out.print("\nWeekly >");
        if(test.calcWeeklyPay() != 1124.5){
            System.out.print("      Fail");
            out = false;
        } else System.out.print("      Pass!");

        return out;
    }

    
    static boolean testHourly(){
        Salaried test = new Salaried(" ", " ", 19.75);
        test.setPay(65000);
        System.out.print("\nAnnual >");
        boolean out = true;
        if(test.calcAnnualPay() != 42620.50){
            System.out.print("      Fail");
            out = false;
        } else System.out.print("      Pass!");

        System.out.print("\nWeekly >");
        if(test.calcWeeklyPay() != 819.625){
            System.out.print("      Fail");
            out = false;
        } else System.out.print("      Pass!");

        return out;
    }
}
