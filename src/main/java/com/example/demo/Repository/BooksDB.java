package com.example.demo.Repository;

import com.example.demo.Model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BooksDB {

    ArrayList<Book> booksList = new ArrayList<>();

    public String saveBook(Book book) {
        for(Book books : booksList) {
            if(books.getId() == book.getId())
                return "Not able to store the book since its already present";
        }
        booksList.add(book);
        System.out.println(book.toString()+" book is inserted");
        return "Able to store the book";
    }

    public List<Book> getBooks() {
        return booksList;
    }

    public Book getBooksByID(long id) {
        for(Book books : booksList) {
            if(books.getId() == id)
                return books;
        }
        return null;
    }

    public String updateBook(Book book) {
        for(Book books : booksList) {
            if(books.getId() == book.getId()) {
                books.setAuthor(book.getAuthor());
                books.setCost(book.getCost());
                System.out.println(books.toString());
                return "book "+book.getId()+" is updated";
            }
        }
        return "Book is not present in the Database";
    }

    public String deleteBook(long id) {
        for(Book books : booksList) {
            if(books.getId() == id) {
                booksList.remove(books);
                return "Books with id "+id+" is deleted";
            }
        }
        return "Book is not present in the Database";
    }
}
