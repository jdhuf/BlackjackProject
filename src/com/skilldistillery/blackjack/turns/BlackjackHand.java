package com.skilldistillery.blackjack.turns;

import java.util.ArrayList;
import java.util.List;

import com.skilldistillery.blackjack.cards.Card;

public class BlackjackHand extends Hand {
	
	List<Card> hand = new ArrayList<>();

	public boolean isBlackJack() {

		if (hand.size() == 2) {
			return hand.get(0).getValue() + hand.get(1).getValue() == 21;

		}

		return false;

	}

	public boolean isBust() {

		int handValue = 0;

		for (Card card : hand) {
			handValue += card.getValue();
		}

		return handValue > 21;
		// return handValue;
	}


	public int getHandValue() {
		int handValue = 0;

		for (Card card : hand) {
			handValue += card.getValue();
		}

		return handValue;

	}

	

}
