import java.time.LocalDate;

class Donation {
    double amount;
    boolean anonymousAmount;
    String name;
    boolean anonymousName;
    String note;
    LocalDate dateDonated;
    
}

public class DonationDemo {
    public static void main(String[] args) {
        Donation donation = new Donation();
        donation.amount = 50;
        donation.anonymousAmount = false;
        donation.name = "Marc";
        donation.anonymousName = false;
        donation.note = "In memory of my late cat named Velcro";
        donation.dateDonated = LocalDate.now();

        System.out.printf("Thank you %s for your donation of $%,.2f!%n", donation.name, donation.amount);

        Donation donation2 = new Donation();
        donation2.amount = 100000000;
        donation2.anonymousAmount = true;
        donation2.name = "Warren Buffet";
        donation2.anonymousName = true;
        donation2.note = "That's pocket change for me";
        donation2.dateDonated = LocalDate.now();

        System.out.printf("Thank you %s for your donation of $%,.2f!%n", donation2.name, donation2.amount);
    }
}