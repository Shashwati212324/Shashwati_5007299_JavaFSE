package ObserverPatternExample;

public class Main {
    public static void main(String[] args) {

        StockMarket stockMarket = new StockMarket();

        Observer mobileApp1 = new MobileApp("MobileApp1");
        Observer webApp1 = new WebApp("WebApp1");

        stockMarket.registerObserver(mobileApp1);
        stockMarket.registerObserver(webApp1);

        stockMarket.setPrice(100.50);
        stockMarket.setPrice(101.00);

        stockMarket.deregisterObserver(mobileApp1);
        stockMarket.setPrice(102.00);
    }
}
