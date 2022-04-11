package com.skilldistillery.blackjack.turns;

import java.util.ArrayList;
import java.util.List;
import com.skilldistillery.blackjack.cards.Card;

public abstract class Hand {
	protected List<Card> hand = new ArrayList<Card>();
	
	public Hand (){
		
	}

	public void addCardToHand(Card card) {

		this.hand.add(card);

	}


	public void clear() {
		this.hand.removeAll(hand);
	}

	public abstract int getHandValue();


	public List<Card> getHand() {
		return hand;
	}

	public void setHand(List<Card> hand) {
		this.hand = hand;
	}


	@Override
	public String toString() {
		return "Hand [hand=" + hand + "]";
	}



}