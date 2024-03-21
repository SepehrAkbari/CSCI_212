/*
 * Author @ Sepehr Akbari (Compiler)
 * March 29, 2024
 * Title: "Societal Classes: Min, Max, Mean"
 * Desc: 
    * Given 10 input integers (negative numbers allowed), 
    * output the minimum, maximum, and average of those 
    * integers. Use an array for the input.
        ** Use a single for loop and update variables minVal, maxVal, 
        * and sumVals on each iteration. (You could use three loops instead).
        ** Initialize variables minVal and maxVal each to the first integer, 
        * NOT to 0. 0 is wrong because integers could be negative. Then update 
        * those values if a smaller or larger integer is seen (respectively).
        ** Don't forget to use floating-point division, not integer division, 
        * when computing the average (use / 10.0, not / 10).  
 *
 * Points: [30 points]
*/

package MMM;
import java.util.Scanner;

public class MinMaxMean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int SIZE = 10;
        int[] arr = new int[SIZE];

        System.out.println("Enter 10 integers");
        
        boolean valid = false;
        while (!valid) {
            try {
                for (int i = 0; i < SIZE; i++) {
                    System.out.print("Enter integer " + (i + 1) + ": ");
                    arr[i] = sc.nextInt();
                }
                valid = true;
            } catch (Exception e) {
                System.out.println("Invalid input");
                sc.next();
            }
        }

        int minVal = arr[0];
        int maxVal = arr[0];
        int sumVals = arr[0];

        for (int i = 1; i < SIZE; i++) {
            if (arr[i] < minVal) {
                minVal = arr[i];
            }
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
            sumVals += arr[i];
        }

        System.out.print("\n");
        System.out.println("Minimum: " + minVal);
        System.out.println("Maximum: " + maxVal);
        System.out.println("Mean (Average): " + (sumVals / ((float)SIZE)));

        sc.close();
    }
}
