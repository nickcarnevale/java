/* Nick Carnevale
 * CSE 007
 * Lab 9
 * Prof. Kalafut
 * 
 * This Class creates a calculator object to be used in the calculator test class
 */

public class Calculator {

	//declare private variables only the calculator object can access
	private double value;
	private static int operations = 0;
	
	//create the calculator object and set the initial value to 0
	public Calculator() {
		value = 0;
	}
	
	//create an add method for the object
	public void add(double val) {
		value += val;
		operations++;
	}
	
	//subtract method
	public void subtract(double val) {
		value -= val;
		operations++;
	}
	
	//multiply method
	public void multiply(double val) {
		value *= val;
		operations++;
	}
	
	//divide method
	public void divide(double val) {
		value /= val;
		operations++;
	}
	
	//a getter method to retreive the valye of the calculator
	public double getValue() {
		return value;
	}
	
	//a clear method to clear the calculator
	public void clear() {
		value = 0;
	}
	
	//a get operations method to retreive the total number of operatiosn the calculator performed
	public int getOperations() {
		return operations;
	}
	
	//a power method without using Math.pow
	public void powerOf(double val, int power) {
		int i = 1;
		value += val;
		do {
			value *= val;
			i++;
			}while(i<power);		
		operations++;
	}
	
}
