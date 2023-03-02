package pro.sky.java.course1.lesson2;

public class Homework2 {
    public static void main(String[] args) {
        Author stephenKing = new Author("Stephen", "King");
        Author joanneRowling = new Author("Joanne", "Rowling");
        Book it = new Book("It", 1986, stephenKing);
        Book harryPotter = new Book("Harry Potter", 1997, joanneRowling);

        System.out.println("Автор - " + stephenKing.getName() + " " + stephenKing.getSurname());
        System.out.println("Книга - " + it.getNameBook() + ", " + it.getYearOfPublication() + " год публикации, " + "Автор - " + stephenKing.getName() + " " + stephenKing.getSurname());
        System.out.println("Автор - " + joanneRowling.getName() + " " + joanneRowling.getSurname());
        System.out.println("Книга - " + harryPotter.getNameBook() + ", " + harryPotter.getYearOfPublication() + " год публикации, " + "Автор - " + joanneRowling.getName() + " " + joanneRowling.getSurname());

        harryPotter.setYearOfPublication(1998);

        System.out.println("Книга - " + harryPotter.getNameBook() + ", " + harryPotter.getYearOfPublication() + " год публикации, " + "Автор - " + joanneRowling.getName() + " " + joanneRowling.getSurname());

    }
}
