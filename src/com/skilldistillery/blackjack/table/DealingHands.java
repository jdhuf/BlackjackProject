package com.skilldistillery.blackjack.table;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.skilldistillery.blackjack.cards.Card;
import com.skilldistillery.blackjack.cards.Deck;

public class DealingHands {

  public static void main(String[] args) {
    DealingHands d = new DealingHands();
    d.run();
  }
  
  private void run() {
    Deck deck = new Deck();
    
    Scanner sc = new Scanner(System.in);
    System.out.print("How many cards would you like? ");
    
    try {
      int numCards = sc.nextInt();
      if(numCards > 52) {
        throw new InputMismatchException();
      }
      
      List<Card> hand = new ArrayList<>(numCards);
      int totalValue = 0;
      for(int i = 0; i < numCards; i++) {
        Card c = deck.dealCard();
        totalValue += c.getValue();
        hand.add(c);
      }
      printHandAndValue(hand, totalValue);
    }
    catch (InputMismatchException e) {
      System.out.println("Please enter a number from 1 to 52.");
    }
    finally {
      sc.close();
    }
  }
  
  private void printHandAndValue(List<Card> hand, int value) {
    for (Card card : hand) {
      System.out.println(card);
    }
    System.out.println("Total value: " + value);
  }

}
