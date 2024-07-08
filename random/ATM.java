/* 
 * Nick Carnevale
 * 1/31/2022
 * CSE Class Participation Week 2
 * Build an ATM
 */
import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		
		int acctNumber;
		double balance = 1000.00;
		int deposit;
		int withdrawal;
		int pin;
		int decision;
		
		Scanner scanner = new Scanner(System.in);
		String welcomeMessage = "Welcome! \nPlease enter your Account Number: ";
		System.out.print(welcomeMessage);
		acctNumber = scanner.nextInt(); 
		if(acctNumber >= 10000 && acctNumber <= 99999) {
		System.out.print("Please enter your PIN: ");}
		else {
			System.out.println("\nInvalid Account Number. Please use 5 digits.");
			System.exit(0);}
		pin = scanner.nextInt();
		if(pin >= 1000 && pin <=9999) {
			System.out.println("Thank you. Please choose next option.");}
		else {
			System.out.println("Error: Invalid PIN.");
			System.exit(0);}
		
		System.out.println("\nMain Menu: ");
		System.out.println("Enter 1 to View Balance.");
		System.out.println("Enter 2 to Make a Withdrawal.");
		System.out.println("Enter 3 to Deposit Cash.");
		System.out.println("Enter 4 to Exit.");
		System.out.print("\nEnter here: ");
	
		decision = scanner.nextInt();
		while(decision == 1 || decision == 2 || decision == 3 || decision == 4){
			if(decision == 4) {
				System.out.println("Thank you for choosing the Lehigh ATM!");
				break;
			}
		switch (decision) {
		case 1:	
			System.out.println("\nYour Account Balance is: $" + balance);	
		break;
		case 2:	
			System.out.print("\nWithdrawal Amount: ");
			withdrawal = scanner.nextInt();	
			if(withdrawal < balance) {
				System.out.println("\nSufficent Funds. Vending Cash Now");
				balance -= withdrawal;
				System.out.println("Current Balance is: $"+ balance);}
			else {
				System.out.println("\nError, Insufficent Funds.");
				System.out.println("Current Balance is: $"+ balance);}
		break;
		case 3:
			System.out.print("\nHow much would you like deposit: ");
			deposit = scanner.nextInt();
			balance += deposit;
			System.out.println("\nCurrent Balance is: $"+ balance);	
		break;}
		System.out.println("\nMain Menu: ");
		System.out.println("Enter 1 to View Balance.");
		System.out.println("Enter 2 to Make a Withdrawal.");
		System.out.println("Enter 3 to Deposit Cash.");
		System.out.println("Enter 4 to Exit.");
		System.out.print("\nEnter here: ");
		decision = scanner.nextInt();
		}
	}
}

