package com.skilldistillery.blackjack.turns;

import java.util.ArrayList;
import java.util.List;
import com.skilldistillery.blackjack.cards.Card;

public abstract class Hand {
	protected List<Card> hand;
	protected Card card;

	public Hand() {
		hand = new ArrayList<>();
	}

	public void addCardToHand(Card card) {

		this.hand.add(card);

	}
	
	public void printHand () {
		for (Card card : hand) {
			System.out.println(card);
		}
	}

	public void clear() {
		this.hand.removeAll(hand);
	}

	public abstract int getHandValue();
	
	public abstract boolean isBust();
	
	public abstract boolean isBlackJack();

	public List<Card> getHand() {
		return this.hand;
	}

	public void setHand(List<Card> hand) {
		this.hand = hand;
	}

	@Override
	public String toString() {
		
		// instantiate Stringbuilder add card and spacing broken needs to be finished
		
		StringBuilder sb = new StringBuilder();
		for (Card card : hand) {
		sb.append(card + " card ");

		}
		return sb.toString();
	}

}