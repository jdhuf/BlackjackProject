package com.skilldistillery.blackjack;

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

		playBlackJack();
		
		displayHands();

	}
	
	public void displayInitialMenu() {

		System.out.println("Welcome to Blackjack!");
		System.out.println();
		System.out.println("Please press 1 to begin.");

		int input1 = sc.nextInt();

		if (input1 == 1) {
			System.out.println("Dealer deals cards.");
			System.out.println();

		}

	}
	
	public void displayHands() {
		
		System.out.println("Your hand:");
		System.out.println();
		player.printHand();
		
		System.out.println();
		System.out.println("Dealer's hand:");
		dealer.printHand();
		
	}

	public void playBlackJack() {

		dealer.getDeck();

		dealer.dealerShufflesDeck();
		dealer.dealerDealsCard(player);
		dealer.dealerDealsCard(dealer);
		dealer.dealerDealsCard(player);
		dealer.dealerDealsCard(dealer);

		System.out.println("Your hand: ");
		player.printHand();
		player.getPlayerHandValue();
		System.out.println();

		System.out.println("Dealer's visible card: ");
		dealer.showSecondCard(card);
		System.out.println();
				
		if (player.checkPlayerHandIsBlackJack()) {
			System.out.println("Player hand is Blackjack. You win!");
			System.out.println();
			
		}

		if (dealer.checkPlayerHandIsBlackJack()) {
			System.out.println("Dealer hand is Blackjack. Dealer wins!");
			System.out.println();
		}
		
		else {
		
		int input = 2;
		
		do {
			
			while(true) {
						
			System.out.println("Hit or stay?");
			System.out.println();
			System.out.println("Press 1 to hit or 2 to stay.");
					
			int userInput = sc.nextInt();
			sc.nextLine();
			
			if (userInput == 1) {
			
			System.out.println("You decide to hit.");
			System.out.println();

			dealer.dealerDealsCard(player);
			System.out.println("Your hand: ");
			player.printHand();
			System.out.println();

			continue;
			
			}
			
			if (userInput == 2) {
				
				System.out.println("You decide to stay: ");

				System.out.println();
				
				break;
			}
			
		} 
		
	} 
		
		while (input != 2);
						
		for (int i = 0; i < 10; i++) {

		 if (dealer.getPlayerHandValue() < 17) {

			dealer.dealerDealsCard(dealer);
			
			System.out.println("Dealer hits.");

			System.out.println();
			
			continue;
		 	
		 }

	}
		
		if ((player.getPlayerHandValue() > 21) && (dealer.getPlayerHandValue()) > 21) {

			System.out.println("No winner. Everyone's busted. Restart to try again.");
			
			System.out.println();
		
		}
		
		
		
		else if (dealer.getPlayerHandValue() > 21) {
		
		System.out.println("Dealer busts. You win!");
		
		System.out.println();
				
	}

	else if ((player.getPlayerHandValue() > dealer.getPlayerHandValue()) && (player.getPlayerHandValue() < 22)) {

			System.out.println("You win!");
			
			System.out.println();
		}

		else if (player.getPlayerHandValue() == dealer.getPlayerHandValue()) {

			System.out.println("No winner. Restart to try again.");
			
			System.out.println();

		}

		else if ((player.getPlayerHandValue() < dealer.getPlayerHandValue()) && (dealer.getPlayerHandValue() < 22)) {

			System.out.println("Dealer wins!");
			
			System.out.println();

		}

		else 	if (player.getPlayerHandValue() > 21) {

			System.out.println("You bust! Dealer wins.");
			
			System.out.println();

		}
		
	}

}
	
}
