package com.skilldistillery.blackjack.turns;

import java.util.List;

import com.skilldistillery.blackjack.cards.Card;

public abstract class Hand {

	List<Card> cards;



	public void addCard() {

		for (Card card : cards) {

		}

	}

	public void clear() {

	}

	public abstract void getHandValue(); // int

	//to String
	
}
