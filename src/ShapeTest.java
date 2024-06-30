/* Nick Carnevale
 * Prof. Kalafut
 * 5/7/2022
 * 
 * This program tests the abstract class shape and family of classes by creating an array of shapes
 */

//import scanner and random classes
import java.util.Scanner;
import java.util.Random;
public class ShapeTest {

	public static void main(String[]args) {

		//variables
		boolean correct = true;
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int input = 0;
		int select;
		
		//array of shapes to hold the specific shapes
		Shape[] testShapes = new Shape[5];
		
		//prompt user
		System.out.println("What shape would you like to make?");
		System.out.println("1-Circle\n2-Triangle\n3-Rectangle");
		System.out.print("Selection: ");
		
		//get input if it is valid
		do{
			if(scanner.hasNextInt()) {
				input = scanner.nextInt();
				if(input == 1 || input == 2|| input == 3) {
					correct = true;
				}
				else {
					System.out.println("Print 1,2,3.");
					scanner.nextLine();
					correct = false;
				}
			}
			else {
				System.out.println("Print 1,2,3.");
				scanner.nextLine();
				correct = false;
			}
		}while(!correct);
		
		//create the proper shape depending on input
		switch(input) {
		
		//make a circle and add it to the shape array 
		//make random radius and print area and perimeter
		case 1: Circle one = new Circle("red","Circle 1");
				one.setRadius(random.nextDouble()*5);
				testShapes[0] = one;
				testShapes[0].toString();
				System.out.println("\nShape 1:");
				System.out.println(testShapes[0].toString());
				System.out.println("Perimeter: " + testShapes[0].computeArea());
		break;
		
		//make a triangle and add it to the shape array 
		//make random base and height and print area and perimeter
		case 2: Triangle oneTri = new Triangle("red","Triangle 1");
				oneTri.setBase(random.nextDouble()*5);
				oneTri.setHeight(random.nextDouble()*5);
				testShapes[0] = oneTri;
				System.out.println("\nShape 1:");
				System.out.println(testShapes[0].toString());
				System.out.println("Perimeter: " + testShapes[0].computeArea());
		break;
		
		//make a rectanlge and add it to the shape array 
		//make random length and width and print area and perimeter
		case 3: Rectangle oneRec = new Rectangle("red","Rectangle 1");
				oneRec.setLength(random.nextDouble()*5);
				oneRec.setWidth(random.nextDouble()*5);
				testShapes[0] = oneRec;
				System.out.println("\nShape 1:");
				System.out.println(testShapes[0].toString());
				System.out.println("Perimeter: " + testShapes[0].computeArea());
		break;
		}
		
		//for the rest of the shape array
		//set random shapes to fill the array
		for(int i = 1; i < testShapes.length; i++) {
			select = random.nextInt(3)+1;
			
			//create the shape depending on the random generator
			switch(select) {
			case 1: Circle one = new Circle("blue","Circle"+ (i+1));
					one.setRadius(random.nextDouble()*5);
					testShapes[i] = one;
					testShapes[i].toString();
					System.out.println("\nShape " + (i+1)+ ":");
					System.out.println(testShapes[i].toString());
					System.out.println("Perimeter: " + testShapes[i].computeArea());
			break;
			
			case 2: Triangle oneTri = new Triangle("blue","Triangle" + (i+1));
					oneTri.setBase(random.nextDouble()*5);
					oneTri.setHeight(random.nextDouble()*5);
					testShapes[i] = oneTri;
					System.out.println("\nShape " + (i+1)+ ":");
					System.out.println(testShapes[i].toString());
					System.out.println("Perimeter: " + testShapes[i].computeArea());
			break;
			
			case 3: Rectangle oneRec = new Rectangle("blue","Rectangle" + (i+1));
					oneRec.setLength(random.nextDouble()*5);
					oneRec.setWidth(random.nextDouble()*5);
					testShapes[i] = oneRec;
					System.out.println("\nShape " + (i+1)+ ":");
					System.out.println(testShapes[i].toString());
					System.out.println("Perimeter: " + testShapes[i].computeArea());
			break;
			}
		}	
	}	
}
