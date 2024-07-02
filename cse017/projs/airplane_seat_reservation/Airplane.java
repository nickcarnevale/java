/***
 * Class Airplane
 * @author Nicholas Carnevale
 * @version 0.1
 * Date of creation: Sepember 9, 2021
 * Last Date Modified: September 9, 2021
 */

//import statements
import java.util.Scanner;
import java.io.File; 
import java.io.PrintWriter; 
import java.io.FileNotFoundException; 

public class Airplane{

    //data members
    private char[][] seatMap;

    //blank constructor that initalizes a seat map for the airplane
    public Airplane(){
        seatMap = new char[9][8]; 
        for(int i = 0; i < seatMap.length; i++){
            for(int j = 0; j < seatMap[i].length; j++){
                seatMap[i][j] = '.';
            }
        }
    }

    /***
	 * Constructor with one parameters
	 * @param	filename string that takes input from file and reads it to initliaze the seat map
	 */
    public Airplane(String fileName){
        seatMap = new char[9][8];
        readMap(fileName);
    }

    /***
	 * Method read the seatmap from file
	 * @param	filename string name of the file
	 */
    public void readMap(String fileName){
        File file = new File(fileName);
        try{
        Scanner fileReader = new Scanner(file); 
        for(int i = 0; i < seatMap.length; i++){
            for(int j = 0; j < seatMap[i].length; j++){
                seatMap[i][j] = fileReader.next().charAt(0);
            }
            fileReader.nextLine();
        }      
        fileReader.close();
        }
        catch(FileNotFoundException e){
            System.out.print("File " + fileName + " does not exist.");
        }
        

    }

    /***
	 * Method check the seat reservation of the seat map
	 * @param	seatnumber string number of seat in map
	 */
    public boolean checkSeatReservation(String seatNumber)throws InvalidSeatException{
        
        boolean good = true; 

        if(Character.getNumericValue(seatNumber.charAt(0)) > 9 || Character.getNumericValue(seatNumber.charAt(0)) < 1){
            throw new InvalidSeatException("Invalid Seat Number..."); 
        }
        else good = true; 

        int row = Character.getNumericValue(seatNumber.charAt(0)) -1;
        int col = -1;
        if(seatNumber.charAt(1) == 'A' || seatNumber.charAt(1) == 'a'){col = 0; return good;}
        else if(seatNumber.charAt(1) == 'B' || seatNumber.charAt(1) == 'b'){col = 1;return true;}
        else if(seatNumber.charAt(1) == 'C' || seatNumber.charAt(1) == 'c'){col = 2;return true;}
        else if(seatNumber.charAt(1) == 'D' || seatNumber.charAt(1) == 'd'){col = 3;return true;}
        else if(seatNumber.charAt(1) == 'E' || seatNumber.charAt(1) == 'e'){col = 4;return true;}
        else if(seatNumber.charAt(1) == 'F' || seatNumber.charAt(1) == 'f'){col = 5;return true;}
        else if(seatNumber.charAt(1) == 'G' || seatNumber.charAt(1) == 'g'){col = 6;return true;}
        else if(seatNumber.charAt(1) == 'H' || seatNumber.charAt(1) == 'h'){col = 7;return true;}
        else {throw new InvalidSeatException("Invalid Input. Please enter in the correct format. ");}
    
    }

    /***
	 * Method make a seat reservation of the seat map
	 * @param	seatnumber string number of seat in map
	 */
    public boolean reserveSeat(String seatNumber) throws InvalidSeatException{

        int row = Character.getNumericValue(seatNumber.charAt(0)) -1;
        int col = -1;
        if(seatNumber.charAt(1) == 'A' || seatNumber.charAt(1) == 'a'){col = 0;}
        else if(seatNumber.charAt(1) == 'B' || seatNumber.charAt(1) == 'b'){col = 1;}
        else if(seatNumber.charAt(1) == 'C' || seatNumber.charAt(1) == 'c'){col = 2;}
        else if(seatNumber.charAt(1) == 'D' || seatNumber.charAt(1) == 'd'){col = 3;}
        else if(seatNumber.charAt(1) == 'E' || seatNumber.charAt(1) == 'e'){col = 4;}
        else if(seatNumber.charAt(1) == 'F' || seatNumber.charAt(1) == 'f'){col = 5;}
        else if(seatNumber.charAt(1) == 'G' || seatNumber.charAt(1) == 'g'){col = 6;}
        else if(seatNumber.charAt(1) == 'H' || seatNumber.charAt(1) == 'h'){col = 7;}
        else throw new InvalidSeatException("Invalid Input. Please enter in the correct format. 1"); 

        if(seatMap[row][col] == '.'){
            seatMap[row][col] = 'X';
            return true; 
        }
        else throw new InvalidSeatException("Seat is already taken :( Please choose another. 2");
    }

    /***
	 * Method free seat reservation on the seat map
	 * @param	seatnumber string number of seat in map
	 */
    public boolean freeSeat(String seatNumber) throws InvalidSeatException{

        int row = Character.getNumericValue(seatNumber.charAt(0)) - 1;
        int col = -1;
        if(seatNumber.charAt(1) == 'A' || seatNumber.charAt(1) == 'a'){col = 0;}
        else if(seatNumber.charAt(1) == 'B' || seatNumber.charAt(1) == 'b'){col = 1;}
        else if(seatNumber.charAt(1) == 'C' || seatNumber.charAt(1) == 'c'){col = 2;}
        else if(seatNumber.charAt(1) == 'D' || seatNumber.charAt(1) == 'd'){col = 3;}
        else if(seatNumber.charAt(1) == 'E' || seatNumber.charAt(1) == 'e'){col = 4;}
        else if(seatNumber.charAt(1) == 'F' || seatNumber.charAt(1) == 'f'){col = 5;}
        else if(seatNumber.charAt(1) == 'G' || seatNumber.charAt(1) == 'g'){col = 6;}
        else if(seatNumber.charAt(1) == 'H' || seatNumber.charAt(1) == 'h'){col = 7;}
        else throw new InvalidSeatException("Invalid Input. Please enter in the correct format. 3"); 

        if(seatMap[row][col] == 'X'){
            seatMap[row][col] = '.';
            return true; 
        }
        else throw new InvalidSeatException("Seat is already free. Please choose another. 4");
    }

    /***
	 * Method save the seatmap from file
	 * @param	filename string name of the file
	 */
    public void saveMap(String fileName){

        try{
            File file = new File(fileName);
            PrintWriter writeFile = new PrintWriter(file);
            for(int i = 0; i < seatMap.length; i++){
                for(int j = 0; j < seatMap[i].length; j++){
                    writeFile.print(seatMap[i][j] + " ");
                }
                writeFile.println(); 
            }
            writeFile.close();      
        }
        catch(FileNotFoundException e){
            System.out.println("Cannot write to " + fileName);
        }
    }

    /***
	 * Method to get the airplane information
	 * no parameters
	 * @return formatted string containing the value of the data members
	 */
    public String toString(){
        String out = ""; 
        System.out.println("\n  A B C D E F G H");
        for(int i = 0; i < seatMap.length; i++){
                out += i+1 + " ";
                for(int j = 0; j < seatMap[i].length; j++){
                    out += String.format(seatMap[i][j] + " ");
                }
                out += "\n"; 
            }
        return out; 
    }

}