import java.util.*;
import java.io.*;
import java.util.Scanner;

/**
 * ContactList - class to model a ContactList.
 * Student Starter File for ISTE-120 HW13, needs to be changed.
 * 
 * @author Klara Makek
 * @version 7.12.2022.
 */

public class ContactList {
   // Contact list file name
   private String filename;

   // ContactList constructor accepts a String parameter
   public ContactList(String inFileName) {
      filename = inFileName;
   }

   /**
    * 3) add a new record to the file. Open the file for writing
    * in append mode(there is a FileWriter constructor with the
    * appropriate parameters).
    * a) prompt the user to enter data for each field in the record.
    * Each field is a String. The last name is required. If the
    * last name is the empty string(""), return to the menu.
    * b) when the user has completed entering data(i.e., all the
    * fields have been prompted), re-display the user choices
    * c) do not overwrite existing data
    */
   public void new_record() {
      /*
       * Prompt for data:
       * Last name
       * First name
       * Phone
       * 
       */
      // Scanner
      Scanner in = new Scanner(System.in);

      // prompt for the last name
      System.out.print("Last name: ");

      // input the last name
      String lastName = in.nextLine();
      // the Last_name must not be empty
      if (lastName.length() == 0) {
         System.out.println("Last name must be at lest one character.");
         return;
      }
      // get the first name and the phone
      System.out.print("First Name: ");
      String firstName = in.nextLine();

      System.out.print("Phone number: ");
      String phoneNumber = in.nextLine();
      // create the output string
      String text = lastName + "," + firstName + "," + phoneNumber;
      System.out.println(text);
      // declare variables to hold file types
      File file = null;
      FileWriter fileWriter = null;
      BufferedWriter buff = null;

      // try to open the file for writing - append the data
      try {
         file = new File(filename);
         fileWriter = new FileWriter(file, true);
         buff = new BufferedWriter(fileWriter);

      } catch (IOException ioe) {
         System.out.println("new_record: Exception opening the file for writing");
      }
      // try to write the data
      try {
         buff.append(text);
         buff.newLine();

      } catch (IOException ioe) {
         System.out.println("new_record: Exception writing to the " +
               file);
      }
      // try to close the file
      try {
         buff.close();
         fileWriter.close();

      } catch (IOException ioe) {
         System.out.println("new_record: Exception closing the file");
      } // end of test of Last_name
   } // end of new_record

   /**
    * 2) display all last names and first names in the file.
    * Open the file for reading, read each record and
    * display the field values.
    * a) display all the lastName, firstName paired fields in the file;
    * display with the format lastName, firstName
    * b) when all records have been displayed, display the record count - the
    * record count is the number of records read and should equal the number of
    * records in the file
    * c) after all the records and the count have been displayed, display the user
    * choices
    */
   public void display_names() {
      // declare variables to hold file types
      File file = null;
      FileReader fileReader = null;
      BufferedReader buff = null;
      // try to open the file for reading
      try {
         file = new File(filename);
         fileReader = new FileReader(file);
         buff = new BufferedReader(fileReader);
      } catch (IOException ioe) {
         System.out.println("display_names: Exception opening the file");
      }

      /*
       * try to read each record and display the field values.
       * a) display all the lastName, firstName paired fields in the file;
       * display with the format lastName, firstName
       * count each record that is read
       */
      int counter = 0; // record counter

      try {
         // read the first record
         String line = buff.readLine();
         // while the record is not null, display the record, count the record
         while (line != null) {
            String[] fields = line.split(",");
            System.out.println(line);
            counter = +1;
            line = buff.readLine();
         }
      } catch (IOException ioe) {
         System.out.println("display_names: Exception reading the file");
      }

      // try to close the file
      try {
         buff.close();
         fileReader.close();

      } catch (IOException ioe) {
         System.out.println("display_names: Exception closing the file");
      }

      // display a count of the records read
      System.out.println("\nTotal records read: " + counter);

   } // end of display_names

   /**
    * 1) search an address file for a particular last name
    * and then display the Last name, the first name, and
    * the phone for each match
    * 2) display the count of records which match the last name
    */
   public void search(String LastName) {
      // declare variables to hold file types
      File addrBook = new File(filename);
      Scanner br = null;
      FileReader fileReader = null;
      BufferedReader buff = null;

      // try to open the file for reading
      try {
         addrBook = new File(LastName);
         fileReader = new FileReader(addrBook);
         buff = new BufferedReader(fileReader);

      } catch (IOException ioe) {
         System.out.println("search: Exception opening the file");
      }

      // try to read each record
      // if the value of the Last_name field equals the value

      /*
       * create a counter to count the number of
       * matching records
       */
      int counter = 0;

      try {
         // read the first record
         String text = buff.readLine();
         // while the record is not null
         // split the record into fields
         // test if the field equals the LastName parameter
         // display the record and increment the counter
         // read the next record
         while (text != null) {
         String[] record = text.split(",");
            if (record[0].equals(LastName)) {
               counter = +1;
               System.out.println(text);
            }
            text = buff.readLine();
         }
      } catch (IOException ioe) {
         System.out.println("search: Exception reading the file");
      }

      // try to close the file
      try {
         fileReader.close();

      } catch (IOException ioe) {
         System.out.println("search: Exception closing the file");
      }

      // display a count of the records found
      System.out.println("Record: " + counter);
   } // end of search

} // end of class