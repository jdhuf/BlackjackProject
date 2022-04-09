package com.skilldistillery.blackjack;

import com.skilldistillery.blackjack.table.Table;

public class BlackJackApplication {
	public static void main(String [] args) {
		
		BlackJackApplication app = new BlackJackApplication();
		app.run();
	}
	
	public void run() {
		Table.displayInitialMenu();
		
	}
}
