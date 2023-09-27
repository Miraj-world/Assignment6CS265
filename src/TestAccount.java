public class TestAccount {
    public static void main(String[] args) {
        Account georgeAccount = new Account(1122, 1000, "George");
        georgeAccount.setAnnualInterestRate(1.5);

        georgeAccount.deposit(30);
        georgeAccount.deposit(40);
        georgeAccount.deposit(50);
        georgeAccount.withdraw(5);
        georgeAccount.withdraw(4);
        georgeAccount.withdraw(2);

        System.out.println("Account Summary for " + georgeAccount.getName());
        System.out.println("-------------------------------");
        System.out.println("Account ID: " + georgeAccount.getId());
        System.out.println("Annual Interest Rate: " + georgeAccount.getAnnualInterestRate() + "%");
        System.out.println("Balance: $" + georgeAccount.getBalance());
        System.out.println("\nTransaction History:");
        georgeAccount.printTransactions();
    }
}
