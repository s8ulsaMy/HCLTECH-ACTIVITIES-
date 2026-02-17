package project_4.bank_2;

public interface DepositAcc extends Account {

    void withdraw(double amt);
    void deposit(double amt);
    void getBalance();
}
