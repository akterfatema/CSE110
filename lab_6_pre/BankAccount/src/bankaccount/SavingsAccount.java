package bankaccount;

import java.util.Calendar;

public class SavingsAccount extends Account {

    Calendar calendar;

    public SavingsAccount() {
    }

    public SavingsAccount(int id, double balance, double annualInterestRate) {
        super(id, balance, annualInterestRate);
        calendar = Calendar.getInstance();
    }

    public double getCreditBalance() {
        double creditBalance = (getBalance() * 3);
        return creditBalance;
    }

    @Override
    public void withdraw(double amount) {
        if (amount < getBalance()) {
            setBalance(getBalance() - amount);
        } else {
            System.out.println("you don't have enough money");
        }
    }

    @Override
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
    }

    @Override
    public void display() {
        System.out.println("This is a Saving Account");
        System.out.println("Account ID: " + getId());
        System.out.println("Date Created: " + getDateCreated().getTime());
        System.out.println("Current Balance: " + getBalance());
        System.out.println("Annual Interest Rate: " + getAnnualInterestRate());
        System.out.println("Monthly interest amount:" + getMonthlyInterestAmount());
        long Credit = 1020303040450656l;
        System.out.println("Credit Card Number:" + Credit);
        calendar.add(Calendar.YEAR, 10);
        System.out.println("Card Expiry Date:" + calendar.getTime());
        System.out.println("Credit Balance:" + getCreditBalance());

    }

}
