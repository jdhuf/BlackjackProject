package com.skilldistillery.blackjack.turns;


import java.util.List;
import com.skilldistillery.blackjack.cards.Card;


public abstract class Hand {
	protected List<Card> hand;


	public void addCard(Card card) {
	
			hand.add(card);
			

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

	@Override
	public String toString() {
		return "Hand [hand=" + hand + ", getHand()=" + getHand() + ", getHandValue()=" + getHandValue() + "]";
	}




	

}