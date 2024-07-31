package AdapterPatternExample;

public class StripePaymentAdapter implements PaymentProcessor {
    private StripePaymentGateway stripePaymentGateway;

    public StripePaymentAdapter(StripePaymentGateway stripePaymentGateway) {
        this.stripePaymentGateway = stripePaymentGateway;
    }

    @Override
    public void processPayment(double amount) {
        stripePaymentGateway.makePayment(amount);
    }
}
