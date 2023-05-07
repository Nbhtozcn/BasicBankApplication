package Accounts;

public class Checking extends Account {
    public Checking() {
        super("checking");
    }

    @Override
    public void addMoney(double amount) {
        if (amount >= 0) {
            double balance = getBalance();
            balance += amount;
            setBalance(balance);
        } else {
            System.out.println("You cannot add negative amount");
        }

    }

    @Override
    public void withdrawMoney(double amount) {
        double balance = getBalance();
        if (balance >= amount) {
            balance -= amount;
            setBalance(balance);
        } else {
            System.out.println("Insufficient balance");
        }
    }
}
