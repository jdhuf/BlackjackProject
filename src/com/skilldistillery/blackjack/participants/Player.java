package com.skilldistillery.blackjack.participants;

import java.util.Iterator;
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
		
//		System.out.println("New card added: " + playerHand);
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
	//	System.out.println(value);
		return value;
	}
//Stuff I'm adding	
	


	public boolean checkPlayerHandIsBust( ) {
		boolean playerHandValueIsBust = this.playerHand.isBust();
	//	System.out.println(playerHandValueIsBust);
		return playerHandValueIsBust;
		
	}
	
	public boolean checkDealerHandIsBust( ) {
		boolean dealerHandValueIsBust = this.playerHand.isBust();
	//	System.out.println(playerHandValueIsBust);
		return dealerHandValueIsBust;
		
	}
	
	public boolean checkPlayerHandIsBlackJack() {
		boolean playerHandValueIsBlackJack = this.playerHand.isBlackJack();
	//	System.out.println(playerHandValueIsBlackJack);
		return playerHandValueIsBlackJack;
	}
	
	
	public void showLastCardDealt(Card card) {
		
		
			
			
			System.out.println(this.playerHand.getHand().get((hand.size()-1)));
		
		
		
		
	}
	
	public void showSecondCard(Card card) {
		System.out.println(this.playerHand.getHand().get(1));
	}

}