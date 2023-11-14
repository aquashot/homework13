package Model;

public class Book {
    private final String name;
    private final Author author;
    private int publicYear;

    public Book(String name, Author author, int publicYear) {
        this.name = name;
        this.author = author;
        this.publicYear = publicYear;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPublicYear() {
        return publicYear;
    }

    public void setPublicYear(int publicYear) {
        this.publicYear = publicYear;
    }
    @Override
    public String toString(){
        return author+ " \"" +name+ "\""+  publicYear;
    }
}
