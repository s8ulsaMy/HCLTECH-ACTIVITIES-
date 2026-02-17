package BankImpl;
import bank_2.*;

public class HousingLoanAcc implements LoanAcc, DebitInterest {

    public void createAcc() {
        System.out.println("Housing Loan Account created");
    }

    public void repayPrincipal(double amt) { }

    public void payInterest(double amt) { }

    public void payPartialPrincipal(double amt) { }

    public void calcInt() { }

    public void deductMonthlyInt() {
        System.out.println("Monthly interest deducted from Housing Loan");
    }

    public void deductHalfYrlyInt() { }

    public void deductAnnualInt() { }
}
