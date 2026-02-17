package BankImpl;
import bank_2.*;

public class SavingsAcc implements DepositAcc, CreditInterest {

    double balance = 1000;

    public void createAcc() {
        System.out.println("Savings Account created");
    }

    public void deposit(double amt) {
        balance += amt;
    }

    public void withdraw(double amt) {
        balance -= amt;
    }

    public void getBalance() {
        System.out.println("Balance: " + balance);
    }

    public void calcInt() { }

    public void addMonthlyInt() {
        System.out.println("Monthly interest added to Savings");
    }

    public void addHalfYrlyInt() { }

    public void addAnnualInt() { }
}
