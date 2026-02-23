package interfaceORabstraction;

interface Payment{
    void pay(double amount);
    void refund(double amount);
}

class CreditCard implements Payment{
    public void pay(double amount){
        System.out.println("Paid ₹" + amount + " using Credit Card");
    }
    public void refund(double amount){
        System.out.println("Refund ₹" + amount + " to Credit Card");
    }
}

class UPI implements Payment{
    public void pay(double amount){
        System.out.println("Paid ₹" + amount + " using UPI");
    }
    public void refund(double amount){
        System.out.println("Refund ₹" + amount + " to UPI");
    }
}

class Paypal implements Payment{
    public void pay(double amount){
        System.out.println("Paid ₹" + amount + " using Paypal");
    }
    public void refund(double amount){
        System.out.println("Refund ₹" + amount + " to Paypal");
    }
}

class PaymentProcessor{
    Payment payment;
    PaymentProcessor(Payment payment){
      this.payment=  payment;
    }

    public void processpayment(double amount) {
       payment.pay(amount);
    }

    public void  processrefund(double amount){
        payment.refund(amount);
    }
}
public class PaymentApp {
    public static void main(String[] args) {
        Payment payment1 =new UPI();
     PaymentProcessor obj1 =new PaymentProcessor(payment1);
     obj1.processpayment(42121);
     obj1.processrefund(48274);
    }
}
