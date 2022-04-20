package src.chapter_assignments;
import java.util.Scanner;

import src.utilities.*;

public class Chapter1 implements TaskHandler {
    @Override
    public void handleTask(Scanner in) {
        int choice = 0;
        while (true) {
            String menuTitle = "Chapter 1 Menu";
            String prompt = "Select an exercise";
            String[] menuOptions = {
                    "Exercise 1", "Exercise 2", "Exercise 3", "Sample Exercise"
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
                    sampleExercise(in);
                    break;
            }
            UIUtility.pressEnterToContinue(in);
        }
        System.out.println("\nExiting Chapter 1 Menu.");
    }

    public void exercise1(Scanner in) {
        UIUtility.showMenuTitle("Exercise 1");
        // Your code here
        double number1 = InputUtility.getDouble("Enter a number", in);
        double number2 = InputUtility.getDouble("Enter another number", in);

        if (number1 > number2) {
            System.out.println("Largest is:" + number1);
        }
        if (number2 > number1) {
            System.out.println("Largest is:" + number2);
        }
        else {
            System.out.println("Largest is:" + number1);
        }

    }

    public void exercise2(Scanner in) {
        UIUtility.showMenuTitle("Exercise 2");
        // Your code here
        double number1 = InputUtility.getDouble("Enter a number", in);
        double number2 = InputUtility.getDouble("Enter another number", in);

        double average = (number1 + number2) / 2;

        System.out.printf("The average is: %.1f" , average);
    }

    public void exercise3(Scanner in) {
        UIUtility.showMenuTitle("Exercise 3");
        // Your code here
        double radius = InputUtility.getDouble("Enter a Radius", in);
        double circ = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;
        System.out.printf("Circumference: %.2f\n", circ);
        System.out.printf("Area: %.2f", area);
    }

    public void sampleExercise(Scanner in) {
        UIUtility.showMenuTitle("Sample Exercise");
        // Sample code here
        String name = InputUtility.getString("What is your name?", in);
        int age = InputUtility.getIntInRange("What is your age?", 0, 200, in);
        String favFood = InputUtility.validateUserString("What is your favorite food?",
                new String[] { "Ice Cream", "Pizza", "Sushi", "Burger" }, in);
        int favNum = InputUtility.getInt("What is your favorite number?", in);
        double temperature = InputUtility.getDouble("What is your body temperature in Fahrenheit?", in);
        System.out.printf(
                "Hello %s! You are %d years old. like to eat %s, %n your favorite number is %d, and your body temp is %.1f degrees fahrenheit.",
                name, age, favFood, favNum, temperature);
    }
}