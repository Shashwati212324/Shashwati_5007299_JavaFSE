package BuilderPatternExample;

public class Computer {
    // Required parameters
    private String CPU;
    private String RAM;

    // Optional parameters
    private String Storage;
    private String GraphicsCard;
    private boolean isBluetoothEnabled;
    private boolean isWiFiEnabled;

    // Private constructor
    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.Storage = builder.Storage;
        this.GraphicsCard = builder.GraphicsCard;
        this.isBluetoothEnabled = builder.isBluetoothEnabled;
        this.isWiFiEnabled = builder.isWiFiEnabled;
    }

    // Getters
    public String getCPU() {
        return CPU;
    }

    public String getRAM() {
        return RAM;
    }

    public String getStorage() {
        return Storage;
    }

    public String getGraphicsCard() {
        return GraphicsCard;
    }

    public boolean isBluetoothEnabled() {
        return isBluetoothEnabled;
    }

    public boolean isWiFiEnabled() {
        return isWiFiEnabled;
    }

    @Override
    public String toString() {
        return "Computer [CPU=" + CPU + ", RAM=" + RAM + ", Storage=" + Storage + ", GraphicsCard=" + GraphicsCard
                + ", BluetoothEnabled=" + isBluetoothEnabled + ", WiFiEnabled=" + isWiFiEnabled + "]";
    }

    // Static Builder class
    public static class Builder {
        private final String CPU; // Required
        private final String RAM; // Required

        private String Storage = "256GB SSD"; // Default
        private String GraphicsCard = "Integrated"; // Default
        private boolean isBluetoothEnabled = false; // Default
        private boolean isWiFiEnabled = true; // Default

        // Constructor for required parameters
        public Builder(String CPU, String RAM) {
            this.CPU = CPU;
            this.RAM = RAM;
        }

        // Method to set optional parameter Storage
        public Builder setStorage(String Storage) {
            this.Storage = Storage;
            return this;
        }

        // Method to set optional parameter GraphicsCard
        public Builder setGraphicsCard(String GraphicsCard) {
            this.GraphicsCard = GraphicsCard;
            return this;
        }

        // Method to set optional parameter BluetoothEnabled
        public Builder setBluetoothEnabled(boolean isBluetoothEnabled) {
            this.isBluetoothEnabled = isBluetoothEnabled;
            return this;
        }

        // Method to set optional parameter WiFiEnabled
        public Builder setWiFiEnabled(boolean isWiFiEnabled) {
            this.isWiFiEnabled = isWiFiEnabled;
            return this;
        }

        // Build method
        public Computer build() {
            return new Computer(this);
        }
    }
}
