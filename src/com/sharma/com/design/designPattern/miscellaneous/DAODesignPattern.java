package com.sharma.com.design.designPattern.miscellaneous;

import java.util.ArrayList;
import java.util.List;

/*  DAO : Data Access Object : DAO is used to separate  Data presentation logic is in separate layer.
    In this way service layer remains in dark about how low level operations are done.
    Model(C)
    DAO (I) -> DAOImplementation (c)
    Client(app) (c)
*
* */
public class DAODesignPattern {
    public static void main(String[] args) {
        BookDAO dao = new BookDAOImplementation();
        // Get all the Books
        List<String> books = dao.getAllBooks();
        //Iterate : Ways to get book object
        System.out.println("Using for loop ");
            for(String book:books)
                System.out.println("Book Information : "+book);

        // Iteration using stream
        System.out.println("Iterate using Stream");
            books.stream()
                    .forEach( b -> System.out.println("Book Information : "+b));


        // Delete book by id
        dao.delete(12);

        // Implementing Book CRUD Operation using Anaymous class

        BookCRUD bookCRUD = new BookCRUD() {
            @Override
            public void save(Book book) {
                System.out.println("Calling save "+book);
            }

            @Override
            public int delete(int bookId) {
                System.out.println("Calling delete  "+bookId);
                return bookId;
            }
        };
        Book book = new Book("Java","123");
        bookCRUD.save(book);

        bookCRUD.delete(123);


    }
}

class Book{
    private String ISBN;
    private String name;

    public Book(){}

    public Book(String ISBN, String name) {
        this.ISBN = ISBN;
        this.name = name;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    @Override
    public String toString() {
        return "Book{" +
                "ISBN='" + ISBN + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

interface BookDAO extends  BookCRUD{
    public List<String> getAllBooks();
    public List<String> getBookISBN();

}

interface BookCRUD{
    public void save(Book book);
    public int delete(int bookId);
}

// Implementation Book Dao
// Dummy Implementation
class BookDAOImplementation implements BookDAO{

    @Override
    public List<String> getAllBooks() {
        List<String> l = new ArrayList<>();
        l.add("List of all books");
        return l;
    }

    @Override
    public List<String> getBookISBN() {
        List<String> l = new ArrayList<>();
        l.add("List of all books isbn Number");
        return l;
    }

    @Override
    public void save(Book book) {
        System.out.println("Save Book ");
    }

    @Override
    public int delete(int bookId) {
        System.out.println("Delete book by bookid "+ bookId);
        return bookId;
    }
}