public class CheckingAccount extends BankAccount {
    private double interestRate;
    private static final double OVERDRAFT_FEE = 30.00;

    public CheckingAccount() {
        super();
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void processWithdrawal(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal must be greater than zero.");
            return;
        }
        if (amount > getBalance()) {
            setBalance(getBalance() - amount - OVERDRAFT_FEE);
            System.out.println("Overdraft fee assessed: $30.00");
        } else {
            withdrawal(amount);
            System.out.println("Withdrawal completed without an overdraft fee.");
        }
        System.out.printf("Balance after withdrawal: $%.2f%n", getBalance());
    }

    public void displayAccount() {
        accountSummary();
        System.out.printf("Interest rate: %.2f%%%n", interestRate);
    }
}
