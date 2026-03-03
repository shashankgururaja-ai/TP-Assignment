interface Payment {

    // Abstract method
    void pay(double amount);
}

// CreditCardPayment class
class CreditCardPayment implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Payment of ₹" + amount + " made using Credit Card.");
    }
}

// UPIPayment class
class UPIPayment implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Payment of ₹" + amount + " made using UPI.");
    }
}

// Main class
public class PaymentDemo {
    public static void main(String[] args) {

        Payment p1 = new CreditCardPayment();
        Payment p2 = new UPIPayment();

        p1.pay(5000);
        p2.pay(1500);
    }
}