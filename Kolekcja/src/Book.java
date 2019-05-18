import java.util.Objects;

public class Book {
    private String autor, tytul;
    private int rokWydania;

    public Book(String author, String tytul, int rokWydania) {
        this.autor = author;
        this.tytul = tytul;
        this.rokWydania = rokWydania;
    }

    public Book() {
    }

    public String getAutor() {
        return autor;
    }

    public String getTytul() {
        return tytul;
    }

    public int getRokWydania() {
        return rokWydania;
    }

    public void setAuthor(String author) {
        this.autor = author;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public void setRokWydania(int rokWydania) {
        this.rokWydania = rokWydania;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return getRokWydania() == book.getRokWydania() &&
                getAutor().equals(book.getAutor()) &&
                getTytul().equals(book.getTytul());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAutor(), getTytul(), getRokWydania());
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + autor + '\'' +
                ", tytul='" + tytul + '\'' +
                ", rokWydania=" + rokWydania +
                '}';
    }
}