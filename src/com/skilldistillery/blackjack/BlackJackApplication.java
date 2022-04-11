package com.skilldistillery.blackjack;

import java.util.List;
import java.util.Scanner;

import com.skilldistillery.blackjack.cards.Card;
import com.skilldistillery.blackjack.cards.Deck;
import com.skilldistillery.blackjack.participants.Dealer;
import com.skilldistillery.blackjack.participants.Player;
import com.skilldistillery.blackjack.turns.BlackjackHand;

public class BlackJackApplication {
	
	
	Deck deck = new Deck();
	BlackjackHand hand = new BlackjackHand();
	Card card = new Card(null, null);
	
	Dealer dealer = new Dealer();
	Player player = new Player();
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		BlackJackApplication app = new BlackJackApplication();
		app.run();
	}

	public void run() {


		displayInitialMenu();

		dealer.getDeck();

		dealer.dealerShufflesDeck();
		
		dealer.dealerDealsCard(dealer);
		
		dealer.addCardtoPlayerHand(card);
		
		dealer.dealerShowsOneCard();
		
		player.getPlayerHandValue();
		
		dealer.getPlayerHandValue();
		
		dealer.dealerShufflesDeck();
		
		dealer.dealerDealsCard(dealer);
		
		dealer.addCardtoPlayerHand(card);
		
		player.getPlayerHandValue();
		
		dealer.getPlayerHandValue();
		
		dealer.dealerDealsCard(player);
		
		dealer.dealerDealsCard(player);
		
		player.getPlayerHand();
		
		System.out.println("I do not have a working program. \n"
				+ "I could have copied code from the dozens of examples that are out there, \n"
				+ "but I would like to understand what I am doing. Please help me!");
		//player.getPlayerHand().addCardToHand(card);
		//player.showHand();

	}

	public void displayInitialMenu() {

		System.out.println("Welcome to Blackjack!");
		System.out.println();
		System.out.println("Please B to begin or Q to quit. ");

		String input = sc.nextLine();

		if (input.equalsIgnoreCase("B")) {
			System.out.println("Dealing cards.");

		}
		if (input.equalsIgnoreCase("Q")) {
			System.out.println("Goodbye!");

		}
		//sc.close();
	}

}
