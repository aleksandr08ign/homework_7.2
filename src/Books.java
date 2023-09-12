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
}

