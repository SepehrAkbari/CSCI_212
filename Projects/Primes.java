/*
 * Author @ Sepehr Akbari (Compiler)
 * Feb 28, 2024
 * Desc: 
    * Write a program called Primes that takes an integer 
    * 'n' from the user and prints the first n prime numbers 
    * on the screen. A prime is a number that is only divisible 
    * by 1 and itself. 1 is not considered a prime. Using the 
    * following theorem: "A composite number n (meaning is not 
    * prime) has a prime divisor less than or equal to sqrt(n)" 
    * will shorten your code.
 *
 * Points: [25 points]
*/

package Primes;
import java.util.*;
import java.lang.Math;

public class Primes {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        int n;
        boolean valid = false;
        while (!valid) {
            try {
                System.out.print("Enter an integer: ");
                n = sc.nextInt();
                if (n > 0) {
                    valid = true;
                    PrintPrimes(n);
                } else {
                    System.out.println("Invalid input. Please enter a positive integer.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                sc.next();
            }
        }
        System.out.print("\n");
    }

    public static void PrintPrimes(int n) {
        System.out.print("The first " + n + " prime numbers are: ");
        for (int i = 2; n > 0; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
                n--;
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) 
            return false; 
  
        if (n == 2 || n == 3) 
            return true; 
  
        if (n % 2 == 0 || n % 3 == 0) 
            return false; 
  
        for (int i = 5; i < Math.sqrt(n); i = i + 6) 
            if (n % i == 0 || n % (i + 2) == 0) 
                return false; 
  
        return true; 
    }
}
