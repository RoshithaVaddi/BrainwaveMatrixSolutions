package internBW;
//import java.util.Scanner;
public class ATMA {
	    private int pin;
	    private double balance;
	    public ATMA(int pin, double initialBalance) {
	        this.pin = pin;
	        this.balance = initialBalance;
	    }
	    public boolean authenticate(int enteredPin) {
	        return enteredPin == pin;
	    }
	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Deposited: ₹" + amount);
	        } else {
	            System.out.println("Invalid deposit amount.");
	        }
	    }
	    public void withdraw(double amount) {
	        if (amount > 0 && amount <= balance) {
	            balance -= amount;
	            System.out.println("Withdrew: ₹" + amount);
	        } else {
	            System.out.println("Invalid withdrawal amount or insufficient balance.");
	        }
	    }
	    public void checkBalance() {
	        System.out.println("Current balance: ₹" + balance);
	    }
	}

