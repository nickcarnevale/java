/* Nick Carnevale
 * CSE007
 * 2/7/2022
 * CSE7 HW 1
 * Fahrenheit to Celsius Class
 */
import java.util.Scanner;

public class TempConverter2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scnr = new Scanner(System.in);
		System.out.print("Please enter the temp in degrees Fahrenheit: ");
		double f = scnr.nextDouble();
		
		double c = (f-32)*5/9;
		
		System.out.print("\nTemp in Celsius: " + c);
		
	}

}
