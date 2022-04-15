package com.skilldistillery.blackjack.turns;

import java.util.ArrayList;

import com.skilldistillery.blackjack.cards.Card;

public class BlackjackHand extends Hand {

	public BlackjackHand() {
		hand = new ArrayList<>();
		}

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
		if (handValue > 21) {
			
		}
		
		return true;

	}

	public int getHandValue() {
		int handValue = 0;

		for (Card card : hand) {
			handValue += card.getValue();
		}

	//	System.out.println(handValue);
		return handValue;
	}
	
	//stuff I'm adding

	
	
		
	

}
