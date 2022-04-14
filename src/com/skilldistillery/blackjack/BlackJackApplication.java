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

		dealer.getDeck();

		dealer.dealerShufflesDeck();

//		dealer.dealerDealsCard(dealer);
//		dealer.dealerDealsCard(player);

		// dealer.getPlayerHandValue();
		// player.getPlayerHandValue();

		dealer.dealerDealsCard(player);
		player.getPlayerHandValue();
		player.checkPlayerHandIsBust();
		player.checkPlayerHandIsBlackJack();
		player.printHand();

		dealer.dealerDealsCard(player);
		player.getPlayerHandValue();
		player.checkPlayerHandIsBust();
		player.checkPlayerHandIsBlackJack();
		player.printHand();

		dealer.dealerDealsCard(player);
		player.getPlayerHandValue();
		player.checkPlayerHandIsBust();
		player.checkPlayerHandIsBlackJack();
		player.printHand();

		dealer.dealerDealsCard(player);
		player.getPlayerHandValue();
		player.checkPlayerHandIsBust();
		player.checkPlayerHandIsBlackJack();
		player.printHand();

	}

	public void displayInitialMenu() {

		System.out.println("Welcome to Blackjack!");
		System.out.println();
		System.out.println("Please press B to begin or Q to quit. ");

		String input = sc.nextLine();

		if (input.equalsIgnoreCase("B")) {
			System.out.println("Dealing cards.");

		}
		if (input.equalsIgnoreCase("Q")) {
			System.out.println("Goodbye!");

		}
		// sc.close();
	}

	public void dealerMakesDecision() {

		if (dealer.getPlayerHandValue() < 17) {
			dealer.dealerDealsCard(dealer);
			System.out.println("Dealer decides to hit.");
		}
		
		else {
			System.out.println("Dealer decides to stay.");
		}

	}

	public void testForWinner() {

		while (true) {

			if (player.checkPlayerHandIsBlackJack()) {
				System.out.println("Player wins.");
				continue;
			}

			if (dealer.checkPlayerHandIsBlackJack()) {
				System.out.println("Dealer wins.");

				continue;
			}

			if (player.checkPlayerHandIsBust()) {
				System.out.println("Dealer wins.");
				continue;
			}

			if (dealer.checkPlayerHandIsBust()) {
				System.out.println("Player wins.");
				break;
			}

		}

		// if (dealer.getPlayerHandValue(dealer) > player.getPlayerHandValue(player) &&
	}
}
