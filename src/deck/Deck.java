package deck;


import java.util.Collections;
import java.util.Stack;

import card.Card;
import card.CARD_SUITS;
import card.CARD_VALUES;

public class Deck {
	protected Stack<Card> deck;
	
	
	public Deck(DeckType deckType) {
		if(deckType == DeckType.MAIN) {
			deck = new Stack<Card>();
			getDeck().push(new Card(CARD_SUITS.CLUBS.getSuit(), CARD_VALUES.TWO.getValue(), CARD_VALUES.TWO.getValueAsString()));
			getDeck().push(new Card(CARD_SUITS.CLUBS.getSuit(), CARD_VALUES.THREE.getValue(), CARD_VALUES.THREE.getValueAsString()));
			getDeck().push(new Card(CARD_SUITS.CLUBS.getSuit(), CARD_VALUES.FOUR.getValue(), CARD_VALUES.FOUR.getValueAsString()));
			getDeck().push(new Card(CARD_SUITS.CLUBS.getSuit(), CARD_VALUES.FIVE.getValue(), CARD_VALUES.FIVE.getValueAsString()));
			getDeck().push(new Card(CARD_SUITS.CLUBS.getSuit(), CARD_VALUES.SIX.getValue(), CARD_VALUES.SIX.getValueAsString()));
			getDeck().push(new Card(CARD_SUITS.CLUBS.getSuit(), CARD_VALUES.SEVEN.getValue(), CARD_VALUES.SEVEN.getValueAsString()));
			getDeck().push(new Card(CARD_SUITS.CLUBS.getSuit(), CARD_VALUES.EIGHT.getValue(), CARD_VALUES.EIGHT.getValueAsString()));
			getDeck().push(new Card(CARD_SUITS.CLUBS.getSuit(), CARD_VALUES.NINE.getValue(), CARD_VALUES.NINE.getValueAsString()));
			getDeck().push(new Card(CARD_SUITS.CLUBS.getSuit(), CARD_VALUES.TEN.getValue(), CARD_VALUES.TEN.getValueAsString()));
			getDeck().push(new Card(CARD_SUITS.CLUBS.getSuit(), CARD_VALUES.JACK.getValue(), CARD_VALUES.JACK.getValueAsString()));
			getDeck().push(new Card(CARD_SUITS.CLUBS.getSuit(), CARD_VALUES.QUEEN.getValue(), CARD_VALUES.QUEEN.getValueAsString()));
			getDeck().push(new Card(CARD_SUITS.CLUBS.getSuit(), CARD_VALUES.KING.getValue(), CARD_VALUES.KING.getValueAsString()));
			getDeck().push(new Card(CARD_SUITS.CLUBS.getSuit(), CARD_VALUES.ACE.getValue(), CARD_VALUES.ACE.getValueAsString()));
			
			getDeck().push(new Card(CARD_SUITS.SPADES.getSuit(), CARD_VALUES.TWO.getValue(), CARD_VALUES.TWO.getValueAsString()));
			getDeck().push(new Card(CARD_SUITS.SPADES.getSuit(), CARD_VALUES.THREE.getValue(), CARD_VALUES.THREE.getValueAsString()));
			getDeck().push(new Card(CARD_SUITS.SPADES.getSuit(), CARD_VALUES.FOUR.getValue(), CARD_VALUES.FOUR.getValueAsString()));
			getDeck().push(new Card(CARD_SUITS.SPADES.getSuit(), CARD_VALUES.FIVE.getValue(), CARD_VALUES.FIVE.getValueAsString()));
			getDeck().push(new Card(CARD_SUITS.SPADES.getSuit(), CARD_VALUES.SIX.getValue(), CARD_VALUES.SIX.getValueAsString()));
			getDeck().push(new Card(CARD_SUITS.SPADES.getSuit(), CARD_VALUES.SEVEN.getValue(), CARD_VALUES.SEVEN.getValueAsString()));
			getDeck().push(new Card(CARD_SUITS.SPADES.getSuit(), CARD_VALUES.EIGHT.getValue(), CARD_VALUES.EIGHT.getValueAsString()));
			getDeck().push(new Card(CARD_SUITS.SPADES.getSuit(), CARD_VALUES.NINE.getValue(), CARD_VALUES.NINE.getValueAsString()));
			getDeck().push(new Card(CARD_SUITS.SPADES.getSuit(), CARD_VALUES.TEN.getValue(), CARD_VALUES.TEN.getValueAsString()));
			getDeck().push(new Card(CARD_SUITS.SPADES.getSuit(), CARD_VALUES.JACK.getValue(), CARD_VALUES.JACK.getValueAsString()));
			getDeck().push(new Card(CARD_SUITS.SPADES.getSuit(), CARD_VALUES.QUEEN.getValue(), CARD_VALUES.QUEEN.getValueAsString()));
			getDeck().push(new Card(CARD_SUITS.SPADES.getSuit(), CARD_VALUES.KING.getValue(), CARD_VALUES.KING.getValueAsString()));
			getDeck().push(new Card(CARD_SUITS.SPADES.getSuit(), CARD_VALUES.ACE.getValue(), CARD_VALUES.ACE.getValueAsString()));
			
			getDeck().push(new Card(CARD_SUITS.DIAMONDS.getSuit(), CARD_VALUES.TWO.getValue(), CARD_VALUES.TWO.getValueAsString()));
			getDeck().push(new Card(CARD_SUITS.DIAMONDS.getSuit(), CARD_VALUES.THREE.getValue(), CARD_VALUES.THREE.getValueAsString()));
			getDeck().push(new Card(CARD_SUITS.DIAMONDS.getSuit(), CARD_VALUES.FOUR.getValue(), CARD_VALUES.FOUR.getValueAsString()));
			getDeck().push(new Card(CARD_SUITS.DIAMONDS.getSuit(), CARD_VALUES.FIVE.getValue(), CARD_VALUES.FIVE.getValueAsString()));
			getDeck().push(new Card(CARD_SUITS.DIAMONDS.getSuit(), CARD_VALUES.SIX.getValue(), CARD_VALUES.SIX.getValueAsString()));
			getDeck().push(new Card(CARD_SUITS.DIAMONDS.getSuit(), CARD_VALUES.SEVEN.getValue(), CARD_VALUES.SEVEN.getValueAsString()));
			getDeck().push(new Card(CARD_SUITS.DIAMONDS.getSuit(), CARD_VALUES.EIGHT.getValue(), CARD_VALUES.EIGHT.getValueAsString()));
			getDeck().push(new Card(CARD_SUITS.DIAMONDS.getSuit(), CARD_VALUES.NINE.getValue(), CARD_VALUES.NINE.getValueAsString()));
			getDeck().push(new Card(CARD_SUITS.DIAMONDS.getSuit(), CARD_VALUES.TEN.getValue(), CARD_VALUES.TEN.getValueAsString()));
			getDeck().push(new Card(CARD_SUITS.DIAMONDS.getSuit(), CARD_VALUES.JACK.getValue(), CARD_VALUES.JACK.getValueAsString()));
			getDeck().push(new Card(CARD_SUITS.DIAMONDS.getSuit(), CARD_VALUES.QUEEN.getValue(), CARD_VALUES.QUEEN.getValueAsString()));
			getDeck().push(new Card(CARD_SUITS.DIAMONDS.getSuit(), CARD_VALUES.KING.getValue(), CARD_VALUES.KING.getValueAsString()));
			getDeck().push(new Card(CARD_SUITS.DIAMONDS.getSuit(), CARD_VALUES.ACE.getValue(), CARD_VALUES.ACE.getValueAsString()));
			
			getDeck().push(new Card(CARD_SUITS.HEARTS.getSuit(), CARD_VALUES.TWO.getValue(), CARD_VALUES.TWO.getValueAsString()));
			getDeck().push(new Card(CARD_SUITS.HEARTS.getSuit(), CARD_VALUES.THREE.getValue(), CARD_VALUES.THREE.getValueAsString()));
			getDeck().push(new Card(CARD_SUITS.HEARTS.getSuit(), CARD_VALUES.FOUR.getValue(), CARD_VALUES.FOUR.getValueAsString()));
			getDeck().push(new Card(CARD_SUITS.HEARTS.getSuit(), CARD_VALUES.FIVE.getValue(), CARD_VALUES.FIVE.getValueAsString()));
			getDeck().push(new Card(CARD_SUITS.HEARTS.getSuit(), CARD_VALUES.SIX.getValue(), CARD_VALUES.SIX.getValueAsString()));
			getDeck().push(new Card(CARD_SUITS.HEARTS.getSuit(), CARD_VALUES.SEVEN.getValue(), CARD_VALUES.SEVEN.getValueAsString()));
			getDeck().push(new Card(CARD_SUITS.HEARTS.getSuit(), CARD_VALUES.EIGHT.getValue(), CARD_VALUES.EIGHT.getValueAsString()));
			getDeck().push(new Card(CARD_SUITS.HEARTS.getSuit(), CARD_VALUES.NINE.getValue(), CARD_VALUES.NINE.getValueAsString()));
			getDeck().push(new Card(CARD_SUITS.HEARTS.getSuit(), CARD_VALUES.TEN.getValue(), CARD_VALUES.TEN.getValueAsString()));
			getDeck().push(new Card(CARD_SUITS.HEARTS.getSuit(), CARD_VALUES.JACK.getValue(), CARD_VALUES.JACK.getValueAsString()));
			getDeck().push(new Card(CARD_SUITS.HEARTS.getSuit(), CARD_VALUES.QUEEN.getValue(), CARD_VALUES.QUEEN.getValueAsString()));
			getDeck().push(new Card(CARD_SUITS.HEARTS.getSuit(), CARD_VALUES.KING.getValue(), CARD_VALUES.KING.getValueAsString()));
			getDeck().push(new Card(CARD_SUITS.HEARTS.getSuit(), CARD_VALUES.ACE.getValue(), CARD_VALUES.ACE.getValueAsString()));
			
			shuffle();
		}
		if(deckType == DeckType.PLAYER) {
			deck = new Stack<Card>();
		}
	}

	// Deck behaviours
	// Shuffle
	protected void shuffle() {
		Collections.shuffle(deck);
	}

	public Stack<Card> getDeck() {
		return deck;
	}
	
	
	
}
