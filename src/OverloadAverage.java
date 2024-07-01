/* Nick Carnevale
 * 4/1/2022
 * CSE7
 * 
 * This program asked the user for an array length and type
 * It then finds the average and prints the array 
 */

import java.util.Scanner;
public class OverloadAverage {

	//gets the length of the array and repeats until an int between 2 and 25 is repeated
	public static int getNumber(Scanner scanner) {
		boolean correct = true;
		int temp = 0;
		System.out.print("Enter an integer 2-25: ");
		do {
			if(scanner.hasNextInt()) {
				temp = scanner.nextInt();
				if(temp>1 && temp<26) {
					correct = true;
				}
				else {
					System.out.print("\nPLease enter int between 2-25: ");
					correct = false;
				}
			}
			else {
				System.out.print("\nPlease enter an int type between 2-25: ");
				correct = false;
				scanner.nextLine();
			}
		}while(!correct);
		return temp;
	}
	
	//gets the type of the array and repeats until an i or d is entered. 
	public static char getChar(Scanner scanner) {
		boolean correct = true;
		char temp = 'n';
		System.out.print("Enter either 'i' or 'd': ");
		do {
			temp = scanner.next().charAt(0);
			if(temp == 'i' || temp == 'd') {
				return temp;
			}
			else {
				System.out.print("\nPlease enter i or d: ");
				correct = false; 
				scanner.nextLine();
			}			
		}while(!correct);
		return temp;
		
	}
	
	//fills the array of type int with random digits between 1 and 100
	public static void fillArray(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random()*99 + 1);
		}
	}
	
	//fills the array of type double with random digits between 1 and 100
	public static void fillArray(double[] arr) {
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (Math.random()*99 + 1);
		}
	}
	
	//finds the average of the array of type int
	public static int findAverage(int[] arr1) {
		int total = 0;
		int average;
		for(int i: arr1) {
			total += i;
		}
		average = total/arr1.length;
		return average;
	}
	
	//finds the average of the array of type double
	public static double findAverage(double[]arr1) {
		double total = 0;
		double average;
		for(double i: arr1) {
			total += i;
		}
		average = total/arr1.length;
		return average;
	}
	
	//prints the int array
	public static void printArray(int[]arr2) {
		for(int i: arr2) {
			System.out.printf("%d, ", i);
		}
		
	}
	
	//prints the double array
	public static void printArray(double[]arr2) {
		for(double i: arr2) {
			System.out.printf("%f, ", i);
		}
	}
	
	public static void main(String[] args) {
		
		//declare variables
		Scanner scanner = new Scanner(System.in);
		int arraySize;
		int arrayType;
		int average;
		double average2;
		
		//intialize array and get input from user
		System.out.println("Enter the questions to determine your array.");
		arraySize = getNumber(scanner);
		arrayType = getChar(scanner);
		int[]arr;
		double[] arr2;
		
		//fill, find average, and print array of which type
		if(arrayType == 'i') {
			arr = new int[arraySize];
			fillArray(arr);
			average = findAverage(arr);
			printArray(arr);
			System.out.println("\nAverage of the array is: " + average);
		}
		else {
			arr2 = new double[arraySize];
			fillArray(arr2);
			average2 = findAverage(arr2);
			printArray(arr2);
			System.out.println("\nAverage of the array is: " + average2);	
		}	
	}
}
