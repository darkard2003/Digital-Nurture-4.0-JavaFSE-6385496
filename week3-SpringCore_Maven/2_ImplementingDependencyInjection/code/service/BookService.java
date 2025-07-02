package org.example.service;

import org.example.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;

    public void addBook(String bookName) {
        bookRepository.saveBook(bookName);
    }

    public String getBook(int id) {
        return bookRepository.findBookById(id);
    }

    public BookRepository getBookRepository() {
        return bookRepository;
    }

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
}
