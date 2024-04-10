package DiceApp;
/*
 * Author @ Sepehr Akbari (Compiler)
 * File: ThreeDice Class
 * April 16, 2024
 * Title: "Card Game: How I lost my life savings!"
 * Desc:
    * Using the Die class, create an application called ThreeDice that creates three Die objects, 
    and keeps rolling them together until the sum of the three Die faces is 12. Print the outcome of each roll, 
    and finally when the program stops, print the number of rolls that were needed.
 *
 * Points: [15 points]
 */

public class ThreeDice {
    Die die1 = new Die();
    Die die2 = new Die();
    Die die3 = new Die();

    public static void main(String[] args) {
        ThreeDice roll = new ThreeDice();
        int sum = 0;
        int rolls = 0;
        while (sum != 12) {
            roll.die1.roll();
            roll.die2.roll();
            roll.die3.roll();
            sum = roll.die1.getValue() + roll.die2.getValue() + roll.die3.getValue();
            System.out.println("Die 1: " + roll.die1.getValue());
            System.out.println("Die 2: " + roll.die2.getValue());
            System.out.println("Die 3: " + roll.die3.getValue());
            System.out.println("Sum: " + sum);
            rolls++;
        }
        System.out.println("Number of rolls: " + rolls);
    }
}
