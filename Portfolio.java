package com.STP;

import java.util.HashMap;
import java.util.Map;

public class Portfolio 
{
	// Initial balance
    double balance = 10000.00; 
    // Stores the stock symbol and quantity
    Map<String, Integer> holdings = new HashMap<>(); 

    public void buyStock(Stock stock, int quantity) 
    {
        double totalCost = stock.price * quantity;
        if (balance >= totalCost) 
        {
            balance -= totalCost;
            holdings.put(stock.symbol, holdings.getOrDefault(stock.symbol, 0) + quantity);
            System.out.println("Successfully bought " + quantity + " shares of " + stock.name);
        } 
        else 
        {
            System.out.println("Insufficient balance to buy " + quantity + " shares of " + stock.name);
        }
    }

    public void sellStock(Stock stock, int quantity) 
    {
        if (holdings.getOrDefault(stock.symbol, 0) >= quantity) 
        {
            double totalSale = stock.price * quantity;
            balance += totalSale;
            holdings.put(stock.symbol, holdings.get(stock.symbol) - quantity);
            if (holdings.get(stock.symbol) == 0) holdings.remove(stock.symbol);
            System.out.println("Successfully sold " + quantity + " shares of " + stock.name);
        }
        else 
        {
            System.out.println("Not enough shares to sell.");
        }
    }

    public void viewPortfolio(Map<String, Stock> market) 
    {
        System.out.println("Balance: ₹" + balance);
        System.out.println("Your Holdings:");
        for (String symbol : holdings.keySet()) 
        {
            Stock stock = market.get(symbol);
            int quantity = holdings.get(symbol);
            System.out.println(stock.symbol + " (" + stock.name + "): " + quantity + " shares at ₹" + stock.price);
        }
    }
}
