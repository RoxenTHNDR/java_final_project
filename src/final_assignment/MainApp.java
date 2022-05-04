package src.final_assignment;
import java.util.Scanner;

import javax.swing.text.View;

import src.utilities.UIUtility;

public class MainApp {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int choice = 0; 
        Hand hand = new Hand();       
        while (true) {
            String menuTitle = "Main Menu";
            String prompt = "Choose an option";
            String[] menuOptions = {
                "Add a new Card"
                , "Edit a Card"
                , "Move a Card"
                , "Remove a Card"
                , "View a specific Card"
                , "View Cards by CMC"
                , "View Cards by Color"
                , "View Cards of only one Color"
                , "View a shuffled card list"
                , "View all Cards"
            };
            choice = UIUtility.showMenuOptions(menuTitle, prompt, menuOptions, scanner);
            if (choice == 0)
                continue;
            if (choice == menuOptions.length + 1)
                break;
            switch (choice) {
                case 1:
                    hand.add(scanner);
                    break;
                case 2:
                    hand.editCard(scanner);
                    break;
                case 3:
                    hand.moveACard(scanner);
                    break;
                case 4:
                    hand.removeCards(scanner);
                    break;
                case 5:
                    hand.viewCard(scanner);
                    break;
                case 6:
                    hand.sortCMC();
                    break;
                case 7:
                    hand.sortColor();
                    break;
                case 8:
                    hand.viewColor(scanner);
                    break;
                case 9:
                    hand.shuffle();
                    break;
                case 10:
                    hand.viewAll();
                    break;

            }
            UIUtility.pressEnterToContinue(scanner);
        }
       System.out.println("\nProgram complete. Goodbye.\n");
       scanner.close();
    }   
}
