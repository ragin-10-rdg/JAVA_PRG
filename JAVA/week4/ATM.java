package week4;
public class ATM {
    private double balance;
    public ATM(double initialBalance) {
        this.balance = initialBalance;
    }
    public void withdrawAmount(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrew $" + amount);
        } else {
            System.out.println("Invalid amount or insufficient funds.");
        }
    }
    public void depositAmount(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    public double checkBalance() {
        System.out.println("Current balance: $" + balance);
        return balance;
    }
    public static void main(String[] args) {
        ATM myATM = new ATM(500.00); // Initial balance of $500
        myATM.depositAmount(150.00); // Should deposit $150
        myATM.withdrawAmount(100.00); // Should withdraw $100
        myATM.withdrawAmount(700.00); // Should fail due to insufficient funds
        myATM.checkBalance();
    }
}
