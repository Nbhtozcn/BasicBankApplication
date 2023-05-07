package Customer;

import Accounts.Account;

import java.util.ArrayList;
import java.util.List;

public abstract class Customer {
    private String customerNumber;
    private String customerName;
    private double creditLimit;
    private List<Account> accounts;

    public Customer(String customerName) {
        this.customerName = customerName;
        this.customerNumber = setCustomerNumber();
        this.accounts = new ArrayList<>();
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public String setCustomerNumber() {
        int accountNumber = (int) (Math.random() * ((10000000 - 1000000) + 1)) + 1000000;
        return Integer.toString(accountNumber);
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(int annualIncome,double creditPercent) {
        this.creditLimit = annualIncome*creditPercent;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    public abstract void openAccount(String accountType);

    public void deleteAccount(Account account){
        if (account.getBalance() == 0){
            this.accounts.remove(account);
            System.out.println("This account has been deleted successfully");
        }else if(account.getBalance() < 0){
            System.out.println("You cannot close credit account without paying your debt");
        }else {
            System.out.println("You have $"+account.getBalance()+ " in your account. Withdraw your money first");
        }
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerNumber='" + customerNumber + '\'' +
                ", customerName='" + customerName + '\'' +
                ", creditLimit=" + creditLimit +
                ", accounts=" + accounts +
                '}';
    }
}
