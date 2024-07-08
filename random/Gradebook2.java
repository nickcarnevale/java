import java.util.Arrays;
public class Gradebook2{
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
        printRowMemory(gradesArray);
        sortRows(gradesArray);
    }
    
    public static double[] averageStudent(int[][] gradesArray) { 
    	
    	double[] average = new double[gradesArray.length];
    	for(int i = 0; i < gradesArray.length; i++) {
    		double[] totals = new double[gradesArray.length];
    		for(int j = 0; j < gradesArray[i].length; j++) {
    			totals[i] += (double) gradesArray[i][j];
    		}
    		average[i] = totals[i]/gradesArray[i].length;
    	}

    	return average;
    	
    }
    
    public static double[] averageTestScore(int [][] gradesArray) {
    	
    	double total;
    	double[] average = new double[gradesArray[0].length];
    	for(int i = 0; i < gradesArray[0].length; i++) {
    		total= 0;
    		for(int j = 0; j < gradesArray.length; j++) {
        		total = total + gradesArray[j][i];
    		}
    		average[i] = total/gradesArray.length;
    	}
    	return average;
    	
    }
    
    public static double getClassAverage(int[][] gradesArray) {
    	
    	double total = 0;
    	double average = 0;
    	for(int i = 0; i< gradesArray.length; i++) {
    		for(int j = 0; j<gradesArray[i].length;j++) {
    			total += (double) gradesArray[i][j];
    			average = total/(gradesArray.length * gradesArray[0].length);
    		}
    	}
    	return average;
    }

    public static void printGrades(int[][] gradesArray, double[] averageStudent, double[] averageTestScore, double totalAverage) {
    	
		System.out.println("\n\t\tTest 1\tTest 2\tTest 3\tAverage");
		
		for(int i = 0; i<gradesArray.length; i++) {
			System.out.print("Student " + (i+1) );
			for(int j = 0; j < gradesArray[i].length;j++) {
				System.out.print("\t" + gradesArray[i][j]);
			}
			System.out.printf("\t%.2f\n",averageStudent[i]);
		}
		System.out.print("Average\t");
		for(int i = 0; i<averageTestScore.length;i++) {
			System.out.printf("\t%.2f",averageTestScore[i]);
		}
		System.out.printf("\t%.2f",totalAverage);
    	
    }
    
    public static void printRowMemory(int[][] gradesArray) {	
    	System.out.print("\n\nRow:\tMemory Reference: ");
    	for(int i = 0; i < gradesArray.length; i++) {
    		System.out.printf("\n%d\t%s",i, gradesArray[i]);
    	} 	
    }
    
    public static void sortRows(int[][] gradesArray) {
    	
    	int temp = 0; 
    	for(int i = 0; i < gradesArray.length; i++) {
    		for(int j = 0; j < gradesArray[i].length;j++) {
    		for(int k = j+1; k < gradesArray[i].length;k++) {
    			if(gradesArray[i][j] < gradesArray[i][k]) {
    				temp = gradesArray[i][j];
    				gradesArray[i][j] = gradesArray[i][k];
    				gradesArray[i][k] = temp;
    			}
    		}
    		}
    	}
    	
    	for(int i = 0; i < gradesArray.length;i++) {
    		System.out.println();
			for(int j = 0; j < gradesArray[i].length;j++) {
				System.out.print("\t" + gradesArray[i][j]);}
    	}
    	
    }
}
