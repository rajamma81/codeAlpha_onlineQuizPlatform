package JAVATASKS;
import java.util.Scanner;

public class SimpleBankingApp {
	
	// online quiz platform 
		static double balance = 100000;
		
	    public static void deposit(double amount) {
	        if (amount > 0) 
	        {
	            balance += amount;
	            System.out.println("Deposit successful! New balance: " + balance);
	        } else 
	        {
	            System.out.println("Deposit amount must be greater than 0.");
	        }
	    }

	    public static void withdraw(double amount) {
	        if (amount > 0) 
	        {
	            if (amount <= balance) 
	            {
	                balance -= amount;
	                System.out.println("Withdrawal successful! New balance: " + balance);
	            } else 
	            {
	                System.out.println("Insufficient balance.");
	            }
	        } else {
	            System.out.println("Withdrawal amount must be greater than 0.");
	        }
	    }

	    public static void checkBalance() {
	        System.out.println("Current balance: " + balance);
	    }
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        boolean exit = false; 

	        System.out.println("Welcome to the Simple Banking Application!");

	        while (!exit) {
	     
	            System.out.println("\nMenu:");
	            System.out.println("1. Deposit Money");
	            System.out.println("2. Withdraw Money");
	            System.out.println("3. Check Balance");
	            System.out.println("4. Exit");
	            System.out.print("Choose an option: ");
	            
	            // Get the user's choice
	            int choice = scanner.nextInt();

	            switch (choice) 
	            {
	                case 1:
	                    System.out.print("Enter amount to deposit: ");
	                    double depositAmount = scanner.nextDouble();
	                    deposit(depositAmount);
	                    break;

	                case 2:
	                    System.out.print("Enter amount to withdraw: ");
	                    double withdrawAmount = scanner.nextDouble();
	                    withdraw(withdrawAmount);
	                    break;

	                case 3:
	                    checkBalance();
	                    break;

	                case 4:
	                    exit = true;
	                    System.out.println("Thank you for using the Simple Banking Application!");
	                    break;

	                default:
	                    System.out.println("Invalid choice. Please choose a valid option.");
	            }
	        }

	        
	        scanner.close(); 

	}

}
