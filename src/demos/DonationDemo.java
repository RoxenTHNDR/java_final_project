package src.demos;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.InputMismatchException;
import java.util.Scanner;

class Donation {
    //instance variables, fields, attributes
    private double amount;
    private String name;
    private String note;
    private LocalDate dateDonated;
    private static double totalDonations = 0;

    // Rule 1: must be public
    // Rule 2: it's return type is always void, but don't specify it.
    // Rule 3: name must match the class name
    // Rule 4: parameters can be added, but are not required.
    public Donation() {
        amount = 0;
        name = "Anonymous";
        note = "I donated in support of this campaign.";
        dateDonated = LocalDate.now();
    }

    public Donation(
        double amount
        , String name
        , String note
        , LocalDate dateDonated
    ) {
        validateAmount(amount);
        this.amount = amount;
        this.name = name;
        this.note = note;
        this.dateDonated = dateDonated;
    }

    // Getter methods (aka Accessors)
    // Rule 1: Must have a public modifier
    // Rule 2: The return type must match the related instance varaible data type
    // Rule 3: The name must start with "get" followed by the name of the variable, starting with a capital letter.
    // Rule 4: Never have parameters
    // Rule 5: Always return the instance variable.
    // Rule 6: Most of the time, create a getter method for every instance variable.
    public double getAmount() {
        return amount;
    }

    public String getName() {
        return name;
    }

    public String getNote() {
        return note;
    }

    public LocalDate getDateDonated() {
        return dateDonated;
    }

    // Setter methods (aka Mutator methods)
    // Rule 1: Must have a public modifier
    // Rule 2: The return type must be void
    // Rule 3: The name must start with "set" followed by the name of the variable, starting with a capital letter.
    // Rule 4: There must be one parameter, the data type must match the instance variable's data type, the parameter name should match the instance variable's name.
    // Rule 5: Always assign the parameter to the instance variable.
    // Rule 6: Most of the time, create a setter method for every instance variable.
    public void setAmount(double amount) {
        validateAmount(amount);
        this.amount = amount;
    }

    // Validator methods
    // Rule 1: Use private modifier\
    // Rule 2: Always have a void return type
    // Rule 3: The name must start with "validate" followed by the name of the variable, starting with a capital letter.
    // Rule 4: There must be one parameter, the data type must match the instance variable's data type, the parameter name should match the instance variable's name.
    // Rule 5: Write if statements for everything single possible error that may occur.
    // Rule 6: throw an IllegalArgumentException passing a string to it's constructor.
    // Rule 7: Call the validator methods before assigning values to the instance variables.
    private void validateAmount(double amount) {
        if(amount < 5 || amount > 10000000) {
            throw new IllegalArgumentException("The minimum donation required is $5. The maximum donation allowed is $10,000,000");
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public void setDateDonated(LocalDate dateDonated) {
        this.dateDonated = dateDonated;
    }


    static void addDonation(double amt) {
        totalDonations += amt;
    }

    static double getTotalDonations() {
        return totalDonations;
    }

    // Methods
    String daysAgo() {
        LocalDate today = LocalDate.now();
        long days = ChronoUnit.DAYS.between(dateDonated, today);
        if(days == 0) {
            return "This donation was made today";
        } else if(days == 1) {
            return "This donation was made yesterday";
        }
        return "This donation was made " + days + " days ago.";
    }
    
}

public class DonationDemo {
    static void doStuff(double val) {
        // doesn't matter
    }

    public static void main(String[] args) {
        Donation donation = new Donation();
        Donation.addDonation(donation.getAmount());

        System.out.printf("Thank you %s for your donation of $%,.2f!%n", donation.getName(), donation.getAmount());
        System.out.println(donation.daysAgo());

        Donation donation2 = new Donation(100000, "Warren Buffet", "That's pocket change", LocalDate.of(2022, 3, 21));
        Scanner sc = new Scanner(System.in);
        boolean error = false;
        while(true) {
            if(error) {
                sc.nextLine();
            }
            System.out.print("How much would you like to donate? ");
            int donationAmt = 0;
            try {
                donationAmt = sc.nextInt();
                error = false;
            } catch(InputMismatchException e) {
                error = true;
                System.out.println("Invalid amount");
                continue;
            }
            
            try {
                donation2.setAmount(donationAmt);
                break;
            } catch(IllegalArgumentException e) {
                error = true;
                System.out.println("Invalid amount");
                System.out.println(e.getMessage());
                continue;
            }
        }
        sc.close();
        
        Donation.addDonation(donation2.getAmount());

        System.out.printf("Thank you %s for your donation of $%,.2f!%n", donation2.getName(), donation2.getAmount());
        System.out.println(donation2.daysAgo());
        System.out.println(donation2);

        System.out.println(Donation.getTotalDonations());
    }
}
