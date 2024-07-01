/* Nick Carnevale
 * 4/1/2022
 * CSE7
 * 
 * This program asked the user for an array length and type of the MultiDimArray
 * It then finds the average and prints the array 
 */

import java.util.Scanner;
import java.util.Arrays;
public class MultiDimAverage {
	
	//finds row average of the array
    public static double[]findRowAverage(int[][] list) {
        double [] rowAverages = new double[list.length];
        double total = 0;
        int counter = 0;
        for(int row = 0; row < list.length; row++){
            for(int col = 0; col < list[row].length;col++){
                total = total + list[row][col];
            }
            rowAverages[row] = total /list[row].length;
            total = 0;
        }
         
       return rowAverages;
    }
    
    //fills the array of type double
    public static void fillArray(double[][] arr1) {
        for(int row = 0; row < arr1.length; row++){
           for(int col = 0; col < arr1[row].length;col++){
               arr1[row][col] = row + col + 0.5;
           }
        }   
    }

    //fills the array of type int
    public static void fillArray(int[][] arr1) {
        for(int row = 0; row < arr1.length; row++){
            for(int col = 0; col < arr1[row].length;col++){
                arr1[row][col] = row + col;
            }
        }
    }

    //finds the average of the array of type in
    public static double findAverage(int[][] list) {
        double total = 0;
        int counter = 0;
        for(int row = 0; row < list.length; row++){
            for(int col = 0; col < list[row].length;col++){
                total = total + list[row][col];
                counter = counter + 1;
            }
        }
         
       return total / counter;
    }

    //finds the average of the array of type double
    public static double findAverage(double[][] list) {
        double total = 0;
        int counter = 0;
        for(int row = 0; row < list.length; row++){
            for(int col = 0; col < list[row].length;col++){
                total = total + list[row][col];
                counter = counter + 1;
            }
        }
        return total / counter;
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        //initializes arrays
        System.out.println("Enter the number of Rows.");
        int rows = getLength(s);
        System.out.println("Enter the number of Columns. ");
        int cols = getLength(s);
        System.out.println("Enter the type of array.");
        int [][] arrI = new int[rows][cols];
        double [][] arrD = new double[rows][cols];
        char type = getType(s);
        
        //fills arrays and prints them depends on the type
        switch (type) {
            case 'i':
                
                fillArray(arrI);
                System.out.println(Arrays.toString(arrI));//prints memory addresses of each array element
                System.out.println(Arrays.deepToString(arrI)); //prints the individual integer values instead
                System.out.println("The average of the above matrix is: " + Arrays.toString(findRowAverage(arrI)));
                break;
            case 'd':

                fillArray(arrD);
                System.out.println(Arrays.toString(arrD)); //prints memory addresses of each array element
                System.out.println(Arrays.deepToString(arrD)); //prints the individual double values instead
                System.out.println("The average of the above matrix is: " + findAverage(arrD));
                break;
        }
        s.close();
    }
    
    //gets the type of array and repeats until an i or d is typed
    public static char getType(Scanner scan){
        char type = '\u0000';
        boolean loopControl = true;
        do{
            System.out.println("Enter an 'i' or 'd': ");
            type = scan.nextLine().charAt(0);
            if(type == 'i' || type == 'd'){
                loopControl = false;
            } else {
                System.out.println("invalid type, try again.");
            }
        }while(loopControl);
        return type;
    }
    
    //gets the length of the array and repeats until an int between 2 and 25 is entered
    public static int getLength(Scanner scan){
        int length = 0;
        boolean loopControl = true;
        do{
            System.out.println("Enter a number between 2 and 25: ");
            if(scan.hasNextInt()){
                length = scan.nextInt();
                scan.nextLine();
                if(length >=2 && length <=25){
                    loopControl = false;
                } else{
                    System.out.println("# outside of range");
                }
            } else {
                System.out.println("not an int");
                scan.nextLine();
            }
        } while (loopControl);
        return length;
    }


}
