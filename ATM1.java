package internBW;
import java.util.Scanner;
public class ATM1 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        ATMA atm = new ATMA(4444, 1000.0);
	        System.out.println("Welcome to the ATM");
	        boolean authenticated = false;
	        while (!authenticated) {
	            System.out.print("Enter PIN: ");
	            int pin = scanner.nextInt();
	            authenticated = atm.authenticate(pin);
	            if (!authenticated) {
	                System.out.println("Invalid PIN. Please try again.");
	            } }
	        boolean exit = false; // Main menu loop
	        while (!exit) {
	            System.out.println("\nATM Menu:");
	            System.out.println("1. Check Balance");
	            System.out.println("2. Deposit Money");
	            System.out.println("3. Withdraw Money");
	            System.out.println("4. Exit");
	            System.out.print("Select an option: ");
	            int option = scanner.nextInt();
	            switch (option) {
	                case 1:
	                    atm.checkBalance();
	                    break;
	                case 2:
	                    System.out.print("Enter amount to deposit: ₹");
	                    double depositAmount = scanner.nextDouble();
	                    atm.deposit(depositAmount);
	                    break;
	                case 3:
	                    System.out.print("Enter amount to withdraw: ₹");
	                    double withdrawAmount = scanner.nextDouble();
	                    atm.withdraw(withdrawAmount);
	                    break;
	                case 4:
	                    exit = true;
	                    System.out.println("Thank you for using the ATM.");
	                    break;
	                default:
	                    System.out.println("Invalid option. Please try again.");
	                    break;
	            } }
	        scanner.close();
	    } }

