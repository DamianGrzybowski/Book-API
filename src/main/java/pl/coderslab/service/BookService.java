package pl.coderslab.service;

import pl.coderslab.entity.Book;

import java.util.List;
import java.util.Optional;

public interface BookService {
    List<Book> getBooks();
    Optional<Book> getBook(long id);

    void addBook(Book book);

    void update(Book book);

    void delete(Long id);
}
