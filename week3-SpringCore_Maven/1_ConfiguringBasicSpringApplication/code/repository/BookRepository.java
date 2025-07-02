package org.example.repository;

public class BookRepository {
    public void saveBook(String bookName) {
        System.out.printf("Saving book: %s%n", bookName);
    }

    public String findBookById(int id) {
        return "Book with ID: " + id;
    }
}
