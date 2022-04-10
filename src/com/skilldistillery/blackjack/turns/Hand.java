package com.skilldistillery.blackjack.turns;


import java.util.List;
import com.skilldistillery.blackjack.cards.Card;



public abstract class Hand {
	List<Card> hand;

	
	
	
////	public Card addCard(Card cardName) {
////	Deck deck = new Deck();
////	
////	List<Card> hand = new ArrayList<>();
////	Card c = deck.dealCard();
////	int cardValue = c.getValue();
////	hand.add(c);
////	
////	System.out.println(cardValue);
////	
////	return c;
////	
////	
////	public Hand() {
////	//	cards = new ArrayList<>();
////
////	}
//	}

//	public void addCard(Card cardName) {
//
//		cards.add(cardName);
//	//	cards.add(getHandValue(), cardName);
//	//	cards.add(0, cardName);
//
//	}
	
	public abstract Card addCard();

	public void clear() {
		hand.removeAll(hand);
	}

	public abstract int getHandValue();

	public List<Card> getCards() {
		return hand;
	}

	public void setCards(List<Card> hand) {
		this.hand = hand;
	}

	// to String
	@Override
	public String toString() {
		return "Hand [hand=" + hand + "]";
	}

}
