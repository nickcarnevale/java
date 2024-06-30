/*
 * Nick Carnevale
 * 2/4/2022
 * CSE 7: Lab 2
 * Phone Number Formatter Class
 */

import java.util.Scanner;
public class PhoneNumber {

	public static void main(String[] args) {

		//declare variables
		long phoneNumber;
		long areaCode;
		long next;
		long last;
		Scanner scanner = new Scanner(System.in);
		
		//ask for phone number
		System.out.print("Enter a 10 digit phone number : ");
		
		phoneNumber = scanner.nextLong();
		
		//isolate parts of phone number
		areaCode = phoneNumber / 10000000;
		next = phoneNumber % 10000000;
		next /=10000;
		last = phoneNumber %1000;
		
		//print formatted phone number
		System.out.printf("Formatted Phone Number: (%d) %d-%d", areaCode, next, last);
		
	}

}
