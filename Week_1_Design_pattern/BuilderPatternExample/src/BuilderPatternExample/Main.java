/*
 3: Implement the Builder Pattern
The Computer class has a private constructor that takes the Builder as a parameter.
The Builder class is static and nested within Computer. It has methods for setting optional parameters and a build() method to create a Computer instance.

Define Product Class (Computer):

Define required and optional attributes.
Use a private constructor and a static nested Builder class.
Implement the Builder Class (Builder):

Provide methods to set optional attributes and a build() method.
Test the Builder Pattern (Main):

Demonstrate the creation of Computer objects with different configurations using the builder

 */


package BuilderPatternExample;

public class Main {
    public static void main(String[] args) {
        // Create a Computer with only required parameters
        Computer basicComputer = new Computer.Builder("Intel i5", "8GB")
                .build();

        // Create a Computer with all parameters
        Computer advancedComputer = new Computer.Builder("Intel i9", "16GB")
                .setStorage("1TB SSD")
                .setGraphicsCard("NVIDIA GTX 1660")
                .setBluetoothEnabled(true)
                .setWiFiEnabled(true)
                .build();

        // Display the Computer configurations
        System.out.println("Basic Computer Configuration:");
        System.out.println(basicComputer);

        System.out.println("\nAdvanced Computer Configuration:");
        System.out.println(advancedComputer);
    }
}
