/* 
 *  Nick Carnevale
 *  1/28/2022
 *  CSE7: Lab 1
 *  Class that converts weight in pounds to weight in kilograms
 */
public class ConvertWeight {

	public static void main(String[] args) {

		final double kgPerPound = 0.45359237;
		double weightInPounds = 150.32;
		double weightInKilograms;
		
		weightInKilograms = weightInPounds * kgPerPound;
		System.out.println(weightInPounds + " is equivalent to " + weightInKilograms + " kg");
	}

}
