/*
 * Author @ Sepehr Akbari (Compiler)
 * March 29, 2024
 * Method 1:
 	* Title: "Totals"
	* Desc: 
		* Implement a method named totals() that takes a two-dimensional 
		* integer array named array as a parameter and returns a one-dimensional 
		* array where each element is the sum of integers in each column of the input array.
	* Points: [10 points]
 * Method 2:
 	* Title: "Vowels"
	* Desc:
		* Implement a method named vowels that accepts a String array named alpha. 
		* The method will return the index of the String that contains the most vowels. 
		* If there is a tie any one will be good.
	* Points: [10 points]
 * Method 3:
 	* Title: "Border"
	* Desc:
		* Implement a method named border that accepts a two-dimensional array of 
		* chars named array as a parameter. It initializes all of the elements of the 
		* array to ‘x’ except for the perimeter (first and last column, and first and last row) 
		* that is initialized to ‘o’. No need to return anything.
	* Points: [10 points]
 *
 * All three methods are included in the PS2Driver.java file and called in the main() method.
 */

// Packages & Imports
import java.util.Scanner;

public class PS2Driver {
	public static void main(String[] args) {
		// this is used for testing each problem
		//one test case is included below - you need to perform thorough testing
		
		//test totals
		System.out.println("Test for the totals method");
		//
		int[][] square2 = {{8,1,6, 4},{3,5,7, 6},{4,9,2, 20}};
		for (int total: totals(square2)) {
			System.out.print (total + " ");
		}
		System.out.println();
		
		//test vowels
		System.out.println("Test for the vowels method");
		
		String[] beta = {"test1", "let's try again", "how many vowels?", "12345"};
		System.out.print(vowels(beta));
		
		System.out.println();
		
		//test border method
		System.out.println("Test for the border method");
		
		char[][] test = {{'a','b', 'c', '4'}, {'5','1','2', '3'}, {'a','b','6', 'c'}};
		border(test);
		
		System.out.println();
	}

	public static int[] totals(int[][] array) {
		//include the code to solve the respective problem here
		//change anything you need to - sums below is not declared not instantiated
		//thus the error
		int[] sums = new int[array[0].length];
		for (int i = 0; i < array[0].length; i++) {
			for (int j = 0; j < array.length; j++) {
				sums[i] += array[j][i];
			}
		}
		return sums;
	}
	
	public static int vowels(String[] alpha) {
		//include the code to solve the respective problem here
		//change anything you need to
		int max = 0;
		int maxIndex = 0;
		for (int i = 0; i < alpha.length; i++) {
			int count = 0;
			for (int j = 0; j < alpha[i].length(); j++) {
				if (alpha[i].charAt(j) == 'a' || alpha[i].charAt(j) == 'e' || alpha[i].charAt(j) == 'i' || alpha[i].charAt(j) == 'o' || alpha[i].charAt(j) == 'u') {
					count++;
				}
			}
			if (count > max) {
				max = count;
				maxIndex = i;
			}
		}
		return maxIndex;
	}
	
	public static void border(char[][] array) {
		//include the code to solve the respective problem here
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				if (i == 0 || i == array.length - 1 || j == 0 || j == array[0].length - 1) {
					array[i][j] = 'o';
				} else {
					array[i][j] = 'x';
				}
			}
		}

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}
}
