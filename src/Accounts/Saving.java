package Accounts;

public class Saving extends Account{
    private double interestRate;

    public Saving() {
        super("saving");
        this.interestRate = 0.015;
    }
    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public void addMoney(double amount) {
        if(amount>=0){
            double balance = getBalance();
            balance+=amount;
            setBalance(balance);

        } else {
            System.out.println("You cannot add negative amount");
        }

    }

    @Override
    public void withdrawMoney(double amount) {
        double balance = getBalance();
        double totalAmount = amount + (amount*0.01);
        if (balance>=totalAmount){
            balance=balance - totalAmount;
            setBalance(balance);
        } else {
            System.out.println("Insufficient balance");
        }

    }

    public void applyInterest(){
        double balance = getBalance();
        balance = balance + balance*getInterestRate();
        setBalance(balance);
    }

    @Override
    public String toString() {
        return "Saving{" +
                "interestRate=" + interestRate +
                '}';
    }
}
