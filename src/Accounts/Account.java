package Accounts;

public abstract class Account {
    private String accountNumber;
    private double balance;
    private String accountType;

    public Account(String accountType) {
        this.balance = 0;
        this.accountType = setAccountType(accountType);
        this.accountNumber = setAccountNumber();
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String setAccountNumber() {
        int accountNum = (int) (1000000 + (Math.random() * (10000000 - 1000000)));
        this.accountNumber = Integer.toString(accountNum);
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountType() {
        return accountType;
    }

    public String setAccountType(String accountType) {
        return accountType.toUpperCase();
    }

    public abstract void addMoney(double amount);

    public abstract void withdrawMoney(double amount);

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                ", accountType='" + accountType + '\'' +
                '}';
    }

}
