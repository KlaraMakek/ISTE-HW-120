/**
 * BankAccount - Class to model a bank account, which has a balance that
 * can be changed by deposits and withdrawals.
 *
 * @author Klara Makek
 * @version 5.10.2022.
 */

public class TestBankAccount {
    // initialise the new bank account
    public static void main(String[] args) {
        BankAccount acc = new BankAccount(1000);
        acc.setTransFee(2); // sets the transaction fee
        acc.setNumFreeTrans(5); // sets the number of free transactions
        // prints the initial massage
        System.out.println("\nSet up new account with $1000, 5 free transactions and $2 per transaction above 5");

        System.out.println("\nStarting balance: " + acc.getBalance()); // printing the starting balance
        /**
         * changes to the account - deposit/withdraw
         */
        acc.deposit(1000);
        acc.withdraw(500);
        acc.withdraw(400);
        acc.deposit(200);
        // printing...
        System.out.println("\nBalance: " + acc.getBalance()
                + "\nExpected: " + acc.getBalance()
                + "\nApply monthly charge:");
        /**
         * deducting the monthly charge from the bank acc balance
         */
        acc.deductMonthlyCharge();
        // printing...
        System.out.println("\nEnding Balance Month " + acc.getMonth() + ": " + acc.getBalance()
                + "\nExpecting: " + acc.getBalance());

        System.out.println("\n\nStarting balance: " + acc.getBalance());
        /**
         * changes to the account - deposit/withdraw
         */
        acc.deposit(1000);
        acc.withdraw(500);
        acc.withdraw(400);
        acc.deposit(200);
        acc.deposit(500);

        // printing...
        System.out.println("\nBalance: " + acc.getBalance()
                + "\nExpected: " + acc.getBalance()
                + "\nApply monthly charge:");
        /**
         * deducting the monthly charge from the bank acc balance
         */
        acc.deductMonthlyCharge();
        // printing...
        System.out.println("\nEnding Balance Month " + acc.getMonth() + ": " + acc.getBalance()
                + "\nExpecting: " + acc.getBalance());

        System.out.println("\n\nStarting balance: " + acc.getBalance());
         /**
         * changes to the account - deposit/withdraw
         */
        acc.deposit(1000);
        acc.withdraw(500);
        acc.withdraw(400);
        acc.deposit(200);
        acc.deposit(500);
        acc.withdraw(1000);

        // printing...
        System.out.println("\nBalance: " + acc.getBalance()
                + "\nExpected: " + acc.getBalance()
                + "\nApply monthly charge:");
        /**
         * deducting the monthly charge from the bank acc balance
         */
        acc.deductMonthlyCharge();
        // printing...
        System.out.println("\nEnding Balance Month " + acc.getMonth() + ": " + acc.getBalance()
                + "\nExpecting: " + acc.getBalance());

        System.out.println("\n\nStarting balance: " + acc.getBalance());
         /**
         * changes to the account - deposit/withdraw
         */
        acc.deposit(1000);
        acc.withdraw(500);
        acc.withdraw(400);
        acc.deposit(200);
        acc.deposit(500);
        acc.withdraw(1000);
        acc.deposit(100);

        // printing...
        System.out.println("\nBalance: " + acc.getBalance()
                + "\nExpected: " + acc.getBalance()
                + "\nApply monthly charge:");
        /**
         * deducting the monthly charge from the bank acc balance
         */
        acc.deductMonthlyCharge();
        // printing...
        System.out.println("\nEnding Balance Month " + acc.getMonth() + ": " + acc.getBalance()
                + "\nExpecting: " + acc.getBalance());

    }

}
