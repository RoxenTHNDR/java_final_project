package src.chapter_assignments;
import java.util.Scanner;
import java.util.Random;

import src.utilities.*;

public class Chapter3 {
    public void handleTask(Scanner in) {
        int choice = 0;
        while (true) {
            String menuTitle = "Chapter 2 Menu";
            String prompt = "Select an exercise";
            String[] menuOptions = {
                    "Exercise 1", "Exercise 2", "Exercise 3"
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
            }
            UIUtility.pressEnterToContinue(in);
        }
        System.out.println("\nExiting Chapter 3 Menu.");
    }

    public void exercise1(Scanner in) {
        UIUtility.showMenuTitle("Exercise 1");
        // Your code here
        // Ask the user for two numbers. Print only the even numbers between them. Break
        // the loop if the last number printed is divisible by the smaller number
        // entered.

        int input1 = InputUtility.getInt("Please input the first number", in);
        int input2 = InputUtility.getInt("Please input the second number", in);
        int num1;
        int num2;

        String evenNumString = "";

        if (input1 <= input2) {
            num1 = input1;
            num2 = input2;
        } else {
            num1 = input2;
            num2 = input1;
        }

        for (int i = num1 + 1; i < num2; i++) {
            if (i % 2 == 0) {
                evenNumString = evenNumString + i + " ";
                int numberPrinted = i;
                if (numberPrinted % num1 == 0) {
                    break;
                }
            }
        }

        System.out.println(evenNumString);

    }

    public void exercise2(Scanner in) {
        UIUtility.showMenuTitle("Exercise 2");
        // Your code here
        // Write a program that will input a list of integers in from the keyboard. When
        // the user enters "STOP", print the sum, count, average (rounded to 2 decimal
        // places), highest, and lowest values.
        Scanner scanner = new Scanner(System.in);
        boolean enterNumbers= true;

        int sum = 0;
        int count = 0;
        int highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;

        System.out.println("Enter Some Numbers (Enter \"S\" or \"Stop\" to stop):");

        while(enterNumbers){
            String input = scanner.nextLine();
            if (input.equals("S")  || input.equals("Stop")){
                break;
            }
            else{
                int number = Integer.parseInt(input);
                count += 1;
                sum += number;

                if (number > highest){
                    highest = number;
                }
                if (number < lowest){
                    lowest = number;
                }

            }
        }
        double average = (double) Math.round((sum / count)*100)/100;

        System.out.println("The sum is: " + sum);
        System.out.println("The count is: " + count);
        System.out.println("The average is: " + average);
        System.out.println("The highest is: " + highest);
        System.out.println("The lowest is: " + lowest);
        
    }

    public void exercise3(Scanner in) {
        UIUtility.showMenuTitle("Exercise 3");
        // Your code here
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int tries = 3;
        
        int num1 = random.nextInt(12 - 1 + 1) + 1;
        int num2 = random.nextInt(12 - 1 + 1) + 1;

        int answer = num1 * num2;

        System.out.println("What is " + num1 + " x " + num2);
        

        while (tries > 0){
            int guess = scanner.nextInt();
            if (guess == answer){
                System.out.println("Correct!");
                break;
            }
            else if (guess != answer && tries == 1){
                System.out.println("Incorrect. The answer was " + answer);
                tries -= 1;
                break;
            }

            else if (guess != answer){
                tries -= 1;
                if (tries == 1){
                    System.out.println("Incorrect. You have " + tries + " attempt remaining");
                }
                else{
                    System.out.println("Incorrect. You have " + tries + " attempts remaining");
                }
                
            }

        }
    }

}
