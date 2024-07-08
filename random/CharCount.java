/* Nick Carnevale
 * Prof. Kalafut
 * CSE007
 * 3/29
 * 
 * This program counts the characters in a word or phrase entered by the user
 * It returns the amount of times each letter in the alphabet was used
 * And how many different letters were used
 */

//import scanner
import java.util.Scanner;
public class CharCount {

	public static void main(String[] args) {
		
		//declare variables
		Scanner scanner = new Scanner(System.in);
		String input;
		char[] message;
		
		//initialize alphabet array
		char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		int [] counts = new int[26];
		int temp;
		char tempChar;
		int counter = 0;
		
		//prompt user for word or phrase
		System.out.print("Please enter a word or phrase: ");
		
		//store user input
		input = scanner.nextLine();
		
		//initialize message array with input
		message = new char[input.length()];
		for(int i = 0; i < input.length();i++) {
			message[i] = input.charAt(i);
		}

		//increases counter if character in the input is equal to the corresponding one in the alphabet
		for(int i = 0; i < message.length; i++) {
			for(int j = 0; j < alphabet.length; j++) {
				if(message[i] == alphabet[j]) {
					counts[j]++;
				}
			}
		}
		
		//print the unsorted array and counter
		System.out.println("Unsorted Arrays:");
		for(char i : alphabet) {
			System.out.print(i + " ");
		}
		System.out.println();
		for(int i : counts) {
			System.out.print(i + " ");
		}
		
		//sort the counter array and alphabet array simultaneously in decending order
		for(int i = 0; i < counts.length; i++) {
			for(int j = i; j < counts.length; j++) {
				if(counts[i]< counts[j]) {
					temp = counts[i];
					tempChar = alphabet[i];					
					counts[i] = counts[j];
					alphabet[i] = alphabet[j];					
					counts[j] = temp;
					alphabet[j] = tempChar;
				}
			}
		}
		
		//print out the sorted arrays
		System.out.println();
		System.out.println("Sorted Arrays: ");
		for(char i : alphabet) {
			System.out.print(i + " ");
		}
		System.out.println();
		for(int i : counts) {
			System.out.print(i + " ");
		}
		
		//get the total number of unique letters in the word or phrase
		for(int i = 0; i < counts.length; i++) {
			if(counts[i] > 0) {
				counter++;
			}
		}
		
		//print out the total number of unique letters
		System.out.print("\nThe total number of unique letters is: " + counter);
			
	}

}
