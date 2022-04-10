package com.skilldistillery.blackjack.participants;

import com.skilldistillery.blackjack.cards.Deck;
import com.skilldistillery.blackjack.turns.BlackjackHand;


public class Dealer extends Player {
		
	private Deck deck;

	
	public Dealer () {
		
		this.deck = new Deck();
		this.playerHand = new BlackjackHand();
	}
	
	
	public void getDeck() {
		deck.createDeck();
	}

	public void dealerShufflesDeck() {
		deck.shuffle();
	}

	public void dealerDealsCard(Player player) {
		deck.dealCard();
	}

	public String dealerShowsOneCard() {
			
		return "Dealer is showing this card: " + playerHand.getHand().get(1);
	}

}
