package com.skilldistillery.blackjack.participants;

import java.util.List;

import com.skilldistillery.blackjack.cards.Card;
import com.skilldistillery.blackjack.turns.BlackjackHand;
import com.skilldistillery.blackjack.turns.Hand;

public class Player {


	protected Hand playerHand;
	 List<Card> hand;

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

	
	public void printHand() {
		playerHand.printHand();
	}


	public void toStringHand() {
		playerHand.toString();
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
		this.hand.clear();
	}

	public int getPlayerHandValue() {
		int value = this.playerHand.getHandValue();
		System.out.println(value);
		return value;
	}

}