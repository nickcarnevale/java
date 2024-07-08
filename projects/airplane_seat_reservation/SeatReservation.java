/***
 * Class to Seat Reservation to test the Airplane Classes
 * @author Nicholas Carnevale
 * @version 0.1
 * Date of creation: Sepember 9, 2021
 * Last Date Modified: September 9, 2021
 */

import java.util.Scanner; 
import java.util.InputMismatchException; 

public class SeatReservation{

    //main method
    public static void main(String[]args){

        //data members
        boolean correct = true; 
        String seat = ""; 
        Scanner scanner = new Scanner(System.in);
        Airplane delta = new Airplane("seatsmap.txt");
        
        //loop to get the menu selection
        while(correct){
            System.out.print(delta.toString());
            int selection = menuSelection(scanner);
            switch(selection){
                
                //reservate a seat
                case 1: seat = getSeat(scanner); 
                        try{
                        if(delta.checkSeatReservation(seat)){
                            delta.reserveSeat(seat);
                            delta.saveMap("seatsmap.txt");
                        }  
                        }
                        catch(InvalidSeatException e){
                            System.out.println(e.getMessage());
                        }
                break; 
                
                //free a seat
                case 2: seat = getSeat(scanner); 
                        try{
                        if(delta.checkSeatReservation(seat)){
                            delta.freeSeat(seat);
                            delta.saveMap("seatsmap.txt");
                        }  
                        }
                        catch(InvalidSeatException e){
                            System.out.println(e.getMessage());
                        }
                break; 
                
                //exit
                case 3: System.out.println("Thank you using my airplane seat reservation program.");
                        correct = false; 
                break; 
            }
        }

    }

    /***
	 * Method to get seat number
	 * @param	scanner of type Scanner 
	 * @return	input
	 */
    public static String getSeat(Scanner scanner){
        String input = "";
        boolean correct = true; 
        System.out.println("Enter a seat number (number, letter format (1A)): ");

        while(correct){
            input = scanner.next(); 
            if(input.length() == 2){
                correct = false;
                return input; 
               }
               else{
                System.out.println("Please enter a valid seat number:");
                correct = true; 
               }     
        }
        return input; 
        
    }

    /***
	 * Method to print menu and get selection
	 * @param	scanner of type scanner 
	 * @return	input
	 */
    public static int menuSelection(Scanner scanner){
        boolean valid = true;
        int input = 0; 
        System.out.println("Please select an operation:\n1: Reserve a seat\n2: Free a seat\n3: Quit"); 
        while(valid){
        try{
            input = scanner.nextInt();
            if(input != 1 && input != 2 && input != 3){
                valid = false; 
                throw new InputMismatchException();
            }
            else {
                valid = true;
                return input; 
            }
        }
        catch(InputMismatchException e){
            System.out.println("Please enter 1, 2, or  3.\n");
        }
        finally{
            return input; 
        }
        }
        return input; 
    }
}