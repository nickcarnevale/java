
public class TwoDimArray {

	public static void main(String[] args) {

		int[][] numbers = new int[5][10];
		randomlyAssign(numbers);
		print2DArray(numbers);
		double[] rowAvg = averageOfRows(numbers);
		System.out.println("\nAverage of Rows: ");
		print1DArray(rowAvg);
		System.out.println("\n\nAverage of Columns:");
		double[] columnAvg = averageOfColumns(numbers);
		print1DArray(columnAvg);
		System.out.println("\n\nTotal Average:");
		double totalAvg = totalAverage(numbers);
		System.out.println(totalAvg);
		System.out.println("\n\nSort Rows: ");
		sortRows(numbers);
		sortColumns(numbers);
		print2DArray(numbers);
		
		String[][] sort = {
				{"a","e","d","c","Z","D"},
                {"2","1","9","3","8"},
                {"then","hello","hellooo","helloo"},
                {"83","65","87","121","99","100"},
		};
		System.out.print("\nString ");
		print2DArray(sort);
		sortStringArray(sort);
		System.out.println("\nSorted String ");
		print2DArray(sort);
				
	}
	
	public static void randomlyAssign(int[][]numbers) {
		
		for(int i = 0; i < numbers.length; i++) {
			for(int j = 0; j < numbers[i].length; j++) {
				numbers[i][j] = (int)((Math.random()*49) + 1);
			}
		}
	}
	
	public static double[] averageOfRows(int[][]numbers) {
		
		double[] average = new double[numbers.length];
    	for(int i = 0; i < numbers.length; i++) {
    		double[] totals = new double[numbers.length];
    		for(int j = 0; j < numbers[i].length; j++) {
    			totals[i] += (double) numbers[i][j];
    		}
    		average[i] = totals[i]/numbers[i].length;
    	}

    	return average;
		
	}
	
	public static double[] averageOfColumns(int[][]numbers) {
		
		double total;
    	double[] average = new double[numbers[0].length];
    	for(int i = 0; i < numbers[0].length; i++) {
    		total= 0;
    		for(int j = 0; j < numbers.length; j++) {
        		total = total + numbers[j][i];
    		}
    		average[i] = total/numbers.length;
    	}
    	return average;
		
	}
	
	public static double totalAverage(int[][]numbers) {
		
		double total = 0;
    	double average = 0;
    	for(int i = 0; i< numbers.length; i++) {
    		for(int j = 0; j<numbers[i].length;j++) {
    			total += (double) numbers[i][j];
    			average = total/(numbers.length * numbers[0].length);
    		}
    	}
    	return average;	
	}
	
	//needs check
	public static void sortRows(int[][]numbers) {
		
    	int temp = 0; 
    	for(int i = 0; i < numbers.length; i++) {
    		for(int j = 0; j < numbers[i].length;j++) {
    		for(int k = j+1; k < numbers[i].length;k++) {
    			if(numbers[i][j] > numbers[i][k]) {
    				temp = numbers[i][j];
    				numbers[i][j] = numbers[i][k];
    				numbers[i][k] = temp;
    			}
    		}
    		}
    	}
	}
	
	//does not work use examprep
	public static void sortColumns(int[][]numbers) {
		int temp = 0; 
    	for(int i = 0; i < numbers[0].length; i++) {
    		for(int j = 0; j < numbers.length;j++) {
    		for(int k = j+1; k < numbers.length;k++) {
    			if(numbers[j][i] > numbers[k][i]) {
    				temp = numbers[j][i];
    				numbers[j][i] = numbers[k][i];
    				numbers[k][i] = temp;
    			}
    		}
    		}
    	}
	}
	
	public static void sortStringArray(String[][]sort) {
		
    	String temp; 
    	for(int i = 0; i < sort.length; i++) {
    		for(int j = 0; j < sort[i].length;j++) {
    		for(int k = j+1; k < sort[i].length;k++) {
    			if(sort[i][j].compareTo(sort[i][k])>0) {
    				temp = sort[i][j];
    				sort[i][j] = sort[i][k];
    				sort[i][k] = temp;
    			}
    		}
    		}
    	}
	}
	
	public static void print2DArray(int[][]numbers) {
		System.out.println("Array: ");
		for(int i = 0; i < numbers.length; i++) {
			for(int j = 0; j < numbers[i].length; j++) {
				System.out.print(numbers[i][j]+ " ");
			}
			System.out.println();
		}
	}
		
	public static void print2DArray(String[][]numbers) {
		System.out.println("Array: ");
		for(int i = 0; i < numbers.length; i++) {
			for(int j = 0; j < numbers[i].length; j++) {
				System.out.print(numbers[i][j]+ " ");
			}
			System.out.println();
			}
	
	}
	public static void print1DArray(double[]numbers) {
		for(int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
	}

}
