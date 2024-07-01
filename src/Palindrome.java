/* 
 * Nick Carnevale
 * Prof. Kalafut
 * CSE 007
 * 
 * Lab. 4
 * 
 * This program checks a user string to see if it is a palindrome. 
 */

import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {

		//initialize scanner and variables
		Scanner myscn = new Scanner(System.in);
		char inpuChar;
		String word;
		boolean isPalindrome = true;
		
		//prompt user for word
		System.out.print("Enter your sentence or word: ");
		word = myscn.nextLine();
		
		//tell whether the word is a palindrome
		for(int i = 0; i < word.length(); i++) {
			if(word.charAt(i) != word.charAt(word.length()-i-1)){
				isPalindrome = false;
				break;
			}
		}
		//print out the answer
		System.out.println(isPalindrome);
		
	}

}
