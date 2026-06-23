import java.util.Scanner;

public class BankUtility {

    BankCustomer bankCustomer;

    public void createAccount() {

        Scanner sc = new Scanner(System.in);

        int accountNumber = (int)(Math.random() * 900000) + 100000;

        System.out.print("Enter Name: ");
        String name = sc.next();

        double balance = 50000;

        bankCustomer = new BankCustomer(accountNumber, name, balance);

        BankCustomer.Bank_TotalAccountNumber++;

        System.out.println("Account Created Successfully");
        System.out.println("Account Number: " + accountNumber);
    }

    public void deposit(double amount) {

        if (bankCustomer == null) {
            System.out.println("Create an account first!");
            return;
        }

        if (amount <= 0) {
            System.out.println("Invalid Amount!");
        } else {
            bankCustomer.Bank_Balance += amount;
            System.out.println("Deposited: " + amount);
            System.out.println("New Balance: " + bankCustomer.Bank_Balance);
        }
    }

    public void withDraw(double amount) {

        if (bankCustomer == null) {
            System.out.println("Create an account first!");
            return;
        }

        if (amount <= 0) {
            System.out.println("Invalid Amount!");
        } else if (amount > bankCustomer.Bank_Balance) {
            System.out.println("Insufficient Balance!");
        } else {
            bankCustomer.Bank_Balance -= amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("Remaining Balance: " + bankCustomer.Bank_Balance);
        }
    }
}