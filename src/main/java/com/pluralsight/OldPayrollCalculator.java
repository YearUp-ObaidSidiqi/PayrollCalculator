package com.pluralsight;
import java.util.Scanner;

public class OldPayrollCalculator {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String fullName = promptForName("What is your name?: ");
        double hoursWorked = promptForNumbers("How many hours did you work?: ");
        double payRate = promptForNumbers("What is your pay rate?: ");
        double totalGrossPay = grossPay(hoursWorked, payRate);
        System.out.println(fullName + ", " + "Your gross pay is " + totalGrossPay);
    }

    public static String promptForName(String prompt) {
        System.out.print(prompt);
        String name = sc.nextLine();
        return name;
    }

    public static double promptForNumbers(String prompt) {
        System.out.print(prompt);
        double hours = sc.nextDouble();
        return hours;
    }

    public static double grossPay(double hours, double rate) {
        double grosspay = 0;
        if (hours <= 40) {
            grosspay = hours * rate;
        } else if (hours > 40) {
            grosspay = (rate * 1.5) * (hours - 40) + 40 * rate;
        }
        return grosspay;
    }
}