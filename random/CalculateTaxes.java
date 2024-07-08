/* Nick Carnevale
 * Mrs. Kalafut
 * CSE007
 * 
 * This program calculates the taxes for the given wages, interest, unemployment and withheld taxes
 */

//import scanner
import java.util.Scanner;
public class CalculateTaxes {

	//method to return an int value 0,1,2 and only those
	//will repeat asking for a value if not 0,1,or 2
	public static int getInt(Scanner input) {
		int value = 0;
		int temp;
		boolean correct = true;
		
		//repeats until an integer is entered
		do {
		if(input.hasNextInt()) {
		temp = input.nextInt();
		if(temp == 0 || temp == 1 || temp == 2) {
			value = temp;
			correct = true;
		}
		else {
			correct = false;
		}}
		else {
			correct = false;
		}
		if(!correct) {
			System.out.println("You did not enter a 0, 1, or 2.");
			input.nextLine();
			correct = false;
			value = 0;
		}
		}while(!correct);
		return value;
	}
	
	//method to return a positive double
	//will repeatedly ask user if not a positive double
	public static double getDouble(Scanner input) {
		double value = 0;
		double temp;
		boolean correct = true;
		
		//repeats until an integer is entered
		do {
		if(input.hasNextDouble()) {
		temp = input.nextDouble();
		if(temp>=0) {
			value = temp;
			correct = true;
		}
		else {
			correct = false;
		}
		}
		else {
			correct = false;
		}
		if(!correct) {
			System.out.print("You did not enter a positive double.\nPlease try again: ");
			input.nextLine();
			correct = false;
			value = 0;
		}
		
		}while(!correct);
		return value;
	}
	
	//this method computes the AGI which is the sum of the wages, interest, and unemployment
	public static double computeAGI(double wages, double interest, double unemployment) {
		double agi = wages + interest + unemployment;
		return agi;
	}
	
	//this method gets the deduction from the persons marital status
	public static int getDeduction(int status) {
		int deduction;
		if(status == 0) {
			deduction = 6000;
		}
		else if(status == 1) {
			deduction = 12000;
		}
		else if(status == 2) {
			deduction = 24000;
		}
		else {
			deduction = 6000;
		}
		return deduction;
	}
	
	//this method calculates the taxable income someone has by subtracting the agi from the deduction
	public static double getTaxable(double agi, int deduction) {
		double deduction1 = (double) deduction;
		double taxable = agi - deduction1;
		return taxable;
	}
	
	//this method calculates the tax for each tax bracket a person may fall under
	//depedning on their taxable income and status
	public static int calcTax(int status, double taxable) {
		double tax;
		if(status != 2) {
			if(taxable <= 10000) {
				tax = .1 * taxable;
			}
			else if(taxable > 10000 && taxable <=40000) {
				tax = 1000 + (.12 * (taxable - 10000));
			}
			else if(taxable > 40000 && taxable <=85000) {
				tax = 4600 + (.24 * (taxable - 40000));
			}
			else {
				tax = 14500 + (.24 * (taxable - 85000));
			}
		}
		else {
			if(taxable<=20000) {
				tax = taxable * .1;
			}
			else if(taxable > 20000 && taxable <= 80000) {
				tax = 2000 + (.12 * (taxable - 20000));
			}
			else {
				tax = 9200 + (.22 * (taxable - 80000));
			}
		}
		Math.round(tax);
		int taxReturn = (int) tax;
		return taxReturn;
	}
	
	//this method subtracts the tax from the tax funds withheld
	//giving the total tax due
	public static int calcTaxDue(int fedTax, double withheld) {
		double fedTax1 = (double) fedTax;
		double taxDue1;
		taxDue1 = fedTax1 - withheld;
		int taxDue = (int) taxDue1;
		return taxDue;
	}
	
	//main method
	public static void main(String[] args) {
		//declare variables
		Scanner scanner = new Scanner(System.in);
		double wages, interest, unemployment, withheld;
		int status, deduction, fedTax;
		double agi, taxable, taxDue;
		
		//prompt the user for the inputs
		System.out.println("Please enter the following. ");
		System.out.print("Annual Wages: ");
		//use method to get the input
		wages = getDouble(scanner);
		
		System.out.print("\nTaxable Interest: ");
		//use method to get the input
		interest = getDouble(scanner);
		
		System.out.print("\nUnemployment Compensation: ");
		//use method to get the input
		unemployment = getDouble(scanner);
		
		System.out.print("\nEmployment status.\n(0 for dependent,1 for single ,2 for married): ");
		//use method to get the input
		status = getInt(scanner); 
		
		System.out.print("\nTaxes Withheld: ");
		//use method to get the input
		withheld = getDouble(scanner);
		
		System.out.println();
		//use method to perform calculation
		agi = computeAGI(wages, interest, unemployment);
		//use print f to correctly format the printed line
		System.out.printf("\nAGI: $%,.2f", agi);

		//use method to perform calculation
		deduction = getDeduction(status);
		//use print f to correctly format the printed line
		System.out.printf("\nDeduction: $%,d", deduction);

		//use method to perform calculation
		taxable = getTaxable(agi,deduction);
		//use print f to correctly format the printed line
		System.out.printf("\nTaxable Income: $%,.2f", taxable);
		
		//use method to perform calculation
		fedTax = calcTax(status,taxable);
		//use print f to correctly format the printed line
		System.out.printf("\nFederal Tax: $%,d", fedTax);
		
		//use method to perform calculation
		taxDue = calcTaxDue(fedTax, withheld);
		//use print f to correctly format the printed line
		System.out.printf("\nTax Due: $%,.2f", taxDue);

	}

}
