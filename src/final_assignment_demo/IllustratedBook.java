package src.final_assignment_demo;

public class IllustratedBook extends Book {
    private Person illustrator;

    public IllustratedBook() {
        super();
        illustrator = new Person();
    }

    public IllustratedBook(String title, Person author, int numPages, Person illustrator) {
        super(title, author, numPages);
        setIllustrator(illustrator);
    }

    public Person getIllustrator() {
        return illustrator;
    }

    public void setIllustrator(Person illustrator) {
        validateIllustrator(illustrator);
        this.illustrator = illustrator;
    }

    public void validateIllustrator(Person illustrator) {
        if(illustrator == null) {
            throw new IllegalArgumentException("Illustrator is required.");
        }
    }
}
