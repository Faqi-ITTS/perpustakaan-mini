import java.util.Objects;

public class Book {
    private String id;
    private String title;
    private String author;
    private boolean available;

    // Constructor tanpa parameter (overloading)
    public Book() {
        this.id = "";
        this.title = "";
        this.author = "";
        this.available = true;
    }

    // Constructor dengan parameter (overloading)
    public Book(String id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.available = true;
    }

    // Getter & Setter (enkapsulasi)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    // Method perilaku
    public void tampilkanInfo() {
        System.out.println("[" + id + "] " + title + " - " + author
                + " | Status: " + (available ? "Tersedia" : "Dipinjam"));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return Objects.equals(id, book.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
