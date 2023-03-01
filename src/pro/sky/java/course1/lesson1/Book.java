package pro.sky.java.course1.lesson1;

public class Book {
    private String nameBook;
    private int yearOfPublication;
    private Author authorName;

    public Book(String nameBook, int yearOfPublication, Author authorName) {
        this.nameBook = nameBook;
        this.yearOfPublication = yearOfPublication;
        this.authorName = authorName;
    }

    public String getNameBook() {
        return this.nameBook;
    }

    public int getYearOfPublication() {
        return this.yearOfPublication;
    }

    public Author getAuthorName() {
        return this.authorName;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }
}
