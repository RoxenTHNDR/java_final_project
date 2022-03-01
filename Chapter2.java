import java.util.Scanner;

import org.w3c.dom.css.Counter;

public class Chapter2 implements TaskHandler {
    @Override
    public void handleTask(Scanner in) {
        int choice = 0;
        while (true) {
            String menuTitle = "Chapter 2 Menu";
            String prompt = "Select an exercise";
            String[] menuOptions = {
                    "Exercise 1", "Exercise 2", "Exercise 3", "Exercise 4"
            };
            choice = UIUtility.showMenuOptions(menuTitle, prompt, menuOptions, in);
            if (choice == 0)
                continue;
            if (choice == menuOptions.length + 1)
                break;
            switch (choice) {
                case 1:
                    exercise1(in);
                    break;
                case 2:
                    exercise2(in);
                    break;
                case 3:
                    exercise3(in);
                    break;
                case 4:
                    exercise4(in);
                    break;
            }
            UIUtility.pressEnterToContinue(in);
        }
        System.out.println("\nExiting Chapter 1 Menu.");
    }

    public void exercise1(Scanner in) {
        UIUtility.showMenuTitle("Exercise 1");
        // Your code here

        // Exercise 1: Test if an integer input from the keyboard is odd or even. You
        // must use the % operator to get credit.

        int number = InputUtility.getInt("Enter a number", in);
        if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

    }

    public void exercise2(Scanner in) {
        UIUtility.showMenuTitle("Exercise 2");
        // Your code here

        // Exercise 2: Input a double value and print the integer part on one line and
        // the first two digits after the decimal point on another line. You must use
        // numeric casting to get credit.

        double number = InputUtility.getDouble("Please input a decimal number", in);

        int numint = (int) number;

        double temp = (number - numint) * 100;

        int decimalint = (int) temp;

        System.out.println(numint);
        System.out.println(decimalint);

    }

    public void exercise3(Scanner in) {
        UIUtility.showMenuTitle("Exercise 3");
        // Your code here

        // Exercise 3: Write a program that finds all of the prime numbers between 2 and
        // 100. You must use a nested for loop and the % operator to get credit.

        int beginingNum = 2;
        int endingNum = 100;

        int num = 0;
        String isPrime = "";

        for (int i = beginingNum; i <= endingNum; i++) {

            int count = 0;
            for (num = i; num >= 1; num--) {

                if (i % num == 0) {
                    count += 1;
                }
            }

            if (count == 2) {
                isPrime = isPrime + i + " ";
            }
        }
        System.out.println(isPrime);

    }

    public void exercise4(Scanner in) {
        UIUtility.showMenuTitle("Exercise 4");
        // Your code here

        // Exercise 4: Write a program that accepts an integer number of seconds and
        // coverts it into days,
        // hours, minutes, and seconds.

        int secondsInDay = 86400;
        int secondsInHour = 3600;
        int secondsInMinute = 60;

        int remainingSec = 0;

        int totalSec = InputUtility.getInt("Enter a number for seconds", in);

        // Get number of days
        int numOfDays = totalSec / secondsInDay;

        // Get remaining seconds
        int daySeconds = numOfDays * secondsInDay;
        remainingSec = totalSec - daySeconds;

        // Get number of hours
        int numOfHours = remainingSec / secondsInHour;

        // Get remaining seconds
        int hourSeconds = numOfHours * secondsInHour;
        remainingSec = remainingSec - hourSeconds;

        // Get number of Minutes
        int numOfMinutes = remainingSec / secondsInMinute;

        // Get remaining seconds
        int minuteSeconds = numOfMinutes * secondsInMinute;
        remainingSec = remainingSec - minuteSeconds;

        // Get Number of Seconds
        int numOfSeconds = remainingSec;

        // Display times
        System.out.println("Days: " + numOfDays);
        System.out.println("Hours: " + numOfHours);
        System.out.println("Minutes: " + numOfMinutes);
        System.out.println("Seconds: " + numOfSeconds);

    }
}