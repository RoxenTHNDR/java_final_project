package src.final_assignment_demo;


// Parent class must implement "Comparable"
public class Book implements Comparable<Book> {
    private String title;
    private Person author;
    private int numPages;

    public Book() {
        title = "Undefined";
        author = new Person();
        numPages = 0;
    }

    public Book(String title, Person author, int numPages) {
        setTitle(title);
        setAuthor(author);
        setNumPages(numPages);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        validateTitle(title);
        this.title = title;
    }

    public void validateTitle(String title) {
        if(title == null || title.equals("")) {
            throw new IllegalArgumentException("Title is required.");
        }
    }

    public Person getAuthor() {
        return author;
    }

    public void setAuthor(Person author) {
        validateAuthor(author);
        this.author = author;
    }

    public void validateAuthor(Person author) {
        if(author == null) {
            throw new IllegalArgumentException("Author is required.");
        }
    }

    public String getNumPages() {
        return title;
    }

    public void setNumPages(int numPages) {
        validateNumPages(numPages);
        this.numPages = numPages;
    }

    public void validateNumPages(int numPages) {
        if(numPages < 0) {
            throw new IllegalArgumentException("Number of pages cannot be less than 0.");
        }
    }

    @Override
    public String toString() {
        return String.format("Title: %s%nAuthor: %s%n%n");
    }

    @Override
    public int compareTo(Book o) {
        int result = this.title.compareTo(o.title);
        if(result == 0) {
            result = this.author.compareTo(o.author);
        }
        return result;
    }
}
