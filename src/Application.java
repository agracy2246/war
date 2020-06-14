

import java.io.*;
import java.util.Arrays;

import deck.Deck;
import deck.DeckType;
import deck.PlayerDeck;
import game.Player;
import game.Game;
import game.Player;
import card.Card;
public class Application {
	
	public static void main(String[] args) {
		for(int i = 0; i < 10; ++i) {
			new Game().start();
		}
		System.out.println("Done");
	}
}
