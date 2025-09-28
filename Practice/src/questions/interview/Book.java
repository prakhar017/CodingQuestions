package interview;

public class Book {

    public int getYearOfPublication;
    private String name;
    private int price;
    private int isbn;
    private Author author;

    public int getGetYearOfPublication() {
        return getYearOfPublication;
    }

    public void setGetYearOfPublication(int getYearOfPublication) {
        this.getYearOfPublication = getYearOfPublication;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public Author getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "getYearOfPublication=" + getYearOfPublication +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", isbn=" + isbn +
                ", author=" + author +
                '}';
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Book(int getYearOfPublication, String name, int price,  int isbn, Author author) {
        this.getYearOfPublication = getYearOfPublication;
        this.name = name;
        this.price = price;
        this.isbn = isbn;
        this.author = author;
    }
}
