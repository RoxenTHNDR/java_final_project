import java.util.Scanner;
public class UIUtility {
    /**
     * Displays a menu and the prompt, returning the String entered by the user.
     *
     * @param menuTitle the title of the menu
     * @param prompt the prompt for input
     * @param menuOptions the list of menu options to display
     * @param in a Scanner object
     * @return the user's response
     */
    public static int showMenuOptions(String menuTitle, String prompt, String[] menuOptions, Scanner in) {
        showMenuTitle(menuTitle);
        int count = 1;
        for (String menuOption : menuOptions) {
            System.out.println(count++ + ": " + menuOption);
        }
        System.out.println(count + ": Exit");
        System.out.print("\n" + prompt + ": ");
        String input = in.nextLine().trim();
        int result = validateIntInput(input, menuOptions.length + 1, in);
        return result;
    }

    /**
     * Displays a series of x's.
     *
     * @param count the number of x's to display
     */
    public static void printXs(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print("x");
        }
        System.out.println();
    }

    /**
     * Displays a properly formatted menu title.
     *
     * @param menuTitle the text of the title
     */
    public static void showMenuTitle(String menuTitle) {
        System.out.println("\n" + "xxx " + menuTitle + " xxx\n");
    }

    /**
     * A string is converted to an integer. If invalid, a message will display.
     *
     * @param input The string representing an integer
     * @param in a Scanner object
     * @return The string converted to an integer, or 0 if invalid
     */

    public static int validateIntInput(String input, int highBound, Scanner in) {
        int intInput = 0;
        try {
            intInput = Integer.parseInt(input);
            if (intInput < 1 || intInput > highBound) {
                intInput = 0;
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            showErrorMessage("Invalid input", in);
        }
        return intInput;
    }

    /**
     * Displays the supplied message.  If waitForAcknowledement is true, will
     * also call pressEnterToContinue().
     *
     * @param message The error message
     * @param in a Scanner object
     */

    public static void showErrorMessage(String message, Scanner in) {
        System.out.println("ERROR: " + message);
        pressEnterToContinue(in);
    }

    /**
     * Displays a wait prompt and waits for the user to hit the enter key.
     * 
     * @param in a Scanner object
     */

    public static void pressEnterToContinue(Scanner in) {
        System.out.print("\nPress Enter to continue... ");
        in.nextLine();
    }
}