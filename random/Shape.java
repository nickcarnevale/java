/* Nick Carnevale
 * Prof. Kalafut
 * 5/7/2022
 * 
 * This program creates the abstract class shape to make the other classes work
 */

public abstract class Shape {

	//private variables
	private String color;
	private String name;
	private static int numShapes = 0;
	
	//protected blank constructor
	protected Shape() {
		numShapes++;
	}
	
	//protected constructor with color and name
	protected Shape(String color, String name) {
		this.color = color;
		this.name = name;
		numShapes++;
	}
	
	//method to set name
	public void setName(String name) {
		this.name = name;
	}
	
	//method to set color
	public void setColor(String color) {
		this.color = color;
	}
	
	//method to get color
	public String getColor() {
		return color;
	}
	
	//method to get name
	public String getName()
	{
		return name;
	}
	
	//abstract methods to be defined in specific shape classes
	public abstract double computeArea();
	public abstract double computePerimeter();
	
	//override to string
	@Override
	public String toString() {
		return name + ", " + color;
	}
}
