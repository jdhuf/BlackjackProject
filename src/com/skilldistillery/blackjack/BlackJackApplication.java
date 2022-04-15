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

	}

	public void displayInitialMenu() {

		System.out.println("Welcome to Blackjack!");
		System.out.println();
		System.out.println("Please press B to begin.");

		String input = sc.nextLine();

		if (input.equalsIgnoreCase("B")) {
			System.out.println("Dealer deals cards.");
			System.out.println();

		}

		// sc.close();
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

		while (true) {

			// test for winner
			if (player.checkPlayerHandIsBlackJack()) {
				System.out.println("Player hand is Blackjack. You win!");
				System.out.println();
				System.out.println("Your hand: ");
				player.printHand();
				System.out.println();
				System.out.println("Dealer's hand: ");
				dealer.printHand();
				break;
			}

			if (dealer.checkPlayerHandIsBlackJack()) {
				System.out.println("Dealer hand is Blackjack. Dealer wins.");
				System.out.println();
				System.out.println("Your hand: ");
				player.printHand();
				System.out.println();
				System.out.println("Dealer's hand: ");
				dealer.printHand();
				break;
			}

			else if (true) {
				System.out.println("Would you like to hit or stay?");

				System.out.println();
				System.out.println("Press H to hit or S to stay.");

				String input1 = sc.next();

				if (input1.equalsIgnoreCase("H")) {

					{

						System.out.println("You decide to hit.");
						System.out.println();
						dealer.dealerDealsCard(player);
						System.out.println("Your hand: ");
						player.printHand();
						System.out.println();

						System.out.println("Would you like to hit or stay?");

						if (dealer.getPlayerHandValue() < 17) {

							while (dealer.getPlayerHandValue() < 17) {

								System.out.println("Dealer decides to hit.");
								System.out.println();
								dealer.dealerDealsCard(dealer);
							}
							System.out.println("Dealer decides to stay.");
							System.out.println();

							if (dealer.getPlayerHandValue() > 21) {
								System.out.println("Dealer's hand is bust. You win!");
								System.out.println();
								System.out.println("Your hand: ");
								player.printHand();
								System.out.println();
								System.out.println("Dealer's hand: ");
								dealer.printHand();

								break;

							}

						}

						if (player.getPlayerHandValue() > 21) {
							System.out.println("Your hand is bust. Dealer wins.");
							System.out.println();
							System.out.println("Your hand: ");
							player.printHand();
							System.out.println();
							System.out.println("Dealer's hand: ");
							dealer.printHand();

							break;
						}

						if (dealer.getPlayerHandValue() < player.getPlayerHandValue()) {
							System.out.println("Dealer's hand value is less than your hand value.\n" + "You win!");
							System.out.println();
							System.out.println("Your hand: ");
							player.printHand();
							System.out.println();
							System.out.println("Dealer's hand: ");
							dealer.printHand();

							break;
						}

						else if (dealer.getPlayerHandValue() > player.getPlayerHandValue()) {
							System.out
									.println("Dealer's hand value is greater than your hand value.\n" + "Dealer wins!");
							System.out.println();
							System.out.println("Your hand: ");
							player.printHand();
							System.out.println();
							System.out.println("Dealer's hand: ");
							dealer.printHand();

							break;
						}

						if (dealer.getPlayerHandValue() < player.getPlayerHandValue()) {
							System.out.println("Dealer's hand value is less than your hand value.\n" + "You win!");
							System.out.println();
							System.out.println("Your hand: ");
							player.printHand();
							System.out.println();
							System.out.println("Dealer's hand: ");
							dealer.printHand();

							break;
						}

						else if (dealer.getPlayerHandValue() > player.getPlayerHandValue()) {
							System.out
									.println("Dealer's hand value is greater than your hand value.\n" + "Dealer wins!");
							System.out.println();
							System.out.println("Your hand: ");
							player.printHand();
							System.out.println();
							System.out.println("Dealer's hand: ");
							dealer.printHand();

							break;
						}

						else if (player.getPlayerHandValue() > 21) {
							System.out.println("Your hand is bust. Dealer wins.");
							System.out.println();
							System.out.println("Your hand: ");
							player.printHand();
							System.out.println();
							System.out.println("Dealer's hand: ");
							dealer.printHand();

							break;
						}

						else if (dealer.getPlayerHandValue() > 21) {
							System.out.println("Dealer's hand is bust. You win!");
							System.out.println();
							System.out.println("Your hand: ");
							player.printHand();
							System.out.println();
							System.out.println("Dealer's hand: ");
							dealer.printHand();

							break;
						}

						else if (dealer.getPlayerHandValue() == player.getPlayerHandValue()) {

							System.out.println();
							System.out.println("Your hand: ");
							player.printHand();
							System.out.println();
							System.out.println("Dealer's hand: ");
							dealer.printHand();
							System.out.println(
									"Dealer's hand value equals your hand value.\n" + "Please restart to play again!");
							break;
						}

						else if (true) {
							System.out.println("Dealer decides to stay.");
							System.out.println();

						}

						if (dealer.getPlayerHandValue() < player.getPlayerHandValue()) {
							System.out.println("Dealer's hand value is less than your hand value.\n" + "You win!");

							System.out.println();
							System.out.println("Your hand: ");
							player.printHand();
							System.out.println();
							System.out.println("Dealer's hand: ");
							dealer.printHand();

							break;
						}

						else if (dealer.getPlayerHandValue() > player.getPlayerHandValue()) {
							System.out
									.println("Dealer's hand value is greater than your hand value.\n" + "Dealer wins!");

							System.out.println();
							System.out.println("Your hand: ");
							player.printHand();
							System.out.println();
							System.out.println("Dealer's hand: ");
							dealer.printHand();

							break;
						}

						else if (dealer.getPlayerHandValue() < 17) {
							System.out.println("Dealer decides to hit.");
							System.out.println();
							dealer.dealerDealsCard(dealer);

							continue;

						}

						else if (dealer.getPlayerHandValue() < player.getPlayerHandValue()) {
							System.out.println("Dealer's hand value is less than your hand value.\n" + "You win!");

							System.out.println();
							System.out.println("Your hand: ");
							player.printHand();
							System.out.println();
							System.out.println("Dealer's hand: ");
							dealer.printHand();

						}

						else if (dealer.getPlayerHandValue() > player.getPlayerHandValue()) {
							System.out
									.println("Dealer's hand value is greater than your hand value.\n" + "Dealer wins!");
							System.out.println();
							System.out.println("Your hand: ");
							player.printHand();
							System.out.println();
							System.out.println("Dealer's hand: ");
							dealer.printHand();
						}

						else if (player.getPlayerHandValue() > 21) {
							System.out.println("Your hand is bust. Dealer wins.");
							System.out.println();
							System.out.println("Your hand: ");
							player.printHand();
							System.out.println();
							System.out.println("Dealer's hand: ");
							dealer.printHand();
						}

						else if (dealer.getPlayerHandValue() > 21) {
							System.out.println("Dealer's hand is bust. You win!");
							System.out.println();
							System.out.println("Your hand: ");
							player.printHand();
							System.out.println();
							System.out.println("Dealer's hand: ");
							dealer.printHand();

						}

						else if (dealer.getPlayerHandValue() == player.getPlayerHandValue()) {
							System.out.println(
									"Dealer's hand value equals your hand value.\n" + "Please restart to play again!");

							System.out.println();
							System.out.println("Your hand: ");
							player.printHand();
							System.out.println();
							System.out.println("Dealer's hand: ");
							dealer.printHand();

						}

						continue;
					}

				}

				else if (input1.equalsIgnoreCase("S")) {

					System.out.println("You decide to stay.");
					System.out.println();

				}

				if (dealer.getPlayerHandValue() < 17) {

					while (dealer.getPlayerHandValue() < 17) {

						System.out.println("Dealer decides to hit.");
						System.out.println();
						dealer.dealerDealsCard(dealer);
					}
					System.out.println("Dealer decides to stay.");
					System.out.println();

					if (dealer.getPlayerHandValue() > 17) {
						System.out.println("Dealer's hand is bust. You win!");
						System.out.println();
						System.out.println("Your hand: ");
						player.printHand();
						System.out.println();
						System.out.println("Dealer's hand: ");
						dealer.printHand();

						break;

					}

				}

				if (dealer.getPlayerHandValue() < player.getPlayerHandValue()) {
					System.out.println("Dealer's hand value is less than your hand value.\n" + "You win!");
					System.out.println();
					System.out.println("Your hand: ");
					player.printHand();
					System.out.println();
					System.out.println("Dealer's hand: ");
					dealer.printHand();

					break;
				}

				else if (dealer.getPlayerHandValue() > player.getPlayerHandValue()) {
					System.out.println("Dealer's hand value is greater than your hand value.\n" + "Dealer wins!");
					System.out.println();
					System.out.println("Your hand: ");
					player.printHand();
					System.out.println();
					System.out.println("Dealer's hand: ");
					dealer.printHand();

					break;
				}

				if (dealer.getPlayerHandValue() < player.getPlayerHandValue()) {
					System.out.println("Dealer's hand value is less than your hand value.\n" + "You win!");
					System.out.println();
					System.out.println("Your hand: ");
					player.printHand();
					System.out.println();
					System.out.println("Dealer's hand: ");
					dealer.printHand();

					break;
				}

				else if (dealer.getPlayerHandValue() > player.getPlayerHandValue()) {
					System.out.println("Dealer's hand value is greater than your hand value.\n" + "Dealer wins!");
					System.out.println();
					System.out.println("Your hand: ");
					player.printHand();
					System.out.println();
					System.out.println("Dealer's hand: ");
					dealer.printHand();

					break;
				}

				else if (player.getPlayerHandValue() > 21) {
					System.out.println("Your hand is bust. Dealer wins.");
					System.out.println();
					System.out.println("Your hand: ");
					player.printHand();
					System.out.println();
					System.out.println("Dealer's hand: ");
					dealer.printHand();

					break;
				}

				else if (dealer.getPlayerHandValue() > 21) {
					System.out.println("Dealer's hand is bust. You win!");
					System.out.println();
					System.out.println("Your hand: ");
					player.printHand();
					System.out.println();
					System.out.println("Dealer's hand: ");
					dealer.printHand();

					break;
				}

				else if (dealer.getPlayerHandValue() == player.getPlayerHandValue()) {

					System.out.println();
					System.out.println("Your hand: ");
					player.printHand();
					System.out.println();
					System.out.println("Dealer's hand: ");
					dealer.printHand();

					System.out
							.println("Dealer's hand value equals your hand value.\n" + "Please restart to play again!");
					break;
				}

			}

		}
	}

}
