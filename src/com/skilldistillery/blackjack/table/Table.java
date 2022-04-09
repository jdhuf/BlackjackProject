package com.skilldistillery.blackjack.table;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.skilldistillery.blackjack.cards.Card;
import com.skilldistillery.blackjack.cards.Deck;

public class Table {

	
	//where the action takes place
	
	public static void displayInitialMenu() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to Blackjack!");
		System.out.println();
		System.out.println("Please B to begin or Q to quit. ");
	
		String input = sc.nextLine();
		
		
		if (input.equalsIgnoreCase("B")) {
			System.out.println("Dealing cards.");
			InitialDealingToDealer();
				
			}
		if (input.equalsIgnoreCase("Q")) {
			System.out.println("Goodbye!");
				
			}
		
		sc.close();
		}
	
	public static void InitialDealingToDealer() {
		 Deck deck = new Deck();
	    List<Card> hand = new ArrayList<>(2);
	    System.out.println("Dealer's initial hand:");
	    System.out.println();
	    
	      int totalValue = 0;
	      Card c = deck.dealCard();
	      Card c1 = deck.dealCard();
	        totalValue = c.getValue() + c1.getValue();
	        hand.add(c);
	        hand.add(c1);
	        c = deck.dealCard();
	        
	        System.out.println();
	        System.out.println(totalValue);
	        System.out.println("Hidden card and " );
	        
	      }
	      
	
	
	private void printHandAndValue(List<Card> hand, int value) {
		for (Card card : hand) {
			System.out.println(card);
		}
		System.out.println("Total value: " + value);
	}
	
}
	
	

