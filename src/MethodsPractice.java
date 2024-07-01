/* Nick Carnevale
 * Mrs. Kalafut
 * 3/24
 * 
 * This program creates methods and uses them in the main method
 */

import java.util.Scanner;
public class MethodsPractice {

	//This is a method to return an integer value from a scanner input
	public static int getInt(Scanner input) {
		int value;
		boolean correct = true;
		
		//repeats until an integer is entered
		do {
		System.out.println("Enter an Integer: ");
		correct = input.hasNextInt();
		if(!correct) {
			System.out.println("You did not enter an integer.");
			input.nextLine();
			correct = false;
			value = 0;
		}
		else {
			value = input.nextInt();
			correct = true;
		}
		}while(!correct);
		return value;
	}
	
	//this method returns a boolean value if the integer is in the desired range
	public static boolean getIntRange(int x, int y, int getInt) {		
		boolean verify;
		
		//decided if the integer is in the range
		if(x>y) {
			if(getInt>y && getInt<x) {
				verify = true;
			}
			else {
				verify = false;
				System.out.println("Int is not in the range. ");
			}
		}
		else {
			if(getInt>x && getInt<y) {
				verify = true;
			}
			else {
				verify = false;
				System.out.println("Int is not in the range. ");
			}
		}
		return verify;
	}
	
	public static void main(String[] args) {
		
		//run the program utilizing the methods created
		Scanner scanner = new Scanner(System.in);
		boolean correct = true;
		int num;
		do {
			num = getInt(scanner);
			correct = getIntRange(10, 20, num);
		}while(!correct);
		
		
	}

}
