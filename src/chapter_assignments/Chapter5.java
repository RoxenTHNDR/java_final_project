package src.chapter_assignments;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
import src.utilities.*;
import java.util.ArrayList;
import java.util.List;


public class Chapter5 implements TaskHandler {
    @Override
    public void handleTask(Scanner in) {
        int choice = 0;
        while (true) {
            String menuTitle = "Chapter 5 Challenge Menu";
            String prompt = "Select an exercise";
            String[] menuOptions = {
                "Exercise 1", "Exercise 2"
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
            }
            UIUtility.pressEnterToContinue(in);
        }
        System.out.println("\nExiting Chapter 5 Challenge Menu.");
    }

    public void exercise1(Scanner in) {
        UIUtility.showMenuTitle("Task 1");
        // Your code here

        // Ask the user to enter some numbers. Assign even numbers to one array and odd numbers to another array. 
        // Display the values in ascending order.

        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        boolean needNumbers = true;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter some numbers, type S to stop:");
        while(needNumbers){
            var input = sc.nextLine();
            if(input.equals("S") || input.equals("s")){
                needNumbers = false;
            }
            else if (Integer.parseInt(input) % 2 == 0){
                even.add(Integer.parseInt(input));
            }
            else if (Integer.parseInt(input) % 2 != 0){
                odd.add(Integer.parseInt(input));
            }
            else{
                System.out.println("Incorrect Input");
            }
        }
        
        if(even.size() == 0){
            System.out.println("Even Numbers: None");
        }
        else{
            Collections.sort(even);
            System.out.println("Even Numbers: " + even);
        }

        if (odd.size() == 0){
            System.out.println("Odd Numbers: None");
        }
        else{
            Collections.sort(odd);
            System.out.println("Odd Numbers: " + odd);
        }
        

        
    }

    public void exercise2(Scanner in) {
        UIUtility.showMenuTitle("Task 2");
        // Your code here

        // Ask the user to enter two strings. Create a helper method called stringReverse that takes in a single String as 
        // input and returns the same string written backwards, 
        // removing any spaces. Create a helper method called isPalindrome that takes a 
        // single String as input and returns true or false if the word is spelled the same both forwards and backwards. 
        // Print the following results.

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        
        String input1 = sc.nextLine();
        helper(input1);

        System.out.println("\n\nEnter another string: ");

        String input2 = sc.nextLine();
        helper(input2);

        int comparer = input1.compareTo(input2);

        if (comparer < 0){
            System.out.println("\n\n"+ input2 + " comes alphabetically before " + input1);
        }
        else if (comparer > 0){
            System.out.println("\n\n"+ input1 + " comes alphabetically before " + input2);
        }
        else{
            System.out.println("These strings are the same");
        }
    }

    private void helper(String input){
        System.out.println("**Statistics**");
        System.out.println("Length: " + input.length());

        if(input.length() <= 3){
            System.out.println("First 3 Characters: " + input);
        }
        else{
            System.out.println("First 3 Characters: " + input.substring(0,3));
        }
        System.out.println("Last character: " + input.substring(input.length() - 1));
        System.out.println("Contains the letter i: " + input.contains("i"));
        System.out.println("Lowercase: " + input.toLowerCase());
        System.out.println("Is a palindrom: " + isPalindrome(input));

    }

    private boolean isPalindrome(String input){
        String test = input.replace(" ", "").toLowerCase();
        int i = 0;
        int j = test.length() - 1;

        while (i < j) {
            
            if (test.charAt(i) != test.charAt(j)){
                return false;
            }

            i++;
            j--;
        }
        return true;

    }
   
}