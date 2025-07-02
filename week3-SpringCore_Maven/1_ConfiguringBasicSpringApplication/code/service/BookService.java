package org.example.service;

import org.example.repository.BookRepository;

public class BookService {
    private final BookRepository bookRepository = new BookRepository();

    public void addBook(String bookName) {
        bookRepository.saveBook(bookName);
    }

    public String getBook(int id) {
        return bookRepository.findBookById(id);
    }

    public BookRepository getBookRepository() {
        return bookRepository;
    }

}
