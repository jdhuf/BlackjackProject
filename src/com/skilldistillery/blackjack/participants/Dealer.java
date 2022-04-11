package com.skilldistillery.blackjack.participants;

import com.skilldistillery.blackjack.cards.Card;
import com.skilldistillery.blackjack.cards.Deck;
import com.skilldistillery.blackjack.turns.BlackjackHand;
import com.skilldistillery.blackjack.turns.Hand;

public class Dealer extends Player {

	private Deck deck;
	private Card card;

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

	public Hand dealerShowsOneCard() {
		System.out.println();
		return getPlayerHand().get(1);
		//+ .getHand().get(1);
	}

////	public int getPlayerHandValue() {
////		int value = this.playerHand.getHandValue();
////		return value;
//
//	}

}
