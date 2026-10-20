import java.util.Scanner;

class BankAccount {

    // Private variables
    private String accountHolder;
    private int accountNumber;
    private double balance;

    // Setter for account holder
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    // Getter for account holder
    public String getAccountHolder() {
        return accountHolder;
    }

    // Setter for account number
    public void setAccountNumber(int accountNumber) {
        if (accountNumber > 0) {
            this.accountNumber = accountNumber;
        } else {
            System.out.println("Invalid account number.");
        }
    }

    // Getter for account number
    public int getAccountNumber() {
        return accountNumber;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposit successful.");
        } else {
            System.out.println("Deposit amount must be greater than 0.");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be greater than 0.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance = balance - amount;
            System.out.println("Withdrawal successful.");
        }
    }

    // Display account details
    public void displayAccount() {
        System.out.println("\n----- Account Details -----");
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Balance        : ₹" + balance);
    }
}

public class BankDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create object
        BankAccount account = new BankAccount();

        // Input account holder
        System.out.print("Enter account holder name: ");
        String name = sc.nextLine();

        // Input account number
        System.out.print("Enter account number: ");
        int number = sc.nextInt();

        // Set values
        account.setAccountHolder(name);
        account.setAccountNumber(number);

        // Deposit
        System.out.print("Enter deposit amount: ");
        double depositAmount = sc.nextDouble();

        account.deposit(depositAmount);

        // Withdraw
        System.out.print("Enter withdrawal amount: ");
        double withdrawAmount = sc.nextDouble();

        account.withdraw(withdrawAmount);

        // Display account
        account.displayAccount();

        sc.close();
    }
}