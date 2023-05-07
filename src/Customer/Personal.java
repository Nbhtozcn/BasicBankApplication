package Customer;

import Accounts.Account;
import Accounts.Checking;
import Accounts.Credit;
import Accounts.Saving;

public class Personal extends Customer{
    private int annualSalary;

    public Personal(String customerName, int annualSalary) {
        super(customerName);
        this.annualSalary = annualSalary;
        setCreditLimit(this.annualSalary,0.1);
    }

    public int getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(int annualSalary) {
        this.annualSalary = annualSalary;
    }

    @Override
    public void openAccount(String accountType) {
        Account account;
        if (accountType.equalsIgnoreCase("checking")){
            account = new Checking();
            getAccounts().add(account);
            System.out.println("Checking account has been successfully opened");
        }else if (accountType.equalsIgnoreCase("saving")){
            account = new Saving();
            getAccounts().add(account);
            System.out.println("Saving account has been successfully opened");
        } else if (accountType.equalsIgnoreCase("credit")) {
            account = new Credit(getCreditLimit());
            getAccounts().add(account);
            System.out.println("Credit account has been successfully opened");
        }
    }
}
