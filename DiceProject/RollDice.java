/*
  * Author @ Sepehr Akbari (Compiler)
  * File: RollDice Class
  * April 16, 2024
  * Title: "Card Game: How I lost my life savings!"
  * Desc:
     * Write an application named rollDice that creates two objects of the Die class (given). 
     The application should roll the dice one by one, print their face values, and then print the sum, 
     difference and product of those values.
  *
  * Points: [10 points]
  */

  public class RollDice {
    // Dice objects
    Die die1 = new Die();
    Die die2 = new Die();

    // main() method
    public static void main(String[] args) {
        // Create an object of the class
        rollDice roll = new rollDice();
        // Roll the dice
        roll.die1.roll();
        roll.die2.roll();
        // Print the face values
        System.out.println("Die 1: " + roll.die1.getValue());
        System.out.println("Die 2: " + roll.die2.getValue());
        // Print the sum, difference and product
        System.out.println("Sum: " + (roll.die1.getValue() + roll.die2.getValue()));
        System.out.println("Difference: " + (roll.die1.getValue() - roll.die2.getValue()));
        System.out.println("Product: " + (roll.die1.getValue() * roll.die2.getValue()));
    }
}

