import java.util.Scanner;

public class Exchange {

    public static Scanner scan = new Scanner(System.in);
    public static Agent agent = new Agent();
    public static Client client = new Client();

    public static void main(String[] args) {
        
        //Client ID Input
        agent.inputClientID();        
        System.out.println("\nHello " + agent.clientID() + ". Welcome to the exchange.");

        //Option Menu Loop
        boolean optionLoop = true;
        int optionChoice = 0;

        while(optionLoop) {
            System.out.println("\nOPTION MENU:\n");
            System.out.println("1. Check the current prices of available assets");
            System.out.println("2. Check your current asset balances");
            System.out.println("3. Buy BITCOIN");
            System.out.println("4. Sell BITCOIN");
            System.out.println("5. Buy ETHEREUM");
            System.out.println("6. Sell ETHEREUM");
            System.out.println("7. Exit the exchange");
            System.out.print("\nInput the number for the option you would like to choose: ");
            
            //Check If optionChoice Input is an Integer
            if (scan.hasNextInt()) {
                optionChoice = scan.nextInt();
            }else {
                scan.next();
            }
            
            //Switch for Option Choice
            switch (optionChoice) {
            case 1:
                agent.assetPrices();
                waitForEnter();
                break;

            case 2:
                userBalance();
                waitForEnter();
                break;

            case 3:
                agent.buyBTC();
                waitForEnter();
                break;

            case 4:
                agent.sellBTC();
                waitForEnter();
                break;

            case 5:
                agent.buyETH();
                waitForEnter();
                break;

            case 6:
                agent.sellETH();
                waitForEnter();
                break;

            case 7:
                System.out.print("\nGoodbye, " + agent.clientID() + "...");
                System.exit(0);
                break;

            default:
                System.out.print("\nThat is not a valid option.\n");
                waitForEnter();
                break;
            }        
        }
    }

    //Exchange Functions
    //Print Current Balances
    public static void userBalance() {
        System.out.println("\n" + agent.clientID() + "'s current balances: ");
        System.out.println("USD = " + agent.usdBalance() + " USD");
        System.out.println("BTC = " + agent.btcBalance() + " BTC");
        System.out.println("ETH = " + agent.ethBalance() + " ETH");
    }

    //Loop Pause 
    public static void waitForEnter() {
        System.out.print("\nPress ENTER to return to the option menu.");
        Scanner scan = new Scanner(System.in);
        String pause = scan.nextLine();
        while(pause.equals(" ")) {
            pause = scan.nextLine();
            scan.close();
        }      
    }        
}
