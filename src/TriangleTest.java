import java.util.Scanner;
public class TriangleTest {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String inputChar;
		int height;
		
		System.out.println("Enter a character: ");
		inputChar = scanner.next();
		
		System.out.println("Enter triangle height: ");
		height = scanner.nextInt();
		
		for(int row = 0; row < height; row++) {
			for(int col = 0; col <= row; col++) {
				System.out.print(inputChar);
			}
			System.out.println();
		}

	}

}
