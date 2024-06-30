
public class Deck {

	private Card[] deck = new Card[52];
	private int nextCard = 0;
	
	public Deck() {
		for(int i = 0; i < 13; i++) {
			deck[i] = new Card(i+1, 0);
		}
		for(int i = 0; i < 13; i++) {
			deck[i+13] = new Card(i+1, 1);
		}
		for(int i = 0; i < 13; i++) {
			deck[i+26] = new Card(i+1, 2);
		}
		for(int i = 0; i < 13; i++) {
			deck[i+39] = new Card(i+1, 3);
		}
	}
	
	public void shuffle() {
		int counter = 0; 
		Card temp;
		while(counter != 52) {
			int random = getRandomCard();
			temp = deck[counter];
			deck[counter] = deck[random];
			deck[random] = temp;
			counter++;
		}
		nextCard = 0;
	}
	
	public int getRandomCard() {
		return (int) (Math.random()*50 + 1);
	}
	
	public Card dealCard() {
		Card deal = deck[nextCard];
		nextCard++;
		return deal;
	}
	
	@Override
	public String toString() {
		String one = ""; 
		String two = "";
		for(int i = 0; i < 26; i++) {
			one += String.format("%s ", deck[i]);
		}
		for(int i = 26; i < deck.length; i++) {
			two += String.format("%s ", deck[i]);
		}
		
		return one + "\n" + two; 
		
	}
	
}
