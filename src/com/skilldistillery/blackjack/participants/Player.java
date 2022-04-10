package com.skilldistillery.blackjack.participants;

import com.skilldistillery.blackjack.turns.BlackjackHand;

public class Player {
	
	
	
	public BlackjackHand playerHand = new BlackjackHand();
	
	public Player () {
		playerHand = new BlackjackHand();
	}

	
	public BlackjackHand getPlayerHand() {
		return playerHand;
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