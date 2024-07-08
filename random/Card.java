
public class Card {

	private int rank;
	private int suit;
	private String[] rankName = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
	private String[] suitName = {"C", "H", "S", "D"};
	
	public Card(int rank, int suit) {
		this.rank = rank;
		this.suit = suit;
	}
	
	public int getRank() {
		return rank;
	}
	
	public int getSuit() {
		return suit;
	}
	
	public String getRankName() {
		return rankName[rank];
	}
	
	public String getSuitName() {
		return suitName[suit];
	}
	
	@Override
	public String toString() {
		return String.format("%s%s", rankName[rank-1], suitName[suit]);
	}
}

