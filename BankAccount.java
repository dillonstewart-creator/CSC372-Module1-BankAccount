public class BankAccount {
    private String firstName;
    private String lastName;
    private int accountID;
    private double balance;

    public BankAccount() {
        balance = 0.0;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit must be greater than zero.");
            return;
        }
        balance += amount;
    }

    public void withdrawal(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal must be greater than zero.");
            return;
        }
        if (amount > balance) {
            System.out.println("Insufficient funds. Use processWithdrawal for checking overdrafts.");
            return;
        }
        balance -= amount;
    }

    public void setFirstName(String firstName) { this.firstName = firstName; }
    public String getFirstName() { return firstName; }

    public void setLastName(String lastName) { this.lastName = lastName; }
    public String getLastName() { return lastName; }

    public void setAccountID(int accountID) { this.accountID = accountID; }
    public int getAccountID() { return accountID; }

    public double getBalance() { return balance; }

    // Protected so the checking subclass can apply overdrafts and fees.
    protected void setBalance(double balance) { this.balance = balance; }

    public void accountSummary() {
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Account ID: " + accountID);
        System.out.printf("Balance: $%.2f%n", balance);
    }
}
