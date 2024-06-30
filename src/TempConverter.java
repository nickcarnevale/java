/* Nick Carnevale
 * CSE007
 * 2/7/2022
 * CSE7 HW 1
 * Celsius to Fahrenheit Class
 */
import java.util.Scanner;
public class TempConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scnr = new Scanner(System.in);
		System.out.print("Please enter the temp in degrees CELSIUS: ");
		double celsius = scnr.nextDouble();
		
		double f = (1.8 * celsius) + 32;
		
		System.out.print("\nTemp in Fahrenheit: " + f);
		
		
	}

}
