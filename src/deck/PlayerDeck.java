package deck;
import java.nio.channels.ShutdownChannelGroupException;

import card.Card;

public class PlayerDeck extends Deck{
	public PlayerDeck() {
		super(DeckType.PLAYER);
		
	}
	
	// Deck Behaviors
	public boolean addCard(Card newCard) {
		super.deck.push(newCard);
		
		if(super.deck.search(newCard) < 0)
			return false;
		else
			return true;
	}
	
	@Override
	public void shuffle() {
		super.shuffle();
	}
}
