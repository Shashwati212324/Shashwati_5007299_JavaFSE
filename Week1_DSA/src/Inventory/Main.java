package Inventory;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private List<Product> inventory;

    public Main() {
        this.inventory = new ArrayList<Product>();
    }

    public void addProduct(Product product) {
        inventory.add(product);
    }

    public void updateProduct(String productId, int quantity, double price) {
        for (Product product : inventory) {
            if (product.getProductId().equals(productId)) {
                product.setQuantity(quantity);
                product.setPrice(price);
                return;
            }
        }
        System.out.println("Product not found.");
    }

    public void deleteProduct(String productId) {
        inventory.removeIf(product -> product.getProductId().equals(productId));
    }

    public void displayInventory() {
        for (Product product : inventory) {
            System.out.println(product);
        }
    }

    public static void main(String[] args) {
        Main ims = new Main();

        Product p1 = new Product("1", "Laptop", 10, 999.99);
        Product p2 = new Product("2", "Smartphone", 20, 499.99);

        ims.addProduct(p1);
        ims.addProduct(p2);

        System.out.println("Inventory after adding products:");
        ims.displayInventory();

        ims.updateProduct("1", 15, 949.99);
        System.out.println("Inventory after updating product:");
        ims.displayInventory();

        ims.deleteProduct("2");
        System.out.println("Inventory after deleting a product:");
        ims.displayInventory();
    }
}
