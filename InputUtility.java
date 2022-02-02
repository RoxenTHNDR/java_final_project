import java.util.Arrays;
import java.util.Scanner;
public class InputUtility {
    /**
     * Prompts the user for a String and returns whatever was entered.
     *
     * @param prompt the prompt text for the user
     * @return the String entered by the user
     */
    public static String getString(String prompt, Scanner in) {
        System.out.print(prompt + ": ");
        return in.nextLine().trim();
    }

    /**
     * Validates that the user's input is included in a list of possible values
     * @param prompt - the prompt text for the user
     * @param possibleValues - a list of strings
     * @param in - a Scanner object
     * @return - the user's input if it was valid
     */
    public static String validateUserString(String prompt, String[] possibleValues, Scanner in) {
        int attempts = 0;
        String possibleValuesString = Arrays.toString(possibleValues);
        String possibleValuesLowercase = possibleValuesString.toLowerCase();
        while (true){
            String newPrompt;
            String invalidInputMsg = "";
            if(attempts > 0) {
                invalidInputMsg = "\nInvalid input. Please try again.\n";
            }
            newPrompt = invalidInputMsg + prompt + possibleValuesString;
            String userInput = getString(newPrompt, in);
            String inputLowercase = userInput.toLowerCase();
            if(possibleValuesLowercase.contains(inputLowercase)){
                return userInput;
            }
            attempts += 1;
        }
    }

    /**
     * Prompts the user for a whole number between the low bound (inclusive) and
     * the high bound (inclusive).
     *
     * @param prompt the text of the user prompt
     * @param lowBound the lower boundary of the range, inclusive
     * @param highBound the upper boundary of the range, inclusive
     * @param in a Scanner object
     * @return the entered whole number
     */
    public static int getIntInRange(String prompt, int lowBound, int highBound, Scanner in) {
        int value = -1;
        boolean needed = true;
        while (needed) {
            value = getInt(prompt, in);
            if (value < lowBound || value > highBound) {
                UIUtility.showErrorMessage("Input not in range " + lowBound + " to " + highBound + ".", in);
            } else {
                needed = false;
            }
        }
        return value;
    }

    /**
     * Prompts the user to enter a whole number. If the value is not a whole
     * number, prints the notIntMessage and tries again. Otherwise, returns the
     * int that was entered.
     *
     * @param prompt the prompt text for the user
     * @param in a Scanner object
     * @return the int entered
     */
    public static int getInt(String prompt, Scanner in) {
        int value = 0;
        String input;
        boolean needed = true;
        while (needed) {
            System.out.print(prompt + ": ");
            input = in.nextLine().trim();
            try {
                value = Integer.parseInt(input);
                needed = false;
            } catch (NumberFormatException nfe) {
                UIUtility.showErrorMessage("Invalid integer", in);
            }
        }
        return value;
    }

    /**
     * Prompts the user to enter a number. If the value is not a number, it prints an invalid input message and tries again.  Otherwise, it returns the value that was entered.
     * @param prompt - the prompt text for the user
     * @param convertToInt - a boolean value. If true the function will convert a whole number (example: 10.0) to its integer representation (example: 10)
     * @return the number entered
    */
    public static double getDouble(String prompt, Scanner in){
        String input;
        while(true){
            try {
                input = getString(prompt, in);
                return Double.parseDouble(input);
            } catch (NumberFormatException nfe) {
                UIUtility.showErrorMessage("Invalid decimal value", in);
            }
        }
    }
}