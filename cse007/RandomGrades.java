/* Nick Carnevale
 * Prof. Kalafut
 * 3/17/2022
 * 
 * This is a program that simulates going through a class's grades after a final
 * It initially asks the user to name the number of students in a class
 * Then the program generates random grades for each student on their final
 * It then asks the user to search for a grade or grade range
 * It then returns the number of grades in that range. 
 */

import java.util.Scanner;

public class RandomGrades {

	public static void main(String[] args) {
		
		//initialize and declare variables
		int students = 0;
		Scanner scanner = new Scanner(System.in);
		boolean valid1;
		boolean valid2 = true;
		String clear;
		int total = 0;
		double average;
		int search = 0;
		String searchGrade = "hi";
		int temp1;
		int temp;
		String tempString;
		int key = 0;
        char keyChar = 'A';
        boolean correct = false; 
        int interate = 0;
        int count = 0;
		
		//prompt user for class size
		System.out.print("Enter the class size of CSE7 (5-150): ");
		
		//make sure the entry is valid
		valid1 = scanner.hasNextInt();
		if(valid1) {
			students = scanner.nextInt();
			if(students >= 5 && students <= 150) {
				valid2 = true;
			}
			else
				valid2 = false;
		}
		else 
			clear = scanner.nextLine();
		
		//repeat prompt if the entry is invalid
		while(!valid1 || !valid2) {
			
			System.out.println("Invalid Entry, Please enter an integer between 5-150: ");
			valid1 = scanner.hasNextInt();
			if(valid1) {
				students = scanner.nextInt();
				if(students >= 5 && students <= 150) {
					valid2 = true;
				}
				else
					valid2 = false;
			}
			else {
				clear = scanner.nextLine();
			}
		}	
		
		//after entry is declared as valid, create an array with the entered number
		int[] grades = new int[students];

		//initialize array with random grades between 0-100
		for(int i = 0; i < grades.length; i++) {
			grades[i] = (int) (Math.random()*100);
		}
		
		//print out array, generate total as well
		System.out.print("Final Grades for CSE7: ");
		for(int i : grades) {
			total += i;
			System.out.print(i + " ");
		}
		
		//sort the array in descending order by utilizing a temp variable
		System.out.print("\nDescending CSE7 Grades: ");
		for(int i = 0; i < grades.length;i++) {
			for(int j = i; j < grades.length;j++) {
				if(grades[i]<grades[j]) {
				temp = grades[i];
				grades[i] = grades[j];
				grades[j] = temp;
				}
			}
		}
		
		//print out sorted array
		for(int a : grades) {
			System.out.print(a + " ");
		}
		
		//get the average grade and print
		average = (double) total / grades.length;
		System.out.printf("\nAverage course grade: %.3f", average);
		
        //prompt user for grade or grade range
		//repeat if given invalid entry
        do{
            System.out.print("\nEnter an integer between 0-100 or an A, B,C,D,F: ");
           
            //if user entered a number check if it is between 0-100
            if(scanner.hasNextInt()){
                key = scanner.nextInt();
               
                //find if the entry is included in the array of grades
                if(key >= 0 && key <= 100){
                    correct = true;
                    int low = 0;
                    int high = grades.length - 1;
                    int keyIndex = -1;
                    while(high >= low){
                        int mid = (high + low)/2;
                        interate++;
                        //{100,95,67,50,45,30,0}
                        // key = 30
                        if(grades[mid] < key){
                            high = mid - 1;
                        }
                        else if(grades[mid] > key){
                            low = mid + 1;
                        }
                        else{
                            keyIndex = mid;
                            break;
                        }
                    }
                   if(keyIndex == -1){
                       System.out.println("key is not found");
                   }
                   else{
                       System.out.println("Key is found at index " + keyIndex);
                       System.out.println("Number of iterations is " + interate);
                   }
                }
                else{
                    System.out.println("You did not enter a number between 0 and 100");
                    correct = false;
                    scanner.nextLine();
                }
               }
           
            //find if entry is A,B,C,D or F
            else{
               keyChar = scanner.next().charAt(0);
               scanner.nextLine();
               correct = true;
               //check if keyChar is A-F
               if(keyChar >= 'A' && keyChar <='F' && keyChar != 'E'){
                   
            	   //return entry is given grade range
            	   for (int index = 0; index < grades.length; index++){
                       switch(keyChar){
                           case 'A':
                               if(grades[index] >= 90){
                                   count++;
                           }
                           break;
                           case 'B':
                               if(grades[index] >= 80 && grades[index] < 90){
                                   count++;
                               }
                           break;
                           case 'C':
                               if(grades[index] >= 70 && grades[index] < 80){
                                   count++;
                               }
                           break;
                           case 'D':
                               if(grades[index] >= 60 && grades[index] < 70){
                                   count++;
                           }
                            break;
                           case 'F':
                               if(grades[index] < 60){
                                   count++;
                               }
                           break;
                   }
               }
               System.out.println("There are " + count + " grades in the " + keyChar + " range.");
           }
           else{
               System.out.println("You did not enter an A, B, C, D, or F");
               correct = false;
           }
       }

       } while(!correct);                   
}		
}

