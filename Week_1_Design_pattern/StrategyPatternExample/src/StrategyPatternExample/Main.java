package StrategyPatternExample;

public class Main {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        PaymentStrategy creditCardPayment = new CreditCardPayment("John Doe", "1234567890123456", "786", "12/23");
        context.setPaymentStrategy(creditCardPayment);
        context.pay(100);

        PaymentStrategy payPalPayment = new PayPalPayment("johndoe@example.com", "password");
        context.setPaymentStrategy(payPalPayment);
        context.pay(200);
    }
}
