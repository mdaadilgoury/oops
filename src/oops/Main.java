package oops;

class BankAccount {
    String name;
    double balance;

    BankAccount(String n, double b){
        this.name = n;
        this.balance = b;
        System.out.println("Congratulations, your account is opened");
        System.out.println("Your name is " + name + " and your balance is " + balance);
    }

    void deposit(double amount){
        balance = balance + amount;
        System.out.println("Amount is deposited. Your total balance is " + balance);
    }

    void withdraw(double amount){
        if (balance >= amount){
            balance = balance - amount;
            System.out.println("Your withdrawal is successful: " + amount);
        }
        else {
            System.out.println("Insufficient balance in your account");
        }
    }

    void showBalance(){
        System.out.println("Your balance is " + balance);
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount c1 = new BankAccount("Aadil",1200);
        c1.deposit(1300);
        c1.withdraw(500);
        c1.showBalance();
    }
}