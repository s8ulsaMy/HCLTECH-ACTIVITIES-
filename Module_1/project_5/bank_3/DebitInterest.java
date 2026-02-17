package bank_2;

public interface DebitInterest extends Interest {

    void deductMonthlyInt();
    void deductHalfYrlyInt();
    void deductAnnualInt();
}
