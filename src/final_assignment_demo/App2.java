package src.final_assignment_demo;

import java.util.Scanner;

import src.utilities.UIUtility;

public class App2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int choice = 0; 
        Library library = new Library();       
        while (true) {
            String menuTitle = "Main Menu";
            String prompt = "Choose an option";
            String[] menuOptions = {
                "Add a new book"
                , "View list of all books"
                // , "View books sorted by title"
                // , "View a single book"
                // , "Update a book"
                // , "Remove a book"
                // , "Move a book"
                // , "Swap two books"
            };
            choice = UIUtility.showMenuOptions(menuTitle, prompt, menuOptions, scanner);
            if (choice == 0)
                continue;
            if (choice == menuOptions.length + 1)
                break;
            switch (choice) {
                case 1:
                    library.add(scanner);
                    break;
                case 2:
                    library.viewAll();
                    break;
            }
            UIUtility.pressEnterToContinue(scanner);
        }
       System.out.println("\nProgram complete. Goodbye.\n");
       scanner.close();
    }   
}
