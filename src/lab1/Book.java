package lab1;

public class Book {
    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        setTitle(title);
        setAuthor(author);
        setYear(year);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title != null && !title.isBlank()) {
            this.title = title;
        } else {
            throw new IllegalArgumentException("Название книги не может быть пустым");
        }
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if (author != null && !author.isBlank()) {
            this.author = author;
        } else {
            throw new IllegalArgumentException("Имя автора не может быть пустым");
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year > 0) {
            this.year = year;
        } else {
            throw new IllegalArgumentException("Год должен быть положительным");
        }
    }

    public void displayInfo() {
        System.out.println(
                "Название: " + title +
                        ", автор: " + author +
                        ", год: " + year
        );
    }
}