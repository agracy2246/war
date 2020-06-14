package card;


public class Card {
	private String suit;
	private int value;
	private String valueAsString;
	
	public Card(String suit, int value, String valueAsString) {
		this.suit = suit;
		this.value = value;
		this.valueAsString = valueAsString;
	}
	
	public int getValue() {
		return value;
	}
	public String getSuit() {
		return suit;
	}
	public String getValueAsString() {
		return valueAsString;
	}
}
