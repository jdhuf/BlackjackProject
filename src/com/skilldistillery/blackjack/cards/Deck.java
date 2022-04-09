package com.skilldistillery.blackjack.cards;


import java.util.ArrayList;
import java.util.Collections;

import java.util.List;



public class Deck {
	private List<Card> cards;
	
	public Deck() {
		cards = createDeck();
	}
	
	private List<Card> createDeck() {
		List<Card> deck = new ArrayList<>(52);
		for (Suit s: Suit.values()) {
			for (Rank r : Rank.values()) {
				deck.add(new Card(r, s));
			}
		}
		return deck;
	}
	
	public int checkDeckSize() {
		return cards.size();
	}
	
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	public Card dealCard() {
		return cards.remove(0);
	}
	
	public void InitialDealingToDealer() {
		 Deck deck = new Deck();
	    List<Card> hand = new ArrayList<>(2);
	      int totalValue = 0;
	      for(int i = 0; i < 2; i++) {
	        Card c = deck.dealCard();
	        totalValue += c.getValue();
	        hand.add(c);
	        
	        System.out.println(totalValue);
	      }
		
	}
	
//	+ remove Card
	
}
