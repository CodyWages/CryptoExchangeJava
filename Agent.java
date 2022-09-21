import java.util.Scanner;

public class Agent extends Client {
    
    public static Scanner scan = new Scanner(System.in);

    // USD Asset Price
    protected double btcUSD = 54990.66;
    protected double ethUSD = 4130.78;
    
    // Agent Functions
    // Asset Price List
    protected void assetPrices() {
        System.out.println("\nThe current prices of the available assets are: ");
        System.out.println("BITCOIN = $" + btcUSD);
        System.out.println("ETHEREUM = $" + ethUSD);
    }
  
    // Buy Bitcoin 
    void buyBTC() {        
        System.out.println("\nYou currently have $" + usdBalance + " to convert.");
        System.out.println("1 BTC is $" + btcUSD + ".\nHow much BITCOIN would you like to BUY? ");
        double quantity = scan.nextDouble();
            if((quantity * btcUSD) <= usdBalance) {
                usdBalance -= (quantity * btcUSD);
                btcBalance += quantity;
            }
            else {
                System.err.println("\nYou do not have enough USD for this transaction.");
            }
        System.out.println("\nYour balances for these assets are:");
        System.out.println(usdBalance + " USD");
        System.out.println(btcBalance + " BTC");
    }
    
    // Sell Bitcoin
    void sellBTC() {
        System.out.println("\nYou currently have " + btcBalance + " BTC to convert.");
        System.out.println("1 BTC is $" + btcUSD + ".\nHow much BITCOIN would you like to SELL? ");
        double quantity = scan.nextDouble();
            if(quantity <= btcBalance) {
                btcBalance -= quantity;
                usdBalance += (quantity * btcUSD);
            }
            else {
                System.err.println("\nYou do not have enough BTC for this transaction.");
            }  
        System.out.println("\nYour balances for these assets are:");
        System.out.println(usdBalance + " USD");
        System.out.println(btcBalance + " BTC");  
    }

    // Buy Ethereum
    void buyETH() {
        System.out.println("\nYou currently have $" + usdBalance + " to convert.");
        System.out.println("1 ETH is $" + ethUSD + ".\nHow much ETHEREUM would you like to BUY? ");
        double quantity = scan.nextDouble();
            if((quantity * ethUSD) <= usdBalance) {
                usdBalance -= (quantity * ethUSD);
                ethBalance += quantity;
            }
            else {
                System.err.println("\nYou do not have enough USD for this transaction.");
            }  
        System.out.println("\nYour balances for these assets are:");
        System.out.println(usdBalance + " USD");
        System.out.println(ethBalance + " ETH");   
    }
    
    // Sell Ethereum
    void sellETH() {
        System.out.println("\nYou currently have " + ethBalance + " ETH to convert.");
        System.out.println("1 ETH is $" + ethUSD + ".\nHow much ETHEREUM would you like to SELL? ");
        double quantity = scan.nextDouble();
            if(quantity <= ethBalance) {
                ethBalance -= quantity;
                usdBalance += (quantity * ethUSD);
            }
            else {
                System.err.println("\nYou do not have enough ETH for this transaction.");
            }
        System.out.println("\nYour balances for these assets are:");
        System.out.println(usdBalance + " USD");
        System.out.println(ethBalance + " ETH"); 
    }
}
