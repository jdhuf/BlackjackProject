package com.skilldistillery.blackjack.participants;

import com.skilldistillery.blackjack.turns.BlackjackHand;
import com.skilldistillery.blackjack.turns.Hand;

public class Player {
	
	protected Hand playerHand;
	

	
	public Player () {
	
		this.playerHand = new BlackjackHand();
		
	}

	
	public BlackjackHand getPlayerHand() {
		return (BlackjackHand) playerHand;
	}

	public void setPlayerHand(BlackjackHand playerHand) {
		this.playerHand = playerHand;
	}

////	public BlackjackHand addCard(Card c) {
////		playerHand.addCard(c) = new Card();
////		return player;
//		
//		
//	}
	
	public void addCard() {
		//playerHand.addCard();
		System.out.println("New card added.");
	}

	public void showHand() {
		
		
	
		System.out.println("Your hand: " + playerHand.toString() + playerHand.getHandValue());
	}

	public void clear() {
		playerHand.clear();
	}

}