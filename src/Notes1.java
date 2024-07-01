/* 
 * Nick Carnevale
 * Java Basics
 * 2/14
 */

//always need this import statement to get input from the user
//I would just memorize it
import java.util.Scanner;

public class Notes1 {

	//this is known as the main method
	//it is required in order to have anything print
	public static void main(String[] args) {

		//data types:
		
		
		//both of these data types hold letters
		//char only holds a single letter
		String string;
		char c;
		
		//Strings are initialized with ""
		string = "This is a string";
		//chars are initialized with ''
		c = 'c';
		
		//these data types cannot hold decimals
		//shorts hold less space than ints and ints hold less space than longs
		short shortInt;
		int integer;
		long bigNumber;
		
		//this is how to initialize an int
		integer = 12345;
		
		//both of these data types can hold decimals
		//floats hold less space than doubles
		double decimal;
		float smallerDouble;
		
		//data type that only yeilds true or false
		boolean trueOrFalse;
		

		//Ways to print
		System.out.println("Hello");
		System.out.println(string);
		
		// \n prints a new line
		System.out.print("Wassup\n");
		
		//this is a print f statement
		//%d and %f are special statments that can represent a variable in a string
		//they correspond in order to the variables listed after the comma
		System.out.printf("%f",integer);
		
		//This is how to initialize a scanner
		Scanner scnr = new Scanner(System.in);
		
		//use these methods to get input
		//for string
		scnr.next();
		
		//for int
		scnr.nextInt();
		
		//for double
		scnr.nextDouble();
		
		//other statments to know
		int x = 5;
		// == means is equivalent (only used for a boolean)
		if(x == 5) {
			//do something
		}
		//!= means not equal
		else if (x != 5) {
			//do something
		}
		else {
			//do something
		}
		
		//switch statements
		switch(x) {
		case 1: //do something
			break;
		case 2: //do something
			break;
		default: //do this if none of cases are true
			break;
		}
		
	}

}
