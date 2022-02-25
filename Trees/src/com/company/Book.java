package com.company;

public class Book implements Comparable{
    String title, author;

    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    @Override
    public int compareTo(Object object) {
        Book book = (Book) object;
        if (!author.equals(book.author)){
            return author.compareTo(book.author);
        } else {
            return title.compareTo(book.title);
        }
    }

    @Override
    public boolean equals(Object object){
        Book book = (Book) object;
        return title.equals(book.title) && author.equals(book.author);
    }

    @Override
    public String toString() {
        return  title + ", " + author;
    }
}
