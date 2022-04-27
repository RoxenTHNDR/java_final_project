package src.final_assignment_demo;

public class Person implements Comparable<Person> {
    private String firstName;
    private String lastName;

    public Person() {
        firstName = "Undefined";
        lastName = "Undefined";
    }

    public Person(String firstName, String lastName) {
        validateFirstName(firstName);
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        validateFirstName(firstName);
        this.firstName = firstName;
    }

    private void validateFirstName(String firstName) {
        if(firstName == null || firstName.equals("")) {
            throw new IllegalArgumentException("First Name is required");
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        validateLastName(lastName);
        this.lastName = lastName;
    }

    private void validateLastName(String lastName) {
        if(lastName == null || lastName.equals("")) {
            throw new IllegalArgumentException("Last Name is required");
        }
    }

    @Override
    public String toString() {
        return String.format("First name: %s%nLast name: %s%n%n", firstName, lastName);
    }

    @Override
    public int compareTo(Person other) {
        int result = this.lastName.compareTo(other.lastName);
        if(result == 0) {
            result = this.firstName.compareTo(other.firstName);
        }
        return result;
    }
}
