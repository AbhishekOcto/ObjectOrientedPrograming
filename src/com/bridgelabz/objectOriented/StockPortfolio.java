package com.bridgelabz.objectOriented;
import java.util.ArrayList;
import java.util.Scanner;
public class StockPortfolio {
    int noOfStock = 0;
    double stockValue = 0;
    double totalValue;

    Scanner sc = new Scanner(System.in);
    ArrayList<Stock> list = new ArrayList<>();

    public void addStock() {
        System.out.println("Enter the number of stocks: ");
        noOfStock = sc.nextInt();
        for ( int i = 1; i <= noOfStock; i++ ) {
            Stock stock = new Stock();
            System.out.println("Stock Number: " +i);

            System.out.println("Enter the Stock Name: ");
            stock.setStockName(sc.next());
            System.out.println("Enter Number of Shares: ");
            stock.setNumOfShares(sc.nextInt());
            System.out.println("Enter Share Price: ");
            stock.setSharePrice(sc.nextInt());
            System.out.println(" ");

            totalValue = stock.getNumOfShares()*stock.getSharePrice();
            stock.setTotalValue(totalValue);
            stockValue = stockValue + totalValue;
            list.add(stock);
        }
    }
    public void stockReport() {
        System.out.println(list);
        System.out.println("The value of all Stocks : Rs. " +stockValue );
    }

}
