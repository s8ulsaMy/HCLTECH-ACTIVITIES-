import bank.*;

class Customer implements DepositAcc, CreditInterest {

    public void createAccount() {
        System.out.println("Account created");
    }

    public void deposit() {
        System.out.println("Amount deposited");
    }

    public void calculateInterest() {
        System.out.println("Credit Interest calculated");
    }
}

public class TestBank {

    public static void main(String[] args) {

        Customer c = new Customer();

        c.createAccount();
        c.deposit();
        c.calculateInterest();
    }
}
