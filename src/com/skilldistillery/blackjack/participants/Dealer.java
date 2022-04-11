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
		this.deck.dealCard();
	}

	public String dealerShowsOneCard() {

		return "Dealer is showing this card: " + playerHand.getHand().get(1);
	}

	public int getPlayerHandValue() {
		int value = this.playerHand.getHandValue();
		return value;

	}

}
