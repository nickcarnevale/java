import java.util.Arrays;
public class Gradebook{
   
	public static void main(String [] args){
        int [][] gradesArray = {{87,96,70},
                                {68,87,90},
                                {94,100,90},
                                {100,81,82},
                                {83,65,85},
                                {78,87,65},
                                {85,75,83},
                                {91,94,100},
                                {76,72,84},
                                {87,93,73}};
        double [] averageRowArray = averageStudent(gradesArray);
        double [] averageColArray = averageTestScore(gradesArray);
        double totalAverage = getClassAverage(gradesArray);
        printGrades(gradesArray,averageRowArray,averageColArray,totalAverage);
    }
	
	public static double[] averageStudent(int[][] arr) {
		double [] array = new double[arr.length] ; 
		double total = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length;j++) {
				total += arr[i][j];
			}
			array[i] = total / (double) arr[i].length;
		}
		return array;
	}
	
	public static double[] averageTestScore(int[][] arr) {
		double[] average = new double[arr.length];
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				average[i]+= arr[i][j];
				average[i] /= arr.length;
			}
		}

		return average;
	}

	public static double getClassAverage(int[][] average) {
		double total = 0;
		for(int i = 0; i < average.length; i++) {
			for(int j = 0; j< average[i].length;j++)
			total += average[i][j];
		}
		return total / average.length;
	}
	
	public static void printGrades(int[][] gradesArray, double[]averageRowArray, double[] averageColArray, double totalAverage) {	    
		System.out.println("\n\t\tTest 1\tTest 2\tTest 3\tAverage");
		
		for(int i = 0; i<gradesArray.length; i++) {
			System.out.print("Student " + i+1 );
			for(int j = 0; j < gradesArray[i].length;j++) {
				System.out.print("\t" + gradesArray[i][j]);
			}
			System.out.printf("\t%.2f\n",averageRowArray[i]);
		}
		System.out.print("Average\t");
		for(int i = 0; i<averageColArray.length;i++) {
			System.out.printf("\t%.2f",averageColArray[i]);
		}
		System.out.printf("\t%.2f",totalAverage);
	}
	
	
}
	
