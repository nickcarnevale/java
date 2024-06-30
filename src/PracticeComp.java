/* Nick Carnevale
 * Prof. Kalafut
 * 5/7/2022
 * 
 * This program tests the animal, dog, and rescue dog classes by creating an animal array, sorting the heights and weights and finding the averages and totals
 */

//need to create random animal's weights and heights
import java.util.Random;
public class PracticeComp {

	//main
	public static void main(String[] args) {
		
		//variables for main
		Random random = new Random();
		Animal[][]list = new Animal[3][15];
		double[] avgHeight;
		double[] avgWeight;
		double[] totalHeight;
		double[] totalWeight;
		
		//randomize the 2d animal array
		for(int i = 0; i < list[0].length;i++) {
			list[0][i] = new Animal(random.nextDouble()*35 + 1,random.nextDouble()*99 + 1);
			list[1][i] = new Dog(random.nextDouble()*35 + 1,random.nextDouble()*99 + 1);
			list[2][i] = new RescueDog(random.nextDouble()*35 + 1,random.nextDouble()*99 + 1);
		}

		//sort the heights
		sortColumnHeight(list);
		
		//get all the averages and totals using static methods
		avgHeight = averageHeightOfColumns(list);
		avgWeight = averageWeightOfColumns(list);
		totalHeight = totalHeightOfColumns(list);
		totalWeight = totalWeightOfColumns(list);
		
		//print in a readable manner
		System.out.println("HEIGHTS\tAnimal\tDog\tRescue Dog");
			for(int j = 0; j < list[0].length; j++) {
				System.out.print(j+1 + ".");
				System.out.printf("\t%.2f",list[0][j].getHeight());
				System.out.printf("\t%.2f",list[1][j].getHeight());
				System.out.printf("\t%.2f\n",list[2][j].getHeight());

			}
		
		//print the avg height below
		System.out.print("AvgH");
		for(int i = 0; i < avgHeight.length; i++) {
			System.out.printf("\t%.2f",avgHeight[i]);
		}
		
		//print the total height below
		System.out.print("\nTotalH");
		for(int i = 0; i < totalHeight.length; i++) {
			System.out.printf("\t%.2f",totalHeight[i]);
		}
		
		//sort the weights
		sortColumnWeight(list);
		
		//print the weights in a readable manner
		System.out.println("\n\nWEIGHTS\tAnimal\tDog\tRescue Dog");
		for(int j = 0; j < list[0].length; j++) {
			System.out.print(j+1 + ".");
			System.out.printf("\t%.2f",list[0][j].getWeight());
			System.out.printf("\t%.2f",list[1][j].getWeight());
			System.out.printf("\t%.2f\n",list[2][j].getWeight());
		}
	
		//print the average weight below
		System.out.print("AvgW");
		for(int i = 0; i < avgWeight.length; i++) {
			System.out.printf("\t%.2f",avgWeight[i]);
		}
	
		//print the total weight below
		System.out.print("\nTotalW");
		for(int i = 0; i < totalWeight.length; i++) {
			System.out.printf("\t%.2f",totalWeight[i]);
		}
	
	}

	//method to sort the height of the columns of the animal array
	public static void sortColumnHeight(Animal[][]list) {
		Animal temp; 
    	for(int i = 0; i < list.length; i++) {
    		for(int j = 0; j < list[i].length; j++) {
    			for(int k = j+1; k < list[i].length; k++) {
    				if(list[i][j].getHeight() > list[i][k].getHeight()) {
        				temp = list[i][j];
        				list[i][j] = list[i][k];
        				list[i][k] = temp;	
    				}
    			}
    		}
    	}
	}
	
	//method to sort the weight of the columns of the animal array
	public static void sortColumnWeight(Animal[][]list) {
		Animal temp; 
		for(int i = 0; i < list.length; i++) {
    		for(int j = 0; j < list[i].length; j++) {
    			for(int k = j+1; k < list[i].length; k++) {
    				if(list[i][j].getWeight() > list[i][k].getWeight()) {
        				temp = list[i][j];
        				list[i][j] = list[i][k];
        				list[i][k] = temp;
        			
    			}
    		}
    	}
    	}
	}
	
	//method to find the average height of each column
	public static double[] averageHeightOfColumns(Animal[][]list) {
		
		double total;
    	double[] average = new double[list.length];
    	for(int i = 0; i < list.length; i++) {
    		total= 0;
    		for(int j = 0; j < list[i].length; j++) {
        		total = total + list[i][j].getHeight();
    		}
    		average[i] = total/list[i].length;
    	}
    	return average;
		
	}

	//method to find the average weight of each column
	public static double[] averageWeightOfColumns(Animal[][]list) {
		
		double total;
    	double[] average = new double[list.length];
    	for(int i = 0; i < list.length; i++) {
    		total= 0;
    		for(int j = 0; j < list[i].length; j++) {
        		total = total + list[i][j].getWeight();
    		}
    		average[i] = total/list[i].length;
    	}
    	return average;
		
	}

	//method to find the total height of each column
	public static double[] totalHeightOfColumns(Animal[][]list) {
		
		double total;
    	double[] average = new double[list.length];
    	for(int i = 0; i < list.length; i++) {
    		total= 0;
    		for(int j = 0; j < list[i].length; j++) {
        		total = total + list[i][j].getHeight();
    		}
    		average[i] = total;
    	}
    	return average;
		
	}

	//method to find the total weight of each column
	public static double[] totalWeightOfColumns(Animal[][]list) {
		
		double total;
    	double[] average = new double[list.length];
    	for(int i = 0; i < list.length; i++) {
    		total= 0;
    		for(int j = 0; j < list[i].length; j++) {
        		total = total + list[i][j].getWeight();
    		}
    		average[i] = total;
    	}
    	return average;
		
	}
}
