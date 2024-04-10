package CardApp;
/*
 * Author @ Sepehr Akbari (Compiler)
 * File: Card Class
 * April 16, 2024
 * Title: "Card Game: How I lost my life savings!"
 * Desc:
    * Define a class called Card that has two private data items: 
    one int called value and one String called suit. 
    This String takes the values "Diamonds", "Hearts", "Clubs" or "Spades". Also, do the following:
        * create a default constructor that sets value to a random value in 
        1-13 and suit to a random suit among the four.
        * create a constructor that takes 2 arguments, an int for card value
        and a String for card suit
        * create getters and setters for the two data items
        * a toString method that prints the card in this format:
        "5 of Hearts", "King of Spades" etc. Note that 1 should be printed as "Ace",
        11 as "Jack", 12 as "Queen" and 13 as "King"
        * an equals method that returns true if two cards have the same suit and value, false otherwise.
    * Use arrays in the constructor.
 * 
 * Points: [30 points]
 */

import java.util.*;
import java.lang.*;
import java.util.random.*;

public class Card {
    // Random object
    Random rand = new Random();
    
    // Private data items
    private int value;
    private String suit;
    
    // Default constructor
    public Card() {
        // Random value and suit
        this.value = rand.nextInt(13) + 1;
        this.suit = new String[] {"Diamonds", "Hearts", "Clubs", "Spades"}[rand.nextInt(4)];
    }
    
    // Constructor
    public Card(int value, String suit) {
        this.value = value;
        this.suit = suit;
    }
    
    // Getter (int value)
    public int getValue() {
        return this.value;
    }
    
    // Getter (String suit)
    public String getSuit() {
        return this.suit;
    }
    
    // Setter (int value)
    public void setValue(int value) {
        this.value = value;
    }

    // Setter (String suit)
    public void setSuit(String suit) {
        this.suit = suit;
    }
    
    // toString() method
    public String toString() {
        String[] values = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        return values[this.value - 1] + " of " + this.suit;
    }
    
    // equals() method
    public boolean equals(Card card) {
        // Check if the two cards have the same suit and value
        return this.value == card.getValue() && this.suit.equals(card.getSuit());
    }
}
