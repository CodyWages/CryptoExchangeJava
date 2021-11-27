import java.util.Scanner;

public class Client {

    public static Scanner scan = new Scanner(System.in);
    public String clientID;

    //Client Asset Balance
    double usdBalance = 1000000.00;
    double btcBalance = 0.00;
    double ethBalance = 0.00;

    //Client Functions
    //Input Client ID
    public void inputClientID() {
        System.out.print("Please input your username: ");
        clientID = scan.nextLine();
    }

    //Return Client ID
    public String clientID() {
        return clientID;
    }

    //Return Client US Dollar Balance
    public double usdBalance() {
        return usdBalance;
    }
    
    //Return Client Bitcoin Balance
    public double btcBalance() {
        return btcBalance;
    }
    
    //Return Client Ethereum Balance
    public double ethBalance() {
        return ethBalance;
    }
}
