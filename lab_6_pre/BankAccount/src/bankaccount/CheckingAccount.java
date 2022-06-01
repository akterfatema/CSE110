package bankaccount;

public class CheckingAccount extends Account {

    private double overdraftLimit;

    public CheckingAccount() {
    }

    public CheckingAccount(int id, double balance, double annualInterestRate, double overdraftLimit) {
        super(id, balance, annualInterestRate);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > overdraftLimit) {
            setBalance(getBalance() - amount);
        } else {
            System.out.println("OverDraft limit is crossed");
        }
    }

    @Override
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
    }

    @Override
    public void display() {
        System.out.println("This is a checking account");
        System.out.println("Account ID: " + getId());
        System.out.println("Date Created: "+getDateCreated().getTime());
        System.out.println("Current Balance: " + getBalance());
        System.out.println("Annual Interest Rate: " + getAnnualInterestRate());
        System.out.println("Monthly interest Amount: " + getMonthlyInterestAmount());
        System.out.println("Overdraft Limit: " + overdraftLimit);
    
    }
}
