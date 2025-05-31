package week4;

public class BankAccountExample {
    private String accHolderName;
    private String accNumber;
    private double balance;

    public void deposit(double amount){
        if (amount>0){
            balance+=amount;
        }else{
            System.out.println("Invalid amount");
        }
    }

    public void withdraw(double amount){
        if(amount>0 && amount <=balance){
            balance -=amount;
        }else{
            System.out.println("Invalid or insufficient balance");
        }
    }

    public String getAccHolderName() {
        return accHolderName;
    }

    public void setAccHolderName(String accHolderName) {
        this.accHolderName = accHolderName;
    }

    public String getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(String accNumber) {
        this.accNumber = accNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}