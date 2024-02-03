/*
 * @Author: Sepehr Akbari
 * 02.02.2024
 * calculates the area of circle
 */
package circle;
import java.util.*;

public class circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        scanner.close();

        double area = Math.PI * Math.pow(radius, 2);

        System.out.println("The area of the circle with radius " + radius + " is: " + area);
    }
}
