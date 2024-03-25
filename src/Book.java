import java.util.Objects;

public class Book {

    private String title;

    private int year;

    private Author author;

    public Book(String title, int year, Author author) {
        this.title = title;
        this.year = year;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book books = (Book) o;
        return year == books.year && Objects.equals(title, books.title) && Objects.equals(author, books.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, year, author);
    }

    @Override
    public String toString() {
        return "books{" +
                "title='" + title + '\'' +
                ", year=" + year +
                ", author=" + author +
                '}';
    }
}
