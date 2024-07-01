/* 
 * Nick Carnevale
 * Prof. Kalafut
 * CSE007 Weekly participation 4
 * Program that asks user for 5 numbers and prints the average
 */

import java.util.Scanner;
public class Average {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int total = 0;
		int count = 1;
		int num;
		System.out.print("Program to calculate average of 5 numbers: ");

		while(count<6) {
			System.out.printf("\nEnter number %d: ",count);
			num = scanner.nextInt();
			count++;
			total = total + num;
		}
		
		int average = total/5;
		System.out.println("\nTotal = " + total);
		System.out.println("Average = " + average);
	}

}
