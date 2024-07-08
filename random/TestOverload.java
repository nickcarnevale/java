
public class TestOverload {

	public static void main(String[] args) {

		int x = 50;
		int y = 100;
		int result = max(x,y);
		System.out.println(result);
		result = max(20,50);
		result = max(max(10,15),max(x,y));
		System.out.println(result);
	}
	

	public static int max(int num1, int num2) {
		int result;
		if(num1>num2) {
			result = num1;
		}
		else
			result = num2;
		return result;
	}
	
	
}
 
