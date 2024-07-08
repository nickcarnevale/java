/* 
 * Nick Carnevale
 * Prof. Kalafut
 * CSE007 Weekly participation 4
 * Program that asks user for how many numbers they want and prints the average
 */


import java.util.Scanner;
public class Average2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int total = 0;
		int count = 1;
		int num;
		System.out.print("How many numbers do you want to find the average of: ");

		int countNums = scanner.nextInt();
		
		while(count != (countNums+1)) {
			System.out.printf("\nEnter number %d: ",count);
			num = scanner.nextInt();
			count++;
			total = total + num;
		}
		
		double average = (double) total/5;
		
		System.out.println("\nTotal = " + total);
		System.out.println("Average = " + average);
		
	}

}
