import java.util.*;

/**
 * TestContactList - class to test out the ContactList class.
 * Student Starter File for ISTE-120 HW13, should not be changed.
 * @author  ISTE-120
 * @version 2201
 */

public class TestContactList {
   public static void main(String [] args) {
      // constants
      final int ONE   = 1;
      final int TWO   = 2;
      final int THREE = 3;
      final int FOUR  = 4;
      final int FIVE  = 5;
      
      // create scanner
      Scanner scan = new Scanner(System.in);

      while (true) {
         System.out.println("1) Search the file for a last name ");
         System.out.println("2) Display all last & first names in file");
         System.out.println("3) Add a new record to the file ");
         System.out.println("4) End the program ");
         System.out.print("Please choose 1 - 4: ");
         int choice = scan.nextInt();
         // discard remnant
         scan.nextLine();
         
         /*
         Create a new ContactList object with the name of the
         contact list file.
         */
         ContactList cl = new ContactList("MyAddressBook.txt");
           
         if (choice == ONE) {
            System.out.print("Enter name to find: ");
            String findMe = scan.nextLine();
            cl.search(findMe);
         }
         
         if (choice == TWO) {   // then call display names
            cl.display_names();
         }

         if (choice == THREE) {   // then call new record 
            cl.new_record();
         }
         
         if (choice == FOUR) { 
            System.exit(0); 
         }
      }
   }
}