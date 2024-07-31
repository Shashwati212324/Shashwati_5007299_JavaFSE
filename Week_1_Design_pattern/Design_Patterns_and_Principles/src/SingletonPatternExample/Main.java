package SingletonPatternExample;

public class Main {
    public static void main(String[] args) {
        // Step 1: Get the single instance of Logger
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        // Step 2: Log messages using both instances
        logger1.log("This is a message from logger1.");
        logger2.log("This is a message from logger2.");

        // Step 3: Verify that both references point to the same instance
        System.out.println("logger1 and logger2 are the same instance: " + (logger1 == logger2));
    }
}
