package deck.of.cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	public static void main(String[] args) {
		
		int numOfHands = 3 ;
		int cardsPerHand = 4 ;

		// Create suits and ranks in the deck

		String[] suits = { "diamonds" , "spades" , "clubs" , "hearts" } ;
		String[] ranks = { "ace", "two", "three", "four", "five", "six", "seven", "eight",
				"nine", "ten", "jack", "queen", "king" } ;

		List<String> deck = new ArrayList<String>() ;

		// Create a deck 
		for (int i = 0; i < suits.length; i++) {
			for (int j = 0; j < ranks.length; j++) {
				deck.add(ranks[j] + " of " +  suits[i]) ;
			}
		}

		//	shuffle the deck.
		Collections.shuffle(deck) ;


		if( deck.size() < numOfHands * cardsPerHand ){
			System.out.println("Not enough cards");
			return ; 
		}

		while( numOfHands > 0){
			System.out.println(dealHand( deck, cardsPerHand )) ;
			System.out.println();
			numOfHands-- ;
		}
	}

	/**
	 * This method generates the cards for each person 
	 * @param deck
	 * @param cardsPerHand
	 * @return 
	 */
	private static List<String> dealHand(List<String> deck, int cardsPerHand) {
		int deckSize = deck.size() ;
		// This obtains cards from the end of the list.
		List<String> handView = deck.subList(deckSize - cardsPerHand, deckSize) ;
		List<String> hand = new ArrayList<String>(handView) ;
		// Note that when we used subList on a list, the new list is backed up by the original list
		// So any modification in the sublist also affects the original list.
		// This will clear the 4 elements chosen for the hand from the deck.
		handView.clear() ;
		return hand ;
	}
}
