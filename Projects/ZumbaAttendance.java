/*
 * Author @ Sepehr Akbari (Compiler)
 * March 29, 2024
 * Title: "one, two, three, ZUMBA!"
 * Desc:
    * Sam tracks her monthly Zumba session attendance. 
    * She has a number for each month. Ask Sam to provide 
    * these values and save them into the array yearlyValues. 
    * Output all 12 elements, one quarter per line. If the 
    * elements are 11 23 24 5 9 16 10 18 19 10 12 10, the output is:
            11 23 24 5
            9 16 10 18 
            19 10 12 10
        * Think about the end-user experience and write the output as friendly as possible. 
        * Use arrays to solve this problem.
 *
 * Points: [20 points]
*/

package Zumba;
import java.util.Scanner;

public class ZumbaAttendance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int SIZE = 12;
        int[] yearlyValues = new int[SIZE];

        System.out.println("Enter 12 integers");

        boolean valid = false;
        while (!valid) {
            try {
                for (int i = 0; i < SIZE; i++) {
                    System.out.print("How many sessions did you attend in month " + (i + 1) + ": ");
                    yearlyValues[i] = sc.nextInt();
                }
                valid = true;
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter an integer.");
                sc.next();
            }
        }

        System.out.println("\nZumba attendance for each quarter:");
        for (int i = 0; i < SIZE; i++) {
            System.out.print(yearlyValues[i] + " ");
            if ((i + 1) % 3 == 0) {
                System.out.println();
            }
        }
    }
}
