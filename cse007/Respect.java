/* 
 * Nick Carnevale
 * Prof. Kalafut
 * CSE 007
 * 
 * Lab. 4
 * 
 * This program takes a user string a creates a repeated pattern with the desired word.
 * Can create 4 different patterns with the word.
 * utilizes nested for loops  
 */

import java.util.Scanner;
public class Respect {

	public static void main(String[] args) {
		
		//initialize scanner and variables
		Scanner scanner = new Scanner(System.in);
		String input;
		String word;
		
		//print out a prompt
		System.out.print("Please enter a word to be used in your pattern: ");
		word = scanner.next();
	
		System.out.println("\nPlease choose:\n-A\n-B\n-C\n-D\n:");
		input = scanner.next();
		
		//switch statement to get the desired choice from user
		switch(input.toLowerCase()) {
		case "a":
			
			//nest for loop to create desired pattern
			for(int row = 0; row < word.length(); row++) {
				for(int col = 0; col <= row; col++) {
					System.out.print(word.charAt(col));
				}
				System.out.println();
			}
			
			break;
		case "b":
			
			//nest for loop to create desired pattern
			for(int row = word.length()-1; row >= 0; row--) {
				for(int col = 0; col <= row; col++) {
					System.out.print(word.charAt(col));
				}
				System.out.println();
			}
			break;
		case "c":
			
			//nest for loop to create desired pattern
			for(int row = 0; row < word.length(); row++) {
				for(int blanks = word.length()-1; blanks >= row; blanks--) {
					System.out.print(" ");
				}
				for(int col = row; col >= 0; col--) {
					System.out.print(word.charAt(col));
				}
				System.out.println();
			}
			
			break;
		case "d":
			
			//nest for loop to create desired pattern
			for(int row = 0; row < word.length(); row++) {
				for(int col = word.length()-1; col >= row; col--) {
					System.out.print(word.charAt(col));
				}
				System.out.println();
			}
			break;
		
			//default case for switch loop
		default: System.out.println("Error.");
			break;
		}
	
		
	}

}
