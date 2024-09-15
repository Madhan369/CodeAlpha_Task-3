package com.STP;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StockTradingPlatform 
{
    public static void main(String[] args) 
    {
        // Simulated stock data
        Map<String, Stock> market = new HashMap<>();
        market.put("AAPL", new Stock("AAPL", "Apple Inc.", 150.00));
        market.put("GOOGL", new Stock("GOOGL", "Alphabet Inc.", 2800.00));
        market.put("TSLA", new Stock("TSLA", "Tesla Inc.", 700.00));

        Portfolio portfolio = new Portfolio();
        Scanner sc = new Scanner(System.in);

        while (true) 
        {
        	System.out.println("\n----------------------");
        	System.out.println("Stock Trading Platform");
        	System.out.println("----------------------");
            System.out.println("1. View Stocks\n2. Buy Stock\n3. Sell Stock\n4. View Portfolio\n5. Exit");
            System.out.print("\nChoose an option: ");
            int choice = sc.nextInt();

            switch (choice) 
            {
                case 1:
                    System.out.println("Available Stocks:");
                    for (Stock stock : market.values()) 
                    {
                        System.out.println(stock.symbol + " - " + stock.name + ": ₹" + stock.price);
                    }
                    break;

                case 2:
                    System.out.print("Enter stock symbol: ");
                    String buySymbol = sc.next().toUpperCase();
                    if (market.containsKey(buySymbol)) 
                    {
                        System.out.print("Enter quantity: ");
                        int quantity = sc.nextInt();
                        portfolio.buyStock(market.get(buySymbol), quantity);
                    } 
                    else 
                    {
                        System.out.println("Invalid stock symbol.");
                    }
                    break;

                case 3:
                    System.out.print("Enter stock symbol: ");
                    String sellSymbol = sc.next().toUpperCase();
                    if (market.containsKey(sellSymbol)) 
                    {
                        System.out.print("Enter quantity: ");
                        int quantity = sc.nextInt();
                        portfolio.sellStock(market.get(sellSymbol), quantity);
                    } 
                    else 
                    {
                        System.out.println("Invalid stock symbol.");
                    }
                    break;

                case 4:
                    portfolio.viewPortfolio(market);
                    break;

                case 5:
                    System.out.println("Exiting... Goodbye!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
