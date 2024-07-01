/* Nick Carnevale
 * Mrs. Kalafut
 * CSE7
 * 4/5/2022
 * 
 * This program stores methods for dealing with 3D arrays
 * Mainly creating, finding the largest and smallest integers, and getting the largest average of the 2d arrays
 */

public class ThreeDimArray {

	//gets a random integer within the range 1-10
	public static int getInt(int range) {
		int i = (int)(Math.random()*range + 1);
		return i;
	}
	
	//declares and initializes a random 3d array
	public static double[][][] createRandom3D(int ThreeDLength) {
		
		double[][][] three = new double[ThreeDLength][getInt(10)][getInt(10)];
		return three;	
	}
	
	//assigns random double values to populate the array
	public static void assign(double[][][] three) {
		for(int d = 0; d < three.length;d++) {
			for(int r = 0; r < three[d].length;r++) {
				for(int c = 0; c < three[d][r].length;c++) {
					three[d][r][c] = Math.random()*10 + 1;
				}
			}
		}
		
		for(int d = 0; d < three.length;d++) {
			for(int r = 0; r < three[d].length;r++) {
				for(int c = 0; c < three[d][r].length;c++) {
					System.out.printf("%.2f ",three[d][r][c]);
				}
				System.out.println();
			}
			System.out.println();
		}
	}
	
	//finds the largest double in the entire array and its position
	public static double[] findLargest(double[][][] three) {
		double largest = three[0][0][0];
		int d = 0;
		int r = 0;
		int c = 0;
		for(int dep = 0; dep < three.length;dep++) {
			for(int row = 0; row < three[dep].length;row++) {
				for(int col = 0; col < three[dep][row].length;col++) {
					if(three[dep][row][col]>largest) {
						largest = three[dep][row][col];
						d = dep;
						r = row;
						c = col;
					}
				}
			}
		}
		return new double[] {(largest),d,r,c};
		
	}
	
	//finds the smallest double within the array and its position
	public static double[] findSmallest(double[][][] three) {
		double smallest = three[0][0][0];
		int d =0;
		int r =0 ;
		int c =0;
		for(int dep = 0; dep < three.length;dep++) {
			for(int row = 0; row < three[dep].length;row++) {
				for(int col = 0; col < three[dep][row].length;col++) {
					if(three[dep][row][col]<smallest) {
						smallest = three[dep][row][col];
						d = dep;
						r = row;
						c = col;
						
					}
				}
			}
		}
		return new double[] {(smallest),d,r,c};	
	}

	//finds and returns the longest 1d array in the 3d array
	public static double[] findLongest(double[][][] three) {
		int longest = three[0][0].length;
		int d = 0;
		int r = 0;
		
		for(int dep = 0; dep < three.length;dep++) {
			for(int row = 0; row < three[dep].length;row++) {
					if(three[dep][row].length>=longest) {
						longest = three[dep][row].length;
						d = dep;
						r = row;						
				}
			}
		}
		double[] longestArray = new double[longest];
		longestArray = three[d][r];
		return longestArray;
	}

	//finds the largest average of the individual 2d arrays in the 3d array
	public static void largestAvg(double [][][] three) {
		double largest = 0;
		int count = 0;
		double[] total = new double[three.length];
		double[] average = new double[three.length];
		for(int i = 0; i < three.length;i++) {
			for(int j = 0; j < three[i].length;j++) {
				for(int k = 0; k< three[i][j].length;k++) {
					total[i] += three[i][j][k];
					average[i] = total[i]/(three[i].length * three[i][j].length);
				}
			}
		}	
		
		System.out.println("\nAverage Values for each 2D array in the 3D array: ");
		for(double i: average) {
			System.out.printf("%.2f ", i);
		}
		
		for(int i = 0; i < average.length; i++) {
			if(average[i]>largest) {
				largest = average[i];
				count = i;
			}
		}
		
		System.out.printf("\n\nLargest average is in array %d and is %.2f.", count, largest);
		
	}
	
	public static void main(String[] args) {

		//declare arrays to use the methods created
		double [][][] three = createRandom3D(3);
		System.out.println("Create & Show a Random 3D Array: ");
		
		//assign values to the 3d array
		assign(three);
		double[] largest;
		double[] smallest;
		double[] longest;
		
		//find the largest value and print
		System.out.println("This is the value & location of the largest element:");
		largest = findLargest(three);
		System.out.printf("[%.2f]   [%.0f][%.0f][%.0f]",largest[0],largest[1],largest[2],largest[3] );
		
		//find the smallest value and print
		System.out.println("\n\nThis is the value & location of the smallest element:");
		smallest = findSmallest(three);
		System.out.printf("[%.2f]    [%.0f][%.0f][%.0f]",smallest[0],smallest[1],smallest[2],smallest[3] );

		//find the longest array and print
		System.out.println("\n\nThis is the longest array:");
		longest = findLongest(three);
		for(double i: longest) {
			System.out.printf(i+ " ");
		}		
		System.out.println();
		
		//find the largest average and print
		largestAvg(three);
	}
}
