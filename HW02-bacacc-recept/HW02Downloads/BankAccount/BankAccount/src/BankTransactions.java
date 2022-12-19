/**
 * Description: A class to test the BankAccount class
 * @author Klara Makek
 * @version 17.9.2022.
 * Course: ISTE-120
 * HW: #2-2
 */

public class BankTransactions {
   public static void main(String[] args) {
   //Jim's Savings bank account
   // BankAccount, instantiate savings object
      BankAccount savings = new BankAccount("Jim's Savings", 0);
      
      // depositing 
      savings.deposit(3000.00);
      // "getting" balance
      savings.printBalance();

      // "getting" the ============ line
      savings.printLineA();
      // printing .....
      System.out.println(savings);
      
      
   
   //Jim's Checking bank account
   // BankAccount, instantiate checking object

    BankAccount checking = new BankAccount("Jim's Checking", 0);
    // "getting" balance
    checking.printBalance();
    // transferring 500 from Jim's savings

    checking.transfer(savings, 500.00);
     // "getting" balance
    checking.printBalance();
    // withdrawing 500

    checking.withdraw(500.00);
     // "getting" balance
    checking.printBalance();

    // printing .....
    System.out.println(checking);

     // "getting" balance
    savings.printBalance();
    // "getting" the ============ line
    checking.printLineA();
    // printing .....
    System.out.println(savings);
 


   //Jen's Checking bank account
   // BankAccount, instantiate checkingJen object

   BankAccount checkingJen = new BankAccount("Jen's Checking", 500.00);
   // "getting" balance
   checkingJen.printBalance();

   // transferring 500 from Jim's savings 
   checkingJen.transfer(savings, 500.00);
   // "getting" balance
   checkingJen.printBalance();

   // withdrawing 50 
   checkingJen.withdraw(50.00);
   // "getting" balance
   checkingJen.printBalance();
   
   // "getting" the ============ line
   checkingJen.printLineA();
   // printing .....
   System.out.println(checkingJen);

   // "getting" balance
   savings.printBalance();
   // printing .....
   System.out.println(savings);





   }
}
