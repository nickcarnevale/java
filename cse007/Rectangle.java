/* Nick Carnevale
 * Prof. Kalafut
 * 5/7/2022
 * 
 * This program creates a rectangle class that extends the abstract class shape
 */

public class Rectangle extends Shape{

	//private variables
	private double length;
	private double width;
	static int numRects = 0;
	
	//blank constructor
	public Rectangle() {
		numRects++;
	}

	//shape constructor
	public Rectangle(String color, String name){
		super(color,name);
		numRects++;
	}
	
	//Constructor with all variables for rectanlge
	public Rectangle(String color, String name, double length, double width) {
		super(color, name);
		if(width < 0) {
			width = Math.abs(width);
		}
		if(length < 0) {
			length = Math.abs(length);
		}
		this.length = length;
		this.width = width;
		numRects++;
	}
	
	//method to get length
	public double getLength()
	{
		return length;
	}

	//method to get with
	public double getWidth() {
		return width;
	}
	
	//method to set length
	public void setLength(double length) {
		if(length < 0) {
			length = Math.abs(length);
		}
		this.length = length;
	}
	
	//method to set width
	public void setWidth(double width) {
		if(width < 0) {
			width = Math.abs(width);
		}
		this.width = width;
	}
	
	//override abstract method compute area
	@Override
	public double computeArea(){
		return length * width; 
	}
	
	//override abstract method computer perimeter
	@Override
	public double computePerimeter(){
		return 2*length + 2*width; 
	}
	
	//override shape to string
	@Override
	public String toString() {
		return super.toString() + ", length: " + length + ", width: " + width + ", area: " + this.computeArea();
	}
	
	
}
