package card;


public enum CARD_VALUES {
	TWO(2, "Two"),THREE(3,"Three"),FOUR(4,"Four"),FIVE(5,"Five"),SIX(6,"Six"),SEVEN(7,"Seven"),
	EIGHT(8,"Eight"),NINE(9,"Nine"),TEN(10,"Ten"),JACK(11,"JACK"),QUEEN(12,"Queen"),KING(13,"King"),ACE(14,"Ace");
	
	private final int value;
	private final String valueAsString;
	
	private CARD_VALUES(int value,String name) {
		this.value = value;
		this.valueAsString = name;
	}
	
	public int getValue() {
		return value;
	}
	public String getValueAsString() {
		return valueAsString;
	}
}
