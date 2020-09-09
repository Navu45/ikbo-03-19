package yamon.Lab2;

public class BookTest {

    public static void main(String[] args)
    {
        Book book = new Book("The Old Man and the Sea", "Ernest Miller Hemingway");
        book.setColorOfCover("blue and green");
        book.setYearOfTheBook(1952);
        book.setNumOfPages(127);

        System.out.println(book.toString());

    }

}

class Book {
    private String name;
    private String author;
    private int yearOfTheBook;
    private String colorOfCover;
    private int numOfPages;

    Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearOfTheBook() {
        return yearOfTheBook;
    }

    public void setYearOfTheBook(int yearOfTheBook) {
        this.yearOfTheBook = yearOfTheBook;
    }

    public String getColorOfCover() {
        return colorOfCover;
    }

    public void setColorOfCover(String colorOfCover) {
        this.colorOfCover = colorOfCover;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", yearOfTheBook=" + yearOfTheBook +
                ", colorOfCover='" + colorOfCover + '\'' +
                ", numOfPages=" + numOfPages +
                '}';
    }
}
