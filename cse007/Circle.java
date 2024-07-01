/* Nick Carnevale
 * Prof. Kalafut
 * 5/7/2022
 * 
 * This program creates a circle class that extends the abstract class shape
 */

public class Circle extends Shape {

	//private variables
	private double radius;
	private static int numCircles = 0;
	
	//blank constructor
	public Circle() {
		super();
		numCircles++;
	}
	
	//constructor with shape variables
	public Circle(String color, String name) {
		super(color, name);
		numCircles++;
	}
	
	//constructor with all variables
	public Circle(String color, String name, double radius) {
		super(color, name);
		
		//radius can't be less than 0
		if(radius < 0) {
			radius = Math.abs(radius);
		}
		this.radius = radius;
		numCircles++;
	}

	//method to set radius
	public void setRadius(double radius) {
		if(radius < 0) {
			radius = Math.abs(radius);
		}
		this.radius = radius;
	}
	
	//method to get radius
	public double getRadius(){
		return radius;
	}
	
	//overriding abstract method
	@Override
	public double computeArea() {
		return Math.PI*radius*radius;
	}

	//overriding abstract method
	@Override
	public double computePerimeter() {
		return 2*Math.PI*radius;
	}
	
	//override to String
	@Override
	public String toString() {
		return super.toString() + ", radius: " + radius + ", area: " + this.computeArea();
	}
	

}
