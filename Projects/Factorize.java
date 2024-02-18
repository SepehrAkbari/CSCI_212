/*
 * Author @ Sepehr Akbari (Compiler)
 * Feb 28, 2024
 * Title: "What factors are you/we made of?"
 * Desc: 
    * Write a program called Factorize that takes 
    * an integer n from the user and prints out the prime 
    * factorization of the number. e.g., if n is 72, the 
    * program should print 2*2*2*3*3, and if n is 210 then 
    * the program should print 2*3*5*7.
 *
 * Points: [25 points]
*/

package Factorize;
import java.util.*;

public class Factorize {
   static Scanner sc = new Scanner(System.in);

   public static void main(String[] args) {
      boolean valid = false;
      while (!valid) {
         try {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            if (n > 0) {
               valid = true;
               factorize(n);
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

   public static void factorize(int n) {
      System.out.print("The prime factorization of " + n + " is: ");
      if (n == 1) {
         System.out.print("1");
         return;
      }
      for (int i = 2; i <= n; i++) {
         while (n % i == 0) {
            System.out.print(i);
            n /= i;
            if (n != 1) {
               System.out.print("*");
            }
         }
      }
   }
}
