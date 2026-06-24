package BankAccount;

import java.util.Scanner;

public class BankMenu{
    public void bankDisplay(){
        BankUtility bankUtility=new BankUtility();
        System.out.println("------------------------------------------------------");
        System.out.println("WELCOME TO SBI BANK");
        System.out.println("-------------------------------------------------------------");
      //  System.out.println("1.CREATE ACCOUNT\n2.DEPOSIT\n3.WITHDRAWL\n4.GET STATEMENT");
       // Scanner sc = new Scanner(System.in);
        //int choice=sc.nextInt();
        while(true){
              System.out.println("1.CREATE ACCOUNT\n2.DEPOSIT\n3.WITHDRAWL\n4.GET STATEMENT\n5.Exist");
              Scanner sc = new Scanner(System.in);
        int choice=sc.nextInt();

          
            if(choice==5)
                break;
            switch (choice) {
                case 1:bankUtility.createAccount();
                    
                    break;
                case 2:System.out.println("Enter Amount to Deposit");
                    double amount=sc.nextDouble();
                    bankUtility.deposit(amount);
                    break;

                
            }
        }
    }
}