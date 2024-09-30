package bank;

public class Stock {
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;

    public Stock(String symbol, String name){
        this.symbol = symbol;
        this.name = name;
        previousClosingPrice = 0.0;
        currentPrice = 0.0;
    }
    public double getChangePercent(){
        return currentPrice - previousClosingPrice;
    }
    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }
    public void setPreviousClosingPrice(double previousClosingPrice) {
        this.previousClosingPrice = previousClosingPrice;
    }
}