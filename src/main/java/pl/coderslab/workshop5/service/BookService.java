package pl.coderslab.workshop5.service;

import java.awt.print.Book;
import java.util.List;

public interface BookService {
    List<Book> getAllBooks();
    Book getBookById(long id)

}
