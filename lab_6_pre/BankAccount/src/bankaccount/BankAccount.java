package bankaccount;

import java.util.ArrayList;
import java.util.Scanner;

public class BankAccount {

    public static void main(String[] args) {

        Account account = new Account(1122, 20000, 4.5);
        account.withdraw(2500);
        account.deposit(3000);

        System.out.println("Balance: " + account.getBalance());
        System.out.println("Monthly Interest: " + account.getMonthlyInterestAmount());
        System.out.println("Account was Created: "+account.getDateCreated().getTime());
        System.out.println("");
        ArrayList<Account> accountList = new ArrayList<Account>();
        Scanner sc = new Scanner(System.in);
        System.out.println("1. for creating a checking account ");
        System.out.println("2. for creating a Saving Account");
        System.out.println("3. Display");
        System.out.println("4. Exit");
        System.out.print("Please enter a number: ");
        boolean f = false;
        while (true) {
            int input = sc.nextInt();
            if (input == 1) {
                System.out.print("Enter id: ");
                int id = sc.nextInt();
                System.out.print("Enter balance: ");
                double balance = sc.nextDouble();
                System.out.print("Enter annual interest rate: ");
                double interest = sc.nextDouble();
                System.out.print("Enter overdraftlimit: ");
                double overDraft = sc.nextDouble();
                Account check = new CheckingAccount(id, balance, interest, overDraft);
                System.out.print("Enter deposit amount:");
                int d = sc.nextInt();
                check.deposit(d);
                System.out.print("Enter withdrawal amount:");
                int w = sc.nextInt();
                check.withdraw(w);
                accountList.add(check);
                System.out.println("Done");

            }
             else if (input == 2) {
                System.out.print("Enter id: ");
                int id = sc.nextInt();
                System.out.print("Enter balance:");
                double balance = sc.nextDouble();
                System.out.print("Enter annual interest rate:");
                double annulRate = sc.nextDouble();
                Account save = new SavingsAccount(id, balance, annulRate);
                System.out.print("Enter deposit amount:");
                int d = sc.nextInt();
                save.deposit(d);
                System.out.print("Enter withdrawal amount:");
                int w = sc.nextInt();
                save.withdraw(w);
                accountList.add(save);
                System.out.println("Done");
            }
             else if (input==3) {
                for (int i = 0; i < accountList.size(); i++) {
                    accountList.get(i).display();
                    System.out.println("");
                    System.out.println("");
                    
                }

            }
             if (input== 4) {
                f = false;
                break;
            }
        }

    }
}
