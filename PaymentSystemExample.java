class Payment11 {
    void pay() {
        System.out.println("Processing payment...");
    }
}

class CreditCardPayment11 extends Payment11 {
    void pay() {
        System.out.println("Paying using Credit Card");
    }
}

class UPIPayment11 extends Payment11 {
    void pay() {
        System.out.println("Paying using UPI");
    }
}

class NetBankingPayment11 extends Payment11 {
    void pay() {
        System.out.println("Paying using Net Banking");
    }
}

class CryptocurrencyPayment11 extends Payment11 {
    void pay() {
        System.out.println("Paying using Cryptocurrency");
    }
}

public class PaymentSystemExample {
    public static void main(String[] args) {
        Payment11 p;

        p = new CreditCardPayment11();
        p.pay();

        p = new UPIPayment11();
        p.pay();

        p = new NetBankingPayment11();
        p.pay();

        p = new CryptocurrencyPayment11();
        p.pay();
    }
}
