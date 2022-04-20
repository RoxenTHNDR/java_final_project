package src.chapter_assignments;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
import src.utilities.*;


public class Chapter5Challenge implements TaskHandler {
    @Override
    public void handleTask(Scanner in) {
        int choice = 0;
        while (true) {
            String menuTitle = "Chapter 5 Challenge Menu";
            String prompt = "Select an exercise";
            String[] menuOptions = {
                "Task 1", "Task 2", "Task 3", "Task 4", "Task 5"
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
                case 5:
                    exercise5(in);
                    break;
            }
            UIUtility.pressEnterToContinue(in);
        }
        System.out.println("\nExiting Chapter 5 Challenge Menu.");
    }

    public void exercise1(Scanner in) {
        UIUtility.showMenuTitle("Task 1");
        int[] list = {0, 1, 2, 3, 4};
        // Your code here

        // Ask for a number
        // Ask where it should go
        // Print the updated list

        int num1 = InputUtility.getInt("Give me a number", in);
        int num2 = InputUtility.getIntInRange("Where would you like it to go?", 0, list.length - 1, in);
        for(int i = list.length - 2; i >= num2; i--) {
            list[i + 1] = list[i];
        }
        list[num2] = num1;
        System.out.println(Arrays.toString(list));


        
    }

    public void exercise2(Scanner in) {
        UIUtility.showMenuTitle("Task 2");
        Integer[] list = {0, 1, 2, 3, 4};
        // Your code here
       
        // Ask what number should be deleted
        // Print the updated list

        int placement = InputUtility.getIntInRange("Which Placement would you like to delete" , 0 , list.length , in  );

        list[placement] = null;
        
        System.out.println(Arrays.toString(list));

    }

    public void exercise3(Scanner in) {
        UIUtility.showMenuTitle("Task 3");
        int[] list = {0, 1, 2, 3, 4};
        // Your code here

        // Ask for a number
        // Ask for another number
        // Swap them
        // Print the updated list


        int placement = InputUtility.getIntInRange("Which Placement would you like to swap?" , 0 , list.length , in  );
        int placement2 = InputUtility.getIntInRange("Which Placement would you like to swap it to?" , 0 , list.length , in  );

        int temp = list[placement];
        list[placement] = list[placement2];
        list[placement2] = temp;

        System.out.println(Arrays.toString(list));

        
    }

    public void exercise4(Scanner in) {
        UIUtility.showMenuTitle("Task 4");
        int[] list = {0, 1, 2, 3, 4};
        // Your code here

        // Print the updated list

        for (int i = 0; i < 1; i++){
            int j, first;
            first = list[0];
            for (j = 0; j < list.length - 1; j++){
                list[j] = list[j + 1];
            }
            list[j] = first;
        }
        
        System.out.println(Arrays.toString(list));


    }

    public void exercise5(Scanner in) {
        UIUtility.showMenuTitle("Task 5");
        Integer[] list = {0, 1, 2, 3, 4};
        // Your code here

        // Print the updated list

        Arrays.sort(list, Collections.reverseOrder());

        System.out.println(Arrays.toString(list));

    }
}