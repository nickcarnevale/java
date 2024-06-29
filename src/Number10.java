import java.util.Scanner;
public class Number10 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int pos = 1;
		
		do {
				
			System.out.println("Enter a positive integer: ");
			pos = scanner.nextInt();
			if(pos<0) {
			System.out.println("Enter a positive integer: ");
			pos = scanner.nextInt();}
		}while(pos<0);
		
		int factorial = 1;
		
		for(int i = 1; i >= pos; i++) {
			factorial *=i;
		}
		
		System.out.println("The Factorial of " + pos + "is " + factorial);
		
	
		
	}

}
