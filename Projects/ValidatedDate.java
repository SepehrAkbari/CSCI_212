/*
 * Author @ Sepehr Akbari (Compiler)
 * Feb 28, 2024
 * Title: "Let's go on a - Validated - Date!"
 * Desc: 
    * Write a program called ValidatedDate that asks the user 
    * to input a month (number), a date and a year. The month should 
    * be in the range 1-12, the date should be a valid date for the month 
    * and the year. The year should be between 1900 and 2023. The program 
    * should not accept any invalid date. Finally, print the date entered. 
    * (Notes: Remember that September, April, June and November have 30 days 
    * each, and the rest (other than February) have 31. February has 28 days 
    * in non-leap years and 29 days in leap years. 
 * 
 * Points: [30 points]
*/

package ValidatedDate;
import java.util.*;

public class ValidatedDate {
   static Scanner sc = new Scanner(System.in);
   
    public static void main(String[] args){
        int monthIn, dateIn, yearIn;
        int response;

        yearIn = GetYear();
        monthIn = GetMonth();
        dateIn = GetDate(yearIn, monthIn);

        boolean ZeroOrOne = false;
        while (!ZeroOrOne){
            try {
                System.out.print("Please enter 0 to display the date in the format MM/DD/YYYY or 1 to display the date in the format DD/MM/YYYY: ");
                response = sc.nextInt();

                if (response == 0) {
                    System.out.println("The date entered is: " + monthIn + "/" + dateIn + "/" + yearIn);
                    ZeroOrOne = true;
                } else if (response == 1) {
                    System.out.println("The date entered is: " + dateIn + "/" + monthIn + "/" + yearIn);
                    ZeroOrOne = true;
                } else {
                    System.out.println("Invalid input. Please only enter 0 or 1.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                sc.next();
            }
        }
    }

    public static int GetYear() {
        int year = 0;

        boolean valid = false;
        while (!valid) {
            try {
                System.out.print("Enter the year (1900-2023): ");
                year = sc.nextInt();

                if (year >= 1900 && year <= 2023) {
                    valid = true;
                } else {
                    System.out.println("Invalid input. Year must be between 1900 and 2023.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                sc.next();
            }
        }
        return year;
    }

    public static int GetMonth() {
        int month = 0;

        boolean valid = false;
        while (!valid) {
            try {
                System.out.print("Enter a month (1-12): ");
                month = sc.nextInt();

                if (month >= 1 && month <= 12) {
                    valid = true;
                } else {
                    System.out.println("Invalid input. Month must be between 1 and 12.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                sc.next();
            }
        }
        return month;
    }

    public static int GetDate(int year, int month) {
        int date = 0;

        boolean valid = false;
        if ((month == 2) && IsLeapYear(year)) {
            while (!valid) {
                try {
                    System.out.print("Enter a date (1-29): ");
                    date = sc.nextInt();
    
                    if (date >= 1 && date <= 29) {
                        valid = true;
                    } else {
                        System.out.println("Invalid input. Date must be between 1 and 29.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a valid integer.");
                    sc.next();
                }
            }
        }else if ((month == 2) && !(IsLeapYear(year))) {
            while (!valid) {
                try {
                    System.out.print("Enter a date (1-28): ");
                    date = sc.nextInt();
    
                    if (date >= 1 && date <= 28) {
                        valid = true;
                    } else {
                        System.out.println("Invalid input. Date must be between 1 and 28.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a valid integer.");
                    sc.next();
                }
            }
        }else if (month == 4 || month == 6 || month == 9 || month == 11) {
            while (!valid) {
                try {
                    System.out.print("Enter a date (1-30): ");
                    date = sc.nextInt();
    
                    if (date >= 1 && date <= 30) {
                        valid = true;
                    } else {
                        System.out.println("Invalid input. Date must be between 1 and 30.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a valid integer.");
                    sc.next();
                }
            }
        }else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            while (!valid) {
                try {
                    System.out.print("Enter a date (1-31): ");
                    date = sc.nextInt();
    
                    if (date >= 1 && date <= 31) {
                        valid = true;
                    } else {
                        System.out.println("Invalid input. Date must be between 1 and 31.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a valid integer.");
                    sc.next();
                }
            }
        }else{
            System.out.println("Something went wrong.");
            return 0;
        }
        return date;
    }

    public static boolean IsLeapYear(int year) {
        return ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0)));
    }
}

