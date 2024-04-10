package CardApp;
/*
 * Author @ Sepehr Akbari (Compiler)
 * File: ShuffleDeck Class
 * April 16, 2024
 * Title: "Card Game: How I lost my life savings!"
 * Desc:
    * Define a driver class called ShuffleDeck with a main() method that does the following:
        * creates an array of 52 card objects called deck
        * use nested for loops to initialize all 52 cards to the four suits and 13 values, in order
        * use a for:each loop to print the entire deck (one card on each line)
        * use a loop with a random number generator to shuffle the deck. That means, take each card at index positions 0-51 one by one, and swap it with another randomly selected card in the deck.
        * use a for:each loop to print the shuffled deck (one card on each line)
    * Hint: Use an array of 52 Card objects.
 *
 * Points: [30 points]
 */

// Packages & Imports
import java.util.*;

public class ShuffleDeck {
    // main() method
    public static void main(String[] args) {
        // Random object
        Random rand = new Random();

        // Creating an array of 52 card objects called deck
        Card[] deck = new Card[52];
        
        // Nested for loops to initialize all 52 cards to the four suits and 13 values, in order
        int index = 0;
        // Loop through the four suits
        for (int i = 0; i < 4; i++) { 
            // Loop through the 13 values  
            for (int value = 1; value <= 13; value++) {
                // Create a card object and add it to the deck
                String suit = new String[] {"Diamonds", "Hearts", "Clubs", "Spades"}[i];
                // Add the card to the deck
                deck[index] = new Card(value, suit);
                // Increment the index
                index++;
            }
        }
        
        System.out.println("The Deck of Cards: \n");
        // Using a for:each loop to print the entire deck
        for (Card card : deck) {
            System.out.println(card);
        }
        
        // Using a loop with a random number generator to shuffle the deck
        for (int i = 0; i < deck.length; i++) {
            // Generate a random index
            int randomIndex = rand.nextInt(deck.length);
            // Swap the cards
            Card temp = deck[i];
            deck[i] = deck[randomIndex];
            deck[randomIndex] = temp;
        }
        
        System.out.println("\n The Shuffled Deck of Cards: \n");
        // Using a for:each loop to print the shuffled deck
        for (Card card : deck) {
            System.out.println(card);
        }
    }
}
