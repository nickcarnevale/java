/* Nick Carnevale
 * Prof. Kalafut
 * 5/7/2022
 * 
 * This program extends animal class and creates a dog constructor
 */

public class Dog extends Animal{

	//private variable for dogs
	public static int numDogs;
	
	//blank constructor
	public Dog() {
		super();
		numDogs++;
	}
	
	//constructor with animal variables
	public Dog(double height, double weight) {
		super(height, weight);
		numDogs++;
	}
	
	//override to string
	@Override
	public String toString() {
		return String.format("Height: %.2f\tWeight: %.2f", this.getHeight(),this.getWeight());
	}
}
