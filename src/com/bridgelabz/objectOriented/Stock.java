package com.bridgelabz.objectOriented;

public class Stock {
    private String stockName;
    private int numOfShares;
    private double sharePrice;
    private  double totalValue;


    public String getStockName() {
        return stockName;
    }
    public void setStockName(String stockName) {
        this.stockName = stockName;
    }
    public int getNumOfShares() {
        return numOfShares;
    }
    public void setNumOfShares(int numOfShares) {
        this.numOfShares = numOfShares;
    }
    public double getSharePrice() {
        return sharePrice;
    }
    public void setSharePrice(double sharePrice) {
        this.sharePrice = sharePrice;
    }
    public double getTotalValue() {
        return totalValue;
    }
    public void setTotalValue(double totalValue) {
        this.totalValue = totalValue;
    }

    @Override
    public String toString() {
        return "Stock [Stock Name = " + stockName + ", Number Of Shares = " + numOfShares + ", Share Price = " + sharePrice
                + ", Total Value = " + totalValue + "]";
    }
}
