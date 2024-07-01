import java.util.Scanner;
public class SeasonsIf {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String input;
		System.out.print("Please enter the date: ");
		input = scanner.next();
		int number = scanner.nextInt();
		
		if(input.equalsIgnoreCase("april") || input.equalsIgnoreCase("may")) {
			System.out.println("It is Spring!");
		}
		else if(input.equalsIgnoreCase("march")&& number >=20 && number<=31) {
			System.out.println("It is Spring!");
		}
		else if(input.equalsIgnoreCase("june")&& number >0 && number <=20) {
			System.out.println("It is Spring!");
		}	
		
	}

}
