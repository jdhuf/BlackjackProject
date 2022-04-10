package com.skilldistillery.blackjack.participants;
import com.skilldistillery.blackjack.cards.Deck;


public class Dealer extends Player {
		
	private Deck deck;

	
	public Dealer () {
		this.deck = new Deck();
	}
	
	
	Dealer (Deck deck) {
		this.deck = new Deck();
	}

	public void dealerShufflesDeck() {
		deck.shuffle();
	}

	public void dealerDealsCard(Player player) {
		deck.dealCard();
	}

	public String dealerShowsOneCard() {
			
		return "Dealer is showing this card: " + playerHand.getCards().get(1);
	}

}
