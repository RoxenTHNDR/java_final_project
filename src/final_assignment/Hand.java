package src.final_assignment;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import src.utilities.InputUtility;
import src.utilities.UIUtility;

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
        // View all the cards
        for(int i = 0; i < cardCount; i++ ){
            
            System.out.println("\n" + handCards[i].getCardName());
            
            System.out.println("Color: " + handCards[i].getCardColor());

            ManaCost cmc = handCards[i].getCMC();
            System.out.println(cmc.toString());
        }
    }

    public void editCard(Scanner in) {
        String[] menuOptions = new String[cardCount];
        for(int i = 0; i < cardCount; i++) {
            menuOptions[i] = handCards[i].getCardName();
        }
        int choice = UIUtility.showMenuOptions("Edit a Card", "Choose a Card", menuOptions, in);
        if(choice == 0) {
            return;
        } else if (choice == menuOptions.length + 1) {
            return;
        } 
        Card cardChosen = handCards[choice - 1];

        while(true) {
            String name = InputUtility.getString("What is the new name? (Press enter to keep " + cardChosen.getCardName() +")", in);
            try {
                if(name.equals("")) {
                    name = cardChosen.getCardName();
                }
                cardChosen.setCardName(name);
                break;
            } catch(IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        // Prompt user for Cards Color
        while (true) {
            String color = InputUtility.validateUserString(
                    "What is the color of the card? (Press enter to keep " + cardChosen.getCardColor() +")",
                    new String[] { "Red", "Black", "Blue", "White", "Green", "Colorless", "Multi"}, in);
            try {
                if (color.equalsIgnoreCase("")) {
                    return;
                }
                cardChosen.setCardColor(color);
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

                cardChosen.setCMC(cmc);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

        }

        

        // Check if the card is a land card
        if(cardChosen instanceof LandCard) {
        
            String landType = InputUtility.validateUserString("What type of Land is it?",
                        new String[] { "Basic", "Multi", "Other" }, in);

                while (true) {
                    try {
                        ((LandCard) cardChosen).setLandType(landType);
                        break;
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                }
        }

    }

    public void moveACard(Scanner in) {
        String[] menuOptions = new String[cardCount];
        for(int i = 0; i < cardCount; i++) {
            menuOptions[i] = handCards[i].getCardName();
        }
        int choice = UIUtility.showMenuOptions("Move a Card", "Choose a Card", menuOptions, in);
        if(choice == 0) {
            return;
        } else if (choice == menuOptions.length + 1) {
            return;
        } 
        Card card = handCards[choice - 1];
        int moveTo = InputUtility.getIntInRange("What spot would you like to move it to?", 1, cardCount, in);
        
        Card temp = handCards[moveTo - 1];
        handCards[moveTo - 1] = card;
        card = temp;

        System.out.println("\n Card has been moved");
    }

    public void sortColor() {
        // Make a copy of the array
        Card temp[] = new Card[cardCount];

        for(int i = 0; i < cardCount; i++){
            temp[i] = handCards[i];
        }
        // Sort Copy
        for (int a = 1; a < cardCount; a++){
            for (int b = cardCount - 1; b >= a; b--){
                if(temp[b - 1].compareTo(temp[b]) > 0){
                    Card holder = temp[b - 1];
                    temp[b - 1] = temp[b];                        temp[b] = holder; 
                } 
            }
        }

        // Print all values

        for(int i = 0; i < cardCount; i++ ){
            
            System.out.println("\n" + temp[i].getCardName());
            
            System.out.println("Color: " + temp[i].getCardColor());
            
            ManaCost cmc = temp[i].getCMC();
            System.out.println(cmc.toString());
        }

    }

    public void sortCMC(){
        // Make a copy of the array
        Card temp[] = new Card[cardCount];

        for(int i = 0; i < cardCount; i++){
            temp[i] = handCards[i];
        }
        // Sort Copy
        for (int a = 1; a < cardCount; a++){
            for (int b = cardCount - 1; b >= a; b--){
                if(temp[b - 1].getCMC().getTotalCost() > temp[b].getCMC().getTotalCost()){
                    Card holder = temp[b - 1];
                    temp[b - 1] = temp[b];
                    temp[b] = holder; 
                } 
            }
        }
        // Print all values

        for(int i = 0; i < cardCount; i++ ){
            
            System.out.println("\n" + temp[i].getCardName());
            
            System.out.println("Color: " + temp[i].getCardColor());
            
            ManaCost cmc = temp[i].getCMC();
            System.out.println(cmc.toString());
        }

    }

    public void viewColor(Scanner in){
        String color = InputUtility.validateUserString(
                        "What color would you like to see?",
                        new String[] { "Red", "Black", "Blue", "White", "Green", "Colorless", "Multi"}, in);
        
        for (int i = 0; i < cardCount; i++){
            if (handCards[i].getCardColor().equals(color)){
                
                System.out.println("\n" + handCards[i].getCardName());
            
                System.out.println("Color: " + handCards[i].getCardColor());

                ManaCost cmc = handCards[i].getCMC();
                System.out.println(cmc.toString());
            }
        }
    }

    


    public void shuffle(){
        //Make a copy of the array
        Card temp[] = new Card[cardCount];

        for(int i = 0; i < cardCount; i++){
            temp[i] = handCards[i];
        }
        //Make it a list
        List<Card> tempList = Arrays.asList(temp);

        //Shuffle
        Collections.shuffle(tempList);

        //Turn back into an array
        tempList.toArray(temp);

        //Print all values
        for(int i = 0; i < cardCount; i++ ){
            
            System.out.println("\n" + temp[i].getCardName());
            
            System.out.println("Color: " + temp[i].getCardColor());
            
            ManaCost cmc = temp[i].getCMC();
            System.out.println(cmc.toString());
        }
    }

    public void viewCard(Scanner in) {
        String[] menuOptions = new String[cardCount];
        for(int i = 0; i < cardCount; i++) {
            menuOptions[i] = handCards[i].getCardName();
        }
        int choice = UIUtility.showMenuOptions("View a Card", "Choose a Card", menuOptions, in);
        if(choice == 0) {
            return;
        } else if (choice == menuOptions.length + 1) {
            return;
        } 
        Card cardChosen = handCards[choice - 1];

        System.out.println("*******"); // Eye candy to break up all the text
        System.out.println(cardChosen.getCardName());
        System.out.println("\nColor:" + cardChosen.getCardColor() + "\n");
        System.out.println(cardChosen.getCMC());
        // If the chosen card is a land card print the land type
        if (cardChosen instanceof LandCard){
            LandCard chosenLand = (LandCard) cardChosen;
            System.out.println("\nLand Type:"+ chosenLand.getLandType());
        }
        System.out.println("*******"); // Eye candy to break up all the text
        
    }

    public void removeCards(Scanner in){
    
         // Create Cardlist Menu
        String[] menuOptions = new String[cardCount];
        for(int i = 0; i < cardCount; i++) {
            menuOptions[i] = handCards[i].getCardName();
        }
        int choice = UIUtility.showMenuOptions("Remove a Card", "Choose a Card", menuOptions, in);
        if(choice == 0) {
            return;
        } else if (choice == menuOptions.length + 1) {
            return;
        } 

        // Store Card for varification
        Card cardChoice = handCards[choice - 1];
        String choiceName = cardChoice.getCardName();

        // Remove card
        handCards[choice - 1] = null;
        cardCount--;

        // Move all valid values to the front
        for (int i = 0; i < handCards.length; i++){
            if(handCards[i] == null){
                for (int k = i + 1; k < handCards.length; k++){
                    handCards[k-1] = handCards[k];
                }
                handCards[handCards.length - 1] = null;
                break;
            }
        }

        System.out.println("\n" + choiceName + " has been removed from hand\n");

        



    }
}
