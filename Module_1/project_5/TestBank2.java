import BankImpl.*;

public class TestBank2 {

    public static void main(String[] args) {

        SavingsAcc s = new SavingsAcc();
        s.createAcc();
        s.deposit(500);
        s.getBalance();
        s.addMonthlyInt();

        PersonalLoanAcc p = new PersonalLoanAcc();
        p.createAcc();
        p.deductMonthlyInt();
    }
}
