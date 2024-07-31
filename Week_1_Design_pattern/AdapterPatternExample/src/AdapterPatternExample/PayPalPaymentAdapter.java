package AdapterPatternExample;

public class PayPalPaymentAdapter implements PaymentProcessor {
    private PayPalPaymentGateway payPalPaymentGateway;

    public PayPalPaymentAdapter(PayPalPaymentGateway payPalPaymentGateway) {
        this.payPalPaymentGateway = payPalPaymentGateway;
    }

    @Override
    public void processPayment(double amount) {
        payPalPaymentGateway.sendPayment(amount);
    }
}
