package src.final_assignment;

import java.util.Scanner;

import src.utilities.InputUtility;

public class Hand {

    private Card[] handCards;
    private int cardCount = 0;

    public Hand() {
        handCards = new Card[7];

        handCards[0] = new Card("Wasitora, Nekoru Queen", "Multi", new ManaCost(1,1,0,0,1,2));
        cardCount++;

        handCards[1] = new Card("Tyrant's Familiar", "Red", new ManaCost(2,0,0,0,0,5));
        cardCount++;
        
        handCards[2] = new Card("Dragonlord's Servant", "Red", new ManaCost(1,0,0,0,0,1));
        cardCount++;

        handCards[3] = new Card("Utvara Hellkite", "Red", new ManaCost(2,0,0,0,0,6));
        cardCount++;

        handCards[4] = new LandCard("Island", "Colorless", new ManaCost(0,0,0,0,0,0), "Basic");
        cardCount++;

        handCards[5] = new LandCard("Opulent Palace", "Colorless", new ManaCost(0,0,0,0,0,0), "Multi");
        cardCount++;

        
    }

    public boolean isFull() {
        // Write your own code here
        return true;
    }

    public void add(Scanner in) {

        // write an if statement checking if the array is not full
        if (cardCount < handCards.length) {
            String type = InputUtility.validateUserString("What type of card would you like to add?",new String[] { "Regular", "Land" }, in);
            Card card = new Card();

            // prompt user for Card Name
            while (true) {
                String name = InputUtility.getString("What is the name of the card? (Press q to quit)", in);
                try {
                    if (name.equalsIgnoreCase("q")) {
                        return;
                    }
                    card.setCardName(name);
                    break;
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }

            // Prompt user for Cards Color
            while (true) {
                String color = InputUtility.validateUserString(
                        "What is the color of the card? (Press q to quit)",
                        new String[] { "Red", "Black", "Blue", "White", "Green", "Colorless", "Multi", "q", "Q" }, in);
                try {
                    if (color.equalsIgnoreCase("q")) {
                        return;
                    }
                    card.setCardColor(color);
                    break;
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }

            // Prompt user through each color for CMC
            while (true) {
                int red = InputUtility.getInt("How much red mana to cast?", in);
                int black = InputUtility.getInt("How much black mana to cast?", in);
                int blue = InputUtility.getInt("How much blue mana to cast?", in);
                int white = InputUtility.getInt("How much white mana to cast?", in);
                int green = InputUtility.getInt("How much green mana to cast?", in);
                int colorless = InputUtility.getInt("How much fill mana to cast?", in);
                try {
                    ManaCost cmc = new ManaCost();
                    cmc.setRed(red);
                    cmc.setBlack(black);
                    cmc.setBlue(blue);
                    cmc.setWhite(white);
                    cmc.setGreen(green);
                    cmc.setColorless(colorless);

                    card.setCMC(cmc);
                    break;
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }

            }

            // If card is a land card prompt for what kind of land it is
            if (type.equalsIgnoreCase("Land")) {
                String landType = InputUtility.validateUserString("What type of Land is it?",
                        new String[] { "Basic", "Multi", "Other" }, in);

                while (true) {
                    try {
                        ((LandCard) card).setLandType(landType);
                        break;
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                }

            }

            handCards[cardCount] = card;
            cardCount++;

        }
        // if the array is full, tell the user you can't add any more
        else{
            System.out.println("Your hand is Full");
        }
    }

    public void viewAll() {
        
        for(int i = 0; i < handCards.length && handCards[i]!= null; i++ ){
            
            System.out.println("\n" + handCards[i].getCardName());
            ManaCost cmc = handCards[i].getCMC();

            System.out.println(cmc.toString());
        }
    }
}
