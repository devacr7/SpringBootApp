package com.example.demo.Model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Book {
    private long id;
    private String author;
    private int cost;

    public Book(long id, String author, int cost) {
        this.id = id;
        this.author = author;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", cost=" + cost +
                '}';
    }
}
