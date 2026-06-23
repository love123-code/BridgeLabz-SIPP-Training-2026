public class BankingMain {

    public static void main(String[] args) {

        SavingsAccount savings = new SavingsAccount();
        savings.setAccountNumber("S101");
        savings.setHolderName("Love");
        savings.setBalance(50000);
        savings.setInterestRate(5);

        savings.deposit(10000);
        savings.withdraw(5000);

        System.out.println("Savings Account");
        savings.displayAccountDetails();
        System.out.println("Interest : " + savings.calculateInterest());

        System.out.println();

        CurrentAccount current = new CurrentAccount();
        current.setAccountNumber("C101");
        current.setHolderName("Rahul");
        current.setBalance(80000);
        current.setMonthlyBonusRate(2);

        current.deposit(5000);
        current.withdraw(10000);

        System.out.println("Current Account");
        current.displayAccountDetails();
        System.out.println("Interest : " + current.calculateInterest());
    }
}