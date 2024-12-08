/**
 * Класс, представляющий книгу.
 */
public class Book {
    private String title;
    private String author;
    private String isbn;

    /**
     * Конструктор для создания книги.
     *
     * @param title название книги
     * @param author автор книги
     * @param isbn ISBN книги
     */
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    /**
     * Получить название книги.
     *
     * @return название книги
     */
    public String getTitle() {
        return title;
    }

    /**
     * Получить автора книги.
     *
     * @return автор книги
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Получить ISBN книги.
     *
     * @return ISBN книги
     */
    public String getIsbn() {
        return isbn;
    }
}

/**
 * Класс, представляющий библиотеку.
 */
import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    /**
     * Конструктор для создания библиотеки.
     */
    public Library() {
        books = new ArrayList<>();
    }

    /**
     * Добавить книгу в библиотеку.
     *
     * @param book книга, которую нужно добавить
     */
    public void addBook(Book book) {
        books.add(book);
    }

    /**
     * Получить список всех книг в библиотеке.
     *
     * @return список книг
     */
    public List<Book> getBooks() {
        return books;
    }

    /**
     * Найти книгу по ISBN.
     *
     * @param isbn ISBN книги
     * @return книга с указанным ISBN или null, если книга не найдена
     */
    public Book findBookByIsbn(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;
    }
}
