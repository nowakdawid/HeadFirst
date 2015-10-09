package _598;

public class Book implements Comparable<Book> {

    String title = "";

    public Book (String t) {
        title = t;
    }

    @Override
    public int compareTo(Book b) {
        return (title.compareTo(b.title));
    }
}
