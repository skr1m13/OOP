package lab1;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Преступление и наказание", "Ф. М. Достоевский", 1866);
        Book book2 = new Book("1984", "Джордж Оруэлл", 1949);
        Book book3 = new Book("Мастер и Маргарита", "М. А. Булгаков", 1967);

        book1.displayInfo();
        book2.displayInfo();
        book3.displayInfo();
    }
}
