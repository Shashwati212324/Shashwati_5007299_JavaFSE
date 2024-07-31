package DecoratorPatternExample;

public class Main {
    public static void main(String[] args) {
        Notifier emailNotifier = new EmailNotifier();
        Notifier smsNotifier = new SMSNotifierDecorator(emailNotifier);
        Notifier slackNotifier = new SlackNotifierDecorator(smsNotifier);

        String message = "Your order has been shipped!";

        System.out.println("Basic Email Notification:");
        emailNotifier.send(message);

        System.out.println("\nEmail and SMS Notification:");
        smsNotifier.send(message);

        System.out.println("\nEmail, SMS, and Slack Notification:");
        slackNotifier.send(message);
    }
}
