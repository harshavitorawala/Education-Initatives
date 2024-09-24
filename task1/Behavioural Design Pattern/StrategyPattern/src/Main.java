public class Main {

    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext();

        // Paying using Credit Card
        paymentContext.setPaymentStrategy(new CreditCardPayment("1234-5678-9012", "John Doe"));
        paymentContext.pay(250.00);

        // Paying using PayPal
        paymentContext.setPaymentStrategy(new PayPalPayment("john@example.com"));
        paymentContext.pay(150.00);

        // Paying using Bitcoin
        paymentContext.setPaymentStrategy(new BitcoinPayment("1A2b3C4d5E"));
        paymentContext.pay(100.00);
    }
}
