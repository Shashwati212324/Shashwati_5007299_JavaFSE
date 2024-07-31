/*

Create a Java Project: Set up a project named ProxyPatternExample.
Define Subject Interface (Image): Interface with a method display().
Implement Real Subject Class (RealImage): Implements the Image interface and loads an image from a remote server.
Implement Proxy Class (ProxyImage): Implements the Image interface, holds a reference to RealImage, and includes lazy initialization and caching.
Test the Proxy Implementation (Main): Demonstrates the use of ProxyImage to load and display images with lazy initialization and caching.

 */

package ProxyPatternExample;

public class Main {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("photo1.jpg");
        Image image2 = new ProxyImage("photo2.jpg");

        // Image will be loaded from disk
        image1.display();
        System.out.println("");

        // Image will not be loaded from disk
        image1.display();
        System.out.println("");

        // Image will be loaded from disk
        image2.display();
        System.out.println("");

        // Image will not be loaded from disk
        image2.display();
    }
}
