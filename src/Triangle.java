/* Nick Carnevale
 * Prof. Kalafut
 * 5/7/2022
 * 
 * This program creates a triangle class that extends the abstract class shape
 */

public class Triangle extends Shape{
	
	//private variables
	private double base;
	private double height;
	private double side1;
	private double side2;
	private static int numTris = 0;
	
	//blank constructor
	public Triangle() {
		numTris++;
	}

	//shape constructor
	public Triangle(String color, String name){
		super(color,name);
		numTris++;
	}
	
	//basic constructor with base and height
	public Triangle(String color, String name, double base, double height) {
		super(color, name);
		if(height < 0) {
			height = Math.abs(height);
		}
		if(base < 0) {
			base = Math.abs(base);
		}
		this.base = base;
		this.height = height;
		numTris++;
	}
	
	//constructor with all variables
	public Triangle(String color, String name, double base, double height, double side1, double side2) {
		super(color, name);
		if(height < 0) {
			height = Math.abs(height);
		}
		if(base < 0) {
			base = Math.abs(base);
		}
		if(side1 < 0) {
			side1 = Math.abs(side1);
		}
		if(side2 < 0) {
			side2 = Math.abs(side2);
		}
		this.base = base;
		this.height = height;
		this.side1 = side1;
		this.side2 = side2;
		numTris++;
	}
	
	//method to set the base
	public void setBase(double base) {
		if(base < 0) {
			base = Math.abs(base);
		}
		this.base = base;
	}
	
	//method to set the height
	public void setHeight(double height) {
		if(height < 0) {
			height = Math.abs(height);
		}
		this.height = height;
	}
	
	//method to get side 1
	public double getSide1()
	{
		return side1;
	}
	
	//method to set side 1
	public void setSide1(double side1) {
		if(side1 < 0) {
			side1 = Math.abs(side1);
		}
		this.side1 = side1;
	}
	
	//method to get base
	public double getBase()
	{
		return base;
	}

	//method to get height
	public double getHeight() {
		return height;
	}
	
	//method to set side 2
	public void setSide2(double side2) {
		if(side2 < 0) {
			side2 = Math.abs(side2);
		}
		this.side2 = side2;
	}
	
	//method to get side 2
	public double getSide2()
	{
		return side2;
	}
	
	//overriding abstract method compute area
	@Override
	public double computeArea(){
		return .5 * base * height; 
	}
	
	//overriding abstract method computer perimeter
	@Override
	public double computePerimeter(){
		return side1 + base + side2; 
	}
	
	//override to string
	@Override
	public String toString() {
		return super.toString() + ", base: " + base + ", height: " + height + ", area: " + this.computeArea();
	}
	
	
}
