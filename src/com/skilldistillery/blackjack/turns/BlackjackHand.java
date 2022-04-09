package com.skilldistillery.blackjack.turns;
import com.skilldistillery.blackjack.cards.Card;


public class BlackjackHand extends Hand {

//	+ getHandValue(): int

	public boolean isBlackJack() {

		if (cards.size() == 2) {
			return cards.get(0).getValue() + cards.get(1).getValue() == 21;

		}

		return false;

	}

	public boolean isBust() {

		int handValue = 0;

		for (Card card : cards) {
			handValue += card.getValue();
		}

		return handValue > 21;

	}

	@Override
	public int getHandValue() {
		int handValue = 0;

		for (Card card : cards) {
			handValue += card.getValue();
		}

		return handValue;

	}

}
