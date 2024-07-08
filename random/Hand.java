
public class Hand {

	private Card[] hand;
	private int handIndex = 0; 
	
	public Hand(int size) {
		hand = new Card[size];
	}
	
	public void display() {
		for(int i = 0; i < hand.length; i++) {
			if(hand[i] != null)
			System.out.print(hand[i] + " ");
		}
	}
	
	public Card getFirstCard() {
		return hand[0];
	}
	
	public void addCard(Card card) {
		hand[handIndex] = card;
		handIndex++;
	}
	
	public Card[] getHand() {
		return hand; 
	}
	
	public int getSoftValue(Card[] hand) {
		int value = 0; 
		for(int i = 0; i < hand.length; i++) {
			if(hand[i] != null) {
			if(hand[i].getRank() > 10)
				value += 10;
			
			else
				value += hand[i].getRank(); 
		}
		}
		return value; 
	}
	
	public int getHardValue(Card[] hand) {
		int value = 0; 
		for(int i = 0; i < hand.length; i++) {
			if(hand[i]!= null) {
			if(hand[i].getRank() > 10)
				value += 10;
			else if(hand[i].getRank() ==  1)
				value += 11; 
			else
				value += hand[i].getRank(); 
		}
		}
		return value; 
	}
	
}
