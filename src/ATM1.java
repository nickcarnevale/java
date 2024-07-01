
public class ATM1 {

	public static void main(String[] args) {

		int[] accounts = new int[10];
		int[] pins = new int[10];
		int[] balances = new int[10];

		
		for(int i = 0; i < 10; i++) {
			accounts[i] = (int) (Math.random()*99999+10000);
		}
		for(int i = 0; i < 10; i++) {
			pins[i] = (int) (Math.random()*9999+1000);
		}
		
		for(int i = 0; i < 10; i++) {
			balances[i] = (int) (Math.random()*999999);
		}
		
		for(int i = 0; i < 10; i++) {
			System.out.printf("Account number: %d\nPin: %d\nBalance: %d\n\n",accounts[i],pins[i],balances[i]);
		}
	
}
}

