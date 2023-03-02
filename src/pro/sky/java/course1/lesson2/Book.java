package pro.sky.java.course1.lesson2;

import java.util.Objects;

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

    @Override
    public String toString() {
        return "Книга: " +
                "Название книги = " + nameBook + ", Год публикации = " + yearOfPublication +
                ", Автор = " + authorName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearOfPublication == book.yearOfPublication && nameBook.equals(book.nameBook) && authorName.equals(book.authorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBook, yearOfPublication, authorName);
    }
}
