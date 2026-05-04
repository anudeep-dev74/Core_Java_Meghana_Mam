package coders.assignments.polymorphism;

class Payment{
    void pay(){
        System.out.println("Processing Payment");
    }
}
class UPI extends Payment{
    @Override
    void pay(){
        System.out.println("Paying using UPI");
    }
}
class CreditCard extends Payment{
    @Override
    void pay(){
        System.out.println("Paying using Credit Card");
    }
}
public class Main {
    static void main(String[] args) {
        Payment p;
        p = new UPI();
        p.pay();
        p = new CreditCard();
        p.pay();
    }
}
