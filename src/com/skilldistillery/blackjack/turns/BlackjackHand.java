package com.skilldistillery.blackjack.turns;
import java.util.ArrayList;
import java.util.List;

import com.skilldistillery.blackjack.cards.Card;
import com.skilldistillery.blackjack.cards.Deck;


public class BlackjackHand extends Hand {

//	+ getHandValue(): int

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

	}

	@Override
	public int getHandValue() {
		int handValue = 0;

		for (Card card : hand) {
			handValue += card.getValue();
		}

		return handValue;

	}

////	public Card addCard() {
////		
////		hand.add(getHandValue(), cardName);
////		public void addCard(Card cardName) {
//		//
////				cards.add(cardName);
////			//	cards.add(getHandValue(), cardName);
////			//	cards.add(0, cardName);
//		return cardName;
//	}

	@Override
	public Card addCard() {
		
		Deck deck = new Deck();
	
		List<Card> hand = new ArrayList<>();
		Card c = deck.dealCard();
		int cardValue = c.getValue();
		hand.add(c);
	
		System.out.println(cardValue);
	
		return c;
	}

}
