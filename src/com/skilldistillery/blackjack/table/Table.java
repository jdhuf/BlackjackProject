package com.skilldistillery.blackjack.table;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.skilldistillery.blackjack.cards.Card;
import com.skilldistillery.blackjack.cards.Deck;

public class Table {

	// where stuff is displayed

	public static void displayInitialMenu() {
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