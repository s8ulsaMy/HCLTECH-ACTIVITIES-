package project_4.bank_2;

public interface LoanAcc extends Account {

    void repayPrincipal(double amt);
    void payInterest(double amt);
    void payPartialPrincipal(double amt);
}
