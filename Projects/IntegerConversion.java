/*
 * Author @ Sepehr Akbari (Compiler)
 * March 29, 2024
 * Title: "You talk; I complile!"
 * Desc:
    * Write a program called IntegerConversion that performs binary to 
    * decimal conversion. The user is asked to provide  8-bit binary number 
    * (1's and 0's; leading 0 is allowed) and compute and output the decimal equivalent.  
    * A binary number's digits are only 0's and 1's, with each digit's weight being 
    * an increasing power of 2 
    * (binary110 is 1*2^2 + 1*2^1 + 0*2^0 = 1*4 + 1*2 + 0*1 = 4 + 2 + 0 = 6 in decimal) 
        * Ex: For input 00000110, the output is: 6.
        * Use arrays to solve this problem.
 *
 * Points: [20 points]
*/

package IntegerConversion;
import java.util.Scanner;

public class IntegerConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int SIZE = 8;
        int[] binary = new int[SIZE];

        boolean valid = false;
        while (!valid) {
            try {
                System.out.print("Enter an 8-bit binary number: ");
                String binaryInput = sc.nextLine();
                if (isBinary(binaryInput, SIZE)) {
                    for (int i = 0; i < SIZE; i++) {
                        binary[i] = Character.getNumericValue(binaryInput.charAt(i));
                    }
                    valid = true;
                }else{
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid 8-bit binary number.");
            }
        }

        int decimal = 0;
        for (int i = 0; i < SIZE; i++) {
            decimal += binary[i] * Math.pow(2, SIZE - i - 1);
        }

        System.out.println("Decimal equivalent: " + decimal);
        
        sc.close();
    }

    public static boolean isBinary(String binaryInput, int SIZE) {
        for (int i = 0; i < binaryInput.length(); i++) {
            if (binaryInput.charAt(i) != '0' && binaryInput.charAt(i) != '1') {
                return false;
            }
        }
        if ((binaryInput.length() != SIZE)) {
          return false;       
        }
        return true;
    }
}
