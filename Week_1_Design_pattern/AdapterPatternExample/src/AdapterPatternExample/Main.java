package AdapterPatternExample;

public class Main {
    public static void main(String[] args) {

        StripePaymentGateway stripePaymentGateway = new StripePaymentGateway();
        PayPalPaymentGateway payPalPaymentGateway = new PayPalPaymentGateway();


        PaymentProcessor stripeAdapter = new StripePaymentAdapter(stripePaymentGateway);
        PaymentProcessor payPalAdapter = new PayPalPaymentAdapter(payPalPaymentGateway);


        System.out.println("Using Stripe Adapter:");
        stripeAdapter.processPayment(100.0);

        System.out.println("\nUsing PayPal Adapter:");
        payPalAdapter.processPayment(200.0);
    }
}
