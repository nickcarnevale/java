/* Nick Carnevale
 * CSE 007
 * Lab 9
 * Prof. Kalafut
 * 
 * This Class tests the calculator object from class calculator
 */

public class CalculatorTest {

	public static void main(String[] args) {
		
		//declare variables to be used in the calculation
		int x = 10;
		double y = 5.0;
		double z = 10.0;
		
		//create an instance of object calculator
		Calculator calc1 = new Calculator();
		
		//use methods
		//calculate (7x+y-13)/4
		System.out.println("Calculation 1:");
		System.out.println("Value = " + calc1.getValue());
		calc1.add(7);
		System.out.println("Value = " + calc1.getValue());
		calc1.multiply(x);
		System.out.println("Value = " + calc1.getValue());
		calc1.add(y);
		System.out.println("Value = " + calc1.getValue());		
		calc1.subtract(13);
		System.out.println("Value = " + calc1.getValue());
		calc1.divide(4);		
		
		//answer:
		System.out.println("Value = " + calc1.getValue());
		System.out.println("Number of operations before clear: " + calc1.getOperations());
		calc1.clear();
		System.out.println("Value " + calc1.getValue());

		//equation 2
		//(4y^2z + 2y^x - 7x)/(5xy + 7z - x)
		
		//create new calculator for this equation
		Calculator calcN = new Calculator();
		
		//create variables to store specific parts of the equation
		double denom = 0;
		double temp = 0;
		double power = 0;
		double power2 = 0;
		double sub = 0;
		
		//use methods to perform calculations
		System.out.println("\nCalculation 2:");
		calcN.add(5);
		System.out.println("Value = " + calcN.getValue());
		calcN.multiply(x);
		System.out.println("Value = " + calcN.getValue());
		calcN.multiply(y);
		temp = calcN.getValue();
		System.out.println("Value = " + calcN.getValue());
		calcN.clear();
		System.out.println("Value = " + calcN.getValue());
		calcN.add(7);
		System.out.println("Value = " + calcN.getValue());
		calcN.multiply(z);
		System.out.println("Value = " + calcN.getValue());
		calcN.add(temp);
		System.out.println("Value = " + calcN.getValue());
		calcN.subtract(x);
		denom = calcN.getValue();
		System.out.println("Value = " + calcN.getValue());
		calcN.clear();
		calcN.powerOf(y, 2);
		power = calcN.getValue();
		System.out.println("Value = " + calcN.getValue());
		calcN.clear();
		calcN.powerOf(y, x);
		System.out.println("Value = " + calcN.getValue());
		power2 = calcN.getValue();
		System.out.println("Value = " + calcN.getValue());
		calcN.clear();
		calcN.add(7);
		System.out.println("Value = " + calcN.getValue());
		calcN.multiply(x);
		System.out.println("Value = " + calcN.getValue());
		sub = calcN.getValue();
		calcN.clear();
		System.out.println("Value = " + calcN.getValue());
		calcN.add(4);
		System.out.println("Value = " + calcN.getValue());
		calcN.multiply(z);
		System.out.println("Value = " + calcN.getValue());
		calcN.multiply(power);
		temp = calcN.getValue();
		calcN.clear();
		System.out.println("Value = " + calcN.getValue());
		calcN.add(2);
		System.out.println("Value = " + calcN.getValue());
		calcN.multiply(power2);
		System.out.println("Value = " + calcN.getValue());
		calcN.add(temp);
		System.out.println("Value = " + calcN.getValue());
		calcN.subtract(sub);
		System.out.println("Value = " + calcN.getValue());
		calcN.divide(denom);
		
		//answer:
		System.out.println("Value = " + calcN.getValue());
		System.out.println("Number of operations before clear: " + calcN.getOperations());
		calcN.clear();
		System.out.println("Value " + calcN.getValue());
		
		
	}

}
