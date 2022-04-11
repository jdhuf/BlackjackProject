package com.skilldistillery.blackjack.participants;

import com.skilldistillery.blackjack.cards.Card;
import com.skilldistillery.blackjack.turns.BlackjackHand;
import com.skilldistillery.blackjack.turns.Hand;

public class Player {

	Card card;
	protected Hand playerHand;

	public Player() {

		this.playerHand = new BlackjackHand();

	}


	public void setPlayerHand(BlackjackHand playerHand) {
		this.playerHand = playerHand;
	}

	public void addCardtoPlayerHand(Card card) {
		this.playerHand.addCardToHand(card);
		System.out.println("New card added.");
	}

	

	public Card getCard() {
		return this.card;
	}


	public void setCard(Card card) {
		this.card = card;
	}


	public Hand getPlayerHand() {
		return this.playerHand;
	}


	public void setPlayerHand(Hand playerHand) {
		this.playerHand = playerHand;
	}


	public void showHand() {

		System.out.println("Your hand: " + this.playerHand.toString() + this.playerHand.getHandValue());
	}

	public void clear() {
		playerHand.clear();
	}

	public int getPlayerHandValue() {
		int value = this.playerHand.getHandValue();
		System.out.println(value);
		return value;
	}

}