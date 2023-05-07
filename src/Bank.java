import Accounts.Account;
import Customer.Customer;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String bankName;
    private List<Customer> customers;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.customers = new ArrayList<>();
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    public void addCustomer(Customer customer){
        this.customers.add(customer);
    }

    public void deleteCustomer(Customer customer){
        boolean isZero = true;
        for (Account account: customer.getAccounts()){
            if (account.getBalance() != 0){
                isZero = false;
                break;
            }
        }
        if (isZero){
            this.customers.remove(customer);
            System.out.println("Customer has been deleted successfully");
        }else {
            System.out.println("This customer has either money or debt in one of his/her accounts.");
        }
    }

}
