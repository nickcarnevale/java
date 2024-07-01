import java.util.Scanner;
public class Test1 {

	public static int changeValue(int x) {
		  int y;
		  x = x * 2;
		  y = x + 1;
		  return y;
		} 
	
	public static void main(String[] args) {
		  int a;
		  a = 5;
		  System.out.print("a = " + a + ", result = " + changeValue(a));
		  }
		
	}
