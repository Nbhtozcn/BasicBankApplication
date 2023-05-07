import Accounts.Saving;
import Customer.Business;
import Customer.Personal;

public class MainBank {
    public static void main(String[] args) {
        Bank bank = new Bank("Techno Bank");
        bank.addCustomer(new Personal("Jason",120000));
        bank.getCustomers().get(0).openAccount("checking");
        bank.getCustomers().get(0).getAccounts().get(0).addMoney(200);
        bank.getCustomers().get(0).getAccounts().get(0).withdrawMoney(50);
        System.out.println(bank.getCustomers().get(0).getAccounts().get(0).getBalance());

        bank.getCustomers().get(0).getAccounts().get(0).withdrawMoney(150);
        bank.getCustomers().get(0).deleteAccount(bank.getCustomers().get(0).getAccounts().get(0));

        bank.getCustomers().get(0).openAccount("saving");
        bank.getCustomers().get(0).getAccounts().get(0).addMoney(200);
        bank.getCustomers().get(0).getAccounts().get(0).withdrawMoney(50);
        ((Saving)(bank.getCustomers().get(0).getAccounts().get(0))).applyInterest();
        System.out.println(bank.getCustomers().get(0).getAccounts().get(0).getBalance());

        bank.getCustomers().get(0).deleteAccount(bank.getCustomers().get(0).getAccounts().get(0));

        bank.getCustomers().get(0).openAccount("credit");
        bank.getCustomers().get(0).getAccounts().get(1).addMoney(200);
        bank.getCustomers().get(0).getAccounts().get(1).withdrawMoney(50);
        System.out.println(bank.getCustomers().get(0).getAccounts().get(1).getBalance());
        bank.getCustomers().get(0).getAccounts().get(1).withdrawMoney(200);
        System.out.println(bank.getCustomers().get(0).getAccounts().get(1).getBalance());
        bank.getCustomers().get(0).deleteAccount(bank.getCustomers().get(0).getAccounts().get(1));

        bank.deleteCustomer(bank.getCustomers().get(0));


        bank.addCustomer(new Business("Google",50000000));


        bank.getCustomers().get(1).openAccount("checking");
        bank.getCustomers().get(1).getAccounts().get(0).addMoney(200);
        bank.getCustomers().get(1).getAccounts().get(0).withdrawMoney(200);
        bank.deleteCustomer(bank.getCustomers().get(1));
        System.out.println(bank.getCustomers());
        
    }
    }
