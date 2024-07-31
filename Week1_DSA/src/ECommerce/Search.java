package ECommerce;

import java.util.Arrays;
import java.util.Comparator;

public class Search {

    // Linear Search
    public static int linearSearch(Product[] products, String productName) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].getProductName().equalsIgnoreCase(productName)) {
                return i;
            }
        }
        return -1;
    }

    // Binary Search
    public static int binarySearch(Product[] products, String productName) {
        Arrays.sort(products, Comparator.comparing(Product::getProductName));
        int left = 0, right = products.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int result = productName.compareToIgnoreCase(products[mid].getProductName());

            if (result == 0) {
                return mid;
            } else if (result > 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
