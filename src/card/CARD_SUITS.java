package card;


public enum CARD_SUITS {
	HEARTS("Hearts"), 
	CLUBS("Clubs"), 
	DIAMONDS("Diamonds"), 
	SPADES("Spades");
	
	private final String text;
	
	CARD_SUITS(String string) {
		this.text = string;
	} 
	
	public String getSuit() {
		return text;
	}
}
