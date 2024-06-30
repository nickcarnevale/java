/*
 * Nick Carnevale
 * Prof. Kalafut
 * CSE007
 * 3/4
 * 
 * This program creates an array with a length of 10, 
 * initializes it with a random set of 10 characters
 * and then asks the user to enter an integer and see if it is in the array. 
 */

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;


public class SearchCompare {

	public static void main(String[] args) {

		//declare and initialize variables
		Scanner scanner = new Scanner (System.in);
		Random random = new Random();
		int userLength = 10;
		char userChar;
		char[] array = new char[userLength];
		char key = 'w';
		System.out.println("Enter a letter between a to z: ");
		String userString = scanner.nextLine();
		key = userString.charAt(0);
		int indexValue = -1;
		int linearComparison = 0;
		int index;
		
		//create array and set its values
		for(index = 0;  index < array.length;index++) {
			array[index] = (char)(random.nextInt(26)+97);
		}
		
		//print out array
		System.out.println(Arrays.toString(array));
		
		//check if the user entered letter is in the array
		for(index = 0; index<array.length; index++) {
			if(array[index] == key) {
				indexValue = index;
				linearComparison = linearComparison + 1;
			}
			else {
				linearComparison = linearComparison + 1;
			}
		}
		if(indexValue == 1) {
			System.out.println(key + " was not found.");
		}
		else {
			System.out.println(key + " was found at index " + indexValue);
		}
	}

}
