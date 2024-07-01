/* Nick Carnevale
 * 4/11
 * CSE7 EXAM 2
 * 
 * Question 7
 */

public class Employee {

	public static void main(String[] args) {
		//given
		int[][] employeeHours = new int[25][7];
		int[] totalHours = new int[7];
		
		//run methods on given
		fillEmployeeHours(employeeHours);
		totalHours = calculateDailyTotals(employeeHours);
		
		//create new method for the weekly total
		int weekTotal = weeklyTotal(employeeHours);
		
		//display in console
		display(employeeHours,totalHours,weekTotal);
	}
	
	//this method generates random int 0-12 to fill the 2D Array 
	//Citing these for loops from my own code which I created last night after the review session
	//Using different variable names to suit this code
	public static void fillEmployeeHours(int[][] employeeHours) {
		
		for(int i = 0; i < employeeHours.length; i++) {
			for(int j = 0; j < employeeHours[i].length; j++) {
				employeeHours[i][j] = (int)(Math.random()*12);
			}
		}
	}	
	
	//This method returns the total of each column in a 2d array
	//Citing this code from my own work which I created last night after the review session
	//modified my code for the average of a column to just display the total of column
	//Using different variable names to suit this code
	public static int[] calculateDailyTotals(int[][] employeeHours) {
		int total;
    	int[] totals = new int[employeeHours[0].length];
    	for(int i = 0; i < employeeHours[0].length; i++) {
    		total= 0;
    		for(int j = 0; j < employeeHours.length; j++) {
        		total = total + employeeHours[j][i];
    		}
    		totals[i] = total;
    	}
    	return totals;
	}
	
	//This method returns the total of all of the values in the 2d Array
	//Citing these for loops from my own code which I created last night after the review session
	//modified my code for the average of a column to just display the total of column
	//Using different variable names to suit this code
	public static int weeklyTotal(int[][]employeeHours) {
		int total = 0;
    	for(int i = 0; i< employeeHours.length; i++) {
    		for(int j = 0; j<employeeHours[i].length;j++) {
    			total += employeeHours[i][j];	
    		}
    	}
    	return total;
	}
	
	//this method displays all of the information in an organized chart
	//Using part of my code which I created for the gradebook assignment
	//Changed the display to work exactly as intended for this program
	public static void display(int[][]employeeHour, int[]totalHours, int weeklyTotal) {
		
		System.out.println("\n\t\tSu\tM\tT\tW\tTH\tFr\tSa");
		
		for(int i = 0; i<employeeHour.length; i++) {
			System.out.print("\nEmployee " + (i+1) );
			for(int j = 0; j < employeeHour[i].length;j++) {
				System.out.print("\t" + employeeHour[i][j]);
			}
		}
		
		System.out.println("\n\n\t\tSu\tM\tT\tW\tTH\tFr\tSa");
		System.out.print("Totals:\t");
		for(int i = 0; i<totalHours.length;i++) {
			System.out.printf("\t%d",totalHours[i]);
		}
		
		System.out.printf("\n\nWeekly Total:\t%d hours worked",weeklyTotal);
		
	}
	
}
	

