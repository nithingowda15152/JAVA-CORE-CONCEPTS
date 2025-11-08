abstract class Payment {
    abstract void makePayment(); // what to do
}

class CreditCardPayment extends Payment {
    void makePayment() { // how to do
        System.out.println("Payment done using Credit Card.");
    }
}

class UpiPayment extends Payment {
    void makePayment() {
        System.out.println("Payment done using UPI.");
    }
}

public class Test1 {
    public static void main(String[] args) {
        Payment p1 = new CreditCardPayment();
        p1.makePayment(); // hides internal card logic

        Payment p2 = new UpiPayment();
        p2.makePayment(); // hides internal UPI logic
    }
}
