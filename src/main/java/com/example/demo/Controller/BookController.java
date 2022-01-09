package com.example.demo.Controller;

import com.example.demo.Model.Book;
import com.example.demo.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    BookService bookService;

    @PostMapping("/insertBook")
    public String insertBook(@RequestBody Book book) {
           return bookService.insertBook(book);
    }

    @GetMapping("/getAllBooks")
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @GetMapping("/getBookByID/{id}")
    public Book getBookByID(@PathVariable long id) {
        return bookService.getBookByID(id);
    }

    @PutMapping("/updateBook")
    public String updateBook(@RequestBody Book book) {
        return bookService.updateBook(book);
    }

    @DeleteMapping("/deleteBook/{id}")
    public String deleteBook(@PathVariable long id) {
        return bookService.deleteBook(id);
    }
}
