package src.final_assignment_demo;

import java.util.Scanner;

import src.utilities.InputUtility;

public class Library {
    
    private Book[] books;
    private int bookCount = 0;

    public Library() {
        books = new Book[5];
        books[0] = new Book("Java: A Beginner's Guide", new Person("Herbert", "Schildt"), 684);
        bookCount++;
        books[1] = new Book("UML: A Beginner's Guide", new Person("Jason", "Roff"), 314);
        bookCount++;
        books[2] = new IllustratedBook("Spiderman", new Person("Stan", "Lee"), 1152, new Person("Stan", "Lee"));
        bookCount++;
        books[3] = new IllustratedBook("Goodnight Moon", new Person("Margaret", "Wise Brown"), 15, new Person("Clemenet", "Hurd"));
        bookCount++;
    }

    public boolean isFull() {
        // Write your own code here
        return true;
    }

    public void add(Scanner in) {
        // write an if statement checking if the array is not full
        String type = InputUtility.validateUserString("What type of book would you like to add?", new String[]{"Regular", "Illustrated"}, in);
        Book book = new Book();
        if(type.equalsIgnoreCase("Illustrated")) {
            book = new IllustratedBook();
        }

        while(true) {
            String title = InputUtility.getString("What is the title? (Press q to quit)", in);
            try {
                if(title.equalsIgnoreCase("q")) {
                    return;
                }
                book.setTitle(title);
                break;
            } catch(IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        // Prompt for Author's first name

        // Prompt for Author's last name

        // Prompt for number of pages

        // If the book is an illustrated book, prompt for the illustrator's first name

        // If the book is an illustrated book, prompt for the illustrator's last name

        books[bookCount] = book;


        // if the array is full, tell the user you can't add any more
    }

    public void viewAll() {

    }
}