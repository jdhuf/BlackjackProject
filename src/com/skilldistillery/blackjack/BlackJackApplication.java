package com.skilldistillery.blackjack;
import java.util.List;
import java.util.Scanner;

import com.skilldistillery.blackjack.cards.Card;
import com.skilldistillery.blackjack.participants.Dealer;
import com.skilldistillery.blackjack.participants.Player;


public class BlackJackApplication {
	public static void main(String [] args) {
		
		BlackJackApplication app = new BlackJackApplication();
		app.run();
	}
	public void run() {


		//List<Card> hand;
		Dealer dealer = new Dealer();
		Player player = new Player();
		
		displayInitialMenu();
		
		dealer.dealerShufflesDeck();
		

		dealer.dealerDealsCard(dealer);
		dealer.addCard();

		dealer.dealerShowsOneCard();

		
		
		
	}
	
	public void displayInitialMenu() {
		Scanner sc = new Scanner(System.in);

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
		sc.close();
	}
	
	

}
