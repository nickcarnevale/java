import java.util.Scanner;
public class OverloadEquals {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input a word: ");
		String word1 = scanner.nextLine();
		System.out.println("Please input another word: ");
		String word2 = scanner.nextLine();
		boolean wordEqual = findEqual(word1, word2);
		if(wordEqual) {
			System.out.println("Your words are equal.");
		}
		else {
			System.out.println("Your words are not equal.");
		}
		System.out.println("Please enter an integer:");
		int int1 = scanner.nextInt();
		System.out.println("Please enter another integer:");
		int int2 = scanner.nextInt();
		boolean intEqual = findEqual(int1,int2);
		if(intEqual) {
			System.out.println("Your integers are equal.");
		}
		else {
			System.out.println("Your integers are not equal.");
		}	
	}
	
	public static boolean findEqual(String s1, String s2) {
		if(s1.equals(s2)) {
			return true;
		}
		else return false;
	}
	
	public static boolean findEqual(int i1, int i2) {
		if(i1 == i2) {
			return true;
		}
		else return false;
	}

}
