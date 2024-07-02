/* Nick Carnevale
 * Prof. Kalafut
 * 5/7/2022
 * 
 * This program creates an animal class that will be extended by dog and rescue dog
 */

public class Animal {

	//private variables for animal
	private double height;
	private double weight;
	private double hi;
	private static int numAnimals;
	
	//blank constructor
	public Animal() {
		numAnimals++;
		hi = 1;
	}
	
	//constructor with variables initialized
	public Animal(double height, double weight) {
		this.height = height;
		this.weight = weight;
		numAnimals++;
	}
	
	//method to set weight
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	//method to set height
	public void setHeight(double height) {
		this.height = height;
	}
	
	//method to get weight
	public double getWeight() {
		return weight;
	}
	
	//method to get height
	public double getHeight() {
		return height;
	}
	
	//method to override to string
	@Override
	public String toString() {
		return String.format("Height (inch): %.2f\tWeight (lb): %.2f", this.getHeight(),this.getWeight());
	}
	
}
