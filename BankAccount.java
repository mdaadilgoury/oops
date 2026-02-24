package encapsulation;

class Bank {
    private double balance;

    public void deposit(double amount){
        balance = balance + amount;
        System.out.println("Your balance is " + balance);
    }

    public void withdraw(double amount){
        if (amount <= balance){
            balance = balance - amount;
            System.out.println("Withdraw successful " + amount);
        }
        else {
            System.out.println("Insufficient balance");
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class BankAccount {
    public static void main(String[] args) {
        Bank obj = new Bank();

        obj.deposit(1222);
        obj.withdraw(122);

        System.out.println("Final Balance = " + obj.getBalance());
    }
}