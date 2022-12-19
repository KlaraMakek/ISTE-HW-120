/**
 * Description: A class to test the CashRegister class
 * @author Klara Makek
 * @version 17.9.2022.
 * Course: ISTE-120
 * HW: #2-1
 */

public class RunCashRegister {
   public static void main(String[] args) {

   /**********  Cash register 1  **********/

   //RunCashRegister, instantiate reg1 object
      CashRegister reg1 = new CashRegister();
   //calling 
      reg1.recordPurchase(70.35);
      reg1.enterPayment(80.00);
      reg1.printReceipt();
   //printing...
      System.out.println(reg1);


      /**********  Cash register 2  **********/
   //RunCashRegister, instantiate reg2 object
      CashRegister reg2 = new CashRegister();
   //calling 
      reg2.recordPurchase(185.10);
      reg2.enterPayment(180.00);
      reg2.printReceipt();
   //printing...
      System.out.println(reg2);

/******* 4 *********/
      // Customer 1 
      CashRegister customer1 = new CashRegister();
      //item #1 sales price 
      customer1.recordPurchase(49.95);
      //item #2 sales price 
      customer1.recordPurchase(20.40);
      //money given
      customer1.enterPayment(80.00);
      //Receipt
      customer1.printReceipt();

      //print....
      System.out.println(customer1);

      // Customer 2
      CashRegister customer2 = new CashRegister();
      //item #1 sales price 
      customer2.recordPurchase(99.95);
      //item #2 sales price 
      customer2.recordPurchase(35.15);
      //item #2 sales price 
      customer2.recordPurchase(50.00);
      //money given
      customer2.enterPayment(180.00);
      //Receipt
      customer2.printReceipt();
      
      //print....
      System.out.println(customer2);   
   
}
}