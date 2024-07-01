/*Nick Carnevale
 * Prof. Kalafut
 * CSE007
 * This program asks the user for a sequences of numbers between -100 and 100 
 * and counters the number of positive numbers, negative numbers 
 * and calculates the total and average of the numbers
 */

import java.util.Scanner;
public class Loops {

	public static void main(String[] args) {
		
		//initialize scanner and variables
		Scanner scanner = new Scanner(System.in);
		int input = 0;
		int counter = 0;
		int positiveCounter = 0;
		int negativeCounter = 0;
		int total = 0;
		double average;
		boolean valid = true;
		
		//prompt the user
		System.out.println("Enter integers between -100 and 100, stop by entering 0:");

		//first do while loop continues unless input is 0
		do {
		
		//second do while loop continues unless input is invalid
		do {
			
			//this sequence of if statements checks to see the input is valid
			if(!scanner.hasNextInt()) {
				valid = false;
				System.out.println("Error, invalid value. Please try again.");
				scanner.nextLine();	
			}
			else {
				input = scanner.nextInt();
				if(input > 100 || input <-100) {
					System.out.println("Invalid Range. Please try again. ");
					valid = false;
					scanner.nextLine();
				}
				else {
					valid = true;
				}
			}

		}while(!valid);
		
			//increases positive counter if input is valid and positive
			if(input>0) {
				positiveCounter++;
			}
			//increase negative counter if input is negative
			else if(input<0){
				negativeCounter++;
			}
			
			//completing the calculations
			counter = positiveCounter + negativeCounter;
			total = total + input;
			average = (double) total / counter;
		
		}while(input !=0);
		
		//print out the result if only 0 is enter
		
		if(counter == 0) {
			System.out.println("\nNo numbers were entered execpt 0.");
		}
		
		//else print out the result
		else {
		System.out.print("\nThe number of positive intergers is: " + positiveCounter);
		System.out.print("\nThe number of negative intergers is: " + negativeCounter);
		System.out.print("\nThe total is: " + total);
		System.out.print("\nThe average is: " + average);
		}
		


	}
}
