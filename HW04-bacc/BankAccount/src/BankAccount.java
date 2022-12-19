/**
 * BankAccount - Class to model a bank account, which has a balance that
 * can be changed by deposits and withdrawals.
 *
 * @author Klara Makek
 * @version 5.10.2022.
 */

public class BankAccount { // Student Starter File
   private double balance;
   private int transFee;
   private int transNum;
   private int numFreeTrans;
   private int month;

   /**
    * Constructs a bank account with a zero balance
    */
   public BankAccount() {
      balance = 0;
      transFee = 0;
      transNum = 0;
      month = 0;
   }

   /**
    * Constructs a bank account with a given balance, number of transactions and month
    * 
    * @param initialBalance the initial balance
    */
   public BankAccount(double initialBalance) {
      balance = initialBalance;
      transNum = 0;
      month = 0;
   }

   /**
    * Deposits money into the bank account.
    * 
    * @param amount the amount to deposit
    */
   public void deposit(int amount) {
      double newBalance = balance + amount;
      balance = newBalance;
      transNum += 1; //for every transaction, number of transaction is increase for 1
      System.out.print("Deposit: " + amount + ", "); //prints the deposit transaction
   }

   /**
    * Withdraws money from the bank account.
    * 
    * @param amount the amount to withdraw
    */
   public void withdraw(int amount) {
      double newBalance = balance - amount;
      balance = newBalance;
      transNum += 1; //for every transaction, number of transaction is increase for 1

      System.out.print("Withdraw: " + amount + ", "); //prints the withdraw transaction
   }

   /**
    * Setting the amount of fee for transactions
    * 
    * @param amount of the fee - 2$
    */
   public void setTransFee(int amount) {
      transFee = amount;
   }

   /**
    * Setting the amount of free transactions
    * 
    * @param amount of free transaction - 5
    */

   public void setNumFreeTrans(int amount) {
      numFreeTrans = amount;
   }

   /**
    * The math formula for the monthly charge
    * 
    */
   public void deductMonthlyCharge() {
      int amountWithdraw = Math.max(transNum - numFreeTrans, 0) * transFee;
      withdraw(amountWithdraw); // the fee is withdrawn from the account
      transNum = 0; //set the initial number of transactions ot 0
   }

   /**
    * Gets the current balance of the bank account.
    * 
    * @return the current balance
    */
   public double getBalance() {
      return balance;
   }

   /**
    * Gets the current month of the account
    * 
    * @return to the month
    */
   public int getMonth() {
      return month += 1;
   }

}