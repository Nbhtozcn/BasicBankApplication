package Accounts;

public class Credit extends Account{
        private double creditLimit;
        private double transactionFee;

        public Credit(double creditLimit) {
            super("credit");
            this.creditLimit = creditLimit;
            this.transactionFee=0.03;
        }

        @Override
        public void addMoney(double amount) {
            if (amount>=0){
                double balance=getBalance();
                balance=balance + (amount-amount*transactionFee);
                setBalance(balance);
            }else{
                System.out.println("You cannot add negative amount");
            }
        }

        @Override
        public void withdrawMoney(double amount) {
            double balance=getBalance();
            double totalAmaount=amount+ amount*transactionFee;
            if (balance+ creditLimit>=totalAmaount){
                balance=balance - totalAmaount;
                setBalance(balance);
            }else{
                System.out.println("Insufficient balance");
            }

        }

        public double getCreditLimit() {
            return creditLimit;
        }

        public void setCreditLimit(double creditLimit) {
            this.creditLimit = creditLimit;
        }

        public double getTransactionFee() {
            return transactionFee;
        }

        public void setTransactionFee(double transactionFee) {
            this.transactionFee = transactionFee;
        }

    }
