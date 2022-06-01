
package bankaccount;

import java.util.Calendar;

public class Account {
    private int id=0;
    private double balance=0.0;
    private double annualInterestRate=0.0;
    private Calendar  dateCreated;

    public Account() {
    }

    public Account(int id,double balance,double annualInterestRate) {
        this.id=id;
        this.balance=balance;
        this.annualInterestRate=annualInterestRate;
        this.dateCreated = Calendar.getInstance();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Calendar getDateCreated() {
        
        return dateCreated;
    }

    public double getMonthlyInterestRate(){
        double monthlyInterestRate=annualInterestRate/12;
        return monthlyInterestRate;
    }
    public double getMonthlyInterestAmount(){
       double monthlyInterestAmount=(balance*getAnnualInterestRate())/100;
       return monthlyInterestAmount;
    }
    public void withdraw(double amount){
        double withdraw=balance-amount;
    }
    public void deposit(double amount){
        double deposit=balance+amount;
    }
    public void display(){
        
    }
}
