package ECommerce;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
                new Product("1", "Laptop", "Electronics"),
                new Product("2", "Smartphone", "Electronics"),
                new Product("3", "Shirt", "Clothing"),
                new Product("4", "Shoes", "Footwear"),
                new Product("5", "Book", "Stationery")
        };

        String searchTerm = "Laptop";
        int linearSearchResult = Search.linearSearch(products, searchTerm);
        if (linearSearchResult != -1) {
            System.out.println("Product found using Linear Search: " + products[linearSearchResult]);
        } else {
            System.out.println("Product not found using Linear Search.");
        }

        int binarySearchResult = Search.binarySearch(products, searchTerm);
        if (binarySearchResult != -1) {
            System.out.println("Product found using Binary Search: " + products[binarySearchResult]);
        } else {
            System.out.println("Product not found using Binary Search.");
        }
    }
}
