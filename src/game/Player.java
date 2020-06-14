package game;

import deck.PlayerDeck;

import java.util.Collection;
import java.util.Stack;

import card.Card;

public class Player {
	
	private PlayerDeck playerDeck;
	private PlayerDeck discardDeck;
	private byte numRoundsWon;
	
	public Player() {
		this.playerDeck = new PlayerDeck();
		this.discardDeck = new PlayerDeck();
		this.numRoundsWon = 0;
	}

	// playCard from playerDeck
	public Card playCard() {
		// If the player's hand is empty when trying to play transfer 
		// cards from discardDeck to playerDeck and Shuffle
		if(playerDeck.getDeck().isEmpty()) {
			gatherDiscardedDeck();
		}	 
		
		return playerDeck.getDeck().pop();
	}
	
	// Places cards from discardDeck into playerDeck and shuffle
	
	private void gatherDiscardedDeck() {
		// here the playerDeck is empty..
		int counter = discardDeck.getDeck().size();
		
		for(int i =0; i < counter; ++i) {
			playerDeck.addCard(discardDeck.getDeck().pop());
		}
		
		playerDeck.shuffle();
	}

	public void addCardToDiscardDeck(Card card) {
		discardDeck.addCard(card);
	}
	
	// increment wins
	public void addRoundWin() {
		numRoundsWon++;
	}
	
	public byte getNumRoundsWon() {
		return numRoundsWon;
	}

	public void setNumRoundsWon(byte numRoundsWon) {
		this.numRoundsWon = numRoundsWon;
	}



	public PlayerDeck getPlayerDeck() {
		return playerDeck;
	}



	public void setPlayerDeck(PlayerDeck playerDeck) {
		this.playerDeck = playerDeck;
	}

	public PlayerDeck getDiscardDeck() {
		return discardDeck;
	}

	public void setDiscardDeck(PlayerDeck discardDeck) {
		this.discardDeck = discardDeck;
	}
	
}
