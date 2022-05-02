package src.final_assignment;
import java.util.Scanner;
import src.final_assignment_demo.Library;
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
                "Add a new card"
                , "View All Cards"
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
                    hand.viewAll();
                    break;
            }
            UIUtility.pressEnterToContinue(scanner);
        }
       System.out.println("\nProgram complete. Goodbye.\n");
       scanner.close();
    }   
}
