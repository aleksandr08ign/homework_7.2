import java.util.Objects;

public class Books {
    String book;
    int year;
    Author author;

    public Books(String book, int year, Author author) {
        this.book = book;
        this.year = year;
        this.author = author;
    }

    public String getBook() {
        return this.book;
    }

    public int getYear() {
        return this.year;
    }

    public Author getAuthor() {
        return this.author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Books{" +
                "book='" + book + '\'' +
                ", year=" + year +
                ", author=" + author +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Books books = (Books) o;
        return year == books.year && Objects.equals(book, books.book) && Objects.equals(author, books.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(book, year, author);
    }
}

