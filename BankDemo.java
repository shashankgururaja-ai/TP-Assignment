class BankAccount {

    // Private attributes (encapsulation)
    private String accountNumber;
    private double balance;

    // Constructor
    public BankAccount(String accNo, double bal) {
        accountNumber = accNo;
        balance = bal;
    }

    // Getter for account number
    public String getAccountNumber() {
        return accountNumber;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }
}

public class BankDemo {

    public static void main(String[] args) {

        // Creating account object
        BankAccount acc = new BankAccount("ACC12345", 5000);

        System.out.println("Account Number: " + acc.getAccountNumber());
        System.out.println("Initial Balance: " + acc.getBalance());

        acc.deposit(2000);
        acc.withdraw(1500);

        System.out.println("Final Balance: " + acc.getBalance());
    }
}