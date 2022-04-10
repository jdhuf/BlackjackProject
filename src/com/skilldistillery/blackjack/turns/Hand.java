package com.skilldistillery.blackjack.turns;

import java.util.ArrayList;
import java.util.List;
import com.skilldistillery.blackjack.cards.Card;


public abstract class Hand {
	List<Card> hand = new ArrayList<>();


	public void addCard() {
		for (Card card : hand)
			this.hand.add(card);
			System.out.println("addCard from Hand class");

	}

	public List<Card> getHand() {
		return this.hand;
	}

	public void setHand(List<Card> hand) {
		this.hand = hand;
	}

	public void clear() {
		this.hand.removeAll(hand);
	}

	public abstract int getHandValue();

	public List<Card> getCards() {
		return this.hand;
	}
//
//	public void setCards(List<Card> hand) {
//		this.hand = hand;
//	}

	// to String
	@Override
	public String toString() {
		return "Hand [hand=" + this.getHandValue() + "]";
	}

}