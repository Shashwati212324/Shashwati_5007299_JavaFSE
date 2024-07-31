package SingletonPatternExample;

public class Logger {
    // Step 1: Private static instance of the class
    private static Logger instance;

    // Step 2: Private constructor to prevent instantiation
    private Logger() {
    }

    // Step 3: Public static method to provide access to the instance
    public static Logger getInstance() {
        if (instance == null) {
            synchronized (Logger.class) {
                if (instance == null) {
                    instance = new Logger();
                }
            }
        }
        return instance;
    }

    // Example method to log messages
    public void log(String message) {
        System.out.println("LOG: " + message);
    }
}
