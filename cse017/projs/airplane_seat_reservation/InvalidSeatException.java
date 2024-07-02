/***
 * Invalid seat exception class
 * @author Nicholas Carnevale
 * @version 0.1
 * Date of creation: Sepember 9, 2021
 * Last Date Modified: September 9, 2021
 */
public class InvalidSeatException extends Exception{

    //blank constructor
    public InvalidSeatException(){
        super("Invalid Seat Exception");
    }

    //constructor with one parameter string message
    public InvalidSeatException(String message){
        super(message);
    }


}