/*
 * Nick Carnevale
 * Prof. Kalafut
 * HW #2
 * Class that creates a math menu and tests the user. 
 */

//declaring imports
import java.util.Scanner;
import java.util.Random;

public class MathMenu {

	public static void main(String[] args) {
	
		//create the initial menu
		System.out.println("Welcome to the Math Program");
		System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division");
		System.out.print("Enter your Choice: ");
		
		//initialize scanner
		Scanner scnr = new Scanner(System.in);
		
		//get input
		int input =  scnr.nextInt();
		
		//create 2 random integers from 0-9
		Random rand = new Random();
		int num1 = rand.nextInt(10);
		int num2 = rand.nextInt(10);
		
		//create switch statement to allow user to choose which math operation
		switch(input) {
		
		//create the addition problem for the user
		case 1: System.out.printf("\n%d + %d = ", num1, num2);
		
		//obtain their answer
		int answer = scnr.nextInt();
		
		//determine whether their answer is correct and print
			if(input == 1 && (num1 + num2) == answer) {
				System.out.print("\nCorrect!");
			}
			else if(input == 1 && !((num1 + num2) == answer)) {
				System.out.println("\nIncorrect :(");
			}
			break;
	
		//create subtraction problem
		case 2: System.out.printf("\n%d - %d = ", num1, num2);
		
		//obtain user answer
		int answer2 = scnr.nextInt();

		//determine whether their answer is correct and print
			if(input == 2 && (num1 - num2) == answer2) {
			System.out.print("\nCorrect!");
			}
			else if(input == 2 && !((num1 - num2) == answer2)) {
			System.out.println("\nIncorrect :(");
			}
			break;

		//create multiplication problem
		case 3: System.out.printf("\n%d * %d = ", num1, num2);
		
		//obtain user answer
			int answer3 = scnr.nextInt();

		//determine whether their answer is correct and print
			if(input == 3 && (num1 * num2) == answer3) {
				System.out.print("\nCorrect!");
				System.exit(0);
			}
			else if(input == 3 && !((num1 * num2) == answer3)) {
				System.out.println("\nIncorrect :(");
				System.exit(0);
			}
			break;
		
		//create division problem
		case 4: System.out.printf("\n%d / %d = ", num1, num2);
		
		//obtain their answer
		int answer4 = scnr.nextInt();

		//determine whether their answer is correct and print
			if(input == 4 && (num1 / num2) == answer4) {
				System.out.print("\nCorrect!");
			}
			else if(input == 4 && !((num1 / num2) == answer4)) {
				System.out.println("\nIncorrect :(");
			}
			break;
		
		//create default for if user does not input 1-4
		default: System.out.println("Error, Invalid Input");
		}
	}
}
