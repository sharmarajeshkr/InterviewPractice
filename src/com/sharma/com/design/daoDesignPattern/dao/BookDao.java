package com.sharma.com.design.daoDesignPattern.dao;


import java.util.List;

public interface BookDao<T> {
    List<T> getAllBooks();
    T getBookByIsbn(int isbn);
    void saveBook(T book);
    void deleteBook(T book);
}
