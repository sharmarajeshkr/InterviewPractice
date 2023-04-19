package com.sharma.com.design.daoDesignPattern;


import com.sharma.com.design.daoDesignPattern.dao.BookDao;
import com.sharma.com.design.daoDesignPattern.daoimpl.BookDaoImpl;
import com.sharma.com.design.daoDesignPattern.model.Books;

public class DaoPattern {
    public static void main(String[] args) {
        BookDao<Books> bookDao = new BookDaoImpl();
        System.out.println("Before Update Retrive book Details");
        for (Books book : bookDao.getAllBooks()) {
            System.out.println("Book ISBN : " + book.getIsbn());
        }

        //update student
        Books book = bookDao.getAllBooks().get(1);
        book.setBookName("Algorithms");
        bookDao.saveBook(book);

        System.out.println("After Update Retrive book Details");

        for (Books books : bookDao.getAllBooks()) {
            System.out.println("Book ISBN : " + books.getIsbn());
        }
    }
}
