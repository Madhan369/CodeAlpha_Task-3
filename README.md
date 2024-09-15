
# Stock Trading Platform

The Simple Stock Trading Platform is a Java-based console application that simulates a basic stock trading environment. It allows users to buy and sell stocks, track their portfolio, and view available stocks with current market prices. The program is designed to provide a simplified experience for users to practice stock trading in a simulated environment without any real-world risks.
## Features

View Available Stocks:
- Users can see a list of stocks available in the market along with their symbols, names, and current prices.

Buy Stocks:
- Users can buy a specified quantity of stocks using their available balance.
- The application checks if the user has enough funds before making a purchase.

Sell Stocks:
- Users can sell a specified quantity of stocks from their portfolio.
- The application ensures that the user has sufficient stock holdings to complete the sale.

View Portfolio:
- Users can view their current balance and a detailed summary of the stocks they own, including the quantity and the stock’s current price.

Exit Option:
- Users can exit the application at any time, ending the simulation.


## Running the Program

The code is now split into three classes:

- Stock: Represents a stock with its symbol, name, and price.
- Portfolio: Handles the user’s balance and holdings, with methods for buying, selling, and viewing the portfolio.
- StockTradingPlatform: Contains the main logic, user interface, and interacts with the Portfolio and Stock classes.
## Future Enhancements

- Random Stock Price Updates: Add functionality to simulate stock price changes over time.

- Data Persistence: Store user data in a file or database so that the portfolio can be saved and loaded between sessions.

- Multiple Users: Expand the platform to support multiple user accounts with individual portfolios.
## Technologies Used

- Java: The entire project is built using core Java concepts like classes, objects, and collections (HashMap).
- Scanner: For reading user input from the console.
- OOP Principles: Encapsulation and separation of concerns are used to structure the application across different classes (Stock, Portfolio, and StockTradingPlatform).
