package oops.inharitacepolymorphism;
class Payment{
     void  pay(int a ){
         System.out.println("proccesing payment.........");
     }
}

class CreditCard extends Payment{
    @Override
    void pay(int a) {
        System.out.println("paid amount "+ a +"using Credit Card");
    }
}

class UPI extends Payment{
    @Override
    void pay(int a) {
        System.out.println("paid amount "+ a +"using UPI");
    }
}

class Paypal extends Payment{
    @Override
    void pay(int a) {
        System.out.println("paid amount "+ a +"using Paypal");
    }
}
public class ShoppingApp {
    public static void main(String[] args) {
     Payment obj = new CreditCard();
     obj.pay(1000);
     Payment obj1 = new UPI();
     obj1.pay(2000);
     Payment obj2 = new Paypal();
     obj2.pay(200);
    }
}
