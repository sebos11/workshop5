package pl.coderslab.workshop5.service;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

public class MemoryBookService {
    private List<Book> books;
    public MemoryBookService(){
        books = new ArrayList<>();

        books.add(new Book(1L, "9788324631766", "Thinking in Java", "Bruce Eckel",
                "Helion", "programming"));
        books.add(new Book(2L, "9788324627738", "Rusz glowa, Java.",
                "Sierra Kathy, Bates Bert", "Helion", "programming"));
        books.add(new Book(3L, "9780130819338", "Java 2. Podstawy",
                "Cay Horstmann, Gary Cornell", "Helion", "programming"));
    }

    }
}
