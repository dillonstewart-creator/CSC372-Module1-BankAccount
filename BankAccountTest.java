public class BankAccountTest {
    public static void main(String[] args) {
        System.out.println("=== Test 1: Regular bank account ===");
        BankAccount savings = new BankAccount();
        savings.setFirstName("Jordan");
        savings.setLastName("Lee");
        savings.setAccountID(1001);
        savings.deposit(500.00);
        savings.withdrawal(125.00);
        savings.accountSummary();

        System.out.println("\n=== Test 2: Checking account (no overdraft) ===");
        CheckingAccount checking = new CheckingAccount();
        checking.setFirstName("Taylor");
        checking.setLastName("Morgan");
        checking.setAccountID(2002);
        checking.setInterestRate(1.50);
        checking.deposit(200.00);
        checking.processWithdrawal(50.00);
        checking.displayAccount();

        System.out.println("\n=== Test 3: Checking account (overdraft) ===");
        checking.processWithdrawal(200.00);
        checking.displayAccount();

        System.out.println("\n=== Test 4: Invalid deposit and withdrawal ===");
        savings.deposit(-10.00);
        savings.withdrawal(-5.00);
        savings.accountSummary();
    }
}
