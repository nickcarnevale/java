//Nick Carnevale
//Prof. Kalafut
//2/11
//Card Lab 3
//picking a random card

public class Cards {

	public static String getCardIdentity(int type) {
		String cardIdentity;
		
		switch(type) {
		case 0: cardIdentity = "Ace"; break;
		case 1: cardIdentity = "2"; break;
		case 2: cardIdentity = "3"; break;
		case 3: cardIdentity = "4"; break;
		case 4: cardIdentity = "5"; break;
		case 5: cardIdentity = "6"; break;
		case 6: cardIdentity = "7"; break;
		case 7: cardIdentity = "8"; break;
		case 8: cardIdentity = "9"; break;
		case 9: cardIdentity = "10"; break;
		case 10: cardIdentity = "Jack"; break;
		case 11: cardIdentity = "Queen"; break;
		case 12: cardIdentity = "King"; break;
		default: cardIdentity = null;
		
		}
		return cardIdentity;	
	}
	
	
	public static void main(String[] args) {

		//declaring variables
		int card;
		int suit;
		int type;
		
		//generating random number between 0-51
		card = (int) (Math.random()*52);
		String suitName;
		String cardIdentity;
		
		//getting the suit 0-3 of the random number
		suit = (int) Math.ceil(card/13);
		if(suit ==0) {
			suitName = "Diamonds";
		}
		else if(suit == 1) {
			suitName = "Clubs";
		}
		else if(suit == 2) {
			suitName = "Hearts";
		}
		else {
			suitName = "Spades";
		}
		
		//getting the card identity by modulusing card
		type = card%13;
		
		//assign the card type
		cardIdentity = getCardIdentity(type);
		
		//print out the result
		System.out.println("You picked the " + cardIdentity+ " of " +suitName);
		
		
	}

}