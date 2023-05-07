package Customer;

import Accounts.Account;
import Accounts.Checking;
import Accounts.Credit;

public class Business extends Customer{
    private int annualIncome;

    public Business(String customerName, int annualIncome) {
        super(customerName);
        this.annualIncome = annualIncome;
        setCreditLimit(annualIncome,0.3);
    }

    @Override
    public void openAccount(String accountType) {
        Account account;
        if (accountType.equalsIgnoreCase("checking")){
            account = new Checking();
            getAccounts().add(account);
            System.out.println("Checking account has been successfully opened");
        } else if (accountType.equalsIgnoreCase("saving")) {
            System.out.println("Business customers cannot have saving accounts");
        } else if (accountType.equalsIgnoreCase("credit")) {
            account = new Credit(getCreditLimit());
            getAccounts().add(account);
            System.out.println("Credit account has been successfully opened");
        }
    }
}
