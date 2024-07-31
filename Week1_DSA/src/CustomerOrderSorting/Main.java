package CustomerOrderSorting;

public class Main {
    public static void main(String[] args) {
        Order[] orders = {
                new Order("1", "Alice", 250.50),
                new Order("2", "Bob", 150.75),
                new Order("3", "Charlie", 300.00),
                new Order("4", "Diana", 200.25),
                new Order("5", "Eve", 175.00)
        };

        System.out.println("Original Orders:");
        printOrders(orders);

        Sorting.bubbleSort(orders);
        System.out.println("\nOrders sorted using Bubble Sort:");
        printOrders(orders);

        orders = new Order[]{
                new Order("1", "Alice", 250.50),
                new Order("2", "Bob", 150.75),
                new Order("3", "Charlie", 300.00),
                new Order("4", "Diana", 200.25),
                new Order("5", "Eve", 175.00)
        };

        Sorting.quickSort(orders, 0, orders.length - 1);
        System.out.println("\nOrders sorted using Quick Sort:");
        printOrders(orders);
    }

    private static void printOrders(Order[] orders) {
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}
