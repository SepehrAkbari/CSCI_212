/*
 * Author @ Sepehr Akbari (Compiler)
 * Feb 28, 2024
 * Title: "Wallet Damage - Calculator"
 * Desc:  
    * Write a program called TicketPriceCalculator. The input 
    * from the end user consists of the following: day of show 
    * (weekday/weekend), time of show (2 PM or 7 PM), customer's 
    * age, and number of tickets to be purchased together; it 
    * prints the individual ticket price for a Broadway show. 
    * The output should clearly indicate the price, along with all 
    * the show details provided as input (day, time, group size, age) 
    * in a user-friendly way. 
    *
    *    The price is determined  based on the following criteria: 
    *       - the full price for weekday shows is  $80; on weekends is $100;
    *       - the matinee (2 PM show) has a 10% discount;
    *       - groups of 8 people or more have an additional 15% discount;
    *       - seniors (65 and over) have a 20% discount;
    *       - kids under 5 are free;
    *       - multiple discounts can be applied. 
    *   
    * Points: [20 points]
*/

package TicketPriceCalculator;
import java.util.*;

public class TicketPriceCalculator {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        String DayIn, TimeIn;
        int GroupSizeIn, AgeIn;

        DayIn = GetDay();
        TimeIn = GetTime();
        GroupSizeIn = GetGroupSize();
        AgeIn = GetAge();

        GetPrice(DayIn, TimeIn, GroupSizeIn, AgeIn);
    }

    public static String GetDay() {
        String day = "";

        boolean valid = false;
        while (!valid) {
            try {
                System.out.print("Enter the day of the show (weekday/weekend): ");
                day = sc.nextLine();
                if (day.equalsIgnoreCase("weekday") || day.equalsIgnoreCase("weekend")) {
                    valid = true;
                } else {
                    System.out.println("Invalid input. Please only enter 'weekday' or 'weekend'.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid string.");
                sc.next();
            }
        }
        return day;
    }

    public static String GetTime() {
        String time = "";

        boolean valid = false;
        while (!valid) {
            try {
                System.out.print("Enter the time of the show (2 PM or 7 PM): ");
                time = sc.nextLine();
                if (time.equalsIgnoreCase("2 PM") || time.equalsIgnoreCase("7 PM")) {
                    valid = true;
                } else {
                    System.out.println("Invalid input. Please only enter '2 PM' or '7 PM'.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid string.");
                sc.next();
            }
        }
        return time;
    }

    public static int GetGroupSize() {
        int groupSize = 0;

        boolean valid = false;
        while (!valid) {
            try {
                System.out.print("Enter the number of tickets you would like to purchase: ");
                groupSize = sc.nextInt();
                if (groupSize > 0) {
                    valid = true;
                } else {
                    System.out.println("Invalid input. Please enter a positive integer.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                sc.next();
            }
        }
        return groupSize;
    }

    public static int GetAge() {
        int age = 0;
        boolean valid = false;
        while (!valid) {
            try {
                System.out.print("Enter your age: ");
                age = sc.nextInt();
                if (age > 0) {
                    valid = true;
                } else {
                    System.out.println("Invalid input. Please enter a positive integer.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                sc.next();
            }
        }
        return age;
    }

    public static void GetPrice(String day, String time, int groupSize, int age) {
        double price = 0;

        if (day.equalsIgnoreCase("weekday")) {
            price = 80;
        } else {
            price = 100;
        }

        if (time.equalsIgnoreCase("2 PM")) {
            price *= 0.9;
        }

        if (groupSize >= 8) {
            price *= 0.85;
        }

        if (age >= 65) {
            price *= 0.8;
        }

        if (age < 5) {
            price = 0;
        }

        System.out.println("The individual ticket price for the show is: $" + price);
    }
}
