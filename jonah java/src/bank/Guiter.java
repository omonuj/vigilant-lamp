package bank;

public class Guiter {
    private String serialNumber;
    private String builder;
    private double price;
    private String model;
    private String type;
    private String backWood;
    private String topWood;

    public Guiter(String serialNumber, String builder, double price, String model, String type, String backWood, String topWood) {
        this.serialNumber = serialNumber;
        this.builder = builder;
        this.price = price;
        this.model = model;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
    }
    public String getSerialNumber() {
        return serialNumber;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double newPrice) {
        this.price = newPrice;
    }
    public String getModel() {
        return model;
    }
    public String getBuilder() {
        return builder;
    }
    public String getType() {
        return type;
    }
    public String getBackWood() {
        return backWood;
    }
    public String getTopWood() {
        return topWood;
    }

}

