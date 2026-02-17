import bank_2.*;

class Customer implements DepositAcc, Interest {

    double balance = 1000;

    public void createAcc() {
        System.out.println("Account created: " + SAVINGS);
    }

    public void deposit(double amt) {
        balance += amt;
        System.out.println("Deposited: " + amt);
    }

    public void withdraw(double amt) {
        balance -= amt;
        System.out.println("Withdrawn: " + amt);
    }

    public void getBalance() {
        System.out.println("Balance: " + balance);
    }

    public void calcInt() {
        System.out.println("Savings Interest = " + SAVINGS_INT + "%");
    }
}

public class TestBank2 {

    public static void main(String[] args) {

        Customer c = new Customer();

        c.createAcc();
        c.deposit(500);
        c.withdraw(200);
        c.getBalance();
        c.calcInt();
    }
}
