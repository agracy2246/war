package game;
import deck.Deck;
import deck.DeckType;
import deck.PlayerDeck;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;

import card.Card;
public class Game {
	Deck mainDeck;
	Player p1;
	Player p2;
	
	Deck warDeck;
	
	
	private final int numRounds = 10;
	private int numRoundsPlayed;
	
	public Game() {
		mainDeck = new Deck(DeckType.MAIN);
		warDeck = new PlayerDeck();
		p1 = new Player();
		p2 = new Player();
		numRoundsPlayed = 0;
		
		gameSetup();
	}

	private void gameSetup() {
		deal();
		
	}

	private void deal() {
		System.out.println("\nDealing Cards...");
		for(int i = 0; i < 26; ++i) {
			p1.getPlayerDeck().addCard(mainDeck.getDeck().pop());
			p2.getPlayerDeck().addCard(mainDeck.getDeck().pop());
		}
	}

	public void start() {
		System.out.println("Game started, good luck!\n");
		
		while(numRoundsPlayed < numRounds) {
			playRound();
			numRoundsPlayed++;
		}
		
		// in case of a tie, play 1 more round
		if(p1.getNumRoundsWon() == p2.getNumRoundsWon()) {
			System.out.println("--- Playing a tie breaker! ---\n");
			playRound();
		}
		
		System.out.println(
			(
				p1.getNumRoundsWon() > p2.getNumRoundsWon()? 
				"Player 1 Wins " + p1.getNumRoundsWon() + "-" + p2.getNumRoundsWon() + "!":
				"Player 2 Wins " + p2.getNumRoundsWon() + "-" + p1.getNumRoundsWon() + "!"
			)
		);
		
	}

	private void playRound() {
		Card p1PlayCard = p1.playCard();
		Card p2PlayCard = p2.playCard();
		System.out.println("Round " + (numRoundsPlayed+1));
		System.out.println("******************************");
		
		System.out.println("Player1 plays: " + p1PlayCard.getValueAsString() + " of " + p1PlayCard.getSuit());
		System.out.println("Player2 plays: " + p2PlayCard.getValueAsString() + " of " + p2PlayCard.getSuit());
		
		
		if(p1PlayCard.getValue() > p2PlayCard.getValue()) {
			System.out.println("\nPlayer1 wins the round!");
			p1.addCardToDiscardDeck(p1PlayCard);
			p1.addCardToDiscardDeck(p2PlayCard);
			p1.addRoundWin();
		}
		else if(p1PlayCard.getValue() < p2PlayCard.getValue()) {
			// p2 wins the round
			System.out.println("\nPlayer2 wins the round!");
			p2.addCardToDiscardDeck(p1PlayCard);
			p2.addCardToDiscardDeck(p2PlayCard);
			p2.addRoundWin();
		}
		else {
			// Tie -> war
			System.err.println("\n--- WAR! ---\n");
			warDeck.getDeck().add(p1PlayCard);
			warDeck.getDeck().add(p2PlayCard);
			playWarRound();
		}	
		System.out.println("******************************\n");
		
	}

	private void playWarRound() {
		// By the rules on bicycle.com, one card is face down, next is face up
		Card p1DownCard = p1.playCard();
		Card p2DownCard = p2.playCard();
		warDeck.getDeck().add(p1DownCard);
		warDeck.getDeck().add(p2DownCard);
		
		Card p1PlayCard = p1.playCard();
		Card p2PlayCard = p2.playCard();
		
		System.out.println("Player1 plays: " + p1PlayCard.getValueAsString() + " of " + p1PlayCard.getSuit());
		System.out.println("Player2 plays: " + p2PlayCard.getValueAsString() + " of " + p2PlayCard.getSuit());
		
		if(p1PlayCard.getValue() > p2PlayCard.getValue()) {
			// p1 wins the round
			System.out.println("\nPlayer1 wins the round!");
			p1.addCardToDiscardDeck(p1PlayCard);
			p1.addCardToDiscardDeck(p2PlayCard);
			
			int counter = warDeck.getDeck().size();
			for(int i = 0; i < counter; ++i) {
				p1.addCardToDiscardDeck(warDeck.getDeck().pop());
			}
			
			p1.addRoundWin();
		}
		else if(p1PlayCard.getValue() < p2PlayCard.getValue()) {
			// p2 wins the round
			System.out.println("\nPlayer2 wins the round!");
			p2.addCardToDiscardDeck(p1PlayCard);
			p2.addCardToDiscardDeck(p2PlayCard);
			
			int counter = warDeck.getDeck().size();
			for(int i = 0; i < counter; ++i) {
				p1.addCardToDiscardDeck(warDeck.getDeck().pop());
			}
			
			p2.addRoundWin();
		}
		else {
			// Tie -> war
			System.err.println("\nReWAR!\n");
			warDeck.getDeck().add(p1PlayCard);
			warDeck.getDeck().add(p2PlayCard);
			BufferedWriter bw = null;
			
			try {
				String content = "Rewar\n";
				File file = new File("test.txt");
				if(!file.exists()) {
					file.createNewFile();
				}
				FileWriter fw = new FileWriter(file, true);
				bw = new BufferedWriter(fw);
				bw.write(content);
				
			}catch(IOException ioe) {
				
			}
			finally {
				 try{
				      if(bw!=null)
					 bw.close();
				   }catch(Exception ex){
				       System.out.println("Error in closing the BufferedWriter"+ex);
				    }
			}
			
			playWarRound();
		}
		
	}
	
	
	
}
