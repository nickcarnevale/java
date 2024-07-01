/*
 * Nick Carnevale
 * CSE007
 * Prof. Kalafut
 * 3/3
 * 
 * Average Array program
 * This program creates an array of 10 and initalizes it with 10 random numbers between 1-20
 */

public class ArrayAverage {

	public static void main(String[] args) {

		//declare variables
		int total = 0;
		int min = 20;
		int max = 0;
		double average;
		
		//create array
		int[] array = new int[10];
		
		//initialize array
		for(int i = 0; i < 10; i++) {
			array[i] = (int) (Math.random()*20+1);
			
			//find min and maxs
			if(array[i]>max) {
				max = array[i];
			}
			if(array[i]<min) {
				min = array[i];
			}
		}
		
		
		System.out.println("The Array is: ");
		
		//print out array
		for(int temp: array) {
			System.out.println(" - "+ temp);
			
			//get the total of the array
			total += temp;
			
			
		}
		
		//print out average, min and max
		average = total/10;
		System.out.println("\nThe maximum is: " + max);
		System.out.println("The minimum is: " + min);
		System.out.println("The average is: " + average);


	}
}
