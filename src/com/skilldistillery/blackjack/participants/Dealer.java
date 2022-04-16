package com.skilldistillery.blackjack.participants;

import com.skilldistillery.blackjack.cards.Deck;
import com.skilldistillery.blackjack.turns.BlackjackHand;


public class Dealer extends Player {

	private Deck deck;
	

	public Dealer() {

		this.deck = new Deck();
		this.playerHand = new BlackjackHand();
	}

	public void getDeck() {
		this.deck.createDeck();
	}

	public void dealerShufflesDeck() {
		this.deck.shuffle();
	}

	public void dealerDealsCard(Player player) {
	
		player.addCardtoPlayerHand(deck.dealCard());
		
	}
	
}
