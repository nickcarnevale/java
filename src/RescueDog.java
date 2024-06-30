/* Nick Carnevale
 * Prof. Kalafut
 * 5/7/2022
 * 
 * This program extends animal class and creates a rescue dog constructor
 */

public class RescueDog extends Dog{

	//private variable for rescue dogs
	public static int numRescueDogs;
	
	//blank constructor
	public RescueDog() {
		super();
		numRescueDogs++;
	}
	
	//constructor with animal variables
	public RescueDog(double height, double weight) {
		super(height, weight);
		numRescueDogs++;
	}

	//override to string
	@Override
	public String toString() {
		return String.format("Height: %.2f\tWeight: %.2f", this.getHeight(),this.getWeight());
	}
}
