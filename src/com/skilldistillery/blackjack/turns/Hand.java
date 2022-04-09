package com.skilldistillery.blackjack.turns;

import java.util.ArrayList;
import java.util.List;
import com.skilldistillery.blackjack.cards.Card;


public abstract class Hand {

	List<Card> cards;


	public Hand() {
		cards = new ArrayList<>();

	}

	public void addCard(Card cardName) {

		cards.add(cardName);
	//	cards.add(getHandValue(), cardName);
	//	cards.add(0, cardName);

	}

	public void clear() {
		cards.removeAll(cards);
	}

	public abstract int getHandValue();

	public List<Card> getCards() {
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}

	// to String
	@Override
	public String toString() {
		return "Hand [cards=" + cards + "]";
	}

}
