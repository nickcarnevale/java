import java.util.Scanner;
public class NumberConversion {

	public static void main(String[] args) {

		//create user menu
		System.out.println("Number Conversion Menu");
		System.out.println("1. Hex\n2. Octal\n3. Binary");
		System.out.print("What type of number would you like to convert: ");
		
		//initialize scanner
		Scanner scnr = new Scanner(System.in);
		
		//get option from user
		int input = scnr.nextInt();
		
		switch(input) {
		case 1:
			//Get hex number from user
			System.out.print("\nEnter a hex number: ");
			
			//obtain hex number from user
			String hex = scnr.next();
			
			//converting hex to decimal by passing base 16
			int hexNum = Integer.parseInt(hex,16);
		
			//print out result
			System.out.print("\nDecimal equivalent of the given hex number: "+ hexNum);
			break;
		
		case 2:
			//Get octal number from user
			System.out.print("\nEnter an octal number: ");
			
			//obtain octal number
			String octal = scnr.next();
			
			//convert into decimal
			int octalNum = Integer.parseInt(octal, 8);
			
			//print out result
			System.out.print("\nDecimal equivalent of the given hex number: "+octalNum);
			break;
		case 3:
			//prompt for binary number
			System.out.print("\nEnter an binary number: ");
			
			//obtain binary number
			String binary = scnr.next();
			
			//convert into decimal
			int binaryNum = Integer.parseInt(binary,2);
			
			//print result
			System.out.print("\nDecimal equivalent of the given binary number: "+binaryNum);	
			break;
			
		//create default for if 1-3 is not entered
		default: System.out.println("Invalid Input. ");break;
		}
	}

}
